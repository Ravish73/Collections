package collection.list;

import java.util.ArrayList;

public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<Swiggy> s =new ArrayList<>();
        s.add(new Swiggy(101 ,"Panner Tikka"));
        s.add(new Swiggy(102 ,"Panner Butter masala"));
        s.add(new Swiggy(103 ,"uttapam"));
        for (Swiggy S :s) {

            System.out.println(S.OrderId +"" +S.OrderName);
        }


    }
}
