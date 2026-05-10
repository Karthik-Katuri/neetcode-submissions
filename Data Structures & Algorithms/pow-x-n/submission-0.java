class Solution {
    public double myPow(double x, int n) {
        double num = 1.0;
        if(n>=0){
        while(n>0){
            num = num*x;
            n--;
        }}
        else{
            while(n<0){
                num = num/x;
                n++;
            }
        }
        
        return num;
    }
}
