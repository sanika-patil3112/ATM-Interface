import java.util.*;
public class ATMmain {
    public static void main (String args []){
        int op,ch;
        int enter_op=0;
        String user,pass;
        int flag=0;

        Scanner sc=new Scanner (System.in);
        login obj=new login();
        
        System.out.println("Choose the option from below dropdown:");
        System.out.println("1.Register\n"+"2.Exit");
        op=sc.nextInt();
        switch(op){
            case 1:
            obj.getdata();
            System.out.println("Registration completed...kindly login");
            System.out.println("-------------------------------------------------");
            System.out.println();
            do{
            System.out.println("1.Login\n"+"2.Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter Your Username:");
                user=sc.next();

                System.out.println("Enter Your Password:");
                pass= sc.next();

                if(obj.username.equals(user) && obj.password.equals(pass)){
                    flag=1;
                    System.out.println("Login Successfully!!");

                    System.out.println();
                    System.out.println("************* Welcome back "+obj.name+" ******************");
                    do{
                        System.out.println("1.Withdraw\n2.Deposit\n3.Transfer");
                        System.out.println("4.Check Balance\n5.Transaction History\n6.Exit");
                        enter_op=sc.nextInt();
                        switch(enter_op){
                            case 1:
                            obj.Withdrawal();
                            break;

                            case 2: 
                            obj.Deposit();
                            break;

                            case 3:
                            obj.Transfer();
                            break;

                            case 4: 
                            obj.check_balance();
                            break;

                            case 5:
                            obj.Transaction_History();
                            break;
                            

                            
                        }

                    }while(enter_op<6);
                }

                else{
                    flag=0;
                }

                if(flag==0){
                    System.out.println("Wrong Username or Password...Kindly Login Again");
                }


            }
        
            }while(flag==0 || enter_op==6);


                case 2:
                break;
        }
    
            }

        }
    
