/*
* File: App.java
* Author: Vámosi László Ádám
* Copyright: 2025, Vámosi László Ádám
* Group: SZOFT I-N
* Date: 2025-02-10
* GitHub: https://github.com/vamosilaszloadam/
* Licenc: MIT
*/

// Feladat 0318
// Írjon programot, amely kiszámítja egy kör alapú henger felszínét. 
// A program kérje be a henger sugarát és hosszát.
// A kör alapú henger felszínének számítása:
// S = 2*pi*r^2 + 2*r*h = 2*pi*r(r+h)

import java.util.Scanner;

public class App {
    public static double getNumber(String text, Scanner sc) {
        while (true) {
            try {
                System.out.print(text);
                double number = Double.parseDouble(sc.nextLine());
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Csak pozitív szám lehet!\n");
                }
            } catch (Exception e) {
                System.out.println("Hibás adat!\n");
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("\nVámosi László Ádám, SZOFT I-N, 2025-02-10");
        System.out.println("A program kiszámítja egy kör alapú henger felszínét.\n");

        Scanner sc = new Scanner(System.in);

        double radius = getNumber("Henger sugara (m): ", sc);
        double height = getNumber("Henger hossza (m): ", sc);

        double surface = 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
        // double surface = 2 * Math.PI * radius * (radius + height);

        System.out.printf("Henger felszíne: %.2f m^2\n", surface);

        sc.close();
    }
}