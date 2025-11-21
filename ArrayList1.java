package collection.list;

import java.util.ArrayList;

public class ArrayList1
{
    public static void main(String[] args) {
        System.out.println("hello");
        ArrayList al=new ArrayList();
        al.add(100);   //integer
        al.add(200);
        al.add(300);
        System.out.println(al);
        al.add('a'); al.add(20.5f);
        System.out.println(al);
        al.add(null);
        System.out.println(al);


    }
}
