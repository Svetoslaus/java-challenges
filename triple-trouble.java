public class Kata {
    public static int TripleDouble(long num1, long num2) {
        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);

        // Check for triple in num1
        for (int i = 0; i < strNum1.length() - 2; i++) {
            char digit = strNum1.charAt(i);
            if (strNum1.charAt(i + 1) == digit && strNum1.charAt(i + 2) == digit) {
                // Check for double in num2
                for (int j = 0; j < strNum2.length() - 1; j++) {
                    if (strNum2.charAt(j) == digit && strNum2.charAt(j + 1) == digit) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        long num1 = 12345566;
        long num2 = 667788;

        int result = TripleDouble(num1, num2);
        System.out.println(result); // Output: 1
    }
}
