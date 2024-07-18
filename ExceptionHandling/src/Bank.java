public class Bank {


        public static void main(String[] args) {
            
            int  accounts[] = {101,102,103,104,105};
            String names[] = {"king","smith","tom","ford","ravi"};
            double  balance[] = {5000,6000,300,4000,90};


            System.out.println("AcNo Name Balance");

                for(int i=0; i< accounts.length ; i++){

                  System.out.println(accounts[i] +" "+names[i]+ "  "+ balance[i]);

                        if(balance[i] < 1000){

                         try{
                            throw new  LowBalanceException("Please  deposit some min amount");
                         }
                         catch(LowBalanceException le){
                                System.err.println(names[i] +" your balance is low plz maintained min balance");

                               // le.printStackTrace();
                                  System.out.println(le.getMessage());

                         }
                        }


                }





        }



}
