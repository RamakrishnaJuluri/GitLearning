public class ReverseStringAndCapitalize
{
    public static void main(String[] args) 
    {
        String str = "im working in epam systems";
        StringBuilder sb = new StringBuilder();
        for(String s: str.split(" "))
        {
            String rev = new StringBuffer(s).reverse().toString();
            rev = Character.toUpperCase(rev.charAt(0))+rev.substring(1);
            sb.append(rev).append(" ");
        }
        System.out.println(sb.toString());
    }       
}
