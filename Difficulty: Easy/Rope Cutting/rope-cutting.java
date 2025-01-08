//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // Reading the number of test cases

        while (t-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");

            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            ArrayList<Integer> result = new Solution().RopeCutting(arr);

            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
            }
            System.out.println();
            System.out.println("~");
        }
        sc.close(); // Closing the scanner
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    // Function for finding maximum and value pair
    public ArrayList<Integer> RopeCutting(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        //int arr[] = {5, 1, 6, 9, 8, 11, 2, 2, 6, 5};
        Arrays.sort(arr);
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]-min>0){
                list.add(arr.length-i);
                min=arr[i];
            }

        }
        return list;
    }
}
