package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan sürekli olarak girilen pozitif tam sayıların durma koşulu verildiğinde en büyük olanını yazan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bSayi = 0;
        int sayi;
        while (true){
            System.out.println("Sayı giriniz: ");
            sayi = scanner.nextInt();
            if (sayi==0){
                System.out.println("Girilen en büyük sayi: "+bSayi);
                break;
            }else {
                if (sayi>bSayi){
                    bSayi = sayi;
                }
            }
        }

    }
}
