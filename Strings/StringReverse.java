package Strings;
class StringReverse{
    public static void main(String args[])
{
    String str = "Rama";
    String rev ="";
    char ch[] = str.toCharArray();
    for(int i = ch.length-1;i>=0;i--)
    {
        rev+=ch[i];
    }
    System.out.println(rev);

}
}