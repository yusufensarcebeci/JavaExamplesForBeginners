package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan bilgisayara girilen bir sayının 3 e tam bölünüp bölünmediğini kontrol eden program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        if (sayi%3==0){
            System.out.println("Tam bölünür: "+sayi);
        }else {
            System.out.println("Tam Bölünmez: "+sayi);
        }
    }
}
