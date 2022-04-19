package com.company;

import java.util.Scanner;

public class Main {

    //Bankaya para yatırılıyor. Faiz oranı ve yıl girildiğinde toplam parayı hesaplayan program

    public static void main(String[] args) {

        double banka =0;
        double para = 10000;

        banka = para;
        for (int i = 0; 10 > i;i++){
            banka += banka*0.14;
            System.out.println(i+1+".yılda banka: "+banka);
        }
        System.out.println("Bankada biriken para: "+banka);
    }
}
