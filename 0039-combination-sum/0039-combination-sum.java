class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int sum = 0;
        int i = 0 ;
        com(candidates, target, new ArrayList<>(), candidates.length, sum,i);
        return ans;
    }

    public void com(int[] arr, int t, ArrayList<Integer> ds, int n, int sum, int i ) {
        if (sum == t) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        if (sum > t) {
            return;
        } else {
            while (i < n) {
                ds.add(arr[i]);
                sum += arr[i];

                com(arr, t, ds, n, sum,i);

                i++;
                int s = ds.remove(ds.size() - 1);
                sum -= s;
            }
        }
    }
}
