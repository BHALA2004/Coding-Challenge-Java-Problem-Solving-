class Solution {
    public static int GCD(int a,int b){
        if(b==0){
            return a;
        }
        else {
            return GCD(b,a%b);
        }
    }
    public String gcdOfStrings(String str1, String str2) {
      if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: Calculate GCD of lengths
        int gcdLength = GCD(str1.length(), str2.length());

        // Step 3: Return the substring of str1 with the length of the GCD
        return str1.substring(0, gcdLength);

    }
}