package com.company;

import java.util.Scanner;

public class Main {

    //While döngüsü ile break ve continue komutlarının kullanımı

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        while (true){
            System.out.println("Bir Sayı Giriniz: ");
            int sayi = scanner.nextInt();
            if(sayi== 0){
                break;
            }
            if (sayi<0){
                System.out.println("Pozitif sayı giriniz: ");
                continue;
            }
            else {
                toplam = toplam +sayi;
            }
            System.out.println("Girilen pozitif sayıların toplamı: "+toplam);
        }


    }
}
