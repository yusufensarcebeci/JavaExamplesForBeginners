package com.company;

import java.util.Scanner;

public class Main {

    //Diziler yardımı ile 2x2 boyutunda a ve b matrislere sayılar giriliyor.
    //Bilgi girişi bittiğinde toplam matrisi hesaplayan program

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] a = new int[2][2];
        int [][] b = new int[2][2];
        for (int i = 0;i < 2; i++){
            for (int j = 0;j < 2; j++){
                System.out.printf("A matrisinin %d satır %d sütunu giriniz: ",i+1,j+1 );
                a[i][j] = scanner.nextInt();
                System.out.printf("B matrisinin %d satır %d sütunu giriniz: ",i+1,j+1 );
                b[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\n2 Matrisin sonucunda oluşan matris \n");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("\t"+a[i][j]+b[i][j]);

    }
}
