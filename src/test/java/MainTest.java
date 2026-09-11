import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testCorrectAnswer() {
        assertTrue(Main.isAnswerCorrect("May", "May,", 0));
    }

    @Test
    public void testIncorrectAnswer(){
        assertFalse(Main.isAnswerCorrect("June", "May", 0));
    }
    @Test
    public void testDifferentCapitalization() {
        assertTrue(Main.isAnswerCorrect("may", "May,", 0));
    }
    @Test
    public void testFinalIncorrectGuess() {
        assertFalse(Main.isAnswerCorrect("June", "May,", 2));
    }
}