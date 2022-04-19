package com.company;

import java.util.Scanner;

public class Main {

    //Başlangıç ve bitiş değeri verilen sayılar arasında kalan sayıların asal olanlarını bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int basla, bitis,adet;
        System.out.println("Başlangıç Değerini Giriniz: ");
        basla = scanner.nextInt();
        System.out.println("Bitiş Değerini Giriniz: ");
        bitis = scanner.nextInt();
        for (int i = basla;i<=bitis;i++)
        {
            adet = 0;
            for (int j = 1;j<=i;j++)
            {
                if (i % j == 0)
                {
                    adet++;
                }
            }
            if (adet==2)
            {
                System.out.println(i);
            }
        }
        {

        }
    }
}
