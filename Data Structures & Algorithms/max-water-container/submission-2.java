class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        int left = 0;int right = heights.length-1;

        while(left<right){
            int height = Math.min(heights[left],heights[right]);
            int base = right-left;

            int area = height*base;
            maxArea = Math.max(area,maxArea);
            if(heights[left]<=heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
