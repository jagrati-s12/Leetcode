class Solution {
    public int trap(int[] h) {
        int ans = 0 ;
        int l = 0;
        int r = h.length-1;
        int lm = 0;
        int rm=0;
        
        while(l<r){
          if(h[l]<h[r]){
            lm = Math.max(lm,h[l]);
            ans+=lm-h[l];
            l++;
          }else{
            rm = Math.max(rm,h[r]);
            ans+=rm-h[r];
            r--;
          }
        }
        return ans;
    }
}