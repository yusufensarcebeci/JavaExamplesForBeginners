package com.company;
import java.util.Scanner;

public class Main {

    //Fibonecci dizisinde dışarıdan girilen terim sayısının değerini hesaplayan ve yazan program

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Terim Sayısını Giriniz: ");
        n = scanner.nextInt();
        System.out.println("Girilen "+n+". Terimin Sayısı "+fibbonecci(n)+" dir");
    }

    public static int fibbonecci(int n){
        if (n==0 || n==1){
            return n;
        }else{
            return fibbonecci(n-2) + fibbonecci(n-1);
        }
    }
}
