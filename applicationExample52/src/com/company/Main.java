package com.company;

public class Main {

    //Alfabedeki büyük harfleri ekranda yan yana görüntüleyen programı yazınız

    public static void main(String[] args) {

        String alfabe="";
        for (char karakter = 'A'; karakter<='Z';karakter++){
            alfabe=karakter+alfabe;
        }
        System.out.println(alfabe);
    }
}
