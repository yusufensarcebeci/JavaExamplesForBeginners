package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 5 satırlı bir diziye isim bilgisi giriliyor.
    //Giriş bittikten sonra dışarıdan girilen bir ismi dizi içerisinde aratan program

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] isimler = new String[5];
        for (int i = 0; i <5; i++){
            System.out.println("İsim Giriniz: ");
            isimler[i] = scanner.nextLine();
        }
        System.out.println("Aranacak ismi giriniz...");
        String isimBul = scanner.nextLine();
        int deger = Arrays.binarySearch(isimler,isimBul);
        if (deger > 0)
            System.out.println("Kayıt Bulundu: "+isimBul);
        else
            System.out.println("Kayıt Bulunamadı... : "+isimBul);

    }
}
