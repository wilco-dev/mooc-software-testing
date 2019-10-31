package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
        words = new CountLetters().count("tiger|bear");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
        words = new CountLetters().count("tiger|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastCharactersIsNotALetter() {
        int words = new CountLetters().count("cat|dog|");
        Assertions.assertEquals(0, words);
    }

}