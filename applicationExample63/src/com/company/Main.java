package com.company;

import java.util.Scanner;

public class Main {

    //1 den N' e kadar olan sayıların toplamını bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplam = 0, sayi ;
        System.out.println("Sayı Giriniz: ");
        sayi = scanner.nextInt();
        for (int i = 0; i <=sayi ;i++){
            toplam +=i;
        }
        System.out.println("Toplam = "+toplam);

    }
}
