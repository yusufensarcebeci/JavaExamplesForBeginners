package com.company;

public class Main {

    //1-100 arası sayıların tek ve çift toplamlarını bulan ve çift toplmadan tek toplamı çıkaran program

    public static void main(String[] args) {

        int tekT=0, ciftT=0;
        for (int i = 0;i<=100;i++){
            if (i%2==0)
            {ciftT += i;}
            else
            {tekT += i;}
        }
        System.out.println("Çift Sayıların Toplamı: "+ciftT);
        System.out.println("Tek Sayıların Toplamı: "+tekT);
        System.out.println("Çift Sayıların Toplamı - Tek Sayıların Toplamı= "+(ciftT-tekT));
        }
    }

