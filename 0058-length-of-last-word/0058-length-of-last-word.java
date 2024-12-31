class Solution {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        String g = s1[s1.length-1];
        return g.length();
        // int count=0;
        // for(int i=s.length()-1;i>=0;i--){
        //     if(Character.isLetter(s.charAt(i))){
        //         count++;
        //     }
        //     if(s.charAt(i)==' '){
        //         if(count>0){
        //         break;}
        //     }
            
        // }
        // return count;
    }
}