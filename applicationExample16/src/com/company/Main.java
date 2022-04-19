package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen herhangi 1 sayının pozitif, negatif ya da 0 olduğunu bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Sayıyı Giriniz: ");
        sayi= scanner.nextInt();
        if (sayi<0){
            System.out.println("Sayı Negatiftir: "+sayi);
        }else if (sayi==0){
            System.out.println("Girilen Sayı Sıfırdır: "+sayi);
        }else {
            System.out.println("Sayı Pozitiftir: "+sayi);
        }
    }

}
