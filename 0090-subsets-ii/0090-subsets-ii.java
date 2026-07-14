class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        printS(0, new ArrayList<>(), nums, nums.length);
        return ans;
    }

    void printS(int index, ArrayList<Integer> ds, int arr[], int n) {

        if (index == n) {
            if (ans.contains(ds)) {
                return;
            } else {
                ans.add(new ArrayList<>(ds));
                return;
            }
        }

        ds.add(arr[index]);
        printS(index + 1, ds, arr, n);
        ds.remove(ds.size() - 1);
        printS(index + 1, ds, arr, n);
    }
}


