package com.company;

import java.util.Scanner;

public class Main {

    //Öğrenci notu 0-49 aralığında ise başarısız, 50-100 aralığında ise başarılı yazdıran program

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int not;
        System.out.println("Öğrencinin Notunu Giriniz: ");
        not = scanner.nextInt();
        if (not>=0 && not<=49){
            System.out.println("Başarısız: "+not);
        }else if (not>=50 && not<=100) {
            System.out.println("Başarılı: "+not);
        }
    }
}
