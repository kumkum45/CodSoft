import java.util.*;
class BankAccount{
    private double balance;
    public BankAccount(double availBalance){
        balance=availBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Money Deposited: "+amount);
        }
        else{
            System.out.println("Invalid amount for deposit!");
        }
}   
 public void withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            System.out.println("Money Withdrawn: "+amount);
        }
        else{
            System.out.println("Insufficient funds or invalid amount for withdrawl!");
        }
    }
}
class ATM{
    private BankAccount account;
    private Scanner scanner;
    public ATM(BankAccount account){
        this.account=account;
        scanner=new Scanner(System.in);
    }
    public void showMenu(){
        System.out.println("****welcome****");
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit amount");
        System.out.println("3. Withdraw amount");
        System.out.println("4. Exit");    
    }
    public void start(){
        int choice;
        do{
            showMenu();
            System.out.println("Enter Your Choice: ");
            choice=scanner.nextInt();
            switch(choice){
            case 1:
            checkBalance();
            break;
            case 2:
            deposit();
            break;
            case 3:
            withdraw();
            break;
            case 4:
            System.out.println("Exiting ATM.Thank You!");
            break;
            default:
            System.out.println("Invalid choice. please select a va;id option!");
            }
        }while(choice!=4);
    }

    private void checkBalance(){
        System.out.println("current Balance: "+account.getBalance());
    }
    private void deposit(){
        System.out.println("Enter amount to deposit: ");
        double amount=scanner.nextDouble();
        account.deposit(amount);
    }
    private void withdraw(){
        System.out.println("Enter withdrawl amount: ");
        double amount=scanner.nextDouble();
        account.withdraw(amount);
    }
    public static void main(String[] args) {
        BankAccount userAccount=new BankAccount(1000);
        ATM atm=new ATM(userAccount);
        atm.start();
    }
}