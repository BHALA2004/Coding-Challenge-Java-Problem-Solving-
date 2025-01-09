class Solution {
    public int prefixCount(String[] words, String pref) {
        int count  = 0;
        for(String value : words){
            if(value.length()>=pref.length() && pref.equals(value.substring(0,pref.length()))  ){
                count++;
            }
        }
        return count;
    }
}