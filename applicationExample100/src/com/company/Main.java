package com.company;

import java.util.Scanner;

public class Main {

    //5 Elemanlı bir diziye bilgi girişi yapılıyor. Bilgi girişi bittiğinde bilgileri ayrı bir diziye tersten yazdıran program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] sayilar  = new int[5];
        int[] tersSayilar = new int[sayilar.length];
        for (int i = 0; i < 5; i++){
            System.out.println("Sayı Giriniz: ");
            sayilar[i] = scanner.nextInt();
        }
        for (int j = 0 ; j< sayilar.length; j++){
            tersSayilar[j] = sayilar[sayilar.length-1-j];
        }
        for (int k=0; k < 5 ; k++){
            System.out.println(tersSayilar[k]);
        }

    }
}
