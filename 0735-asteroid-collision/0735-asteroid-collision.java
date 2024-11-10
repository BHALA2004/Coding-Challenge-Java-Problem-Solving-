class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // Stack<Integer> stack = new Stack<>();
        // for(int i : asteroids){
        //     while(!stack.isEmpty() && i<0 && stack.peek()>0 && i<Math.abs(stack.peek())){
        //         stack.pop();
        //     }
        //     if(stack.isEmpty() || i>0 || stack.peek()<0){
        //         stack.push(i);
        //     }
        //     else if(stack.peek()==Math.abs(i)){
        //         stack.pop();
        //     }
        // }
        // int[] ans = new int[stack.size()];
        // for(int i = stack.size()-1;i>=0;i--){
        //     ans[i]=stack.pop();
        // }
        // return ans;
        Stack<Integer> stack = new Stack<Integer>();

        for (int asteroid : asteroids)
        {            
            while(!stack.isEmpty() && asteroid<0 && stack.peek()>0 && stack.peek()<Math.abs(asteroid))
                stack.pop(); 
            

            if (stack.isEmpty() || asteroid > 0 || stack.peek() < 0) 
                stack.push(asteroid);
            else if (stack.peek() == Math.abs(asteroid))
                stack.pop();
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}