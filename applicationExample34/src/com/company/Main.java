package com.company;

import java.util.Scanner;

public class Main {

    //Alt program ile sayının kuvvetini bulan programı yazınız

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Taban sayısını giriniz: ");
        int a = scanner.nextInt();
        System.out.println("Kuvvet sayısını giriniz: ");
        int b = scanner.nextInt();
        kuvvetBul(a,b);
    }
    
    public static int kuvvetBul(int sayi,int kuvvet){
        int sonuc=1;
        for (int i = 1;i<=kuvvet;i++){
            sonuc = sonuc*sayi;
        }
        System.out.println(sayi+" Sayısının "+kuvvet+ " kuvveti: "+sonuc);
        return (sonuc);
    }
}
