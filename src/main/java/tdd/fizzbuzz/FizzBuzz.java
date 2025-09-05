package tdd.fizzbuzz;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "Fizzbuzz";
    public static String countFizzBuzz(int count) {
        boolean isMultipleOf3 = count % 3 == 0;
        boolean isMultipleOf5 = count % 5 == 0;
        if (isMultipleOf3 && isMultipleOf5) {
            return FIZZBUZZ;
        }
        else if (isMultipleOf3) {
            return FIZZ;
        }
        else if (isMultipleOf5) {
            return BUZZ;
        }
        else {
            return String.valueOf(count);
        }
    }
}
