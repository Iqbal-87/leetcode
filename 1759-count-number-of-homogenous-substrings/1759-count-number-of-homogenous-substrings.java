class Solution {
    public int countHomogenous(String s) {
        int mod = (int)Math.pow(10,9)+7;
        int length =1;
        int result =1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                length++;
              
            }
            else
            length=1;
              result = (result + length)% mod ;
        }
        return result;
        
    }
}