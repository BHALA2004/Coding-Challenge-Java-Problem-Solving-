class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0; int right  = 0;int count = 0;int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            while(count>k){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            max=Math.max(max,i-left+1);

        }
        return max;
    }
}