package com.company;

public class Main {

    //While kullanarak 1 den 10 a kadar olan sayıların toplamını bulan program

    public static void main(String[] args) {

        int t = 0;
        int i = 0;
        while (i<=10){
            t = t + i;
            i++;
        }
        System.out.println("1 den 10 a kadar olan sayıların toplamı: "+t);
    }
    }

