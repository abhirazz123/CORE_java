package OCT_16.Scanner_class;

//WAP to read employee data using Scanner class
public class ReadEmployeeData {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter Employee Id :");
		int id = sc.nextInt(); //123 
		
		System.out.print("Enter Employee Name :");
		String name = sc.nextLine(); //Buffer Problem	
		name = sc.nextLine();
		
		System.out.println("Printing Employee Data");
		
		System.out.println("Employee Id is :"+id);
		System.out.println("Employee Name is :"+name);
		sc.close();

	}

}
