package DEC_04;
class HospitalStaff 
{
		private String name;
		private int age;
		private String role;

	public HospitalStaff(String name, int age, String role) {
		this.name = name;
		this.age = age;
		this.role = role;
		
	}
	public void work() {
		System.out.printf(role + " "+name + "is working" );
	}
	
}


class Doctor extends HospitalStaff {
		private String specialization;
	
	public Doctor(String name, int age, String role, String specialization) {
		super(name, age, role);
		this.specialization = specialization;
		
	}
	@Override
	public void work() {
		super.work();
		System.out.println( specialization +" is treating patient");
	}
}
class Nurse  extends HospitalStaff
{
	private int yearsOfExperience;
	
	public Nurse(String name, int age, String role, int yearsOfExperience) 
	{
		super(name, age, role);
		this.yearsOfExperience = yearsOfExperience;
		
	}
	@Override
	public void work () {
		super.work();
		System.out.println(" Nurse " + yearsOfExperience +" years of experience is taking care of patients. ");
		
	}
	
}


public class HospitalManagementSystem 
{
	public static void main(String[] args) 
	{
		Doctor D =new Doctor(" Dr.Abhi ", 35, "Doctor", " Cardiology");
		D.work();
		
		
		Nurse n = new Nurse("Nina ", 30, "Nurse", 8);
		n.work();
		
		HospitalStaff stf = new HospitalStaff("Abhi", 20, "Janitor");
	}
}
