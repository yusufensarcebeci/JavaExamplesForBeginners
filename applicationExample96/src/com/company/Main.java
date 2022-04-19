package com.company;

import java.util.Scanner;

public class Main {

    //Girilen sayının EKOK unu bulan program

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2, okek;
        System.out.println("1. Sayıyı  Giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.println("2. Sayıyı  Giriniz: ");
        sayi2 = scanner.nextInt();
        okek = okekBul(sayi1,sayi2);
        System.out.println("Girilen Sayıların Okek'i: "+okek);
    }
    public static int okekBul(int s1, int s2){
        int a ,sonuc=1;
        if (s1>s2){
            a = s1;
        }else {
            a=s2;
        }
        for (int i = a;i<=s1*s2;i++){
            if (i % s1 ==0 && i % s2 ==0){
                sonuc = i;
                break;}
        }
        return sonuc;
    }
}