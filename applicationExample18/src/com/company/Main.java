package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen sayının yine dışarıdan girilen sayıya tam bölünüp bölünmediğini bulan ve yazan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bolunen,bolen,sonuc;
        System.out.println("Bölünen Sayıyı Giriniz: ");
        bolunen = scanner.nextInt();
        System.out.println("Bölen Sayıyı Giriniz");
        bolen = scanner.nextInt();
        sonuc = bolunen%bolen;
        if (sonuc==0){
            System.out.println(bolunen+" Sayısı "+bolen+" Sayısına Tam Bölünür ");
        }else {
            System.out.println(bolunen+" Sayısı "+bolen+" Sayısına Tam Bölünmez ");
        }

    }
}
