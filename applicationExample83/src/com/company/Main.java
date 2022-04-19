package com.company;

import java.util.Scanner;

public class Main {

    //Girilen Sayının Mutlak Değerini Hesaplayan Program

    public static void main(String[] args) {
        mutlakHesapla();
    }
    public static void mutlakHesapla(){
        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Sayı Giriniz: ");
        sayi = scanner.nextInt();
        if (sayi<0){
            // %d = Decimal Integer = Ondalık Tamsayı
            System.out.printf("|%d| = %d",sayi,(sayi*-1));
        }else {
            System.out.printf("|%d| = %d",sayi,sayi);
        }
    }
}
