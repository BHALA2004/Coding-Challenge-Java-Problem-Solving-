class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            return (b[1] - b[0]) - (a[1] - a[0]);
        });
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<points.length;i++){
            while(!pq.isEmpty() && points[i][0] - pq.peek()[0] > k){
                pq.poll();
            }
            if(!pq.isEmpty()){
                int temp[] = pq.peek();
                int x1 = temp[0];
                int y1 = temp[1];
                int x2 = points[i][0];
                int y2 = points[i][1];
                ans = Math.max(ans,y1+y2+Math.abs(x2-x1));
            }
            pq.offer(new int[]{points[i][0], points[i][1]});
        }
        return ans;
    }
}