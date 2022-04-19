package com.company;

import java.util.Scanner;

public class Main {

    //Ekrana girilen satır sayısı kadar üçgen çizen program

    public static void main(String[] args) {

        Scanner scanner =new Scanner( System.in);
        System.out.println("Bir Sayı Giriniz :");
        int sayi =scanner.nextInt();
        for(int i=0;i<=sayi-1;i++){
            for(int j=0;j<=(sayi-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
