package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan Alış ve KarOran girilip işlem bittiğinde Satış fiyatını hesaplayan ve ekrana yazdıran program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double alis, karOran, satis;
        System.out.println("Alış Fiyatı Giriniz: ");
        alis = scanner.nextDouble();
        System.out.println("Kâr Oranı Giriniz: ");
        karOran = scanner.nextDouble();
        satis = alis + (alis * karOran /100 );
        System.out.println("Satış Fiyatı: "+satis);
    }
}
