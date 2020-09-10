package com.epam.ooad;

import java.util.Scanner;

public class Encryption {
    static void encript (Scanner in) {
        String input,output;
        input = askForPlainTextMessage(in);
        output = encryptMessage(input);
        outputEncryptedMessage(output);
    }
    private static void outputEncryptedMessage(String output) {
        System.out.println("Encrypted message: ");
        System.out.println(output);
    }

    private static String encryptMessage(String input) {
        StringBuilder output;
        output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(encryptLetter(input.charAt(i)));
        }
        return output.toString();
    }

    private static char encryptLetter(char letter) {
        char encrypted;
        if ('A' <= letter && letter <= 'Z') {
            int offset = 3;
            encrypted = shiftRight(letter, offset);
        } else {
            encrypted = letter;
        }
        return encrypted;
    }

    private static String askForPlainTextMessage(Scanner in) {
        String input;
        System.out.println("Enter a message to encrypt: ");
        input = in.nextLine();
        return input;
    }

    private static char shiftRight(char letter, int offset) {
        char encrypted;
        if (letter + offset <= 'Z') {
            encrypted = (char) (letter + offset);
        } else {
            encrypted = (char) (letter + offset - 26);
        }
        return encrypted;
    }
}
