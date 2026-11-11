package org.example;

public class NumberGuesser {
    int target;

    public NumberGuesser(int number) {
        this.target = number;
    }

    public String guess(int guess) {
        if (guess < this.target) {
            return "higher";
        } else if (guess > this.target) {
            return "lower";
        } else {
            return "correctamundo";
        }
    }
}
