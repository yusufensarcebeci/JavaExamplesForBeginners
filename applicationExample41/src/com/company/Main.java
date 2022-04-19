package com.company;

import java.util.Scanner;

public class Main {

    //Döngü kullanarak dışarıdan girilen sürekli sayıların durma koşulu verilediğinde toplamlarını bulan ve yazan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        while (true){
            System.out.println("Bir sayı giriniz: ");
            System.out.println("(Bitirmek için 0)");
            int sayi = scanner.nextInt();
            if (sayi==0){
                System.out.println("Girilen sayıların toplamı: "+toplam);
                break;
            }else {
                toplam+=sayi;
            }
        }
    }
}
