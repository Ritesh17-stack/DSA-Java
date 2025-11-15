package Cryptography;

import java.util.*;

public class Playfair {

    // Generate 5x5 Playfair Cipher Table and position map
    private static Map<Character, int[]> positionMap = new HashMap<>();

    public static char[][] constructTable(String key) {
        key = key.toUpperCase().replace('J', 'I');
        StringBuilder uniqueKey = new StringBuilder();

        // Keep only unique letters
        for (char c : key.toCharArray()) {
            if (Character.isLetter(c) && uniqueKey.indexOf(String.valueOf(c)) == -1) {
                uniqueKey.append(c);
            }
        }

        // Fill remaining letters (excluding J)
        for (char c : "ABCDEFGHIKLMNOPQRSTUVWXYZ".toCharArray()) {
            if (uniqueKey.indexOf(String.valueOf(c)) == -1) {
                uniqueKey.append(c);
            }
        }

        char[][] table = new char[5][5];
        int index = 0;

        // Fill table and map positions
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                char ch = uniqueKey.charAt(index++);
                table[i][j] = ch;
                positionMap.put(ch, new int[]{i, j});
            }
        }

        // Display the table
        System.out.println("\nPlayfair Cipher Table:");
        for (char[] row : table) {
            for (char c : row) System.out.print(c + " ");
            System.out.println();
        }

        return table;
    }

    // Prepare text into pairs for processing
    public static List<String> prepareText(String text, boolean forEncryption) {
        text = text.toUpperCase().replace('J', 'I').replaceAll("[^A-Z]", "");
        List<String> pairs = new ArrayList<>();
        int i = 0;

        while (i < text.length()) {
            char a = text.charAt(i);
            char b = (i + 1 < text.length()) ? text.charAt(i + 1) : 'X';

            if (forEncryption && a == b) {
                b = 'X';
                i++;
            } else {
                i += 2;
            }

            pairs.add("" + a + b);
        }
        return pairs;
    }

    // Core method for both encryption and decryption
    public static String processText(String text, String key, boolean encrypt) {
        char[][] table = constructTable(key);
        List<String> pairs = prepareText(text, encrypt);
        StringBuilder result = new StringBuilder();

        for (String pair : pairs) {
            char a = pair.charAt(0), b = pair.charAt(1);
            int[] posA = positionMap.get(a);
            int[] posB = positionMap.get(b);

            int rowA = posA[0], colA = posA[1];
            int rowB = posB[0], colB = posB[1];

            if (rowA == rowB) { // same row
                result.append(table[rowA][(colA + (encrypt ? 1 : 4)) % 5]);
                result.append(table[rowB][(colB + (encrypt ? 1 : 4)) % 5]);
            } else if (colA == colB) { // same column
                result.append(table[(rowA + (encrypt ? 1 : 4)) % 5][colA]);
                result.append(table[(rowB + (encrypt ? 1 : 4)) % 5][colB]);
            } else { // rectangle
                result.append(table[rowA][colB]);
                result.append(table[rowB][colA]);
            }
        }

        return result.toString();
    }

    // Public encryption/decryption wrappers
    public static String encipher(String text, String key) {
        return processText(text, key, true);
    }

    public static String decipher(String text, String key) {
        return processText(text, key, false);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Playfair Cipher Simulation");

        System.out.print("Enter the key: ");
        String key = sc.nextLine();

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        String cipher = encipher(text, key);
        System.out.println("\nEncrypted Text: " + cipher);

        String plain = decipher(cipher, key);
        System.out.println("Decrypted Text: " + plain);
    }
}
