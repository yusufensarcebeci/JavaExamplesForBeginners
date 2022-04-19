package com.company;

import java.util.Scanner;

public class Main {

    //Negatif sayılar girilinceye kadar girilen sayının karekökünü bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Sayı Giriniz: ");
            int sayi = scanner.nextInt();
            if (sayi < 0){
                break;
            }
            System.out.println(Math.sqrt(sayi));
        }
        System.out.println("Negatif Sayı Girdiniz.. ");
    }
}
