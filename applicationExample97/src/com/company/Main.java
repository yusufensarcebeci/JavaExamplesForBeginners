package com.company;

import java.util.Scanner;

public class Main {

    //Girilen 2 sayıdan büyük olanı geri gönderen fonksiyon

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int s1, s2;
        System.out.println("1. sayıyı giriniz: ");
        s1 = scanner.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        s2 = scanner.nextInt();
        System.out.println("Girilen Büyük Sayı: "+buyuk(s1,s2));
    }
    public static int buyuk(int s1, int s2){
        if (s1 > s2)
            return s1;
        else if (s2 > s1)
            return s2;
        else
            return s1;
    }
}
