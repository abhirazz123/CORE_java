package DIC_05.instance_of;
class Test
{
	
}

public class InstanceofDemo1 {

	public static void main(String[] args) {
		Test t1 = new Test();
		
		if(t1 instanceof Test) {
			System.out.println("t1 is pointing to test object");
		}
	}

}
