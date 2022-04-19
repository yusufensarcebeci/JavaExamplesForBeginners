package com.company;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {

    //Dışarıdan bilgisayara girilen tek ve çift sayıların toplamlarını ayrı ayrı bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tekSnc = 0, ciftSnc = 0, sayi = 1;
        while (sayi!=0){
            System.out.println("Sayi Giriniz: ");
            sayi= scanner.nextInt();
            if (sayi%2==0){
                ciftSnc = ciftSnc + sayi;
            }else {
                tekSnc = tekSnc + sayi;
            }
        }
        System.out.println("Çift Sayıların Toplamı: "+ciftSnc);
        System.out.println("Tek Sayıların Toplamı: "+tekSnc);

    }
}
