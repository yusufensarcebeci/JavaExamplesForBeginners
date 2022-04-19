package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan bilgisayara girilen 3 tam sayıyı küçükten büyüğe sıralayan program (if)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Tam Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("2. Tam Sayıyı Giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println("3. Tam Sayıyı Giriniz: ");
        int sayi3 = scanner.nextInt();

        if (sayi1>sayi2 && sayi1>sayi3){
            if (sayi2>sayi3){
                System.out.println("Sıralama: "+sayi1+" > "+sayi2+" > "+sayi3);
            }else {
                System.out.println("Sıralama: "+sayi1+" > "+sayi3+" > "+sayi2);
            }
        }else if (sayi2>sayi1 && sayi2>sayi3){
            if (sayi1>sayi3){
                System.out.println("Sıralama: "+sayi2+" > "+sayi1+" > "+sayi3);
            }else {
                System.out.println("Sıralama: "+sayi2+" > "+sayi3+" > "+sayi1);
            }
        }else {
            if (sayi1 > sayi2) {
                System.out.println("Sıralama: " + sayi3 + " > " + sayi1 + " > " + sayi2);
            }else {
                System.out.println("Sıralama: " + sayi3 + " > " + sayi2 + " > " + sayi1);
            }
        }
    }
}
