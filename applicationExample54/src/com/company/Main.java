package com.company;

public class Main {

    //1 den 10a kadar olan sayıların karekökleri ve karelerini bulan program

    public static void main(String[] args) {

        System.out.println("Karekökleri: ");
        for (double i  =1; i<=10;i++){
            System.out.println(i+" sayısının karekökü: "+Math.sqrt(i));
        }
        System.out.println("");
        System.out.println("*************************");
        System.out.println("Kareleri : ");
        for (double i = 1; i<=10;i++){
            System.out.println(i+" sayısının karesi: "+Math.pow(i,2));
        }
    }
}
