package com.company;

public class Main {

    //1-10 arası sayıların toplamını bulan ve sonucu ekrana yazan program

    public static void main(String[] args) {

        int t = 0;
        for (int i = 1; i <= 10 ;i++){
            t+=i;
        }
        System.out.println("Sayıların Toplamı: "+t);
    }
}
