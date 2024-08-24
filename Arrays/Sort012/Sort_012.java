package Arrays.Sort012;

public class Sort_012 
{
      public static void sortArray012(int[] arr, int n)
      {
        int low =0;
        int mid =0;
        int high = n-1;
        int temp = 0; 

        if (n == 1)
        System.out.println("Cannot perform the operation, because the length is 1");

        while(mid<=high)
        {
            if(arr[mid] == 0)
            {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else
            {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for(int i: arr)
        {
            System.out.print(i+" ");
        }
      }
      public static void main(String[] args) {
        int[] arr = {2,0,2,1,0};
        int n = arr.length;
        sortArray012(arr, n);
      }


}
