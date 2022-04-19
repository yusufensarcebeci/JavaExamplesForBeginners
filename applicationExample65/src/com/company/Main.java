package com.company;

public class Main {

    //Harflerin bulunması

    public static void main(String[] args) {

        String[] sozcuk  =new String[]{"Ü","Ş","Ç","Ğ","Ö"};
        if (sozcuk[0].contains("Ü")){
            System.out.println("Harf Bulundu");
        }else {
            System.out.println("Harf Bulunamadı");
        }
    }
}
