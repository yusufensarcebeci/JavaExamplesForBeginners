package com.company;
import java.util.Scanner;

public class Main {

    //Öğrenciye ait 3 yazılı notu girildikten sonra ortalaması 50 den büyük veya eşitse geçtiniz değilse kaldınız yazan program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double not1, not2, not3, ort;
        System.out.println("1. Yazılı Notunu Giriniz: ");
        not1 = scanner.nextDouble();
        System.out.println("2. Yazılı Notunu Giriniz: ");
        not2 = scanner.nextDouble();
        System.out.println("3. Yazılı Notunu Giriniz: ");
        not3 = scanner.nextDouble();
        ort = (not1+not2+not3)/3;
        System.out.println("Öğrencinin Ortalaması: "+ort);
        if (ort>=50){
            System.out.println("Geçtiniz");
        }else {
            System.out.println("Kaldınız");
        }



    }
}
