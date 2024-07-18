package service;



@FunctionalInterface  //optional
public interface MyInterface {

    public abstract  int  add(int a, int b);





        public  static void  m1(){

                System.out.println("m1() static method is called..");

        }


        public default void m2(){

            System.out.println("m2() default method is called..");

        }

}
