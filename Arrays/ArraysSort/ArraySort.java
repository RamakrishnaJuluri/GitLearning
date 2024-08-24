package Arrays.ArraysSort;

public class ArraySort 
{
    public static void arraySort(int[] arr, int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                 arr[j+1] = temp;
            }
        }
        
        }

        for(int k=0; k<arr.length; k++)
        {
            System.err.print(arr[k] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {19,21,20,23,18};
        int n = arr.length;
        ArraySort.arraySort(arr, n);
    }  
}
