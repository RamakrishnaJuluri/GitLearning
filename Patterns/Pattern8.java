package Patterns;

public class Pattern8 
{
    public static void pattern8(int n)
    {
        for(int i=0;i<=n;i++)
        {
            System.out.println();

            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i + 1);j++)
            {
                System.out.print("*");
            }
        }
    }
    public static void main(String[] args) {
        pattern8(5);
    }
    
}
