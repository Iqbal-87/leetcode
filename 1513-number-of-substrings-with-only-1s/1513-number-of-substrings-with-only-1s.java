class Solution {
    public int numSub(String s) {
        int mod = (int)Math.pow(10,9) + 7;
        int len=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1' ){
                len++;
                res = (res+len)%mod;
            }
            else{
                len=0;
            }
        }
        return res;
        
    }
}