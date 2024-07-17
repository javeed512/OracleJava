package com.oracle.bank.service;

/*
 * @Author: Lalit
 * Date: 17-july-24
 * Description: BankImp1 class implements  deposit() 
 * 
 */

public abstract class BankImp1  implements  IBank { // abstract class object cannot be created

    @Override
    public void  deposit(){

        System.out.println("Deposit successfull...");

    }

    public abstract  void withdraw();

}
