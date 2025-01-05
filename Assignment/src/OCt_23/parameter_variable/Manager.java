package OCt_23.parameter_variable;

public class Manager  {
	int ManagerId;
	String ManagerName;
	public void setManagerData(int Id,String Name   ) {
		this.ManagerId = Id;
		this.ManagerName= Name;
	}
	public void getManagerData() {
		System.out.println("Manager Id:"+ManagerId);
		System.out.println("Manager name:"+ManagerName);
	}

}
