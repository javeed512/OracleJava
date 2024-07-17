
import java.util.*;

public class ListDemo {


    public static void main(String[] args) {
        
      List<String>  list =      new ArrayList<String>();   // here <String> is known as generic data type


                    list.add("king");
                    list.add("smith");
                    list.add("tom");
                    list.add("ford");

                    System.out.println(list);


                        for(String str:list){

                                System.out.println(str);

                        }



    }


}
