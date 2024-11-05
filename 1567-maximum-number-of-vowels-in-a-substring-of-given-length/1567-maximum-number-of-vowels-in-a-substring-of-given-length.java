class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int ans = 0;
        int window = 0;
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u')
                window++;
        }
        ans = window;
        for (int right = k; right < n; right++) {
            if (s.charAt(right) == 'a' || s.charAt(right) == 'e' || s.charAt(right) == 'i' || s.charAt(right) == 'o'
                    || s.charAt(right) == 'u')
                window++;
            if (s.charAt(right - k) == 'a' || s.charAt(right - k) == 'e' || s.charAt(right - k) == 'i'
                    || s.charAt(right - k) == 'o' || s.charAt(right - k) == 'u')
                window--;
            ans = Math.max(ans, window);
        }
        return ans;
    }
}