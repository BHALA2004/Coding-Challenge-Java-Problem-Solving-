class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int index=0;
        while(index<n){
            int start = intervals[index][0];
            int end = intervals[index][1];
            while(index<n-1 && end>=intervals[index+1][0]){
                end = Math.max(end,intervals[index+1][1]);
                index++;
            }
            
            list.add(new int[]{start,end});
            index++;
        }
        int[][] result = new int[list.size()][2];
        int indexi=0;
        for(int[] arr : list){ 
            result[indexi++]=arr;
        }
        return result;
    }
}