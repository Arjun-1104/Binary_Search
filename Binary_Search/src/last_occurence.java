public class last_occurence {
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,30,30,30,40,50,60,70,80,90};
        int k  = 30;

        int ans = get(arr,k);
        System.out.println(ans);
    }

    public static int get(int[] arr,int k){

        int s = 0;
        int e = arr.length-1;
        int ans = -1;

            while (s<=e) {
            int mid = (s+e)/2;

            if(k == arr[mid]){
                ans = mid;
                s = mid+1;
            }
            else if(k< arr[mid]){
                e = mid -1;
            }
            else{
                s = mid +1;
            }
        }
        return ans;
    }
}


















































































































