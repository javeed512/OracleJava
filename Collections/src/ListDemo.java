
import java.util.*;

public class ListDemo {


    public static void main(String[] args) {
        
      List<String>  list =      new ArrayList<String>();   // here <String> is known as generic data type


                    list.add("king");
                    list.add("smith");
                    list.add("tom");
                    list.add("ford");
                    list.add(null);

                    System.out.println("Homogenous Objects");

                    System.out.println(list);
                    System.out.println("List size "+list.size());
                    System.out.println("Is available "+list.contains("ford"));

                        list.remove("tom");


                        for(String str:list){

                                System.out.println(str);

                        }

                            // convert list  into array

                            System.out.println("List to Array");

                        Object[]  stringArr =        list.toArray();

                            for (Object obj : stringArr) {

                                String s1 = (String) obj;

                                System.out.println(s1);
                                
                            }



                  List<Object> list2 =     new ArrayList<Object>();    


                            list2.add("Javeed");
                            list2.add(101);  // new Integer(101);
                            list2.add(4.555); // new Double(4.555);
                            list2.add(true);
                            list2.add(new ListDemo());

                            System.out.println("Heterogenous Objects");
                            System.out.println(list2);

    }


}
