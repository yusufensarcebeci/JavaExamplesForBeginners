package com.company;

import java.util.Scanner;

public class Main {

    //2 kenarı verilen dik üçgenin hipotenüsünü bulan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. kenarı giriniz: ");
        int kenar1 = scanner.nextInt();
        System.out.println("2. kenarı giriniz: ");
        int kenar2 = scanner.nextInt();
        pisagor(kenar1,kenar2);

    }

    static int pisagor(int x, int y){
        int islem = 0;
        double hipotenüs = Math.sqrt(x*x+y*y);
        System.out.println("Hipotenüs uzunluğu: "+hipotenüs);
        return islem;
    }
}
