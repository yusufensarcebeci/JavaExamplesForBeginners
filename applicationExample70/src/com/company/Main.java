package com.company;

import java.util.Scanner;

public class Main {

    //Girilen 2 sayı arasındaki sayıların toplamını bularak ortalamasını hesaplayan program

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        int s1,s2,sayac=0,toplam=0;
        double ort = 0.0;
        
        System.out.println("1. sayıyı giriniz: ");
        s1 = scanner.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        s2 = scanner.nextInt();

        if (s1>s2){
            for (int i = s2; i<=s1;i++){
                toplam+=i;
                sayac++;
            }
        }else {
            for (int i = s1; i<=s2;i++) {
                toplam += i;
                sayac++;
            }
        }
        ort = toplam/sayac;
        System.out.println("Sayıların Toplamı: "+toplam);
        System.out.println("Sayıların Ortalaması: "+ort);

    }
}
