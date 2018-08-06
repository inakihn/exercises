import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static org.junit.Assert.assertEquals;

// TODO: If sets cannot contain duplicates, why this program output says that the CharPair set contains 260 elements?
//Can you fix it? charPairs set size must be 26.

@RunWith(JUnit4.class)
public class Exercise5 {

    private static final String SUCCESS_MSG = "Well done! charPairs set size is 26.";

    @Test
    public void exercise5() {
        String result;
        Set<CharPair> charPairs = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                charPairs.add(new CharPair(ch, ch));
            }
        }
        if (charPairs.size() != 26) {
            result = "charPairs set size is " + charPairs.size() + " instead of 26.";
        } else {
            result = SUCCESS_MSG;
        }
        assertEquals(SUCCESS_MSG, result);
    }

    public static class CharPair {
        private final char first;
        private final char second;

        CharPair(char first, char second) {
            this.first = first;
            this.second = second;
        }

        public boolean equals(CharPair charPair) {
            if (this == charPair) return true;
            if (charPair == null || getClass() != charPair.getClass()) return false;
            return first == charPair.first &&
                    second == charPair.second;
        }

        public int hashCode() {
            return Objects.hash(first, second);
        }

    }
}
