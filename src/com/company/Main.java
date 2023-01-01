package com.company;

import java.util.Scanner;

public class Main {

    public static String isEvenParts(Integer number){
        if(number%2==0 && number!=2)
            return "YES";

        return "NO";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = (sc.nextInt());
        System.out.println(isEvenParts(w));
    }
}
