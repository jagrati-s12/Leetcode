class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int a = 0;
        int max = 0;
        for (int i = 0; i< s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(a));
                a++;
            }
            set.add(s.charAt(i));
            max = Math.max(max, i - a + 1);
        }
        return max;
    }
}