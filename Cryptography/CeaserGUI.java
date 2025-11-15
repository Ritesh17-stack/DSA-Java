package Cryptography;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CeaserGUI {

    // Check if input has numbers or special characters
    public static boolean hasNumberOrSpecial(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || !Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }

    // Encrypt text
    public static String encipher(String pt) {
        if (hasNumberOrSpecial(pt)) {
            return "Enter a pure alphabetic string.";
        }
        StringBuilder ct = new StringBuilder();
        for (char c : pt.toCharArray()) {
            if (Character.isUpperCase(c)) {
                ct.append((char) ((c - 'A' + 3) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                ct.append((char) ((c - 'a' + 3) % 26 + 'a'));
            }
        }
        return ct.toString();
    }

    // Decrypt text
    public static String decipher(String ct) {
        if (hasNumberOrSpecial(ct)) {
            return "Enter a pure alphabetic string.";
        }
        StringBuilder pt = new StringBuilder();
        for (char c : ct.toCharArray()) {
            if (Character.isUpperCase(c)) {
                pt.append((char) ((c - 'A' - 3 + 26) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                pt.append((char) ((c - 'a' - 3 + 26) % 26 + 'a'));
            }
        }
        return pt.toString();
    }

    // Build GUI
    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Caesar Cipher");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Layout
        frame.setLayout(new GridLayout(6, 1));

        // Input
        JLabel inputLabel = new JLabel("Enter text:");
        JTextField inputField = new JTextField();

        // Buttons
        JButton encipherButton = new JButton("Encipher");
        JButton decipherButton = new JButton("Decipher");

        // Output
        JLabel outputLabel = new JLabel("Result:");
        JTextField outputField = new JTextField();
        outputField.setEditable(false);

        // Add components
        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(encipherButton);
        frame.add(decipherButton);
        frame.add(outputLabel);
        frame.add(outputField);

        // Encipher button action
        encipherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String result = encipher(input);
                outputField.setText(result);
            }
        });

        // Decipher button action
        decipherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String result = decipher(input);
                outputField.setText(result);
            }
        });

        frame.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
