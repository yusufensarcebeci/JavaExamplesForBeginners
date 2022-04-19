package com.company;

import java.util.Scanner;

public class Main {

    //Ad ve soyad bilgileri dışarıdan girilen ve işlem bittiğinde ekrana 'Merhaba Ad Soyad' yazan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ad, soyad;
        System.out.println("Adınızı Giriniz: ");
        ad = scanner.nextLine();
        System.out.println("Soyadınızı Giriniz: ");
        soyad = scanner.nextLine();
        System.out.println("Merhaba "+ad+"\s"+soyad); // "\s" ifadesi boşluk bırakır.
    }
}
