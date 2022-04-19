package com.company;

import java.util.Scanner;

public class Main {

    //Boolean değişken kullanımı

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean sonuc;
        int sayi;
        System.out.println("Sayı Giriniz: ");
        sayi=scanner.nextInt();
        sonuc = sayi==5;
        if (sonuc==true){
            System.out.println("Doğru Bildiniz! : "+sayi);
        }else{
            System.out.println("Bilemediniz : "+sayi);
        }

    }
}
