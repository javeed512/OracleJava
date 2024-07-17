public class App {
    public static void main(String[] args) throws Exception {
        
        
            String s1 = "hello";

            String s2 = "hello";

            System.out.println("s1.equals(s2) "+s1.equals(s2));  // it compare values

            System.out.println("s1 == s2 "+ (s1  == s2) ); // it compare hashcode or references


            String   str1  = new String("java");
	        String   str2  = new String("java");


                System.out.println("str1 , str2 values "+  str1.equals(str2));  // it comapre values

                    System.out.println("str1 , str2 hashcodes "+ (str1  == str2)); // it compares hashcode


            s1  =  s1.concat(s2);

                System.out.println(s1);

                s1 = s1 + " friends";

                System.out.println(s1);

    }
}
