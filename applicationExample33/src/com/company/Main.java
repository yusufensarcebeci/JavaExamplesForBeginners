package com.company;

public class Main {

    //Parametreli procedure kullanımı

    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        islem(a,b);
        
    }
    public static boolean islem(int x, int y){
        int sonuc = x + y;
        System.out.println("Sonuç: "+sonuc);
        return true;
    }

}
