package org.example;

import org.junit.Assert;
import org.junit.Test;

public class NumberGuesserTest {
    @Test
    public void testGuessingTooLowReturnsHigher() {
        NumberGuesser game = new NumberGuesser(10);
        Assert.assertEquals("higher", game.guess(5));
    }

    @Test
    public void testGuessingTooHighReturnsLower() {
        NumberGuesser game = new NumberGuesser(10);
        Assert.assertEquals("lower", game.guess(15));
    }

    @Test
    public void testGuessingCorrectlyReturnsCorrect() {
        NumberGuesser game = new NumberGuesser(10);
        Assert.assertEquals("correctamundo", game.guess(10));
    }
}
