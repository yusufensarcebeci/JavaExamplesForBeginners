package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan girilen sayının mükemmel sayı olup olmadığını bulan program

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi, toplam = 0;
        System.out.print("Bir sayi giriniz: ");
        sayi = scan.nextInt();
        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0)
                toplam += i;
        }
        if(sayi == toplam)
            System.out.println(sayi + " Mükemmel bir sayidir");
        else
            System.out.println(sayi + " Mükemmel bir sayi degildir.");
    }
}
