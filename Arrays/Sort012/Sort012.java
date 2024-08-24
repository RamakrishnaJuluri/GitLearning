package Arrays.Sort012;

public class Sort012
{
    public static void sort012(int[] arr,int n)
    {
        int c0=0,c1=0,c2=0;

        for(int i=0; i<n; i++)
        {
            //increase the count of c0, if zeros are found
            if(arr[i]==0)
            {
            c0++;
            }
            //increase the count of c1, if ones are found
            else if(arr[i]==1)
            {
            c1++;
            }
            //increase the count of c2, if twos are found
            else
            {
            c2++;
            }
        }
        System.out.println("the number of zeros are :"+c0);
        System.out.println("the number of ones are :"+c1);
        System.out.println("the number of twos are :"+c2);

        int idx = 0;
        for(int i=0; i<c0; i++)
        arr[idx++] = 0;

        for(int i=0; i<c1; i++)
        arr[idx++] = 1;

        for(int i=0; i<c2; i++)
        arr[idx++] = 2;

    }
    public static void main(String[] args) 
    {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        sort012(arr, n);
        for(int i: arr)
        {
            System.out.print(i+" ");

        }
    }
}