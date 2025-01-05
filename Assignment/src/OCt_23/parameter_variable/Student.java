package OCt_23.parameter_variable;

	public class Student 
	{
		int id = 100;
		String name = "Scott";
		public void accept() 
		{
			int id = 200;
			String name = "Smith";
			System.out.println(id+":"+name);
		}
		public void input (int id,String name) 
		{
			System.out.println(id+":"+name);
		}
}
