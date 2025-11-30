/**
 * Comprehensive tests for Calculator class to identify bugs.
 *
 * Run with:
 *   javac -d out src/*.java tests/*.java
 *   java -cp out CalculatorTest
 */
public class CalculatorTest {
    private static int passed = 0;
    private static int failed = 0;
    private static Calculator calc;

    public static void main(String[] args) {
        System.out.println("=== Calculator Bug Hunt Tests ===\n");
        calc = new Calculator();

        testAdd();
        testSubtract();
        testMultiply();
        testDivide();
        testPower();
        testFactorial();

        printResults();
    }

    private static void testAdd() {
        System.out.println("--- add() Tests ---");
        test("add(2, 3) should equal 5", calc.add(2, 3), 5);
        test("add(0, 0) should equal 0", calc.add(0, 0), 0);
        test("add(-1, 1) should equal 0", calc.add(-1, 1), 0);
        test("add(-5, -3) should equal -8", calc.add(-5, -3), -8);
    }

    private static void testSubtract() {
        System.out.println("\n--- subtract() Tests ---");
        System.out.println("    [BUG DETECTION: subtract uses + instead of -]");

        // These tests will FAIL if subtract is buggy (using + instead of -)
        test("subtract(10, 4) should equal 6", calc.subtract(10, 4), 6);
        test("subtract(5, 5) should equal 0", calc.subtract(5, 5), 0);
        test("subtract(3, 7) should equal -4", calc.subtract(3, 7), -4);
        test("subtract(-5, -3) should equal -2", calc.subtract(-5, -3), -2);
        test("subtract(0, 5) should equal -5", calc.subtract(0, 5), -5);

        // Diagnostic: show actual vs expected
        int actual = calc.subtract(10, 4);
        int expected = 6;
        if (actual != expected) {
            System.out.println("    >>> BUG FOUND: subtract(10, 4) returned " + actual + " but expected " + expected);
            System.out.println("    >>> The method appears to be ADDING instead of SUBTRACTING!");
        }
    }

    private static void testMultiply() {
        System.out.println("\n--- multiply() Tests ---");
        test("multiply(6, 7) should equal 42", calc.multiply(6, 7), 42);
        test("multiply(0, 100) should equal 0", calc.multiply(0, 100), 0);
        test("multiply(-3, 4) should equal -12", calc.multiply(-3, 4), -12);
        test("multiply(-2, -5) should equal 10", calc.multiply(-2, -5), 10);
    }

    private static void testDivide() {
        System.out.println("\n--- divide() Tests ---");
        testDouble("divide(20, 4) should equal 5.0", calc.divide(20, 4), 5.0);
        testDouble("divide(7, 2) should equal 3.5", calc.divide(7, 2), 3.5);
        testDouble("divide(-10, 2) should equal -5.0", calc.divide(-10, 2), -5.0);
        testDouble("divide(0, 5) should equal 0.0", calc.divide(0, 5), 0.0);
    }

    private static void testPower() {
        System.out.println("\n--- power() Tests ---");
        test("power(2, 3) should equal 8", calc.power(2, 3), 8);
        test("power(5, 0) should equal 1", calc.power(5, 0), 1);
        test("power(3, 4) should equal 81", calc.power(3, 4), 81);
        test("power(10, 2) should equal 100", calc.power(10, 2), 100);
        test("power(1, 100) should equal 1", calc.power(1, 100), 1);
    }

    private static void testFactorial() {
        System.out.println("\n--- factorial() Tests ---");
        System.out.println("    [BUG DETECTION: factorial initializes result to 0 instead of 1]");

        // These tests will FAIL if factorial starts with result = 0
        test("factorial(0) should equal 1", calc.factorial(0), 1);
        test("factorial(1) should equal 1", calc.factorial(1), 1);
        test("factorial(5) should equal 120", calc.factorial(5), 120);
        test("factorial(3) should equal 6", calc.factorial(3), 6);
        test("factorial(7) should equal 5040", calc.factorial(7), 5040);

        // Diagnostic: show actual vs expected
        int actual = calc.factorial(5);
        int expected = 120;
        if (actual != expected) {
            System.out.println("    >>> BUG FOUND: factorial(5) returned " + actual + " but expected " + expected);
            System.out.println("    >>> The result variable is likely initialized to 0 (should be 1)!");
        }
    }

    private static void test(String name, int actual, int expected) {
        if (actual == expected) {
            System.out.println("  ✓ " + name);
            passed++;
        } else {
            System.out.println("  ✗ " + name + " [got: " + actual + "]");
            failed++;
        }
    }

    private static void testDouble(String name, double actual, double expected) {
        if (Math.abs(actual - expected) < 0.0001) {
            System.out.println("  ✓ " + name);
            passed++;
        } else {
            System.out.println("  ✗ " + name + " [got: " + actual + "]");
            failed++;
        }
    }

    private static void printResults() {
        System.out.println("\n=== Test Results ===");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Total:  " + (passed + failed));

        if (failed > 0) {
            System.out.println("\n🐛 " + failed + " bug(s) detected!");
            System.out.println("\nBugs to fix in Calculator.java:");
            System.out.println("  1. subtract() - Uses wrong operator (+ instead of -)");
            System.out.println("  2. factorial() - Wrong initial value (0 instead of 1)");
        } else {
            System.out.println("\n🎉 All tests passed! Bugs have been fixed!");
        }
    }
}