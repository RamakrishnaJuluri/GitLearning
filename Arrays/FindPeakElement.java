package Arrays;

public class FindPeakElement 
{
    public static void peakElement(int[] arr, int n)
    {
        int largest = Integer.MIN_VALUE; 
        for(int i =0; i<n; i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            } 
        }
        System.out.println("the largest of the element is :"+ largest);
        
    }

    public static void main(String[] args) 
    {
        int[] arr = {12,1,5,67,68}; 
        int n = arr.length;
        FindPeakElement.peakElement(arr, n);


    }
}
