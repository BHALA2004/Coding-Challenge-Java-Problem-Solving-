class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> hashmap = new HashMap<>();
      for(int i = 0;i<nums.length;i++){
          hashmap.put(nums[i],hashmap.getOrDefault(nums[i],0)+1);
      }
      for(Map.Entry<Integer,Integer> has : hashmap.entrySet()){
          if(has.getValue()>=2){
              return has.getKey();
          }
      }
      return -1;
    }
}