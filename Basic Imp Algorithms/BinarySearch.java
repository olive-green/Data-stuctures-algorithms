public int binarySearch(int[] arr,int low,int high,int target){
    if(low<high){
        int mid=low+(mid-low)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[mid]>target){
            return binarySearch(arr,low,mid-1,target);
        }
        return binarySearch(arr,mid+1,high,target);
    }
    return -1;
}