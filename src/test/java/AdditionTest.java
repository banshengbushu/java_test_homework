import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AdditionTest {
    Addition addition;

    @Test
    public void should_return_correct_result() {
        addition = new Addition();
        int result = addition.add(2);
        assertThat(result, is(1));
    }
}