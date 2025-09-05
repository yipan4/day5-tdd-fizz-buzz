package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "Fizzbuzz";
    @Test
    public void should_return_number_when_count_given_not_multiple_of_3_or_5() {
        // Given
        int count = 1;
        // When
        String result = FizzBuzz.countFizzBuzz(count);
        // Expect
        assertEquals("1",result);
    }

    @Test
    public void should_return_fizz_when_count_given_is_multiple_of_3_only() {
        // Given
        int count = 3;
        // When
        String result = FizzBuzz.countFizzBuzz(count);
        // Expect
        assertEquals(FIZZ, result);
    }

    @Test
    public void should_return_buzz_when_count_given_is_multiple_of_5_only() {
        // Given
        int count = 5;
        // When
        String result = FizzBuzz.countFizzBuzz(count);
        // Expect
        assertEquals(BUZZ, result);
    }
}
