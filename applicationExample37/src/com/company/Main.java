package com.company;

public class Main {

    //Fonksiyon kullanarak 1'den 16 ya kadar çift sayıları yazdıran program

    public static void main(String[] args) {

        int a = 0;
        while (a < 16){
            a = ciftBul(a);
            System.out.println(a);
        }
    }

    public static int ciftBul(int x){
        return x + 2;
    }
}
