package com.company;

import java.util.Scanner;

public class Main {

    //Kısa ve Uzun kenarı girilen dikdörtgenin alanı ve çevresini hesaplayan program.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        float kisaKenar, uzunKenar, alan, cevre;
        System.out.println("Kısa Kenarı Giriniz: ");
        kisaKenar = scanner.nextFloat();
        System.out.println("Uzun Kenarı Giriniz: ");
        uzunKenar = scanner.nextFloat();
        alan = kisaKenar * uzunKenar;
        cevre = 2*(kisaKenar+uzunKenar);
        System.out.println("Dikdörtgenin Alanı: "+alan+"m²");
        System.out.println("Dikdörtgenin Çevresi: "+cevre);
    }
}
