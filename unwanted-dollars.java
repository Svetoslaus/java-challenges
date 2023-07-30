public class UnwantedDollars {

    public static double moneyValue(String input) {
        // Remove any leading or trailing spaces
        input = input.trim();
        
        // Check if the input starts with a "$" sign
        boolean hasDollarSign = input.startsWith("$");
        
        // Remove any "$" sign and spaces from the input
        input = input.replace("$", "").trim();
        
        // Check if the input starts with a "-" sign indicating a negative number
        boolean isNegative = input.startsWith("-");
        
        // Remove any "-" sign and spaces from the input
        input = input.replace("-", "").trim();
        
        try {
            double number = Double.parseDouble(input);
            return isNegative ? -number : number;
        } catch (NumberFormatException e) {
            // If the input cannot be parsed as a number, return 0.0
            return 0.0;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(moneyValue(" $ 50.25")); // Output: 50.25
        System.out.println(moneyValue("$100")); // Output: 100.0
        System.out.println(moneyValue("- $ 75.50")); // Output: -75.5
        System.out.println(moneyValue(" 123.45 ")); // Output: 123.45
        System.out.println(moneyValue("12.3")); // Output: 12.3
        System.out.println(moneyValue("abc")); // Output: 0.0 (invalid input)
    }
}

