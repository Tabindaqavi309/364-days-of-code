package com.company;

public class SecondDayOfCode {
    public static String tooLongWords(String word) {

        StringBuilder stringBuilder = new StringBuilder();

        if (word.length() <= 10)
            return word;

        return stringBuilder.append(word.charAt(0))
                .append(word.length() - 2)
                .append(word.charAt(word.length() - 1)).toString();


    }

}
