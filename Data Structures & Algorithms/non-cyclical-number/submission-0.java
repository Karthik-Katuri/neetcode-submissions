class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        return isCyclic(n,set);
    }
    public boolean isCyclic(int n, HashSet<Integer> set){
        while(!set.contains(n)){
            set.add(n);
            n = square(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
    public int square(int n){
        int num = 0;
        while(n>0){
            int x = n%10;
            num += x*x;
            n = n/10;
        }
        return num;
    }
    
}
