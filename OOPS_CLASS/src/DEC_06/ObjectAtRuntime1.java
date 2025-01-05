package DEC_06;

class Student1{
	public void gett() {
		System.out.println("Welcome Student");
	}
}
class Sample1
{
	public void gett() {
		System.out.println("Hello Btch 39!!");
	}
	
}



public class ObjectAtRuntime1 {

	public static void main(String[] args) throws Exception
	{
		Object obj = Class.forName(args[0]).newInstance();
		if(obj instanceof Sample1) {
			Sample1 s1 = (Sample1) obj;
			s1.gett();
		}
		else if(obj instanceof Student1) {
			Student1 s1 = (Student1) obj;
			s1.gett();
			
		}
		
	}

}
