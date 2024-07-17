package com.oracle.bank.service;

public class BankUtil {


        public static   IBank      getObject(){


                return   new BankImp2();

        }


}
