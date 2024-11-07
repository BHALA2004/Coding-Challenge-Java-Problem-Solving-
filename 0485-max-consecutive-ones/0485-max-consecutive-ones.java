class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0,flag=0,pre_flag=flag;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                flag++;
                maxi=Math.max(flag,maxi); // update maxi with the current maximum consecutive ones
            }
            else{
                
                flag=0;
            }
        }
        return maxi; // return the maximum consecutive ones found
    }
}