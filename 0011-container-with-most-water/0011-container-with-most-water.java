class Solution {
    public int maxArea(int[] arr) {
        int max =0;int res = 1;int index = 1;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
           res = Math.min(arr[left],arr[right]);
            index = Math.abs(left-right);
            max = Math.max(max,res*index);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}