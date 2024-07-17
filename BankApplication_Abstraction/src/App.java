/**
 * @Author: Vishnu  (UI Developer)
 * Date: 18-july-24
 * Description: BankApplication UI for ATM
 * 
 * 
 */

import java.util.*;

import com.oracle.bank.service.BankUtil;
import com.oracle.bank.service.IBank;

public class App {
    public static void main(String[] args) throws Exception {
        
     boolean flag = true;

            Scanner  scanner = new Scanner(System.in);

           
        while(flag){
            System.out.println("****** WELCOME TO ATM *******");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");

                int choice =    scanner.nextInt();


                  IBank bank     =  BankUtil.getObject(); // abstraction

            switch (choice) {
                case 1:
                    
                        bank.deposit();

                break;

                 case 2:
                 
                        bank.withdraw();

                 break;

                 case 3:
                            flag = false;
                            System.out.println("Thank You visit again..");
                 break;
            
                default:
                        System.err.println("Invalid Option");

                    break;
            }



        }


    }
}
