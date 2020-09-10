package com.epam.ooad;

import java.util.Scanner;

public class Decryption {
    static void descript (Scanner in) {
        String input,output;
        input = readEncryptedMessage(in);
        output = decryptMessage(input);
        outputDecryptedMessage(output);
    }

    private static void outputDecryptedMessage(String output) {
        System.out.println("Decrypted message: ");
        System.out.println(output);
    }

    private static String decryptMessage(String input) {
        StringBuilder output = new StringBuilder();
        // decrypt entire message
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            char decrypted = decryptLetter(letter);
            output.append(decrypted);
        }
        return output.toString();
    }

    private static String readEncryptedMessage(Scanner in) {
        String input;
        System.out.println("Enter a message to decrypt: ");
        input = in.nextLine();
        return input;
    }


    private static char shiftLeft(char letter, int offset) {
        char decrypted;
        if (letter - offset >= 'A') {
            decrypted = (char) (letter - offset);
        } else {
            decrypted = (char) (letter - offset + 26);
        }
        return decrypted;
    }


    private static char decryptLetter(char letter) {
        char decrypted;
        if ('A' <= letter && letter <= 'Z') {
            int offset = 3;
            decrypted = shiftLeft(letter, offset);
        } else {
            decrypted = letter;
        }
        return decrypted;
    }
}
