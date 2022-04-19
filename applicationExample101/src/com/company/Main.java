package com.company;

import java.util.Scanner;

public class Main {

    //10 öğrencinin notu diziye aktarılıyor. Bilgi girişi bittiğinde
    //sınıfın ortalamasını bularak ortalamadan yüksek alan öğrenciler geçti diğerleri kaldı yazan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] notlar = new int[10];
        int sayi, toplam = 0;
        double ort = 0.0;
        for (int i = 0; 10>i;i++){
            System.out.println((i+1)+". Notu Giriniz: ");
            sayi = scanner.nextInt();
            notlar[i] = sayi;
            toplam += sayi;
        }
        ort = toplam / 10;
        System.out.println("Ortalama = "+ort);

        for (int i =0; notlar.length > i; i++){
            if(notlar[i] > ort)
                System.out.println((i+1)+". Öğrenci Geçti");
            else
                System.out.println((i+1)+". Öğrenci Kaldı");
        }
    }
}
