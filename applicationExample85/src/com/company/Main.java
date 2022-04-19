package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen bir tam sayıya kadar olan tüm tam sayıları toplayıp ortalamasını bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi,toplam=0;
        System.out.println("Bir sayı giriniz: ");
        sayi=scanner.nextInt();
        for (int i = 0; i<sayi; i++){
            toplam +=i;
        }
        System.out.println(sayi+" a Kadar Olam Tüm Sayıların Toplamı: "+toplam);
    }
}
