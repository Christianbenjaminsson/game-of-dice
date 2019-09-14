package com.example.tarningsspelmedarray;

import java.util.Scanner;
import java.util.Random;

public class TarningsspelMedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int antalKast = 0, summaSpelare = 0, summaDator = 0;
        int[] spelarensKast = new int[2];

        boolean game= true;

        while (game) {
            System.out.print("Välj antal kast eller avsluta spelet: ");
            antalKast = scan.nextInt();

            for (int i = 1; i <= antalKast; i++) {
                spelarensKast[0] = (int) (1 + Math.random() * 6);
                summaSpelare += spelarensKast[0];
                System.out.println("Spelarens kast nr " + i + " blev " + spelarensKast[0] + " och summan är " + summaSpelare);

                spelarensKast[1] = (int) (1 + Math.random() * 6);
                summaDator += spelarensKast[1];
                System.out.println("Datorns kast nr " + i + " blev " + spelarensKast[1] + " och summan är " + summaDator);
            }

            if (summaSpelare > summaDator) {
                System.out.println("");
                System.out.println("Grattis, spelaren vann över datorn");
            } else {
                System.out.println("");
                System.out.println("Grattis, datorn vann över spelaren");
            }

            System.out.println("Vill du fortsätta eller avsluta: ");
            String newGame = scan.nextLine();

            if (newGame.equalsIgnoreCase("Avsluta")) {
                game = false;
            }
        }
    }
}

