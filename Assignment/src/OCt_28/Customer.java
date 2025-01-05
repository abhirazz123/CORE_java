package OCt_28;

public class Customer 
{
   private double balance = 10000;  //Data Hiding 
   
   public void deposit(double amount)
   {
	   //Validation on data
	   if(amount <=0)
	   {
		   System.err.println("Amount can't deposited");
	   }
	   else
	   {
		   this.balance = this.balance + amount;
		   System.out.println("After deposit :"+this.balance);
	   }
   }
   
   public void withdraw(double amount)
   {
	   this.balance = this.balance - amount;
	   System.out.println("After Withdraw :"+this.balance);
   }
   
   
}
