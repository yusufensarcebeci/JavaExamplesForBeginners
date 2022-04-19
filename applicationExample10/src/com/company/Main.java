package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen 1. sayının %20 si ile 2. sayının %10 unu  toplayan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sayi1, sayi2, sonuc;
        System.out.println("1. Sayıyı Giriniz: ");
        sayi1 = scanner.nextDouble();
        System.out.println("2. Sayıyı Giriniz: ");
        sayi2 = scanner.nextDouble();
        sonuc = (sayi1 * 0.2) + (sayi2 * 0.1);
        System.out.println("1. sayının %20 si ile 2. sayının %10 unun toplamı: "+sonuc);
    }
}
