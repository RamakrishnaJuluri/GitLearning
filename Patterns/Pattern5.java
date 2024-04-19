package Patterns;

public class Pattern5 
{
    public static void pattern5(int n)
    {
        for(int i=1; i<=n;i++)
        {
            System.out.println();

            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");

            }

        }     
    } 
    public static void main(String[] args) {
        pattern5(5);
    }   
}
