class Solution {
    public boolean isPal(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
    public String longestPalindrome(String s) {
        int l = 0;
        String ans = "";

        while (l < s.length()) {
            int r = s.length() - 1;

            while (l <= r) {
                if (isPal(s, l, r)) {
                    if (r - l + 1 > ans.length()) {
                        ans = s.substring(l, r + 1);
                    }
                    break;
                }
                r--;
            }
            l++;
        }
        return ans;
    }

}