package OCT_21.OOPs;

	public class Student 
	{
		String  name ;
		int age ;
		double height ;
		int roll_no;
		
		
		//Behavior
		public void talk() {
			System.out.println("Hello Everyone , my name is :"+name );
			System.out.println("My roll No is:"+roll_no);
			System.out.println("My height is :"+height);
		}
		public void writeExam() {
			System.out.println("Every Saturday "+name+"is writing exam for Enjoying Sunday");
		}
		
}