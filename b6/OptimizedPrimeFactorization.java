package homework.b6;

import java.util.ArrayList;
import java.util.List;

public class OptimizedPrimeFactorization implements Runnable{
    private final long number;

    public OptimizedPrimeFactorization(long number) {
        this.number = number;
    }

    @Override
    public void run() {
        List<Long> primeFactors = findPrimeFactors(number);
        System.out.println("Prime factors of " + number + " are: " + primeFactors);
    }

    private List<Long> findPrimeFactors(long number) {
        List<Long> factors = new ArrayList<>();
        // Check for number of 2s that divide number
        while (number % 2 == 0) {
            factors.add(2L);
            number /= 2;
        }
        // Number must be odd at this point, check for other factors
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        // If number is a prime number greater than 2
        if (number > 2) {
            factors.add(number);
        }
        return factors;
    }
}
