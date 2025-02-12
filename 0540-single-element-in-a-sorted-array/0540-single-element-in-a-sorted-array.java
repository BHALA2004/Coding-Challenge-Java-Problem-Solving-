class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            hashmap.put(nums[i],hashmap.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> map : hashmap.entrySet()){
            if(map.getValue()==1){
                return map.getKey();
            }
        }
        return -1;
    }
}