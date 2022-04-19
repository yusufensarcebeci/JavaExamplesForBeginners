package com.company;

import java.util.Scanner;

public class Main {

    //Matematiksel işlemcilerin kullanımına yönelik, dışarıdan girilen 2 sayıyı toplayan ve sonucu ekrana yazan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2, toplam;
        System.out.println("1. Sayıyı Giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.println("2. Sayıyı Giriniz: ");
        sayi2 = scanner.nextInt();
        toplam = sayi1+sayi2;
        System.out.println("Girilen Sayıların Toplamı: "+toplam);
    }
}
