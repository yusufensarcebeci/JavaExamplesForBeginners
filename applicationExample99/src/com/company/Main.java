package com.company;

import java.util.Scanner;

public class Main {

    //10 Elemanlı bir diziye dışarıdan pozitif sayılar giriliyor. Giriş bittiğinde dizideki sayılardan en büyüğünü bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bSayi = 0;
        int[] sayilar = new int[10];
        for (int i = 0;i <= 9;i++){
            System.out.println("Sayı Giriniz: ");
            sayilar[i] = scanner.nextInt();
            if (sayilar[i] > bSayi)
                bSayi = sayilar[i];
        }
        System.out.println("Girilen En Büyük Sayı: "+bSayi);
    }
}
