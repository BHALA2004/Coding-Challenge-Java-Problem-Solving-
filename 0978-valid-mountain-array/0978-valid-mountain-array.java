class Solution {
    public boolean validMountainArray(int[] arr) {
        int min = 0;int max = 0;
        if(arr.length==1){
            return false;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return false;
            }
            else if(min==0 && arr[i]>arr[i+1]){
                min = 1;
            }
            else if(min==1 && arr[i]<arr[i+1]){
                return false;
            }

        }
        if(min==0){
            return false;
        }
        return true;
        
    }
}