package com.company;

public class Main {

    //1 den 10 a kadar olan sayıların karelerinin toplamını bulan programı yazınız
    //Java da repeat until yok

    public static void main(String[] args) {

        int kt = 0;
        int i = 0;
        while (i<=10){
            kt = kt + i * i;
            i++;
        }
        System.out.println("1 den 10 a kadar olan sayıların toplamı: "+kt);
    }
}
