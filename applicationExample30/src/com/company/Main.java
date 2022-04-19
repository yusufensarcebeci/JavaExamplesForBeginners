package com.company;

import java.util.Scanner;

public class Main {

    //Switch-Case yapısı kullanarak klavyeden girilen sayının kontrolünü yapan program (1 - 2)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int islem;
        System.out.println("Bir Sayı Giriniz: ");
        islem=scanner.nextInt();


        switch (islem){
            case 1:
                System.out.println("1 Seçtiniz");
                break;

            case 2:
                System.out.println("2 Seçtiniz");
                break;
            default:
                System.out.println("1 ya da 2 Seçmediniz");
        }

    }
}
