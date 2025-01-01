class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            for(int j = n-i;j>0;j--){
                System.out.print(" ");
            }
            int val = 1;
            List<Integer> temp = new ArrayList<>();
            for(int j = 1;j<=i;j++){
                temp.add(val);
                val = (val * (i - j)) / j;
            }
            System.out.println();
            list.add(temp);
        }
        return list;
    }
}