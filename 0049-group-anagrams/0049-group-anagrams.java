class Solution {
     public static String sorting(String str){
        char[] s = str.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            String sortedStr = sorting(str);

            // If the key is not already in the map, add it with an empty list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            
            // Add the original string to the list corresponding to the sorted key
            map.get(sortedStr).add(str);
        }

        // Output the grouped anagrams
        List<List<String>> groupedAnagrams = new ArrayList<>(map.values());
        return groupedAnagrams;
    }
}