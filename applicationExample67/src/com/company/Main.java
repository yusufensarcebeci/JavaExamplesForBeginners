package com.company;

public class Main {

    //1 den 100 e kadar olan sayıların toplamlarını While döngüsü ile bulan program

    public static void main(String[] args) {

        int a = 1; int toplam = 0;
        while (a <= 100){
            toplam +=a;
            a++;
        }
        System.out.println("Toplam= "+toplam);
    }
}
