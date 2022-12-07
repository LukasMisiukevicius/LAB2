package com.example.lab2;

public class TextCounter {
    public static String getCharCount(String text)
    {
        return String.valueOf(text.length());
    }
    public static String getWordCount(String text)
    {
        if(text == null || text.isEmpty())
        {
            return String.valueOf(0);
        }
        else
        {
            String[] words = text.split("\\P{Alnum}+");
            return String.valueOf(words.length);
        }
    }
}
