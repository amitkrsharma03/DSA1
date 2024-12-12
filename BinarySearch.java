package Programs;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr={1, 3, 5, 7, 9, 11, 13};
        int tar=11;
        int n=7;
        int result = BS(arr, tar, n);
        if (result != -1) {
            System.out.println("Target " + tar + " found at index " + result);
        } else {
            System.out.println("Target " + tar + " not found in the array.");
        }
    }

    private static int BS(int[] arr, int tar, int n)
    {
        int l=0,r=n-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(tar==arr[m]){
                return m;
            }else if(arr[m]>tar){
                r=m-1;
            }else{
                l=m+1;
            }
            l++;
        }
        return -1;
    }
}

/*
Note: Should be already in sorted Order
Time Complexity:
    Best Case: Theta : O(1); When element is at the middle position
    Average Case: Omega: O(log n);
    Worst Case: Big-Oh: O(log n);    
*/