import org.junit.Test;

import static org.junit.Assert.*;

public class GetMultipleNumberTest {
    GetMultipleNumber multipleNumber;

    @Test
    public void should_return_correct_result() {
        multipleNumber = new GetMultipleNumber();
        int array_a[] = {6, 7, 10, 19, 20, 23, 27, 33, 41, 55};
        int[] newArray = multipleNumber.eight_multiple_number(array_a);
        int result[] = {8, 8, 16, 24, 24, 24, 32, 40, 48, 56};
        assertArrayEquals(newArray, result);
    }
}