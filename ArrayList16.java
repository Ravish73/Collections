package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList16 {
    public static void main(String[] args) {
        ArrayList al2 = new ArrayList<>();
        al2.add(88);
        al2.add(12);
        al2.add(23);

        Iterator <Integer>i = al2.iterator();
        while (i.hasNext()) {
           // String s=(String)
            Integer a= i.next();


            System.out.println(a);
        }
//            Object data = i.next();  // extract data
//
//            System.out.println(data); // print value
//
//            // Check data type
//            if (data instanceof Integer)
//            {
//                System.out.println("Integer");
//            }
//            else if (data instanceof String)
//            {
//                System.out.println("String type");
//            }
//            else
//            {
//                System.out.println("Other type");
//            }
//        }
//
   }
    }
//
