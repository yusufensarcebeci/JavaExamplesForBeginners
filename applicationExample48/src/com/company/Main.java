package com.company;

import java.util.Scanner;

public class Main {

    ///Dışarıdan bilgisayara sürekli olarak sayı girişi yapılmaktadır. While dönüsünü kullanarak girilen sayıların
    // en büyük ve en küçük olanlarını ayrı ayrı bularak ekrana yazan programı yazınız

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ebs = -2147483648;
        int eks = 2147483647;
        while(true){
            System.out.println("Sayı Giriniz: ");
            int sayi = scanner.nextInt();
            if (sayi>ebs){
                ebs = sayi;
            }
            else if(sayi < eks){
                eks = sayi;
            }
            else if(sayi ==0 ){
                break;
            }


        }
        System.out.println("Girilen En Küçük Sayı: "+eks);
        System.out.println("Girilen En Büyük Sayı: "+ebs);

    }
}
