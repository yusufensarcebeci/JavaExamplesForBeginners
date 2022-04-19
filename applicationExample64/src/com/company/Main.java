package com.company;

import java.util.Scanner;

public class Main {

    //Klavyeden basılan bir tuşun ASCII karşılığını veren program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Karakteri Giriniz: ");
        String i = scanner.nextLine();
        char c = i.charAt(0);

        int ascii = (int) c;
        System.out.println(i+"--> ASCII karşılığı: "+ascii);

    }

}
