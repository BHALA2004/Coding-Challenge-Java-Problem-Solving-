class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;double max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length-k+1;i++){
            int j = i;
            while (j<k+i){
                sum+=nums[j];
                j++;
            }
            max=Math.max(max,sum);
            sum=0;
        }
        return (double)(max/k);
    }
}