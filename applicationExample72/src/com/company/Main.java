package com.company;

import java.util.Scanner;

public class Main {

//Yalnızca toplama işlemi yaparak dışarıdan girilen 1. sayıyı 2. sayıya carpan program

    public static void main(String[] args) {

        int s1,s2,carpım=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı  giriniz: ");
        s1= scanner.nextInt();
        System.out.println("2. sayıyı  giriniz: ");
        s2= scanner.nextInt();
        for (int i = 1; i<=s2;i++){
            carpım = carpım + s1;
        }
        System.out.println("Carpım: "+carpım);
    }
}