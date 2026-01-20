package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList17 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("HP");
        al.add("Lenovo");
        al.add("Dell");
        al.add("acer");
        al.add("samsung");
        System.out.println(al);
        Iterator i = al.iterator();
        System.out.println();

        while (i.hasNext())
        {
            String info = (String) i.next();
            if (info.equals("acer"))
            {
                i.remove();
            }
        }
        for (String ss: al)
        {
            System.out.println(ss);
        }
    }
}