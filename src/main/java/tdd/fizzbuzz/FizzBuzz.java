package tdd.fizzbuzz;

public class FizzBuzz {
    public static String countFizzBuzz(int count) {
        boolean isMultipleOf3 = count % 3 == 0;
        boolean isMultipleOf5 = count % 5 == 0;
        if (!isMultipleOf3 && !isMultipleOf5) {
            return String.valueOf(count);
        }
        return null;
    }
}
