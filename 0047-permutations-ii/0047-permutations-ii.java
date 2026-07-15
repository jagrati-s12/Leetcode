class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] b = new boolean[nums.length];
        per(nums, new ArrayList<>(), nums.length, b);
        return ans;
    }

    public void per(int[] arr, ArrayList<Integer> ds, int n, boolean[] b) {
        if (n == ds.size()) {
            if(ans.contains(ds)){
                
            }else{
            ans.add(new ArrayList<>(ds));
            return;}
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (b[i])
                    continue;
                ds.add(arr[i]);
                b[i] = true;

                per(arr, ds, n, b);

                ds.remove(ds.size() - 1);
                b[i] = false;
            }
        }
    }
}