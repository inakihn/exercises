import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

//Write a concise method that prints each item in STRING_ARRAY in uppercase to the output stream
//for reference, the expected result is EXPECTED_RESULT_MSG

@RunWith(JUnit4.class)
public class Exercise3 {

    private static final String[] STRING_ARRAY = { "learn", "By", "DoINg" };
    private static final String EXPECTED_RESULT_MSG = "LEARN BY DOING";

    @Test
    public void exercise3() {
        String result = myMethod();
        assertEquals(EXPECTED_RESULT_MSG, result);
    }

    private String myMethod() {
        List<String> myList = Arrays.stream(STRING_ARRAY).map(x -> x.toUpperCase()).collect(Collectors.toList());
        return String.join(" ", myList);
    }

}
