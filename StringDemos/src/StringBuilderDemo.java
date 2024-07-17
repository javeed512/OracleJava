public class StringBuilderDemo {


        public static void main(String[] args) {
            

                StringBuilder sb1  = new StringBuilder("hello");

                    sb1.append("hello");

                System.out.println(sb1);

                System.out.println(sb1.reverse());


                System.out.println(sb1.delete(0, 5));

        }



}
