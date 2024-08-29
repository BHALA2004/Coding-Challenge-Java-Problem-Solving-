class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }
        List<Integer> list = new ArrayList<>();


        for(int i = 0;i<nums2.length;i++){
            if(list1.contains(nums2[i])){
                list.add(nums2[i]);
                list1.remove((Integer)nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result;
    }
}