package com.company;

import java.util.Scanner;

public class Main {

    //Sürekli girilen sayıların durma koşulu verildiğinde en büyüğünü while döngüsü kullanarak bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ebs=0;
        while (true){
            System.out.println("Sayı Giriniz: ");
            int sayi = scanner.nextInt();
            if (sayi>ebs){
                ebs = sayi;
            }
            else if (sayi==0){
                System.out.println("En Büyük Sayı: "+ebs);
                break;
            }
        }
    }
}
