class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int sum =0;
        int[] res = new int[2];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                sum = numbers[i]+numbers[j];
                if(sum==target){
                    res[0]=i+1;
                    res[1]=j+1;
                    return res;
                }
            }
        }
        return res;
        
    }
}