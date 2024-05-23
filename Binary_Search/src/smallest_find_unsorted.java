public class smallest_find_unsorted {
    public static void main(String[] args) {

        int[] arr = {10,20,30,100,50,60,70};
        int ans = get(arr);
        System.out.println(ans);
    }

    public static int get(int[] arr){                 //sorted

        if(arr.length==1){
            return arr[0];
        }
        else if(arr[0] < arr[arr.length-1]){
            return arr[0];
        }                                            //sorted
        else{                                        //unsorted
            int start = 0;
            int end = arr.length-1;

            while(start<=end){

                int mid = (start+end)/2;

                if(mid!=0 && arr[mid]-1 > arr[mid]){
                    return arr[mid];
                }
                else if(mid != arr.length-1 && arr[mid]>arr[mid+1]){
                    return arr[mid+1];
                }
                else if(arr[start] <= arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            return -1;
        }
    }
}
