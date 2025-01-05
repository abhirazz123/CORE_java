package OCt_28.Encapsulation.method_return_type;

public class Test 
{
	private  int id;
	public Test(int id) {
		this.id = id;
	}public Test get() {
		return new Test (5);
	}
   
}
