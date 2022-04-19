package com.company;

public class Main {

    //1 100 arası asal sayıları ve adedini bulan program

    public static void main(String[] args) {

        int sayac=0;
        for (int sayi = 2; sayi<=100; sayi++)
        {
            int kontrol =0;
            for (int i = 2; i < sayi;i++)
            {
                if (sayi%i==0)
                {
                    kontrol=1;

                }
            }
            if (kontrol != 1)
            {
                System.out.println(sayi+" Asaldır");
                sayac++;
            }
        }
        System.out.println("******************");
        System.out.println(sayac+" Adet asal sayı vardır");
    }
}
