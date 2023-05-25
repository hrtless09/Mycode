package learnigjava.basi;




	import java.util.Scanner;
	public class project1 {
	
	float Balance;
	int P=5867,pin,count=0;
	public void  CheckPin() {
		
		Scanner sc= new Scanner(System.in);
		while(count<3)
		{
			count++;
			System.out.println("Enter your four digit pin");
			pin=sc.nextInt();
			if(P==pin) {
				System.out.println("Welcome to ATM");
				 AccountType() ;
	           
			}
			else {
				System.out.println("Invalid pin");
			}
		}
		if(count==3) {
			System.out.println("Your A/c is locked for 24 hours");
		}
		}
	public void AccountType() {
		System.out.println("Enter your A/C type");
		System.out.println("1.saving A/C");
		System.out.println("2. Current A/c");
		Scanner sc= new Scanner(System.in);
		int type=sc.nextInt();
		if(type==1) {
			SavingAcc();
		}
		else if(type==2) {
			CurrentAcc();
		}
		else {
			System.out.println("Enter your A/C type");
		}
	}
	public void SavingAcc() {
		menu();
	}
	public void CurrentAcc() {
		menu();
	}
		
		public void menu() {
			System.out.println("Enter your choice");
			System.out.println("1. Check A/C Balance");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Deposity Money");
			System.out.println("4 .EXIT");
			
			Scanner sc= new Scanner(System.in);
			int opt=sc.nextInt();
			if (opt==1) {
				CheckBalance();
			}
			else if (opt==2) {
				WithdrawMoney();
			}else if (opt==3) {
				DeposityMoney();
				
			}
			else if(opt==4) {
				System.out.println("Enter your valid option");
				System.out.println("Thank you");
				
			}

		}
		public void CheckBalance() {
			System.out.println("Balance:"+Balance);
			 menu();
		}
		public void WithdrawMoney() {
			System.out.println("Enter your amount to withdraw");
			Scanner sc= new Scanner(System.in);
			float amount=sc.nextFloat();
			if(amount>Balance) {
				System.out.println("Insufficient Balance");
			}
			else {
				Balance=Balance-amount;
				System.out.println("Money withdraw successful");
			}
			 menu();
			}
		public void DeposityMoney() {
			System.out.println("Enter your amount to deposity");
			Scanner sc= new Scanner(System.in);
			float amount=sc.nextFloat();
			Balance=Balance+amount;
			System.out.println("Money deposity successful");
	menu();
		}

		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 project1 obj=new  project1();
			 obj.CheckPin();
		}


}
