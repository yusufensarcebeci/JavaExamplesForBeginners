package com.company;

import java.util.Scanner;

public class Main {

    //Alt program örneği

    public static void main(String[] args) {
        yaz();
        oku();
    }
    public static void yaz(){
        System.out.println("Merhaba");
        System.out.println("Devam etmek için bir tuşa basınız");
        Scanner scanner = new Scanner(System.in);
        String tus = scanner.nextLine();
    }
    public static void oku(){
        System.out.println("Okuyorum");
    }
}
