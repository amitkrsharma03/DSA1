package Programs;

public class ShellSort {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    void sort(int[] arr){
        
    }

    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};
        ShellSort ob = new ShellSort();
        ob.sort(arr);
        printArray(arr);
    }
}