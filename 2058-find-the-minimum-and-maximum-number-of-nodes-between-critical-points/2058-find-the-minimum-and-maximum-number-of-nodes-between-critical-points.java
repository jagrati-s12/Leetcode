
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> nums = new ArrayList<>();

        while(head != null){
            nums.add(head.val);
            head = head.next;
        }

        List<Integer> p= new ArrayList<>();

        int n = nums.size();

        for(int i = 1; i < n - 1; i++){
            if(nums.get(i) > nums.get(i - 1) && nums.get(i) > nums.get(i + 1)){
                p.add(i);
            }
            else if(nums.get(i) < nums.get(i - 1) && nums.get(i) < nums.get(i + 1)){
                p.add(i);
            }
        }

        int m = p.size();

        if(m < 2){
            return new int[]{-1, -1};
        }

        int min = Integer.MAX_VALUE;

        int max = p.get(m - 1) - p.get(0);

        for(int i = 1; i < m; i++){
            min = Math.min(min,p.get(i) - p.get(i - 1) );
        }

        return new int[]{min, max};
    }
}