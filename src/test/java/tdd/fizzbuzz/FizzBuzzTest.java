package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_number_when_count_given_not_multiple_of_3_or_5() {
        // Given
        int count = 1;
        // When
        String result = FizzBuzz.countFizzBuzz(count);
        // Expect
        assertEquals("1",result);
    }
}
