package Arrays.RemoveDuplicates;

public class RemoveDuplicates 
{
    public static void removeDuplicates(int[] arr, int n)
    {
        int[] temp = new int[arr.length];
        int i=0;
            for(int j=1; j<n; j++)
            {
                if(arr[i]!= arr[j])
                {
                   i++;

                }
                else
                {
                  temp[i] = arr[j];
                  i = j; 
                  j++;

                }
            }
            for(int k=0; k<n; k++)
            {
                System.out.println(temp[k]+ " ");
            }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        int n = arr.length;
        RemoveDuplicates.removeDuplicates(arr, n);
    }
}
