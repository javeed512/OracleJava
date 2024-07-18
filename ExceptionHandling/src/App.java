public class App {
    public static void main(String[] args) {  // caller
       
            System.out.println("Open File");
            System.out.println("Write data to the file");

            int result =0;

            String name = "Javeed";

            try{


                System.out.println("Welcome "+name);
                System.out.println(name.length());
           result  =      div(10,2);


                    System.out.println(args[0]); // new ArrayIndexOutOfBoundExp();

           System.out.println("Hello world");
            }
            catch(ArithmeticException e){

                    System.out.println(e);

                    System.err.println("Sorry you can't  divide num by zero");

            }
            catch(NullPointerException ne){


                ne.printStackTrace();


            }
            catch(Exception e){ // Expcetion e =  new ArrayIndexOutOfBoundExp();

                    e.printStackTrace();

            }


            finally{

                System.out.println("Close File");
            }
            
            
             System.out.println("Result "+result);

           

    }


    public static  int  div(int a, int b)throws ArithmeticException{ // callee


            return a / b;       
    }



}
