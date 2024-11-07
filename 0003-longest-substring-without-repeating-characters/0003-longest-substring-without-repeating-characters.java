class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h = new HashSet<>();int length = 0;int max = 0;
        int left = 0;int right = 0;
        while(right<s.length()){
            while(h.contains(s.charAt(right))){
                h.remove(s.charAt(left));left++;
            }
            h.add(s.charAt(right));length=right-left+1;
            max=Math.max(max,length);
            right++;

        }
        return max;
    }
}