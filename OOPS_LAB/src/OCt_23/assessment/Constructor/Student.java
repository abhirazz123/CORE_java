package OCt_23.assessment.Constructor;

public class Student {
String StudentCollageName;
String CollageAdd;
String studentName;
int studenId;
double collagefee;
int attendance;
int marks;

public void setstudentdata(String  collName,String  Add,String Name,int  Id,double  fee,int att,int Cgpa) {
	 StudentCollageName=collName; 
	 CollageAdd=Add;
	studentName = Name;
	 studenId = Id;
	 collagefee = fee;
	 attendance = att;
	 marks = Cgpa;
}
public void getstudentdata() {
	System.out.println("Student Collage Name:"+StudentCollageName);
	System.out.println("student Name:"+studentName);
	System.out.println("studen Id:"+studenId);
	System.out.println("collage fees:"+collagefee);
	System.out.println(" attendance "+attendance+"%");
	System.out.println("Sem marks:"+marks+" CGPA ");
}

}
