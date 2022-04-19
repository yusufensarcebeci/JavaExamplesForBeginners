package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan bilgisayara girilen tamsayıyı ekrana yazdıran program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Sayı giriniz: ");
        sayi = scanner.nextInt();
        System.out.println("Girdiğiniz sayı: "+sayi);

    }
}
