package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen sayıya kadar olan sayıların çift ve tek olanlarını ayrı ayrı toplayan program

    public static void main(String[] args) {
        tekCiftTopla();
    }
    public static void tekCiftTopla(){
        Scanner scanner = new Scanner(System.in);
        int ciftT=0, tekT=0,sayi;
        System.out.println("Sayı Giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 0;i<sayi;i++){
            if (i%2==0)
            {ciftT += i;}
            else
            {tekT += i;}
        }
        System.out.println("Çift Sayıların Toplamı: "+ciftT);
        System.out.println("Tek Sayıların Toplamı: "+tekT);
    }

}
