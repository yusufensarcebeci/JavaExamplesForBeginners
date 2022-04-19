package com.company;

import java.util.Scanner;

public class Main {

    //Taban ve Kuvvet değerleri dışarıdan bilgisayara giriliyor. Verilen tabana göre kuvvet değerini hesaplayan program

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        int kuvvet, taban , sonuc = 1;
        System.out.println("Kuvvet Giriniz: ");
        kuvvet=scanner.nextInt();
        System.out.println("Taban Giriniz: ");
        taban=scanner.nextInt();
        for (int i = 1; i<= kuvvet;i++){
            sonuc *=taban;
        }
        System.out.println("Girilen "+taban+" sayısının "+kuvvet+" kuvveti: "+sonuc);
    }
}
