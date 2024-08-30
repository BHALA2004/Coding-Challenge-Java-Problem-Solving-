class Solution {
    public int firstUniqChar(String s) {
        char[] m = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<m.length;i++){
            map.put(m[i],map.getOrDefault(m[i],0)+1);
        }
        for(int i =0;i<m.length;i++){
                if(1==map.get(m[i])){
                   return i;
                }
        }
        return -1;
    }
}