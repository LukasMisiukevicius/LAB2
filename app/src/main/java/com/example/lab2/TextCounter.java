package com.example.lab2;

public class TextCounter {
    public static String getCharCount(String text)
    {
        return String.valueOf(text.length());
    }
    public static int getWordCount(String text)
    {
        if(text == null || text.isEmpty())
        {
            return 0;
        }
        else
        {
            String[] words = text.split("\\P{Alnum}+");
            return words.length;
        }
    }
}
