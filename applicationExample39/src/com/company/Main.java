package com.company;

import java.util.Scanner;

public class Main {

    //Girilen sayının küpünü hesaplayan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        int sayi  =scanner.nextInt();
        kupHesapla(sayi);

    }
    public static int kupHesapla(int x){
        int sonuc = x*x*x;
        System.out.println(sonuc);
        return sonuc;
    }
}
