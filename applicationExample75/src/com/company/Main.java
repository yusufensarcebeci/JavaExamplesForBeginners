package com.company;

import java.awt.font.FontRenderContext;
import java.util.Random;

public class Main {

    //Bilgisayar 0-100 arasında rastgele 10 sayı üretir. 50 den yüksek olanlarının ortalamsını bulan program

    public static void main(String[] args) {

        Random random = new Random();
        int sayi,sayac=0,toplam=0,ort=0;
        for (int i = 1;i<=10;i++){
             sayi= random.nextInt(100);
            if (sayi>=50){
                toplam+=sayi;
                sayac++;
            }
        }
        ort=toplam/sayac;
        System.out.println("Ortalama: "+ort);

    }
}
