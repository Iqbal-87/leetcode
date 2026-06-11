class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        boolean[] arr = new boolean[26];
        char[] c = sentence.toCharArray();
        for(int i=0;i<n;i++){
            arr[c[i]-'a']=true;

        }
        for(int i=0;i<26;i++){
            if(arr[i]==false)
            return false;
        }
        return true;
        
    }
}