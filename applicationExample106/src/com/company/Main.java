package com.company;

import java.util.Scanner;

public class Main {

    //Boyutu  dışarıdan girilen bir kare matris oluşturan proggram

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin Boyutunu Giriniz: ");
        int boyut = scanner.nextInt();
        int [][] dizi = new int[boyut][boyut];
        for (int i = 0; i < boyut ; i++) {
            for (int j = 0; j < boyut; j++) {
                dizi[i][j] = j - i + 1;
                if (dizi[i][j] < 0)
                    dizi[i][j] = Math.abs(dizi[i][j] - 2);
            }
        }
        System.out.println("Oluşan Matris");
        for (int i = 0; i < boyut ; i++) {
            for (int j = 0; j < boyut; j++)
                System.out.print(dizi[i][j] + "\t");
            System.out.println(" ");
        }
    }
}
