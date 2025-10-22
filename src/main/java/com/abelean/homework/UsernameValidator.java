package com.abelean.homework;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean valid;
        do {
            System.out.println("Introduceti numele de utilizator: ");
            username = scanner.nextLine();
            valid = true;

            // 1. Verificare lungime
            if(username.length() < 6 || username.length() >12) {
                System.out.println("ERROR: Numele de utilizator trebuie sa aiba intre 6 si 12 caractere");
                valid = false;
            }

            // 2. Verificare spatii
            boolean spatii = false;
            for(int i = 0; i<username.length(); i++) {
                if(username.charAt(i) == ' ') {
                    spatii = true;
                    break;
                }
            }
            if(spatii) {
                System.out.println("ERROR: Numele de utilizator nu trebuie sa contina spatii");
                valid = false;
                continue;
            }

            // 3. Verificare numar
            boolean digit = false;

            for(int i = 0; i<username.length(); i++) {
                if(Character.isDigit(username.charAt(i))){
                    digit = true;
                    break;
                }
            }
            if(!digit) {
                System.out.println("ERROR: Numele de utilizator trebuie sa contina minim o cifra");
                valid = false;
            }
        }while(!valid);

        System.out.println("Numele de utilizator acceptat: " +username);
        scanner.close();
    }
}
