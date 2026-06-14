class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null || nums.length==0)
        return 0;
        int n = nums.length;
        int maxproduct = nums[0];
        int prefix =1;
        int suffix =1;
        for(int i =0;i<n;i++){
            if(suffix==0)
            suffix=1;
            if(prefix==0)
            prefix=1;
            prefix *=nums[i];
            suffix *=nums[n-i-1];
            maxproduct = Math.max(maxproduct,Math.max(suffix,prefix));

        }
        return maxproduct;
        
    }
}