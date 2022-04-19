package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen herhangi bir sayının karesini bulup yazdıran program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi, sonuc;
        System.out.println("Sayıyı giriniz: ");
        sayi = scanner.nextInt();
        sonuc = sayi*sayi;
        System.out.println(sayi+" Sayısının Karesi: "+sonuc);

    }
}
