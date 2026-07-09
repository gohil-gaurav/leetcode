class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                int l = left + 1, r = right;
                boolean sl = true;
                while (l < r) {
                    if (s.charAt(l) != s.charAt(r)) {
                        sl = false;
                        break;
                    }
                    l++; r--;
                }

                l = left; r = right - 1;
                boolean sr = true;
                while (l < r) {
                    if (s.charAt(l) != s.charAt(r)) {
                        sr = false;
                        break;
                    }
                    l++; r--;
                }

                return sl || sr;
            }
            left++;
            right--;
        }

        return true;
    }
}