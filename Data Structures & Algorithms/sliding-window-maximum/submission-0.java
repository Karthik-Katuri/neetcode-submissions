class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<=n-k;i++){
            int max = Integer.MIN_VALUE;
            for(int j =i;j<i+k;j++){
                max = Math.max(max,nums[j]);
            }
        arr.add(max);
        }
    int[] res = new int[arr.size()];
    for(int i =0;i<arr.size();i++){
        res[i] = arr.get(i);
    }
    return res;
    }
    
    
}
