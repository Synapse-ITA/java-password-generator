package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INIZIALIZZAZIONE VARIABILI
        String name;
        String surname;
        String favColour;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;

        // RICHIESTA INPUT UTENTE nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno (in numero).
        System.out.println("Inserisci il tuo nome!");
        name = scanner.next();
        System.out.println("Inserisci il tuo cognome!");
        surname = scanner.next();
        System.out.println("Inserisci il tuo colore preferito!");
        favColour = scanner.next();
        System.out.println("Inserisci il tuo giorno di nascita!");
        dayOfBirth = scanner.nextInt();
        System.out.println("Inserisci il tuo mese di nascita!");
        monthOfBirth = scanner.nextInt();
        System.out.println("Inserisci il tuo anno di nascita!");
        yearOfBirth = scanner.nextInt();

        String passwordGenerator = name + "-" + surname + "-" + favColour + "-" + (dayOfBirth+monthOfBirth+yearOfBirth);
        System.out.println(passwordGenerator);

                scanner.close();
    }
}
