package collection.list;

import java.util.ArrayList;

public class ArrayList12
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList<>();
        al.add(100);
        al.add('x');
        al.add(true);
        al.add(0,200.5);
        System.out.println(al);
        System.out.println(  al.size());
        al.remove(0);
        System.out.println(al);
        Integer i=100;
        al.remove(i);

        System.out.println(al);
        System.out.println(al.isEmpty());
        ArrayList al2 =new ArrayList<>();
        al2.addAll(al);
        System.out.println(al2);
        al2.retainAll(al);
        System.out.println(al2);






    }
}
