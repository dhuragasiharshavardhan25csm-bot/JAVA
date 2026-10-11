
import java.util.Scanner;

class Account{
	int accountNo;
	double balance;
	String type;
	
	Account(int num,double bal,String t){
		accountNo=num;
		balance=bal;
		type=t;
	}
	
	void deposit(double amount) {
		balance+=amount;
		
		System.out.println("amount you deposited is:"+amount);
		System.out.println("total balance is:"+balance);
	}
	
	void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("withdrawl amount:"+amount);
			System.out.println("total balance remined:"+balance);
		}else {
			System.out.println("insufficient balance");
		}
	}
	
	void transfer(Account other,double amount) {
		if(amount<=balance) {
			balance-=amount;
			other.balance+=amount;
			System.out.println("transfer done succesfully..!");
			System.out.println("updated balance:"+balance);
		}else {
			System.out.println("insufficient balance and transition failed..!");
		}
	}
	
	void show() {
		System.out.println("account number:"+accountNo);
		System.out.println("account type:"+type);
		System.out.println("total Balance:"+balance);
	}
}

class SavingsAccount extends Account{
	double rate;
	
	SavingsAccount(int num,double bal,double r){
		super(num,bal,"savings account");
		rate=r;
		
	}
	void calinterest() {
		double interest=balance*rate/100;
		System.out.println("Interest:"+interest);
	}
}

class CurrentAccount extends  Account{
	double limit;
	CurrentAccount(int num,double bal,double l){
	super(num,bal,"current account");
	limit=l;
	
	}
	
	@Override
	void withdraw(double amount) {
		if(amount<=balance+limit){
			balance-=amount;
			System.out.println("withdrawl is ok..,balance:"+balance);
		}else {
			System.out.println("overdraft limit crossed");
		}
	}
	
}

//main
public class Week12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 SavingsAccount sav=new SavingsAccount(100,5000,5);
		 CurrentAccount cur=new CurrentAccount(101,3000,2000);
		
		 int choice;
		 do {
	         System.out.println("\n--- Bank Menu ---");
	         System.out.println("1. Deposit (Savings)");
	         System.out.println("2. Withdraw (Savings)");
	         System.out.println("3. Interest (Savings)");
	         System.out.println("4. Withdraw (Current)");
	         System.out.println("5. Transfer Savings -> Current");
	         System.out.println("6. Show Accounts");
	         System.out.println("7. Exit");
	         System.out.print("Choice: ");
	         choice = sc.nextInt();

		switch(choice) {
		case 1:
			System.out.println("Amount:");
			sav.deposit(sc.nextDouble());
			break;
		case 2:
			System.out.println("amount:");
			sav.withdraw(sc.nextDouble());
			break;
		case 3:
			sav.calinterest();
			break;
		case 4:
			System.out.println("amount:");
			cur.withdraw(sc.nextDouble());
			break;
		case 5:
			System.out.println("amount:");
			sav.transfer(cur, sc.nextDouble());
			break;
		case 6:
			System.out.println("Savings:");
			sav.show();
			System.out.println("Current:");
			cur.show();
			break;
		case 7:
			System.out.println("exiting...!");
			break;
		default:
			System.out.println("invalid choice..");
			
		}
	}while(choice!=7);
		 sc.close();
    } 
}
