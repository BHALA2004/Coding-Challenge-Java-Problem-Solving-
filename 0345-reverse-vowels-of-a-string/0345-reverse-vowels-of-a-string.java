class Solution {
    public String reverseVowels(String s) {
        // Convert the string to a char array to allow in-place modifications
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        
        // Define a helper method to check if a character is a vowel
        while (left < right) {
            if (isVowel(charArray[left]) && isVowel(charArray[right])) {
                // Swap the vowels
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                
                // Move both pointers inward
                left++;
                right--;
            } else if (isVowel(charArray[left])) {
                right--; // Move the right pointer leftward
            } else if (isVowel(charArray[right])) {
                left++; // Move the left pointer rightward
            } else {
                left++;
                right--;
            }
        }
        
        // Convert the char array back to a string
        return new String(charArray);
    }
    
    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
