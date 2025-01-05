package DEC_06.keyword;
class Student1{
	public void greet() {
		System.out.println("welcome Student");
	}
}
class Sample{
	public void greet() {
		System.out.println("Hello Batch 39!!!");
	}
}

public class ObjectAtRuntime1 {

	public static void main(String[] args) throws Exception
	{
		 Object obj = Class.forName(args[0]).newInstance();
		 if (obj instanceof Sample) {
			 Sample s1 =  (Sample) obj;
			 s1.greet();
		 }
		 else if (obj instanceof Student1) {
			 Student1 s1 = (Student1) obj;
			 s1.greet();
		 }

	}

}
