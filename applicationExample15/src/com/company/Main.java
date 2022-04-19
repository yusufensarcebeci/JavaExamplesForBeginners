package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan bilgisayara girilen herhangi sayının tek mi çift mi olduğunu bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Sayıyı Giriniz: ");
        sayi = scanner.nextInt();
        if (sayi%2==0){
            System.out.println("Sayı Çifttir: "+sayi);
        }else {
            System.out.println("Sayı Tektir: "+sayi);
        }

    }
}
