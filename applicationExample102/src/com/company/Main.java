package com.company;

import java.util.Scanner;

public class Main {

    //İsim ve Soyisim bilgileri diziye aktarılıyor. Bilgi girişi bittiğinde bilgileri görüntüleyen  program;

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        String[] isimler;
        String[] soyİsimler;
        System.out.println("Kaç kişi girilecek: ");
        int sayac = scanner.nextInt();
        for (int i = 0; i <= sayac; i++){
            System.out.println("İsim giriniz: ");
            isimler = new String[i];
            System.out.println("Soyisim giriniz: ");
            soyİsimler = new String[i];
        }
        for (int i = 1; i <= sayac; i++){}

    }
}
