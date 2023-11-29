package org.lessons.java.security;
//

import java.util.Scanner;


public class PasswordGenerator {
    public static void main(String[] args) {
Scanner keyboardReader = new Scanner(System.in);

        //variabile nome
        String nameUser;
       System.out.println("Inserisci il tuo nome!");
       nameUser=keyboardReader.next();

        //variabile cognome
        String surnameUser;
        System.out.println("Inserisci il tuo cognome!");
        surnameUser=keyboardReader.next();

        //variabile data di nascità
        int dayBirth;
        System.out.println("Inserisci il tuo giorno di nascità!");
       dayBirth=keyboardReader.nextInt();
        int monthBirth;
        System.out.println("Inserisci il tuo mese di nascità!");
        monthBirth=keyboardReader.nextInt();
       int yearBirth;
        System.out.println("Inserisci il tuo giorno di nascità!");
        yearBirth=keyboardReader.nextInt();

        //faccio la somma
       int dateBirth = dayBirth+monthBirth+yearBirth;

       //variabile colore
        String favoriteColor;
        System.out.println("Inserisci il tuo colore preferito!");
       favoriteColor=keyboardReader.next();



       System.out.println(favoriteColor+surnameUser+nameUser+dateBirth);
        //chiudo scaner
        keyboardReader.close();
    }
}



