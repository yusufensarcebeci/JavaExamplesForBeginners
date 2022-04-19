package com.company;

import java.util.Scanner;

public class Main {

    //5 adet sayı giriliyor. 50 den yüksek olanlarını toplayan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi, toplam=0;
        for (int i = 0;i<5;i++){
            System.out.println("Sayı Giriniz: ");
            sayi = scanner.nextInt();
            if (sayi>=50){
                toplam+=sayi;
            }
        }
        System.out.println("Toplam: "+toplam);

    }
}
