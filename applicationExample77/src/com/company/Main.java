package com.company;

import java.util.Scanner;

public class Main {

    //Başlangıç bitiş ve artış değerleri bilgisayara girilen sayıları yazdıran program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int baslangiç,bitis,artis;
        System.out.println("Başlangıç değeri giriniz: ");
        baslangiç = scanner.nextInt();
        System.out.println("Bitis değeri giriniz: ");
        bitis = scanner.nextInt();
        System.out.println("Artis değeri giriniz: ");
        artis = scanner.nextInt();
        if (baslangiç > bitis){
            for (int i = bitis; i<=baslangiç; i +=artis){
                System.out.println(i);
            }

        }else {
            for (int i = baslangiç; i<=bitis; i +=artis){
                System.out.println(i);
            }
        }


    }
}
