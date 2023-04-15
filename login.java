import java.util.*;
// import java.util.Scanner;
// import java.util.Map;


public class login extends person {
    private int balance=50000;
    private int withdrawal_limit=20000;
    private int withdrawal_money;
    private int deposit_money;
    private int transfer_money;
    private String Rec_name;
    private Long Rec_acc_no;
    Scanner sc=new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);
    Map<Integer,String> ministmt=new HashMap<>();

    public void Withdrawal(){
        System.out.println("Enter amount to withdrawal: ");
        withdrawal_money=sc.nextInt();
        if(withdrawal_money>withdrawal_limit){
            System.out.println("Daily Limit Exceeded");
        }

        else if(withdrawal_money>balance){
            System.out.println("Insufficient Balance");   
        }

        else{
            ministmt.put(withdrawal_money,"Amount Withdrawl");
            balance=balance-withdrawal_money;
            System.out.println("Available Balance:"+balance);
        }System.out.println("--------------------------------------------------");

      
    }

    public void Deposit(){
        System.out.println("Enter amount to deposit: ");
        deposit_money=sc.nextInt();
        balance=balance+deposit_money;
        System.out.println("Available Balance:"+balance);
        ministmt.put(deposit_money,"Amount Deposited");
        System.out.println("--------------------------------------------------");
    }
    
    public void Transfer(){
        System.out.println("Enter receipant's name:");
        Rec_name=sc1.nextLine();
        System.out.println("Enter receipant's account number:");
        Rec_acc_no=sc.nextLong();
        System.out.println("Enter amount to transfer:");
        transfer_money=sc.nextInt();
        balance=balance-transfer_money;
        System.out.println("Successfully transfered to "+Rec_name);
        System.out.println("Available Balance="+balance);
        ministmt.put(transfer_money,"Amount Transfered");
        System.out.println("--------------------------------------------------");

    }

    public void check_balance(){
        System.out.println("Available Balance:"+balance);
        System.out.println("--------------------------------------------------");
    }

    public void Transaction_History(){
        for(Map.Entry<Integer,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("--------------------------------------------------");

    }

    

    }


    

