package com.company;

public class Main {

    //1 den 10 a kadar olan tek sayıların toplamını bulan program

    public static void main(String[] args) {

        int toplam=0;
        for (int i = 0;i<=10;i++){
            if (i%2!=0){
                toplam = i+toplam;
            }
        }
        System.out.println("Toplam: "+toplam);

    }
}
