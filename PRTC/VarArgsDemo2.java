	class AddParameter
	{
		public void acceptAndAddParameter(int ...values)
		{
			int sum = 0;
			for(int value : values)
			{
				sum = sum + value;
			}
			System.out.println("Sum of parameter is :"+sum);
		}
	}

	public class VarArgsDemo2 
	{
		public static void main(String[] args) 
		{
			AddParameter a = new AddParameter();
			a.acceptAndAddParameter(10,20,30);
			a.acceptAndAddParameter(100,200,300,400);

		}

	}