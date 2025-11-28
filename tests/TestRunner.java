/**
 * Simple test runner to verify bug fixes.
 * Run after fixing bugs to check your work!
 */
public class TestRunner {
    private static int passed = 0;
    private static int failed = 0;
    
    public static void main(String[] args) {
        System.out.println("=== Running Tests ===\n");
        
        testCalculator();
        testStringUtils();
        testArrayHelper();
        
        System.out.println("\n=== Test Results ===");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Total:  " + (passed + failed));
        
        if (failed == 0) {
            System.out.println("\n🎉 All tests passed! Great job fixing the bugs!");
        } else {
            System.out.println("\n⚠️  Some tests failed. Keep debugging!");
        }
    }
    
    private static void testCalculator() {
        System.out.println("--- Calculator Tests ---");
        Calculator calc = new Calculator();
        
        test("add(5, 3) == 8", calc.add(5, 3) == 8);
        test("subtract(10, 4) == 6", calc.subtract(10, 4) == 6);
        test("multiply(6, 7) == 42", calc.multiply(6, 7) == 42);
        test("divide(20, 4) == 5.0", calc.divide(20, 4) == 5.0);
        test("power(2, 3) == 8", calc.power(2, 3) == 8);
        test("factorial(5) == 120", calc.factorial(5) == 120);
        test("factorial(0) == 1", calc.factorial(0) == 1);
    }
    
    private static void testStringUtils() {
        System.out.println("\n--- StringUtils Tests ---");
        StringUtils str = new StringUtils();
        
        test("reverse('hello') == 'olleh'", "olleh".equals(str.reverse("hello")));
        test("isPalindrome('racecar') == true", str.isPalindrome("racecar"));
        test("isPalindrome('hello') == false", !str.isPalindrome("hello"));
        test("countVowels('education') == 5", str.countVowels("education") == 5);
        test("countVowels('AEIOU') == 5", str.countVowels("AEIOU") == 5);
        test("capitalize('hello world') == 'Hello World'", 
             "Hello World".equals(str.capitalize("hello world")));
    }
    
    private static void testArrayHelper() {
        System.out.println("\n--- ArrayHelper Tests ---");
        ArrayHelper arr = new ArrayHelper();
        
        int[] positive = {5, 2, 8, 1, 9, 3};
        int[] negative = {-5, -2, -8, -1, -9};
        int[] mixed = {-3, 0, 5, -1, 2};
        
        test("findMax([5,2,8,1,9,3]) == 9", arr.findMax(positive) == 9);
        test("findMax([-5,-2,-8,-1,-9]) == -1", arr.findMax(negative) == -1);
        test("findMin([5,2,8,1,9,3]) == 1", arr.findMin(positive) == 1);
        test("sum([5,2,8,1,9,3]) == 28", arr.sum(positive) == 28);
        test("average([5,2,8,1,9,3]) == 4.666...", 
             Math.abs(arr.average(positive) - 4.666666666) < 0.01);
        test("contains([5,2,8,1,9,3], 8) == true", arr.contains(positive, 8));
        test("contains([5,2,8,1,9,3], 7) == false", !arr.contains(positive, 7));
    }
    
    private static void test(String name, boolean condition) {
        if (condition) {
            System.out.println("  ✓ " + name);
            passed++;
        } else {
            System.out.println("  ✗ " + name);
            failed++;
        }
    }
}
