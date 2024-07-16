package com.oracle.oops;

public class Child extends Parent{


        public  String  toString(){

                return "Child";

        }

        

        public Child(){
            super();  // Parent();

                System.out.println("Child() is called Child object created");


        }



        public void  m1(){

                System.out.println("m1() Called from Child class");

        }



    public void m2(){


        System.out.println("m2() is called from Child");

    }


}
