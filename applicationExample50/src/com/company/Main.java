package com.company;

import java.util.Scanner;

public class Main {

    //Girilen sayı kadar istenilen metni yazan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metin Giriniz: ");
        String metin = scanner.nextLine();
        System.out.println("Kaç defa yazayım: ");
        int sayi = scanner.nextInt();
        for (int i = 1; i<=sayi; i++){
            System.out.println(i +". "+ metin);
        }
    }
}
