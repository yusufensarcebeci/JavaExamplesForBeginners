package com.company;

import java.util.Scanner;

public class Main {

    //2x2 boyutlu bir dizi oluşturarak bilgi girişi yapan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] dizi = new int[3][3];
        for (int i = 0; i <3; i++){
            for (int j = 0; j <=i; j++){
                System.out.printf("Dizinin %d satır, %d sütunu için sayı giriniz: ",i,j);
                dizi[i][j]=scanner.nextInt();
            }
        }
    }
}
