//Chack if an array is sorted(Strictly increasing)

public class check_array_sorted {
    public static boolean isSorted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        int arr[]={1,3,4,5,7,8};
        int idx=0;
        System.out.print(isSorted(arr,idx));
    }
}
