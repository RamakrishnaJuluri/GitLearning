package Arrays;
import java.util.Arrays;
import java.util.Random;
class Create1DArray
{
    public void createAnArray(int arraylength, int randomrange)
    {
        try
        {
            int[] arr;
        arr = new int[arraylength];
        for(int i = 0; i<arr.length;i++)
        {
            Random randommunber = new Random();
             arr[i] = randommunber.nextInt(randomrange);
        }
        System.out.println(Arrays.toString(arr));
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);

        }
        
    }
    public static void main (String args[])
    {
        Create1DArray newarr = new Create1DArray();
        newarr.createAnArray(15,1500);
    }
}
