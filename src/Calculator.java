/**
 * A simple calculator class with basic operations.
 * Contains 2 bugs for you to find and fix!
 */
public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        // BUG #1: Wrong operation
        return a + b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        // Note: No division by zero check - that's a feature request, not a bug!
        return (double) a / b;
    }
    
    /**
     * Calculate a raised to the power of b
     */
    public int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    
    /**
     * Calculate factorial of n (n!)
     */
    public int factorial(int n) {
        // BUG #2: Wrong starting value for result
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
