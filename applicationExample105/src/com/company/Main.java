package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen herhangi bir tam sayının rakamlarının farklı olup olmadığını bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi, uzunluk = 0;
        boolean rakamfark;
        System.out.println("Sayı Giriniz: ");
        sayi = scanner.nextInt();
        uzunluk = String.valueOf(sayi).length();
        int[] rakamlar = new int[uzunluk];
        rakamfark = true;
        for (int  i = 0; i<uzunluk;i++){
            if (sayi>=1){
                rakamlar[i] = sayi%10;
                sayi/=10; }
            for (int j = 0; j<i;j++)
                if (rakamlar[i]==rakamlar[j]){
                    rakamfark = false;
                    break; }
            if (rakamfark==false)
                break;
        }
        if (rakamfark)
            System.out.println("Girilen Sayının Rakamları Farklı");
        else
            System.out.println("Girilen Sayının Rakamları Birbirinden Farklı Değil");
    }
}
