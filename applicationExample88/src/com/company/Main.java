package com.company;

import java.util.Scanner;

public class Main {

    // Pascal Üçgeninin ilk beş satırıno ekrana yazan  program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını girin: ");
        int satir = scanner.nextInt();
        for (int i=0; i < satir;i++){
            int a = 1;
            for (int b=0; b< satir - i ;b++){
                System.out.println();
            }
            for (int c=0; c <= i; c++){
                System.out.printf("%d, ",a);
                a = a * (i - c) / (c + 1);
            }
            System.out.println();
        }
    }
}
