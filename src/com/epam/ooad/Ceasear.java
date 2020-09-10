package com.epam.ooad;

import java.util.Scanner;

public class Ceasear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ave com.epam.oopconcept.Caesar! Morituri te salutant!");
        String input= readMessage(in);
        if (input.equals("encrypt"))
            Encryption.encript(in);
        else
            Decryption.descript(in);

        System.out.println("Vale!");
    }

    private static String readMessage(Scanner in) {
        String input;
        boolean again = false;
        do {
            System.out.println("Would you like to encrypt or decrypt a message?");
            input = in.nextLine();
            if (!(input.equals("encrypt") || input.equals("decrypt"))) {
                System.out.println("Tertium non datur!");
                again = true;
            }
        } while (again);
        return input;
    }

}
