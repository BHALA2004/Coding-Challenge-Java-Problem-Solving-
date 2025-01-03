class Solution {
    public String simplifyPath(String path) {
        String[] res = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String val : res){
            if(val.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(!val.equals(".") && !val.isEmpty()){
                stack.push(val);
            }
        }
        StringBuilder str = new StringBuilder();
        for(String newval : stack){
            str.append("/").append(newval);
        }
        return str.length()>0?str.toString():"/";
    }
}