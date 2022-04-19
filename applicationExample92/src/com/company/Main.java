package com.company;

import java.util.Scanner;

public class Main {

    //Girilen 2 sayının ebob unu bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int s1, s2 ,ebob;
        System.out.println("1. sayıyı giriniz: ");
        s1=scanner.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        s2=scanner.nextInt();
        ebob = ebobBul(s1,s2);
        System.out.println("Girilen Sayıların EBOB u: "+ebob);
    }

    public static int ebobBul(int x,int y){
        int ebob , sonuc = 1;
        if(x < y)
            ebob = x;
        else
            ebob = y;
        for (int i = ebob; i > 0; i--){
            if (x%i==0 && y%i==0){
                sonuc=i;
                break;
            }
        }
        return sonuc;
    }
}