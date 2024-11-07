class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();boolean m = false;
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> hash : map.entrySet()){
            if(!list.contains(hash.getValue())){
                 list.add(hash.getValue()); m = true;
            }
            else {
                m=false;break;
            }
        }
        return m;
    }
}