package com.company;

import java.util.Scanner;

public class Main {

    //String değişkene bilgi girişi

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Kullanıcıdan veri almak için kullanılan sınıf
        String isim;
        System.out.println("İsim Giriniz: ");
        isim = scanner.nextLine();
        System.out.println("Girilen İsim : "+isim);

    }
}
