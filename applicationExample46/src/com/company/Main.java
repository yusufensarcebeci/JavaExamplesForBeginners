package com.company;

import java.util.Scanner;

public class Main {

    //While kullanrak dışarıdan bilgisayara girilen sayının tam bölenlerini bulan(sayi dahil) ve bölenleri ekrana yazan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;
        int i = 1;
        System.out.println("Bir Sayı Giriniz: ");
        sayi = scanner.nextInt();

        while (i<=sayi){
            if (sayi%i ==0){
                System.out.println("Tam Bölen ="+i);
            }
            i++;
        }

    }
}
