package OCt_22.OOPs;

public class Student {

	String Studentname ;
	String StudentSchoolNme;
	int Studentclasss ;
	String Studentbranch ;
	int Studentrollno;
	double Studentfess;
	
	public void setStudentDetlies(String name,String SchoolName,int classs,String branch,int RollNo,double fees ) {
		Studentname= name;
		StudentSchoolNme= SchoolName;
		Studentclasss= classs;
		Studentbranch=branch;
		Studentrollno= RollNo;
		Studentfess= fees;
	}
	public void getStudentDetlies() {
		System.out.println("Student name is:- "+Studentname);
		System.out.println("Student School name is :-"+StudentSchoolNme);
		System.out.println("Studet class name is :-"+Studentclasss);
		System.out.println("Student roll no is :-"+Studentrollno);
		System.out.println("Student branch is :-"+Studentbranch);
		System.out.println("Student fees is :-"+Studentfess);
	}
	public void function() {
		System.out.println("welcom to my school");
	
	}
}
