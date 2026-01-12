package collection.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList13 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(789);
        al.add(Integer.valueOf(100));

        for (Object o : al) {
            if (o instanceof Integer) {
                Integer i = (Integer) o;
                System.out.println(i);

            } else if (o instanceof String) {
                String i = (String) o;
                System.out.println(i);


            }


        }
    }
}
