package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen sayının Asal Çarpanlarını Bulan ve Ekrana Yazan Program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        for (int i = 2; i <=sayi; i++){
            if (sayi % i == 0){
                System.out.println(i);
                sayi /=i ;
                i--;
            }
        }
    }
}
