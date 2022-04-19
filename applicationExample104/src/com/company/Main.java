package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan diziye sayı girişi yapılıyor. Bilgi girişi bittikten sonra dizi satırlarını küçükten büyüğe sıralayan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;
        int [] dizi = new int[5];
        for (int i=0;i<5; i++){
            System.out.println("Sayı Giriniz: ");
            dizi[i] = scanner.nextInt();
        }
        for (int i=1;i<5; i++)
            for (int j=0;j<4; j++) {
                if (dizi[j] > dizi[j+1]) {
                    sayi = dizi[j];
                    dizi[j]= dizi[j+1];
                    dizi[j+1] = sayi;
                }
            }
        for (int i = 0; i<5; i++)
            System.out.println(dizi[i]);
    }
}
