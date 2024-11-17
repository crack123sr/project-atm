import java.util.*;

import javax.sound.sampled.SourceDataLine;


public class atm{


    public static void main(String args []){
    String accountNumber ="3124562346896534";
    long balance = 60000;
    System.out.println(" --------------------------NATION BANK-----------------------------");
    System.out.println("__________________||Welcome to Nation Bank ATM service||_______________");
    System.out.println("PLEASE INSERT YOUR CARD");
    System.out.println("Press GO if inserted");
    Scanner sc= new Scanner(System.in);
    String command=sc.nextLine();
    String detect1="GO";
    String detect2="go";
    if(command.compareTo(detect1)==0  || command.compareTo(detect2)==0){
        System.out.println("Your card has been detected");
        System.out.println("----------------------------------------");
        System.out.println("SELECT A TRANSACTION");
        System.out.println("====================================");
        System.out.println("Press 1 for GET CASH WITHDRWAL");
        System.out.println("Press 2 to  DEPOSIT CASH ");
        System.out.println("Press 3 for CHECK BALANCE");
        System.out.println("Press 4 for VIEW STATEMENT");
        System.out.println("Press 5 to  DEPOSIT CHECK");
        System.out.println("Press 6 to  UPDATE PIN");
        System.out.println("Press 7 for QUICK TRANSFER");
        System.out.println("Press 8 to  BUY STAMPS");
        System.out.println("Press 9 for EXIT");
        System.out.println("====================================");
        System.out.print("CHOOSE THE SERVICE REQUIRED:");
        
        int service=sc.nextInt();
                if(service==1){
                System.out.println("please provide your login credentials:");
                System.out.println("PLEASE ENTER YOUR USERNAME");
                String username=sc.next();
                System.out.println("PLEASE ENTER YOUR PASSWORD ");
                String password=sc.next();
        
         System.out.println("*************************************************");
            System.out.println("WELCOME TO THE WITHDRWAL INTERFACE");
            System.out.println("*************************************************");
            System.out.print("PLEASE ENTER THE AMOUNT : Rs ");
            long take =sc.nextInt();
            if(take>100000 ){
                System.out.println("Withdrawal limit is exceeded");}
                else if(take>balance){
                    System.out.println("you do not have sufficient balance");}
                    else if(take<500){
                        System.out.println("PLEASE WITHDRAW AMOUNT ABOVE Rs 500");
                
            }else{
                System.out.println("Enter your 4 DIGIT PIN");
                int pin=sc.nextInt();
                int count = 0;
                 int temp = pin;
        
                while (temp != 0) {
                temp = temp / 10;
                count++;
        }
 
                if(count != 4){
                    System.out.println("INVALID PIN:PIN MUST BE OF 4 DIGITS");
                }else{
                    System.out.println("..........please wait while we are processing your transaction.........");
                    int a=sc.nextInt();
                    System.out.println("your transaction was successfull");
                    long previousbal=60000;
                     balance=previousbal-take;
                    System.out.println("Your Updated balance is: Rs " + balance);
                    System.out.println("<<<<<<<Thank you for using our services>>>>>>>");
                    int b=sc.nextInt();
                    System.out.println("Your transaction Details are given below");
                    System.out.println("date and time:");
                    System.out.println("Transaction ID:");
                    System.out.println("please wait while we are generating the slip");
                    System.out.println("PRESS 0 TO EXIT");
                    int p=sc.nextInt();
                    System.out.println("PLEASE WITHDRAW YOUR CARD");
                    

                    
                    
                }
            }

        }else if(service==2){ System.out.println("*************************************************");
        System.out.println("WELCOME TO THE DEPOSIT CASH INTERFACE");
        System.out.println("*************************************************");
        System.out.print("PLEASE ENTER THE AMOUNT: Rs ");
        int take2=sc.nextInt();
             if(take2>20000){
            System.out.println("Deposit limit is exceeded");
               } else if(take2<500){System.out.println("please deposit  cash amount above Rs 500");}             else{
                              System.out.println("PLEASE ENTER YOUR 16 digit ACCOUNT NUMBER");
                               accountNumber = sc.next();
        
                   // Check if the length of the account number exceeds 16 digits
                                 if (accountNumber.length() > 16 || accountNumber.length() <16) {
                                  System.out.println("INVALID ACCOUNT NUMBER");}
                              else{
            
            System.out.println("Enter your 4 DIGIT PIN");
            int pin=sc.nextInt();
            int count = 0;
             int temp = pin;
    
            while (temp != 0) {
            temp = temp / 10;
            count++;
            }

            if(count != 4){
                System.out.println("INVALID PIN:PIN MUST BE OF 4 DIGITS");
             } else{
                System.out.println("..........please wait while we are processing your transaction.........");
                int a=sc.nextInt();
                System.out.println("your transaction was successfull");
                int previousbal=60000;
                 balance=previousbal+take2;
                System.out.println("Your Updated balance is: Rs " + balance);
                System.out.println("<<<<<<<Thank you for using our services>>>>>>>");
                int b=sc.nextInt();
                System.out.println("Your transaction Details are given below");
                System.out.println("date and time:");
                System.out.println("Transaction ID:");
                System.out.println("please wait while we are generating the slip");
                System.out.println("PRESS 0 TO EXIT");
                int s=sc.nextInt();
                System.out.println("PLEASE WITHDRAW YOUR CARD");
}
   }
     }
         }
else if(service==3){
    System.out.println("please provide your login credentials:");
                System.out.println("PLEASE ENTER YOUR USERNAME");
                String username=sc.next();
                System.out.println("PLEASE ENTER YOUR PASSWORD ");
                String password=sc.next();
                          
                              System.out.println("Current balance for your account " + accountNumber +" is:" );
                              System.out.println(balance);
        }else if(service==4){
            System.out.println("PLEASE ENTER YOUR USERNAME");
        String username=sc.next();
        System.out.println("PLEASE ENTER YOUR PASSWORD ");
        String password=sc.next();
            System.out.println("Current balance for your account " + accountNumber +" is:" );
                              System.out.println(balance);
            System.out.println("======================================================");
            System.out.println("2500----DEBITED--------21/01/24");
            System.out.println("7000----CREDITED-------23/01/24");
            System.out.println("1000----DEBITED--------28/01/24");
            System.out.println("=========================================================");
            System.out.println("PRESS O TO EXIT");
            int v=sc.nextInt();
            if(v==0){
                System.out.println("~~~~~~~~~~~~~~~~~~~YOU HAVE BEEN LOGGED OUT~~~~~~~~~~~~~~~~~~~~~~");
            }
 }else if(service==5){
    System.out.println("*************************************************");
            System.out.println("WELCOME TO THE CHEQUE DEPOSIT INTERFACE");
            System.out.println("*************************************************");
            System.out.println("Enter your 16-digit account number");
            accountNumber=sc.next();
            if (accountNumber.length() > 16 || accountNumber.length() <16) {
                System.out.println("INVALID ACCOUNT NUMBER");}else{
            System.out.println("Enter THE BANK:");
            String bank=sc.next();
            System.out.println("ENTER THE PAYEE NAME:");
            sc.nextLine();
            String payeea=sc.next();
            System.out.println("ENTER 16-DIGIT PAYEE ACCOUNT NUMBER:");
            String payee=sc.next();
            if (payee.length() > 16 || payee.length() <16) {
                System.out.println("INVALID ACCOUNT NUMBER");}else{
            System.out.println("ENTER IFSC CODE:");
            System.out.println("note:LETTERS MUST BE IN CAPITAL");
            String ifsc=sc.next();
            if (ifsc.length() > 11 || ifsc.length() <11) {
                System.out.println("INVALID IFSC CODE");}

            else{String branch="NSCI0001221";
            if(ifsc.compareTo(branch)==0){
                System.out.println("DALTONGANJ,BAZAR BRANCH");}
        
            System.out.println("======================================================");
            System.out.println("ENTER THE CHEQUE ID");
            String cheque=sc.next();
            System.out.println("disclose the deposition amount Rs:");
            int take3=sc.nextInt();
            if(take3<500){System.out.println("please enter deposition amount above Rs 500");}else{
            System.out.println("Enter your 4 DIGIT PIN");
            int pin=sc.nextInt();
            int count = 0;
             int temp = pin;
    
            while (temp != 0) {
            temp = temp / 10;
            count++;
            }

            if(count != 4){
                System.out.println("INVALID PIN:PIN MUST BE OF 4 DIGITS");}
                if(take3>60000){
                    System.out.println("YOUR CHEQUE WILL BE BOUNCED");
                }else{
            System.out.println("========================================================");
            System.out.println("Your cheque has been successfully deposited");
            int w=sc.nextInt();
            System.out.println("...............your balance will be updated within 24 hours............");
            int r=sc.nextInt();
            System.out.println("for any query contact us on toll free no. 1221-2234-1256");
            System.out.println("================THANK YOU FOR USING OUR SERVICES==================");}}}}
        }
}else if(service==6){
    System.out.println("please provide your login credentials:");
    System.out.println("PLEASE ENTER YOUR USERNAME");
    String username=sc.next();
    System.out.println("PLEASE ENTER YOUR PASSWORD ");
    String password=sc.next();
    System.out.println("enter your 4 DIGIT current PIN:");
    int pin=sc.nextInt();
            int count = 0;
             int temp = pin;
    
            while (temp != 0) {
            temp = temp / 10;
            count++;
            }

            if(count != 4){
                System.out.println("INVALID PIN:PIN MUST BE OF 4 DIGITS");}else{
            System.out.println("ENTER NEW PIN:");
             pin=sc.nextInt();
            count = 0;
              temp = pin;
    
            while (temp != 0) {
            temp = temp / 10;
            count++;
            }

            if(count != 4){
                System.out.println("INVALID PIN:PIN MUST BE OF 4 DIGITS");}else{
                System.out.println("PLEASE PROVIDE 6 -digit OTP SENT ON YOUR REGISTERED MOBILE NUMBER");
                int OTP=sc.nextInt();
                if(OTP != 654567){
                    System.out.println("invalid OTP");
                }else{
                    System.out.println("press OK");
                    String ok=sc.next();
                    String detect3="OK";
    if(ok.compareTo(detect3)==0 ){
        System.out.println("Your PIN has been successfully updated");

                }}}
            


    
}}else if(service==7){System.out.println("service not available");}
else if(service==8){System.out.println("service not available");}
else if(service==9){System.out.println("==============YOU HAVE BEEN EXITED============");
System.out.println("`````````````````THANK YOU FOR USING OUR SERVICES.PLRASE PROVIDE YOUR FEEDBACK!!!!`````````````````");}
}
           

  
        



        
    else{
        System.out.println("Card Not Found");
        }


     



    
    }
    }
