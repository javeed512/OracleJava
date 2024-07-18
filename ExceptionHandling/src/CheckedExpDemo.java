public class CheckedExpDemo {


    public static void main(String[] args) {  // Main Thread
        

                System.out.println("Hello");

                    try{

                        Thread.sleep(2000);  // 2 secs
                    }
                    catch(InterruptedException ie){

                            ie.printStackTrace();
                    }
                 

                System.out.println("World");


    }



}
