package com.company;

import java.util.Scanner;

public class Main {

    //Yıl sonu notu girilen öğrencinin notunun harf karşılığını bulan program
    //( 0-60 =F1, 60-69=C, 70-74=B2, 75-84=B1, 85-89=A2, 90-100=A1 )

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int not;
        System.out.println("Öğrencinin Notunu Giriniz: ");
        not = scanner.nextInt();
        if (not>=0 && not<=60){
            System.out.println("F1");
        }else if (not>=60 && not<=69){
            System.out.println("C");
        }else if (not>=70 && not<=74){
            System.out.println("B2");
        }else if (not>=74 && not<=84){
            System.out.println("B1");
        }else if (not>=85 && not<=89){
            System.out.println("A2");
        }else if (not>=90 && not<=100){
            System.out.println("A1");
        }

    }
}
