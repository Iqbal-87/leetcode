class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n =nums.length;
        if(nums==null || nums.length==0)
        return -1;
        Arrays.sort(nums);
        return nums[n-k];

        
    }
}