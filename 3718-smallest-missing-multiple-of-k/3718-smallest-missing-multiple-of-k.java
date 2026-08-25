class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int ans =1;
        for(int i = 1 ;i<=nums.length ;i ++){
        ans = k*i;
            if(!set.contains(ans)){
                return ans;
            }
        }
        return ans+k;
      
    }
}