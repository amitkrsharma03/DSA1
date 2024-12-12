package Programs;

public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
    private static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    private static void printArray(int[] arr)
    {
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}

/*Time Complexity:
    Best Case: Theta : O(n); When Already sorted
    Average Case: Omega: O(n^2);
    Worst Case: Big-Oh: O(n^2);
    */