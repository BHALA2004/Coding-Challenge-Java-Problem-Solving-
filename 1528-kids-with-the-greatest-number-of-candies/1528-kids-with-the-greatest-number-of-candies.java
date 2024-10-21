class Solution {
    public static int max(int[] candy){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<candy.length;i++){
            max=Integer.max(max,candy[i]);
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxi = max(candies);
        //System.out.println(maxi);
        for(int i = 0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxi){
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }
}