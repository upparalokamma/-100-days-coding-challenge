//recursion:method calls itself
public class Main {
    public static int fibonacci(int n) {
        // Base case: return n if it's 0 or 1
        if (n == 0 || n == 1) {
            return n;
        }
        // Recursive case: sum of the previous two terms
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int number = 9;
        System.out.println("Fibonacci of " + number + " is: " + fibonacci(number));
    }
}
