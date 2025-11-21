package collection.list;

import java.util.ArrayList;

public class ArrayList2
{
    public static void main(String[] args) {
        ArrayList al =new ArrayList();

        al.add("lenovo");
        al.add("hp");
        al.add("samsung");
        al.add("dell");
        for (Object O :al)
        {
          String i= (String) O;
            System.out.println(i);
        }

    }
}
