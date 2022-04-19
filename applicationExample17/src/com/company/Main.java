package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan sayı girişi yapılmaktadır. Girilen sayının 3 ve 8 e tam bölünüp bölünmediğini bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Sayı Giriniz: ");
        sayi = scanner.nextInt();
        if (sayi % 3 == 0 && sayi % 8 == 0){
            System.out.println("Sayı 3 e ve 8 e tam bölünür");
        }else {
            System.out.println("Sayı 3 ve 8 e tam bölünmez");
        }
    }
}
