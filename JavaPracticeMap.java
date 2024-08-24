import java.util.*;

public class JavaPracticeMap 
{
    public static void main(String[] args) {

        HashMap<String, Float> hm = new HashMap<String, Float>();
        hm.put("Sachin", 9.6f);
        hm.put("Kohli", 9.4f);
        hm.put("Surya", 8.4f);
        System.out.println("the entries of the map are : "+ hm);

        for(Map.Entry<String, Float> set : hm.entrySet())
        {
            float value = set.getValue();
            if(value>9.1)
            System.out.println(set.getKey());
        }


    }
}
