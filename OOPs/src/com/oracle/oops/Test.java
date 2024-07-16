package com.oracle.oops;

public class Test {

        String name;

        // Constructor Overloading

        public Test(){

            System.out.println("Test() constructor");
        }

        public Test(String name){
                    this.name = name;

        } 



        // method overloading
        public  int add(int x, int y ){

                return x+y;
        }


        public  int add(int x , int y , int z){

            return x+y+z;    
        }




        public static void main(String[] args) {


                // Parent p  = new Parent();

                // p.m1();

                // System.out.println(p.toString());



                Object o = new Child();

                 Parent p  = new Parent();

                 Child c  = new Child();

                 Parent p1 = new Child();

                 Child c1 = (Child) p1;

                   //  c.m2(); // from  Child

                    //   c.m1();  

           //  System.out.println(c.toString());  // from Child class overriden toString()


               Object obj =      new String("Oracle");

               System.out.println(obj);

               String str  = (String)  obj;

               System.out.println(str);


              


                // String s1 = "hello ";
                // String s2 = "world";

                // System.out.println(s1 + s2); // concate operator

                // int x = 9;
                
                // int y = 10;

                // System.out.println(x + y);  // arithmatic operator 


            
        }


}
