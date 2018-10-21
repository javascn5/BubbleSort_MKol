package com.sda.sort;

public class Main {

    public static void main(String[] args) {
        int[] tab = {5, 54, 4, 65, 65, 41, 35, 99, 1, -10, 54};

        System.out.println("Nieposortowane:");
        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println("\n");


        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }

        System.out.println("Posortowane:");
        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }
    }
}
