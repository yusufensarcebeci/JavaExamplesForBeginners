package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen 3 sayının geometrik ortalamasını bulan ve ekrana yazan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sayi1,sayi2,sayi3,geoOrt;
        System.out.println("1. Sayıyı giriniz: ");
        sayi1 = scanner.nextDouble();
        System.out.println("2. Sayıyı giriniz: ");
        sayi2 = scanner.nextDouble();
        System.out.println("3. Sayıyı giriniz: ");
        sayi3 = scanner.nextDouble();
        geoOrt = (sayi1*sayi2*sayi3) / (sayi1+sayi2+sayi3);
        System.out.println("Sayıların Geometrik Ortalaması: "+geoOrt);

    }
}
