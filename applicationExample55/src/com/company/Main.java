package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan bilgisayara girilen sayının asal sayı olup olmadığını bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi, a=0;
        System.out.println("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
        for (int i = 1;i<=sayi;i++){
            if (sayi<=1){
                System.out.println("Sayı Asal Değildir: "+sayi);
            }else if (sayi==2){
                System.out.println("Sayı Asaldır: "+sayi);
            }if (sayi%i == 0){
                a++;
            }if(a==2){
                System.out.println("Sayı Asaldir: "+sayi);
            }else {
                System.out.println("Sayı Asal Değildir: "+sayi);
            }
        }
    }
}
