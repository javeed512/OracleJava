package com.oracle.oops;

public class Parent extends Object{

        public Parent(){

            super(); // Object();

            System.out.println("Parent() called Parent Object created");

        }


        public void m1(){

                System.out.println("m1() is called from  Parent");

        }

        public String  toString(){

                return "Parent";

        }



}
