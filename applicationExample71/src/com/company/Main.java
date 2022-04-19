package com.company;

import java.util.Scanner;

public class Main {

    //Yalnızca çıkarma işlemi yaparak dışarıdan girilen 1. sayıyı 2. sayıya bölen, blüm ve kalanı yazan program

    public static void main(String[] args) {

        int s1,s2,bolum=0,kalan=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı  giriniz: ");
        s1= scanner.nextInt();
        System.out.println("2. sayıyı  giriniz: ");
        s2= scanner.nextInt();
        while (s1>s2){
            kalan = s1 - s2;
            bolum++;
            s1 = kalan;
        }
        System.out.println("Bölüm: "+bolum);
        System.out.println("Kalan: "+kalan);
    }
}
