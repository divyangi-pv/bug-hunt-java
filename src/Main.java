/**
 * Main entry point for Bug Hunt Java Project
 * Run this to see the bugs in action!
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bug Hunt Java Project ===\n");
        
        // Test Calculator
        System.out.println("--- Calculator Tests ---");
        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("6 * 7 = " + calc.multiply(6, 7));
        System.out.println("20 / 4 = " + calc.divide(20, 4));
        System.out.println("2 ^ 3 = " + calc.power(2, 3));
        System.out.println("Factorial of 5 = " + calc.factorial(5));
        
        // Test StringUtils
        System.out.println("\n--- StringUtils Tests ---");
        StringUtils str = new StringUtils();
        System.out.println("Reverse 'hello': " + str.reverse("hello"));
        System.out.println("Is 'racecar' palindrome? " + str.isPalindrome("racecar"));
        System.out.println("Count vowels in 'education': " + str.countVowels("education"));
        System.out.println("Capitalize 'hello world': " + str.capitalize("hello world"));
        
        // Test ArrayHelper
        System.out.println("\n--- ArrayHelper Tests ---");
        ArrayHelper arr = new ArrayHelper();
        int[] numbers = {5, 2, 8, 1, 9, 3};
        System.out.println("Array: [5, 2, 8, 1, 9, 3]");
        System.out.println("Max: " + arr.findMax(numbers));
        System.out.println("Min: " + arr.findMin(numbers));
        System.out.println("Sum: " + arr.sum(numbers));
        System.out.println("Average: " + arr.average(numbers));
        
        System.out.println("\n=== End of Tests ===");
        System.out.println("Did you spot the bugs? Check the output carefully!");
    }
}
