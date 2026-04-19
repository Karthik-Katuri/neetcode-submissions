class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
    if(nums.length==0){
        return 0;
    }
        for(int num: nums){
            set.add(num);

        }
        int longest=0;
        for(int num:nums){
            int length=1;

            while(set.contains(num+length)){
                length++;
            }
            
            longest=Math.max(longest,length);
            

        }
        return longest;
    }
}
