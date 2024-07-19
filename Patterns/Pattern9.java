package Patterns;

public class Pattern9 
{
    public static void pattern9(int n)
    {
        for(int i=0;i<=n;i++)
        {
            System.out.println();

            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<2*n-1;j++)
            {
                System.out.print("* ");
            }

        }

    }
    public static void main(String[] args) {
        pattern9(5);
    }
}
