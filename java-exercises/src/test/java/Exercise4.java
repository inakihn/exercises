import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;

// Implement exercise4 using the HomeMadeStack inner class from the exercise2 (provided that you have fixed the bug), but using generics.
// The code is commented because it does not compile. Implement the generic version of the HomeMadeStack class and uncomment
// the code of the main method to execute it.

@RunWith(JUnit4.class)
public class Exercise4 {

    private static final int LOOPS = 10;
    private static final String SUCCESS_MSG = "SUCCESS";

    @Test
    public void exercise4() {
        HomeMadeStack<String> homeMadeStack = new HomeMadeStack<>();
        for (long i = 0; i < LOOPS; i++) {
            homeMadeStack.push("Text" + i);
            homeMadeStack.pop();
        }
    }

    public static class HomeMadeStack<T> {
        private static final int DEFAULT_INITIAL_CAPACITY = 16;
        private Object[] pile;
        private int pileSize = 0;

        HomeMadeStack() {
            pile = new Object[DEFAULT_INITIAL_CAPACITY];
        }

        void push(Object e) {
            makeThePileBigEnough();
            pile[pileSize++] = e;
        }

        Object pop() {
            if (pileSize == 0) {
                throw new EmptyStackException();
            }
            Object result = pile[--pileSize];
            pile[pileSize] = null; // Eliminate obsolete reference
            return result;
        }

        private void makeThePileBigEnough() {
            if (pile.length == pileSize) {
                pile = Arrays.copyOf(pile, 2 * pileSize + 1);
            }
        }

    }

}
