package com.company;

import java.util.Scanner;

public class Main {

    //Bir işyerinde bir elemanın günlük ücreti şöyle hesaplanmaktadır. İşçinin saat ücreti ile o günkü toplam çalışma
    //saati çarpılıp, bu çarpım 100 TL'den büyükse 100 Tl vergi kesilir. İşçinin günlük ücretini hesaplayan program

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int saatUcret, calismaSaat, netUcret, brutUcret;
        System.out.println("İşçinin Saat Ücretini Giriniz: ");
        saatUcret = scanner.nextInt();
        System.out.println("İşçinin Çalışma Saatini Giriniz: ");
        calismaSaat = scanner.nextInt();
        brutUcret = saatUcret * calismaSaat;
        if (brutUcret>1000){
            netUcret = brutUcret - 100;
        }else{
            netUcret = brutUcret;
        }
        System.out.println("İşçinin Net Ücreti: "+netUcret);
    }
}
