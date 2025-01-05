package DIC_02.Method_Overriding;

class RBI
{
	protected String ifscCode = "RBIHYD8532";
	public String loan() {
		return "Bank should provide long";
		
	}
}
class SBI extends RBI
{
	protected String ifscCode = "SBIAMP8532";//Variable Hiding
	public String loan() 
	{
		return "Providing loan @ 9.2% ROI";
	}
}

public class Variable_Hiding_upcasting {

	public static void main(String[] args) 
	{
		RBI r = new RBI();
		System.out.println(r.ifscCode+ " : "+r.loan());
		
		SBI S = new SBI();
		System.out.println(S.ifscCode+" : "+S.loan());
	}

}
