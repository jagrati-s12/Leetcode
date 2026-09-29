class Solution {
    public boolean isSubsequence(String s, String t) {
        int l = 0;

        for (int i = 0; i < t.length(); i++) {
            if (l < s.length() && t.charAt(i) == s.charAt(l)) {
                l++;
            }
        }

        return l == s.length();
    }
}