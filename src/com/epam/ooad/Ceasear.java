package com.epam.ooad;

import java.util.Scanner;

public class Ceasear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ave com.epam.oopconcept.Caesar! Morituri te salutant!");
        String input, output;
        do {
            System.out.println("Would you like to encrypt or decrypt a message?");
            input = in.nextLine();
            if (input.equals("encrypt")) {
                input = askForPlainTextMessage(in);
                output = encryptMessage(input);
                outputEncryptedMessage(output);
                break;
            } else if (input.equals("decrypt")) {
                input = readEncryptedMessage(in);
                output = decryptMessage(input);
                outputDecryptedMessage(output);
                break;
            } else {
                System.out.println("Tertium non datur!");
            }
        } while (true);
        System.out.println("Vale!");
    }

    private static void outputDecryptedMessage(String output) {
        System.out.println("Decrypted message: ");
        System.out.println(output);
    }

    private static String decryptMessage(String input) {
        String output;
        output = "";
        output = decryptSingleCharacter(input, output);
        return output;
    }

    private static String decryptSingleCharacter(String input, String output) {
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if ('A' <= letter && letter <= 'Z') {
                if (letter - 3 >= 'A') {
                    output = output + (char)(letter - 3);
                } else {
                    output = output + (char)(letter - 3 + 26);
                }
            } else {
                output = output + letter;
            }
        }
        return output;
    }

    private static String readEncryptedMessage(Scanner in) {
        String input;
        System.out.println("Enter a message to decrypt: ");
        input = in.nextLine();
        return input;
    }

    private static void outputEncryptedMessage(String output) {
        System.out.println("Encrypted message: ");
        System.out.println(output);
    }

    private static String encryptMessage(String input) {
        String output;
        output = "";
        output = encryptSingleCharacter(input, output);
        return output;
    }

    private static String encryptSingleCharacter(String input, String output) {
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if ('A' <= letter && letter <= 'Z') { // validation
                if (letter + 3 <= 'Z') {
                    output = output + (char)(letter + 3);
                } else {
                    output = output + (char)(letter + 3 - 26);
                }
            } else {
                output = output + letter;
            }
        }
        return output;
    }

    private static String askForPlainTextMessage(Scanner in) {
        String input;
        System.out.println("Enter a message to encrypt: ");
        input = in.nextLine();
        return input;
    }
}
