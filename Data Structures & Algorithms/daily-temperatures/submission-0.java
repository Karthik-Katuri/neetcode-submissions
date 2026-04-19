class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[n];
        
        for(int i =0;i<n;i++){
            int maxTemp = temperatures[i];
            maxTemp = Math.max(maxTemp,temperatures[i]);
           while(!stack.isEmpty() && maxTemp>stack.peek()[0]){
            int[] pair = stack.pop();
            result[pair[1]] = i-pair[1];
           }
           stack.push(new int[]{maxTemp,i});
        }
        return result;
    }
}
