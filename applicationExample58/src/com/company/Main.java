package com.company;

public class Main {

    //Fibonacci dizisinin ilk 10 satırı listbox a ekleyen program

    public static void main(String[] args) {

        int x=1, y=1;
        System.out.println(x);
        System.out.println(y);
        for (int i = 1;i<=8;i++){
            int z = x + y;
            System.out.println(z);
            x = y;
            y = z;
        }
    }
}
