class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charFreqCount = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int freq = charFreqCount.getOrDefault(c,0);
            charFreqCount.put(c,freq+1);

        }
        for(int i=0;i<s.length();i++){
            if(charFreqCount.get(s.charAt(i))==1)
            return i;
        }
        return -1;
        
    }
}