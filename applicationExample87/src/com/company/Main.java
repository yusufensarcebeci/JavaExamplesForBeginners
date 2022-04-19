package com.company;

import java.util.Scanner;

public class Main {

    //Üçgenin kenar uzunlukları bilgisayara giriliyor. Girilen uzunluklara göre çeşidini bulan ve ekrana yazan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("A Kenarını Giriniz: ");
        a = scanner.nextInt();
        System.out.println("B Kenarını Giriniz: ");
        b = scanner.nextInt();
        System.out.println("C Kenarını Giriniz: ");
        c = scanner.nextInt();
        if (a>0 && b>0 && c>0){
            if (a==b && a==c){
                System.out.println("EşKenar Üçgen!");
            }
            else if (a!=b && b!=c && a!=c){
                System.out.println("ÇeşitKenar Üçgen");
            }
            else{
                System.out.println("İkizkenar Üçgen");
            }
        }else {
            System.out.println("Yanlış Giriş Yaptınız!");
        }
    }
}
