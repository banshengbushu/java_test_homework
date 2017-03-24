import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GetMultipleNumberTest {
    GetMultipleNumber multipleNumber;

    @Test
    public void should_return_correct_result() {
        multipleNumber = new GetMultipleNumber();
        int array_a[] = {1, 2, 4, 5, 6, 7, 10, 19, 20, 23, 27, 33, 41, 55};
        int result = multipleNumber.eight_multiple_number(array_a);
        assertThat(result, is(1));
    }

}