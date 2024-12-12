package Programs;

public class Insertion {
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};
        Insertion ob = new Insertion();
        ob.sort(arr);
        printArray(arr);
    }
    static void printArray(int[] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    void sort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;
        }
    }
}

/*Time Complexity:
    Best Case: Theta : O(n); When Already sorted
    Average Case: Omega: O(n^2);
    Worst Case: Big-Oh: O(n^2);
    */
