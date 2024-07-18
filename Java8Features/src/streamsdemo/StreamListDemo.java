package streamsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamListDemo {



        public static void main(String[] args) {


            List<String>  list = new ArrayList<String>();

            list.add("apple");
            list.add("mango");
            list.add("banana");
            list.add("grapes");
            list.add("orange");

             Stream<String>  stream1 =       list.stream();

    List<String>  newList = stream1.filter( (String fruit)->{  return  fruit.length() > 5;}  ).collect(Collectors.toList());
                    
                System.out.println(newList);


              Integer  arr[]  = {3,4,2,1,5,6,7,8,9,10};
                    

                Stream<Integer>    stream2 =    Arrays.stream(arr);


              Optional<Integer> optional =      stream2.min( 
                        Comparator.comparing(Function.identity())
                     );



                      System.out.println("Result "+optional.get());


                      Stream<Integer>    stream3 =    Arrays.stream(arr);


            stream3.sorted(Comparator.reverseOrder()).forEach( (n1)->{ System.out.println(n1);} );

            
            Stream<Integer>    stream4 =    Arrays.stream(arr);


                  //  System.out.println("Count of elements "+  stream4.count());

                    System.out.println("Print first three elements");
                    stream4.limit(3).forEach( System.out::println );



        }

         


}
