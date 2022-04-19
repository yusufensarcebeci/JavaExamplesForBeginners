package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen herhangi bir sayınon 0-100 aralığında olup olmadığını bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Sayıyı  Giriniz: ");
        sayi= scanner.nextInt();
        if (sayi>=0 && sayi<=100){
            System.out.println("0-100 Arasında Sayı Girdiniz: "+sayi);
        }else{
            System.out.println("Sayı 0-100 Arasında Değildir: "+sayi);
        }
    }
}
