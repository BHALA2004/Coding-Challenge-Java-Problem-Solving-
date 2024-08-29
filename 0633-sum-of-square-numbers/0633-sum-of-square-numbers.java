class Solution {
    public boolean judgeSquareSum(int c) {
        long sum = 0;boolean result =false;long start = 0,end=(long) Math.sqrt(c);
        
        while (start<=end){
            sum=(start*start)+(end*end);
            if(sum==c){
                result=true;break;
            }
            else if(sum>c){
                end--;
            }
            else {
                start++;
            }
            sum=0;
        }
        return result;
    }
}