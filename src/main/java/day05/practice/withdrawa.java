package day05.practice;

class Account  {
	String accNo;
	double balance;
	
	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

interface ATM {
    boolean deposit(Account account, double amount);
    boolean withdraw(Account account,double amount) throws Exception;
    double getBalance();
}
/*Task#1: Create an AxisATM implementation which will have withdrawal
 *  charges of 5 rupees. If the balance is less than 5000,
 *   the withdraw method should throw and exception
 */
 class Axis implements ATM {

	@Override
	public boolean deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		account.balance+=amount;
		
		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		// TODO Auto-generated method stub
		if(account.balance<5000) {
			throw new Exception("Your account balance is less than 5000");
		}
		double total = amount +5;
		if(account.balance >= total) {
			account.balance -= total;
			return true;
		}
		else {
			throw new Exception("Your account balance is less than 5000");
		}
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.getBalance();
	}


}
// Icici ATM
 /*
  * Create an IciciATM implementation which will have withdrawal charges of 10 rupees.

If the balance is less than 10000, the withdraw method should throw and exception

Implement the Deposit method which is common for all the Banks.
  */
 
 class Icici implements ATM {

		@Override
		public boolean deposit(Account account, double amount) {
			// TODO Auto-generated method stub
			account.balance+=amount;
			
			return true;
		}

		@Override
		public boolean withdraw(Account account, double amount) throws Exception {
			// TODO Auto-generated method stub
			if(account.balance<10000) {
				throw new Exception("Your account balance is less than 10000");
			}
			double total = amount +10;
			if(account.balance >= total) {
				account.balance -= total;
				return true;
			}
			else {
				throw new Exception("Your account balance is less than 10000");
			}
			
		}

		@Override
		public double getBalance() {
			// TODO Auto-generated method stub
			return this.getBalance();
		}


	}

public class withdrawa {
	public static void main(String[] args) {
		Account AxisAcc = new Account("Ac9876543", 5000);
//		#Task 1
				ATM axisAtm = new Axis();

				try {
					axisAtm.withdraw(AxisAcc, 2000);
					System.out.println(AxisAcc.getBalance());
				} catch (Exception e) {

					System.out.println("Error" + e.getMessage());
				}
//				#Task2

				Account iciciacc = new Account("IC1213", 10000);
				ATM icici = new Icici();

				try {
					icici.withdraw(iciciacc, 2000);
					System.out.println(iciciacc.getBalance());
				} catch (Exception e) {

					System.out.println("Error" + e.getMessage());
				}
				
				
				axisAtm.deposit(AxisAcc, 2000);
				System.out.println("Your account balance after deposited " + AxisAcc.getBalance());

				icici.deposit(AxisAcc, 2000);
				System.out.println("Your account balance after deposited " + iciciacc.getBalance());

	}

}
