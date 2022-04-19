package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen sayının kontrolunu yapan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Sayıyı Giriniz: ");
        sayi= scanner.nextInt();
        if (sayi == 1 || sayi == 5){
            System.out.println("Doğru Girdiniz (1 ya da 5): "+sayi);
        }else{
            System.out.println("Farklı Bir Sayı Girdiniz: "+sayi);
        }
    }
}
