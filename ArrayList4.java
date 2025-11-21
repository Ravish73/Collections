package collection.list;

import collection.list.Swiggy;

import java.util.ArrayList;

public class ArrayList4
{
    public static void main(String[] args)
    {
        ArrayList al =new ArrayList<>();
        al.add(new Swiggy(101,"Panipuri"));
        al.add(new RedBus(111,"King "));
        al.add(new Emp(777,"raviraj "));
        for (Object O:al)
        {
            if (O instanceof Swiggy)
            {
                Swiggy S= (Swiggy)O;
                System.out.println(S.OrderId +"  "+ S.OrderName);
            }

            else if (O instanceof Emp)
            {
                Emp E =(Emp)O;
                System.out.println( + E.EpId+ " "+ E.EmpName);

            }
            else if (O instanceof RedBus)
            {
                RedBus R=(RedBus)O;
                System.out.println(R.TicketId+" "+R.PassangerName);
            }

        }



    }
}
