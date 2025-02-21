package OCT_23;

public class Manager {
	int ManagerId;
	String ManagerName;
	public void setManagerDate(int ManagerId, String ManagerName) {
		this.ManagerId = ManagerId;
		this.ManagerName = ManagerName;
	}
	public void getManagerData() {
		System.out.println("Manager id is : " +ManagerId);
		System.out.println("Manager name is : "+ ManagerName);
	}

}
