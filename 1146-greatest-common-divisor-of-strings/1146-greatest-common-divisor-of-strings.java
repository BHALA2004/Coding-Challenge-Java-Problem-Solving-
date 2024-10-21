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
        int k = 0;
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        String result  = "";
        int a = str1.length();int b = str2.length();
        if(a>b){
        k = GCD(a,b);}
        else {
            k = GCD(b,a);
        }
       
        return str1.substring(0,k);
    }
}