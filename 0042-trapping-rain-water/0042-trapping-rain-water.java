class Solution {
    public int trap(int[] height) {
        int leftMax = height[0];
        Stack<Integer> stack = new Stack<>();
        stack.push(height[height.length-1]);
        for(int i = height.length-1;i>=2;i--){
            stack.push(Math.max(stack.peek(),height[i]));
        }

        int totalWater = 0;

        for(int i = 1;i<height.length-1;i++){
            int temp = Math.min(stack.peek(),leftMax);
            int minimum = temp-height[i];
            totalWater+=Math.max(0,minimum);
            stack.pop();
            leftMax = Math.max(leftMax,height[i]);

        }
        return totalWater;
    }
}