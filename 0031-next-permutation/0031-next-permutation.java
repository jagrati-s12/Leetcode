class Solution {
    public void nextPermutation(int[] nums) {

        int l = -1;
        int r = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                l = i;
                break;
            }
        }

        if (l == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for (int i = nums.length - 1; i > l; i--) {
            if (nums[l] < nums[i]) {
                r = i;
                break;
            }
        }

        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;

        reverse(nums, l + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}