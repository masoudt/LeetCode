package _q389_find_diff;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by tavazma on 8/31/16.
 */
public class SolutionTest {
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        Solution tester = new Solution(); // MyClass is tested

        // assert statements
        assertEquals("10 x 0 must be 0", 'd', tester.findTheDifference("abc", "cabd"));
        assertEquals("10 x 0 must be 0", 'a', tester.findTheDifference("", "a"));
        assertEquals("10 x 0 must be 0", 'a', tester.findTheDifference(null, "a"));
    }

}
