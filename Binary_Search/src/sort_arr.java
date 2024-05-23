public class sort_arr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int k = 20;

        int ans = -1;

        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;

            if(arr[mid] == k){
                ans = mid;
                break;
            }
            else if(k > arr[mid]){
                s = mid + 1;
            }
            else if(k < arr[mid]){
                e = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
