public class LargestNumberArray 
{
    public static int largestNumberArray(int[] arr, int n)
    {
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            largest = arr[i];
        }
        return largest;
    } 
    
    public static void main(String[] args) {
        int[] arr = {3,6,8,4,2,9};
        int n = arr.length;
        int answer = largestNumberArray(arr, n);
        System.out.println("the second largest number of array is :"+ answer);
    }
}
