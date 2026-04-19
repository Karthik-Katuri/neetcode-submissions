class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int height = Math.min(heights[i],heights[j]);
                int base = j-i;
                int area = height*base;
                maxArea = Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
}
