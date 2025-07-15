class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       
       int prev = 0;
       int oneCount = 0;
       int i = 0;
       for(i = 0;i<nums.length;i++){
        if(nums[i]==1){
            oneCount ++;
        }
        else{
            prev = Math.max(oneCount,prev);
            oneCount=0;
        }
        
       }
       if(i==nums.length){
        prev = Math.max(oneCount,prev);
       }
       
       return prev;

       // return the maximum consecutive ones found
    }
}