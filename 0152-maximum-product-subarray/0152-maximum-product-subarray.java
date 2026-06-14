class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null ||nums.length==0){
            return 0;
        }
        int Product=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
            int currentProduct =1;
            for(int j=i;j<nums.length;j++){
                currentProduct *=nums[j];
                Product = Math.max(currentProduct,Product);

            }
         }
         return Product;
        
    }
}