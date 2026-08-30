class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int min = 0, max = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] < nums[min]) min= i;
            if(nums[i] > nums[max]) max = i;
        }

        int l = Math.min(min, max);
        int r = Math.max(min, max);

        int front = r + 1;
        int back = n - l;
        int both = (l + 1) + (n - r);

        return Math.min(front, Math.min(back, both));
    }
}