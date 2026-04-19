class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int result = 0;
        if(n==1){
            return 1;
        }
        int left =0;int right = 0;
        while(right<n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
            }
            else{
                
                
                set.remove(s.charAt(left));
                left++;
            }
            result = Math.max(result,set.size());
        }
        return result;
    }
}
