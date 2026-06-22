class Solution {
    public int[] sortArray(int[] nums) {
        if(nums==null || nums.length<=1)
        return nums;
        int l =0;
        int r = nums.length-1;
        mergesort(nums,l,r);
        return nums;
    }
    private void mergesort(int[] nums, int l, int r){
        if(l>=r)
        return;
        int mid = (l+r)/2;
        mergesort(nums,l,mid);
        mergesort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    private void merge(int[] nums,int l, int mid, int r){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = mid+1;
        while(left<=mid && right<=r){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while(right<=r){
            temp.add(nums[right]);
            right++;
        }
        int k=0;
        for(int i=l;i<=r;i++){
            nums[i]=temp.get(k++);
        }
    }
}