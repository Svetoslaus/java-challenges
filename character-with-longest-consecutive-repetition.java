public class Solution {
   public static Object[] longestRepetition(String s) {
    if (s.isEmpty()) {
        return new Object[]{"", 0};
    }

    char currentChar = s.charAt(0);
    int currentCount = 1;
    char maxChar = currentChar;
    int maxCount = currentCount;

    for (int i = 1; i < s.length(); i++) {
        char c = s.charAt(i);

        if (c == currentChar) {
            currentCount++;
        } else {
            if (currentCount > maxCount) {
                maxChar = currentChar;
                maxCount = currentCount;
            }
            currentChar = c;
            currentCount = 1;
        }
    }

    if (currentCount > maxCount) {
        maxChar = currentChar;
        maxCount = currentCount;
    }

    return new Object[]{String.valueOf(maxChar), maxCount};
}


}
