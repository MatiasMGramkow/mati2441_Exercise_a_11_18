import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class No18a
{
    public void run()
    {
        Map<String, String> value = new HashMap<>();
        value.put("3","Marty");
        value.put("42","Marty");
        value.put("31","Dave");
        value.put("82","Sue");
        value.put("17","Ed");
        value.put("29","Ed");
        value.put("56","Ed");

        System.out.println(reverse(value));
    }
    private Map<String, Set<String>> reverse(Map<String, String> map)
    {
        Map<String, Set<String>> value = new HashMap<>();

        for ( Map.Entry<String, String> m :  map.entrySet())
        {
            if(value.containsKey(m.getValue()))
            {
                Set<String> s = value.get(m.getValue());
                s.add(m.getKey());

                value.put(m.getValue(), s);
            }else
            {
                Set<String> s = new HashSet<>();
                s.add (m.getKey());
                value.put(m.getValue(), s);
            }
        }
        return value;
    }

}
