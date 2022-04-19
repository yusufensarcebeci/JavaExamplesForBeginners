package com.company;

import java.util.Scanner;

public class Main {

    //Dışarıdan bilgisayara girilen sayıya kadar olan sayıların asal olanlarını ekrana yazan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int adet, sayi;
        System.out.println("Sayı Giriniz: ");
        sayi = scanner.nextInt();
        for (int i = 1; i<=sayi;i++)
        {
            adet=0;
            for (int j = 1;j<=i;j++)
            {
                if (i % j ==0)
                {
                    adet++;
                }
            }
            if (adet==2)
            {
                System.out.println(i);
            }
        }
    }
}
