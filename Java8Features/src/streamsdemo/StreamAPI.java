package streamsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {


      

                  public static void main(String[] args) {

                    Integer  arr[]  = {3,4,2,1,5,6,7,8,9,10};
                    

                Stream<Integer>    stream1 =    Arrays.stream(arr);



                        stream1.forEach(  (Integer n1)->{System.out.println(n1);}   );


                        String  names[] = {"tom","smith","javeed","vishnu"};

                         Stream<String>  stream2 =      Arrays.stream(names);

                            stream2.forEach((String s)->{  System.out.println(s);});


                            Stream<String>  stream3 =      Arrays.stream(names);

    // Stream<Integer>  stream4 = stream3.map((String name) ->{ return name.length();});

    //                     stream4.forEach((Integer len)->{System.out.println(len);});


                    // map() process each name and return length  , foreach() print each length
  //  stream3.map((String name) ->{ return name.length();}).forEach((Integer len)->{System.out.println(len);});


 List<Integer> list = stream3.map((String name) ->{ return name.length();}).collect(Collectors.toList());

                  }



}
