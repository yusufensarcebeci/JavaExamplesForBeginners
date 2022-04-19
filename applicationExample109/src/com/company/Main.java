package com.company;

import java.util.Scanner;

public class Main {

    //Sabir değerli dizi tanımlaması

    public static void main(String[] args) {
        int [] sayilar = new int[7];
        sayilar[0] = 0;
        sayilar[1] = 10;
        sayilar[2] = 20;
        sayilar[3] = 30;
        sayilar[4] = 40;
        sayilar[5] = 50;
        sayilar[6] = 60;
        for (int i = 0; i<7;i++)
            System.out.printf("A nın [%d] değeri = %d \n",i,sayilar[i]);
    }
}
