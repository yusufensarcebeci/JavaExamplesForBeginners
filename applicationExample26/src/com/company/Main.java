package com.company;

import java.util.Scanner;

public class Main {

    //Bir işyerinde bir elemanın günlük ücreti şu şekilde hesaplanmaktadır. İşçinin saat ücreti ile o günkü toplam çalışma saati
    //çarpılıp, bu çarpım 1000 Tl den büyükse %10 vergi kesilmektedir. Çalışma saati 8 den büyükse mesai ücreti günlük çalışma
    //ücretinin iki katıdır. İşçinin günlük ücretini hesaplayan program.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int saatUcret, calismaSaati,netUcret, brutUcret;
        System.out.println("Saat Ücretini Giriniz: ");
        saatUcret=scanner.nextInt();
        System.out.println("Çalısma Saatini Giriniz: ");
        calismaSaati=scanner.nextInt();
        if (calismaSaati<=8){
            brutUcret=saatUcret*calismaSaati;
        }else{
            brutUcret = (saatUcret*8) + ((calismaSaati-8) * (saatUcret*2));
        }
        if (brutUcret>1000){
            netUcret = brutUcret - (brutUcret/10);
        }else {
            netUcret = brutUcret;
        }
        System.out.println("İşçinin net ücreti: "+netUcret);


    }
}
