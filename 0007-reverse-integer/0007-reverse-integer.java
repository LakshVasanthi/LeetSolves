class Solution {

    public static int reverse(int x) {
        int reversed = 0;
        int maxDiv10 = Integer.MAX_VALUE / 10;
        int minDiv10 = Integer.MIN_VALUE / 10;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reversed > maxDiv10 || (reversed == maxDiv10 && digit > 7)) {
                return 0; // Overflow case
            }
            if (reversed < minDiv10 || (reversed == minDiv10 && digit < -8)) {
                return 0; // Underflow case
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }
}