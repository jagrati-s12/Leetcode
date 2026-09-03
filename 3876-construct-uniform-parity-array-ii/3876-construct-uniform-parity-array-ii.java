class Solution {
    public boolean uniformArray(int[] nums) {
        int s = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num % 2 == 1)
                s = Math.min(s, num);
        }

        if (s == Integer.MAX_VALUE)
            return true;

        for (int num : nums) {
            if (num % 2 == 0 && num <= s)
                return false;
        }

        return true;
    }
}