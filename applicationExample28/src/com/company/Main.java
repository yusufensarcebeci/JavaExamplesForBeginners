package com.company;

import java.util.Scanner;

public class Main {

    //Vize ve final sınav notlarının; vizenin %40 ını, finalin %60 ını alarak ortalamsını bulan ve
    //ortalaması 60 ve üzeri olan kişinin durumunu "geçtiniz", altında ise "kaldınız" yazdıran program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double vizeNot, finalNot, ort;
        System.out.println("Vize Notunu Giriniz: ");
        vizeNot = scanner.nextInt();
        System.out.println("Final Notunu Giriniz: ");
        finalNot = scanner.nextInt();
        ort = ((vizeNot*0.4) + (finalNot*0.6));
        if (ort>=60){
            System.out.println("Geçtiniz: "+ort);
        }else {
            System.out.println("Kaldınız: "+ort);
        }


    }
}
