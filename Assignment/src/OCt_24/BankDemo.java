package OCt_24;

public class BankDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setBankDeatils("BOB", " HYD", "BOB1007");
		bank.setCustemberDeatils("Abhishek kumar", 3000, 20106110);
		bank.deposit(200);
		bank.withdraw(5000);
	}

}
