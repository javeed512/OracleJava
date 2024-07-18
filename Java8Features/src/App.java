import service.MyImpDemo;
import service.MyInterface;

public class App {
    public static void main(String[] args) throws Exception {
      
        
           MyInterface  mi =     new MyImpDemo();

                   int result  =     mi.add(5, 5);

                   System.out.println("Result "+result);

                   MyInterface.m1();

                   mi.m2();


          MyInterface   m =   (a,b)->a+b;        // (int a, int b)->{  return  a+b; };

                 int    sum =       m.add(4, 4);


                    System.out.println("Sum using Lambda Exp "+sum);

                    m.m2();


                    hello( (a,b)->{System.out.println(a+b); return a+b;} );


    }



        public static void   hello(MyInterface mi){

                System.out.println("Hello friends");

        }


}
