package com.example.lab2;


import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@MediumTest
@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void Given_OneWord_SelectedWords_Then_ReturnedOne() {
        final String givenString = "Four";
        final String expectedResult = "1";

        onView(withId(R.id.etInput)).perform(click(), replaceText(givenString));

        onView(withId(R.id.spCountChoice)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Words"))).perform(click());

        onView(withId(R.id.btnCount)).perform(click());
        onView(withId(R.id.tvCount)).check(matches(withText(expectedResult)));
    }

    @Test
    public void Given_ThreeWords_SelectedWords_Then_ReturnedThree() {
        final String givenString = "One two thRee";
        final String expectedResult = "3";

        onView(withId(R.id.etInput)).perform(click(), replaceText(givenString));

        onView(withId(R.id.spCountChoice)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Words"))).perform(click());

        onView(withId(R.id.btnCount)).perform(click());
        onView(withId(R.id.tvCount)).check(matches(withText(expectedResult)));
    }

    @Test
    public void Given_OneSpace_SelectedWords_Then_ReturnedZero() {
        final String givenString = " ";
        final String expectedResult = "0";

        onView(withId(R.id.etInput)).perform(click(), replaceText(givenString));

        onView(withId(R.id.spCountChoice)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Words"))).perform(click());

        onView(withId(R.id.btnCount)).perform(click());
        onView(withId(R.id.tvCount)).check(matches(withText(expectedResult)));
    }

    @Test
    public void Given_OneChar_SelectedChars_Then_ReturnedOne() {
        final String givenString = "a";
        final String expectedResult = "1";

        onView(withId(R.id.etInput)).perform(click(), replaceText(givenString));

        onView(withId(R.id.spCountChoice)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Chars"))).perform(click());

        onView(withId(R.id.btnCount)).perform(click());
        onView(withId(R.id.tvCount)).check(matches(withText(expectedResult)));
    }

    @Test
    public void Given_ThreeCharsAndTwoSpaces_SelectedChars_Then_ReturnedThree() {
        final String givenString = "q w e";
        final String expectedResult = "3";

        onView(withId(R.id.etInput)).perform(click(), replaceText(givenString));

        onView(withId(R.id.spCountChoice)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Words"))).perform(click());

        onView(withId(R.id.btnCount)).perform(click());
        onView(withId(R.id.tvCount)).check(matches(withText(expectedResult)));
    }

    @Test
    public void Given_OneSpace_SelectedChars_Then_ReturnedZero() {
        final String givenString = " ";
        final String expectedResult = "0";

        onView(withId(R.id.etInput)).perform(click(), replaceText(givenString));

        onView(withId(R.id.spCountChoice)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Words"))).perform(click());

        onView(withId(R.id.btnCount)).perform(click());
        onView(withId(R.id.tvCount)).check(matches(withText(expectedResult)));
    }

}
