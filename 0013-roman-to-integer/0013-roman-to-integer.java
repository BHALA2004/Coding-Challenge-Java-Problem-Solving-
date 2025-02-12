class Solution {
    public int romanToInt(String s) {
        int k = 0;
            for(int i = 0;i<s.length();i++){
                    if(i<=s.length()-2 && map(s.charAt(i))<map(s.charAt(i+1))){
                    int big = map(s.charAt(i+1));
                    int small = map(s.charAt(i));
                    k+=(big-small);
                    i+=1;
                }
                else {
                    k+=map(s.charAt(i));
                    }
            }
            return k;
    }
    public static int map(char c){
        int integerValue = 0;
        switch (c) {
            case 'I':
                integerValue = 1;
                break;
            case 'V':
                integerValue = 5;
                break;
            case 'X':
                integerValue = 10;
                break;
            case 'L':
                integerValue = 50;
                break;
            case 'C':
                integerValue = 100;
                break;
            case 'D':
                integerValue = 500;
                break;
            case 'M':
                integerValue = 1000;
                break;
            default:
                System.out.println("Invalid Roman numeral.");
                return 0;
        }
        return integerValue;
    }
}