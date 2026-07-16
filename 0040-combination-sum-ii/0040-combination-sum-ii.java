class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int sum = 0;   
        int i = 0 ;
        com(candidates, target, new ArrayList<>(), candidates.length, sum,i);
        return ans;
    }

    public void com(int[] arr, int t, ArrayList<Integer> ds, int n, int sum, int i) {
    if (t == 0) {
        ans.add(new ArrayList<>(ds));
        return;
    }

    for (int j = i; j < n; j++) {
        if (j > i && arr[j] == arr[j - 1])
            continue;

        if (arr[j] > t)
            break;

        ds.add(arr[j]);
        com(arr, t - arr[j], ds, n, sum, j + 1);
        ds.remove(ds.size() - 1);
    }
}
}