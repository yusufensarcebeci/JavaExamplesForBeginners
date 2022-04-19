package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan bilgisayara 10 adet sayı girişi yapılmaktadır

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi, toplam=0;
        for (int i = 1; i <=10 ;i++){
            System.out.println("Sayı giriniz: ");
            sayi = scanner.nextInt();
            toplam +=sayi;
        }
        System.out.println("Toplam = "+toplam);

    }
}
