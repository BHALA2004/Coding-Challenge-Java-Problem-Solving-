class Solution {
    public static List<String> helper(String p,String up,List<String> list){
            if(up.isEmpty()){
                list.add(p);
                return list;
            }
            int n = up.charAt(0)-'0';
            if(n!=7 && n!=9 && n!=8){
        for(int i = (n-1)*3;i< n*3;i++){
            char ch  = (char)('a'+(i-3));
            helper(p+ch,up.substring(1),list);
        }}
        else if(n==7){
            for(int i = (n-1)*3;i<= n*3;i++){
                char ch  = (char)('a'+(i-3));
                helper(p+ch,up.substring(1),list);
            }
        }
        else if(n==8){
            for(int i = (n-1)*3;i< n*3;i++){
                char ch  = (char)('a'+((i-3)+1));
                helper(p+ch,up.substring(1),list);
            }
        }
        else {
            for(int i = (n-1)*3;i<= n*3;i++){
                char ch  = (char)('a'+(i-3)+1);
                helper(p+ch,up.substring(1),list);
            }
        }
            return list;
    }
    
    public List<String> letterCombinations(String digits) {
            List<String> list = new ArrayList<>();
            String p = "";
            if(digits.isEmpty()){
                return list;
            }
            helper(p ,digits, list);
            return list;
    }
}