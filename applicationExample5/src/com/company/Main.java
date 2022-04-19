package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan bilgisayara girilen 2 sayı ile 4 işlem yapan ve sonuçları ekrana yazdıran program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sayi1, sayi2, toplam, fark, carpim, bolum;
        System.out.println("1. sayıyı giriniz: ");
        sayi1 = scanner.nextDouble();
        System.out.println("2. sayıyı giriniz: ");
        sayi2 = scanner.nextDouble();
        toplam = sayi1 + sayi2;
        fark = sayi1 - sayi2;
        carpim = sayi1 * sayi2;
        bolum = sayi1 / sayi2;
        System.out.println("Sayıların Toplamı: "+toplam);
        System.out.println("Sayıların Farkı: "+fark);
        System.out.println("Sayıların Çarpımı: "+carpim);
        System.out.println("Sayıların Bölümü: "+bolum);
    }
}
