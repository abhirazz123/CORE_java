package OCT_21;

public class car {
	private	String name ;
	private	String brandNme;
	private	double CarePric;
	private	String CareModel;
	private String CareNo;
	// Properties
	public car(String name ,
	String brandNme, double CarePric,String CareModel,String CareNo ) {
		this.name=name;
		this.brandNme=brandNme;
		this.CareModel=CareModel;
		this.CareNo=CareNo;
	}public void Rassingcar(){
		System.out.println(name+"is a my favert care");
		System.out.println(brandNme+"brand Name" );
		System.out.println("care model"+CareModel);
		System.out.println("Care number "+CareNo);
	}public void careRuniing() {
		System.out.println("this my dreem care");
	}
}
