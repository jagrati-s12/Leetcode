class Solution {
    public boolean checkDivisibility(int n) {
        int a = ds(n);
        int b = dp(n);
        int c = a+b;
        return n % c == 0;
    }
    public int ds(int n){
        int i = 0 ;
        while(n>0){
            i+=n%10;
            n=n/10;
        }
        return i ;
    }
    public int dp(int n){
        int i = 1 ;
        while(n>0){
            i*=n%10;
            n=n/10;
        }
        return i ;
    }
}