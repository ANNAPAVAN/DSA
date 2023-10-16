import java.util.*;
class Test 
{
    public static void main(String[] args)
    {
        TreeMap<String,Integer> m = new TreeMap<>(new Comp());
        
        m.put("pavan",110);
        m.put("anna",102);
        m.put("op",113);

        
        // System.out.println(m);
        for(Map.Entry<String,Integer> i:m.entrySet())
        {
            if(i.getKey().equals("pavan"))
            {
                m.put(i.getKey(),i.getValue()+1000);   
            }
        }
        System.out.println(m);
    }
}
class Comp implements Comparator<Object>
{
    public int compare(Object o1,Object o2)
    {
        String s1 = (String)o1;
        String  s2 = (String)o2;
        return s2.compareTo(s1);
    }
}


