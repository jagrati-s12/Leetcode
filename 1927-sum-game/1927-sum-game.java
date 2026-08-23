class Solution {
    public boolean sumGame(String num) {
    double sol = 0;
    for(int i = 0 ; i<num.length()/2;i++){
        sol+=ans(num.charAt(i));   
    }
    for(int i =num.length()/2 ; i<num.length();i++){
        sol-=ans(num.charAt(i));   
    }
    return sol != 0.0;
    }
    public double ans(char c) {
    return c == '?' ? 4.5 : c - '0';
  }
}