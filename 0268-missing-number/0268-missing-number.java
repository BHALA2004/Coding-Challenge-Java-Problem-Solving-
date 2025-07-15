class Solution {
    public int missingNumber(int[] nums) {
       

int sum = 0;
int arrSum = 0;
      for(int i = 0;i<=nums.length;i++){
        sum+=i;
      }

      for(int i = 0;i<nums.length;i++) {
            arrSum +=nums[i];
      }

      return sum-arrSum;


    }
}