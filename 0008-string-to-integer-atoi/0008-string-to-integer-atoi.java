class Solution {

    public boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public int myAtoi(String s) {

        int i = 0;
        int num = 0;
        int sign = 1;

        // WHITESPACES
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // SIGN
        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } 
            else if (s.charAt(i) == '+') {
                i++;
            }
        }

        // CONVERSION
        while (i < s.length() && isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // OVERFLOW CHECK
            if (num > Integer.MAX_VALUE / 10 ||
                (num == Integer.MAX_VALUE / 10 && digit >= 8)) {

                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            num = num * 10 + digit;
            i++;
        }

        return sign * num;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna