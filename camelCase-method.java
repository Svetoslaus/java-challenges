public class Solution {
    public static String camelCase(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        String[] words = input.trim().split("\\s+");
        StringBuilder camelCase = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                camelCase.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    camelCase.append(word.substring(1).toLowerCase());
                }
            }
        }

        return camelCase.toString();
    }

    public static void main(String[] args) {
        String input = "convert this string to camelCase";
        String camelCaseString = camelCase(input);
        System.out.println(camelCaseString); // Output: "ConvertThisStringToCamelCase"
    }
}
