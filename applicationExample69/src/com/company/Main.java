package com.company;

public class Main {

    //1 den 100e kadar olan çift sayıların toplamını bulan program

    public static void main(String[] args) {

        int toplam = 0;
        for (int i = 1; i <=100;i++){
           if (i%2==0){
               toplam+=i;
           }
       }
        System.out.println("Çift Sayıların Toplamı: "+toplam);
    }
}
