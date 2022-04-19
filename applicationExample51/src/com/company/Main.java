package com.company;

import java.util.Random;

public class Main {
    //Bilgisayar rastgele 1-100 arası sayı  üretmektedir.
    // Üretilen bu sayıların tek ve çift olanlarının sayısını bulan ve ekrana yazan program

    public static void main(String[] args) {

        int sayi, tekAdet=0, ciftAdet=0;
        Random random = new Random();
        for (int i = 1;i <=10;i++){
            sayi = random.nextInt(100);
            System.out.println(sayi);
            if (sayi%2 ==0){
                ciftAdet++;
            }
            else{
                tekAdet++;
            }
        }
        System.out.println("Çift Olanların Sayısı: "+ciftAdet);
        System.out.println("Tek Olanların Sayısı: "+tekAdet);
    }
}
