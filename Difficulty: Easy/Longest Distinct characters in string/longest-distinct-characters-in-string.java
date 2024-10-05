//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        
        int n = S.length();   int maxLength = 0;
        int start = 0;

        // HashMap to store the last index of every character
        HashMap<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char currentChar = S.charAt(end);

            // If the character is already in the map, move the start pointer
            if (map.containsKey(currentChar)) {
                start = Math.max(start, map.get(currentChar) + 1);
            }

            // Update the map with the current character's latest index
            map.put(currentChar, end);

            // Calculate the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

       return maxLength;
        
    }
}