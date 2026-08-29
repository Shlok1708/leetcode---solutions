class Solution {
    public boolean isNumber(String s) {
        if (s == null || s.trim().isEmpty()) {
            return false;
        }

        s = s.trim();
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExponent = false;
        boolean canHaveSign = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                seenDigit = true;
                canHaveSign = false;
            } else if (c == '+' || c == '-') {
                if (!canHaveSign) {
                    return false;
                }
                canHaveSign = false;
            } else if (c == '.') {
                if (seenDot || seenExponent) {
                    return false;
                }
                seenDot = true;
                canHaveSign = false;
            } else if (c == 'e' || c == 'E') {
                if (seenExponent || !seenDigit) {
                    return false;
                }
                seenExponent = true;
                seenDigit = false; // Reset to ensure digits follow the exponent
                canHaveSign = true;  // An exponent can be followed by a sign (e.g., 2e-3)
            } else {
                return false;
            }
        }

        return seenDigit;
    }
}