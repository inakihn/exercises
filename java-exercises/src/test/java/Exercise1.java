import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.management.ManagementFactory;

import static org.junit.Assert.assertTrue;

// TODO: Make me run much faster without changing too much.

@RunWith(JUnit4.class)
public class Exercise1 {

    @Test
    public void exercise1() {
        Long sum = sumAllIntegers();
        System.out.println("Sum : " + sum + " took " + ManagementFactory.getRuntimeMXBean().getUptime() / 1000 + " seconds.");
        assertTrue(ManagementFactory.getRuntimeMXBean().getUptime() / 1000 <= 3);
    }

    private Long sumAllIntegers() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i + i;
        }
        return sum;
    }

}
