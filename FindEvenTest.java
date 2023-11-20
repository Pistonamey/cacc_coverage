import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindEvenTest {
    @org.junit.jupiter.api.Test
    void test() {
        int[] testCase = new int[]{0, 2, 3};
        int[] expected = new int[]{230, 302, 320};
        int[] res = findEven.findEvenNumbers(testCase);
        String resStr = Arrays.toString(res);
        String expectedStr = Arrays.toString(expected);
        assertEquals(expectedStr, resStr);
    }
}