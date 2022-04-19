package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //Sayı Tahmin Oyunu

    public static void main(String[] args) {
        tahmin();
    }

    public static void tahmin(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sayac = 1;
        System.out.println("Lütfen 1-100 arasında bir sayı giriniz: ");
        int tahmin = scanner.nextInt();
        int sayi = random.nextInt(100);

        while (tahmin != sayi) {
            if(tahmin>100 || tahmin<0 )
            {
                System.out.println("1 ile 100 arasında bir değer giriniz: ");
                tahmin = scanner.nextInt();
                sayac++;
            }
            else if (tahmin < sayi)
            {
                System.out.println("Daha Büyük Giriniz: ");
                tahmin = scanner.nextInt();
                sayac++;

            }
            else
            {
                System.out.println("Daha Küçük Giriniz: ");
                tahmin = scanner.nextInt();
                sayac++;

            }
        }
        System.out.println("Tebrikler Bildiniz!! : "+sayi);
        System.out.println(sayac+" Adımda Bildiniz...");
    }


}



