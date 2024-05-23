public class unsort_find_k {
    public static void main(String[] args) {
        int[] arr = {50,60,70,80,90,100,10,20,30,40};
        int k = 20;

        int ans = get(arr,k);
        System.out.println(ans);
    }
    public static int get(int[] arr,int k){

        int s = 0;
        int e = arr.length-1;
        int ans = -1;
    
    while(s<=e){

        int mid = (s+e)/2;

        if(arr[mid] == k){
            return mid;
        }
        else if(arr[s] <= arr[mid]){ //first part sorted
            
            if(k>=arr[s] && k<arr[mid]){
                e = mid -1;
            }
            else{
                s = mid +1;
            }
        }
        else{ //second part sorted
             
            if(k>arr[mid] && k<=arr[e]){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
    }
    return ans;
}
}

