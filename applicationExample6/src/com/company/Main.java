package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan sayı ve oran değerleri girilip işlem bittiğinde sayı ile oran değerlerini hesaplayan ve sonucu yazdıran program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sayi, oran, sonuc;
        System.out.println("Sayı Giriniz: ");
        sayi = scanner.nextDouble();
        System.out.println("Oranı Giriniz: ");
        oran = scanner.nextDouble();
        sonuc = sayi * oran /100 ;
        System.out.println("Girilen Sayının yüzde "+oran+" oranı = "+sonuc);
    }
}
