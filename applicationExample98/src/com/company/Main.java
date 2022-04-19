package com.company;
import java.util.Scanner;

public class Main {

    //Dizi isimli 5 satırlı String bir dizi oluşturarak bilgi girişi yapan program

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dizi = new String[5];
        for (int i =0; i < 5; i++){
            System.out.println("İsim Giriniz: ");
            dizi[i] = scanner.nextLine();
        }
        System.out.println("Bilgi Girişi Bitti");
    }
}
