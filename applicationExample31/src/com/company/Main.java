package com.company;

import java.util.Scanner;

public class Main {

    //Klavyeden girilen tuşu kontrol eden program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Bir tuşa basınız: ");
        str = scanner.nextLine();
        char chr = str.charAt(0);
        int ascii= chr;
        if (ascii>=48 && ascii<=57){
            System.out.println("Sayı girdiniz: "+chr+" , Ascii: "+ascii );
        }else if (ascii>=65 && ascii<=96){
            System.out.println("Büyük Harf Girdiniz: "+chr+" , Ascii: "+ascii );
        }else if (ascii>=97 && ascii<=120){
            System.out.println("Küçük Harf Girdiniz: "+chr+" , Ascii: "+ascii );
        }else {
            System.out.println("Başka Bir Tuşa Bastınız: "+chr+" , Ascii: "+ascii );
        }



    }
}
