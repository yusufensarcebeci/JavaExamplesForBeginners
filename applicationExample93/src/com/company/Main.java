package com.company;

import java.util.Scanner;

public class Main {

    //Girilen çif bir sayının mutlak değerini, karesini, karekökünü bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı  Giriniz: ");
        int sayi = scanner.nextInt();
        if (sayi%2==0){
            if (sayi<0){
                System.out.printf("|%d| = %d",sayi,sayi*-1);
            }else {
                System.out.printf("|%d| = %d",sayi,sayi);
            }
            System.out.println();
            System.out.println("Sayının Karesi= "+sayi*sayi);
            System.out.println("Sayının Karekökü= "+Math.sqrt(sayi));
        }else {
            System.out.println("Çift Sayı Giriniz");
        }
    }
}