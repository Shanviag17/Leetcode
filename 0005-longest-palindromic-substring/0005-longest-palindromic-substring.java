class Solution {
    public String longestPalindrome(String s) {

        String LPS = "";

        if (s.length() <= 1)
            return s;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int low = i;
            int high = i;

            while (low >= 0 && high < s.length()
                    && s.charAt(low) == s.charAt(high)) {

                low--;
                high++;
            }

            String palindrome = s.substring(low + 1, high);

            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }


            // Even length palindrome
            low = i;
            high = i + 1;

            while (low >= 0 && high < s.length()
                    && s.charAt(low) == s.charAt(high)) {

                low--;
                high++;
            }

            palindrome = s.substring(low + 1, high);

            if (palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }
        }

        return LPS;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna