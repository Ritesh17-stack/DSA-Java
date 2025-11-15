package Cryptography;

import java.util.*;

public class Hillcipher {

    // Convert character to number (A → 0, B → 1, ...)
    private static int charToNum(char c) {
        return c - 'A';
    }

    // Convert number to uppercase character (0 → A, 1 → B, ...)
    private static char numToChar(int n) {
        return (char) ((n % 26 + 26) % 26 + 'A');
    }

    // Generate key matrix from key string
    private static int[][] getKeyMatrix(String key, int size) {
        key = key.toUpperCase().replaceAll("[^A-Z]", "");
        if (key.length() < size * size)
            throw new IllegalArgumentException("Key is too short for " + size + "x" + size + " matrix!");

        int[][] matrix = new int[size][size];
        int k = 0;
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = charToNum(key.charAt(k++));
        return matrix;
    }

    // Multiply matrix and vector (mod 26)
    private static int[] multiply(int[][] matrix, int[] vector) {
        int size = matrix.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = 0; j < size; j++)
                sum += matrix[i][j] * vector[j];
            result[i] = ((sum % 26) + 26) % 26;
        }
        return result;
    }

    // Modular inverse of determinant (mod 26)
    private static int modInverse(int det, int mod) {
        det = ((det % mod) + mod) % mod;
        for (int i = 1; i < mod; i++)
            if ((det * i) % mod == 1)
                return i;
        throw new ArithmeticException("Matrix is not invertible modulo 26.");
    }

    // Inverse of 3x3 matrix mod 26
    private static int[][] inverseMatrix3x3(int[][] m) {
        int det = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        det = ((det % 26) + 26) % 26;

        int invDet = modInverse(det, 26);
        int[][] inv = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int val = ((m[(j + 1) % 3][(i + 1) % 3] * m[(j + 2) % 3][(i + 2) % 3])
                        - (m[(j + 1) % 3][(i + 2) % 3] * m[(j + 2) % 3][(i + 1) % 3]));
                inv[i][j] = ((val * invDet) % 26 + 26) % 26;
            }
        }
        return inv;
    }

    // Encrypt message
    public static String encipher(String message, String key) {
        int size = 3;
        int[][] keyMatrix = getKeyMatrix(key, size);
        message = message.toUpperCase().replaceAll("[^A-Z]", "");

        // Padding with X if not divisible by 3
        while (message.length() % size != 0)
            message += 'X';

        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < message.length(); i += size) {
            int[] block = new int[size];
            for (int j = 0; j < size; j++)
                block[j] = charToNum(message.charAt(i + j));

            int[] encrypted = multiply(keyMatrix, block);
            for (int val : encrypted)
                cipherText.append(numToChar(val));
        }

        return cipherText.toString();
    }

    // Decrypt message
    public static String decipher(String cipher, String key) {
        int size = 3;
        int[][] keyMatrix = getKeyMatrix(key, size);
        int[][] inverseKey = inverseMatrix3x3(keyMatrix);

        StringBuilder plainText = new StringBuilder();

        for (int i = 0; i < cipher.length(); i += size) {
            int[] block = new int[size];
            for (int j = 0; j < size; j++)
                block[j] = charToNum(cipher.charAt(i + j));

            int[] decrypted = multiply(inverseKey, block);
            for (int val : decrypted)
                plainText.append(numToChar(val));
        }

        return plainText.toString();
    }

    // Driver
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hill Cipher Simulation");

        System.out.print("Enter key (9 letters for 3x3): ");
        String key = sc.nextLine();

        System.out.print("Enter plaintext: ");
        String message = sc.nextLine();

        String cipher = encipher(message, key);
        System.out.println("\nEncrypted Text: " + cipher);

        String plain = decipher(cipher, key);
        System.out.println("Decrypted Text: " + plain);
    }
}
