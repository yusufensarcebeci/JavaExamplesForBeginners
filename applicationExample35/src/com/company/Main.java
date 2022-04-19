package com.company;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class Main {

    //Girilen sayıya kadar olan sayıların toplamını bulan programı kullanarak yazınız

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int a = scanner.nextInt();
        toplamBul(a);
    }

    public static int toplamBul(int sayi){
        int toplam = 0;
        for (int i = 0;i<=sayi;i++){
            toplam +=i;
        }
        System.out.println("Toplam: "+toplam);
        return (toplam);
    }
}
