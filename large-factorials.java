import java.math.BigInteger;

public class Kata {
    public static String Factorial(int n) {
        if (n < 0) {
            return null;
        } else if (n == 0 || n == 1) {
            return "1";
        } else {
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(Factorial(5));  // Output: "120"
        System.out.println(Factorial(25)); // Output: "15511210043330985984000000"
        System.out.println(Factorial(0));  // Output: "1"
        System.out.println(Factorial(-3)); // Output: null
    }
}
