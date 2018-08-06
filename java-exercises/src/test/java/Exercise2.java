import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.EmptyStackException;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class Exercise2 {

    // You cannot modify these constants.
    private static final int LOOPS = 10;
    private static final int OBJECT_ARRAY_SIZE = 20000000;

    @Test
    public void exercise2() {
        HomeMadeStack homeMadeStack = new HomeMadeStack();
        for (long i = 0; i < LOOPS; i++) {
            Object[] objectArray = new Object[OBJECT_ARRAY_SIZE];
            homeMadeStack.push(objectArray);
            homeMadeStack.pop();
        }
        assertTrue(true);
    }

    public static class HomeMadeStack {
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
