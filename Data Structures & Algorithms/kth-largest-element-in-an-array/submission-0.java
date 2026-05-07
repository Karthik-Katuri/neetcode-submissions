class Solution {
    public int findKthLargest(int[] nums, int k) {
       int n = nums.length;
       Arrays.sort(nums);
        int i = n;
       while(i>=0){
        if(k==0){
            
            break;
        }k--;
        i--;
       }
       return nums[i];
    }
}
