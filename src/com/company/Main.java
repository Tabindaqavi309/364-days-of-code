package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.SecondDayOfCode.tooLongWords;

public class Main {
        //
        public static void main(String[] args) {
                List<String> listOfWords = new ArrayList<>();
                Scanner sc = new Scanner(System.in);
                int n = (sc.nextInt());

                for (int i = 0; i < n; i++) {
                        sc = new Scanner(System.in);
                        String w = (sc.nextLine());
                        listOfWords.add(w);
                }

                listOfWords.stream().forEach(s -> {
                        System.out.println(tooLongWords(s));
                });

        }
}



