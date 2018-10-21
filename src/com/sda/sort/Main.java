package com.sda.sort;

public class Main {

    public static void main(String[] args) {
        int[] tab = {11, 10, 14, 15, 20, 34, 3, 41, 42, 44, 54};
        boolean sorted = true;
        int qIteracji = 0;

        System.out.println("Nieposortowane:");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("\n");


        for (int i = 0; i < tab.length - 1; i++) {
            sorted = true;
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                    sorted = false;
                }
                qIteracji++;
            }
            if (sorted == true) {
                break;
            }
        }

        System.out.println("Ilosc iteracji: " + qIteracji);

        System.out.println("Posortowane:");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
