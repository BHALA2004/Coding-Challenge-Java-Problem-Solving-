class Solution {
     public static int helper(int num,int val){
        if(num<=0){
            return val;
        }
        if(num%2==0){
            return helper(num/2,++val);
        }
        return helper(num-1,++val);

    }
    public int numberOfSteps(int num) {
         int val=0;
        return helper(num,val);
    }
}