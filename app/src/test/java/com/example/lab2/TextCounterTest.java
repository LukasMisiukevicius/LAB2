package com.example.lab2;

import org.junit.Test;

import static org.junit.Assert.*;


public class TextCounterTest {
    // For a getCharCount function
    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_getCharCountIsCalled_Then_NullPointerExeptionIsThrown() {
        TextCounter.getCharCount(null);
    }

    @Test
    public void Given_EmptyString_When_getCharCountIsCalled_Then_ReturnedZero() {
        final String givenString = "";
        final String expectedResult = "0";
        final String actualResult = TextCounter.getCharCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TenChars_When_getCharCountIsCalled_Then_ReturnedTen() {
        final String givenString = "qwertyuiop";
        final String expectedResult = "10";
        final String actualResult = TextCounter.getCharCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TenIntegers_When_getCharCountIsCalled_Then_ReturnedTen() {
        final String givenString = "1234567890";
        final String expectedResult = "10";
        final String actualResult = TextCounter.getCharCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_TwoCharsAndOneSpace_When_getCharCountIsCalled_Then_ReturnedThree() {
        final String givenString = "a a";
        final String expectedResult = "3";
        final String actualResult = TextCounter.getCharCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_ThreeSpecialChars_When_getCharCountIsCalled_Then_ReturnedThree() {
        final String givenString = "!.-";
        final String expectedResult = "3";
        final String actualResult = TextCounter.getCharCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    // for a getWordCount function
    @Test
    public void Given_NullString_When_getWordCountIsCalled_Then_ReturnedZero() {
        final String givenString = null;
        final String expectedResult = "0";
        final String actualResult = TextCounter.getWordCount(givenString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_OneChar_When_getWordCountIsCalled_Then_ReturnedOne() {
        final String givenString = "a";
        final String expectedResult = "1";
        final String actualResult = TextCounter.getWordCount(givenString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_FiveChar_When_getWordCountIsCalled_Then_ReturnedOne() {
        final String givenString = "qwert";
        final String expectedResult = "1";
        final String actualResult = TextCounter.getWordCount(givenString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_FourChareAndASpace_When_getWordCountIsCalled_Then_ReturnedTwo() {
        final String givenString = "qw rt";
        final String expectedResult = "2";
        final String actualResult = TextCounter.getWordCount(givenString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_MultipleSpaces_When_getWordCountIsCalled_Then_ReturnedZero() {
        final String givenString = "          ";
        final String expectedResult = "0";
        final String actualResult = TextCounter.getWordCount(givenString);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_ThreeSpecialSymbols_When_getWordCountIsCalled_Then_ReturnedZero() {
        final String givenString = "!.-";
        final String expectedResult = "0";
        final String actualResult = TextCounter.getWordCount(givenString);
        assertEquals(expectedResult, actualResult);
    }


}