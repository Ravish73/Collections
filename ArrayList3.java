package collection.list;

import java.util.ArrayList;

public class ArrayList3
{
    public static void main(String[] args)
    {
        Swiggy cust1=new Swiggy(101,"ButterChicken");
        Swiggy cust2=new Swiggy(102,"PavBhaji");
        Swiggy cust3=new Swiggy(103,"pizza/Burger");
        ArrayList al= new ArrayList();
        al.add(cust1);        al.add(cust2);        al.add(cust3);
        for (Object O:al)
        {
            Swiggy s=(Swiggy)O;
            System.out.println(s.OrderId+ "  "+s.OrderName);
        }




    }
}
