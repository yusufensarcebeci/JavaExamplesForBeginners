package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    //Dışarıdan bilgisayara girilen bir sayının faktöriyelini bulan program

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = scanner.nextInt();
        int fak = 1;
        for (int i = 1;i<=sayi;i++){
            fak = fak*i;
        }
        System.out.println(sayi+"'nin faktöriyeli: "+fak);
    }
}
