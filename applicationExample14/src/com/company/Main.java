package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen 2 sayıyı büyüklük bakımından karşılaştıran program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2;
        System.out.println("1. Sayıyı Giriniz: ");
        sayi1=scanner.nextInt();
        System.out.println("2. Sayıyı Giriniz: ");
        sayi2 = scanner.nextInt();
        if (sayi1>sayi2){
            System.out.println("Sayı 1 Büyüktür");
        }else if (sayi1==sayi2){
            System.out.println("Sayılar Eşittir");
        }else{
            System.out.println("Sayı 2 Büyüktür");
        }
    }
}
