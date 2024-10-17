class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        if(n==0){
            return true;
        }
        if(arr.length==1){
            if(arr[0]==0 && n==1){
                return true;
            }
            else if(arr[0]==1 && n==1){
                return false;
            }
        }

        if(arr[0]==0){
            if(arr[1]!=1){
                arr[0]=1;n--;
                if(n==0){
                    return true;
                }
            }
        }
        if(arr[arr.length-1]==0){
            if(arr[arr.length-2]!=1){
                arr[arr.length-1]=1;n--;
                if(n==0){
                    return true;
                }
            }
        }
        for(int i = 1;i<arr.length-1;i++){
            if(arr[i]==0){
                if((arr[i-1]!=1) && (arr[i+1]!=1)){
                    arr[i]=1;n--;
                    if(n==0){
                        return true;
                    }
                }
            }
        }
        return false;
        //System.out.print(Arrays.toString(arr));
    }
}