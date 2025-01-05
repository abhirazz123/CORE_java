package OCt_23.assessment.Constructor;

public class Schoolday {
	String Schoolname;
	String whyManayfriend;
	String frindname;
	String life;
	String  stress;
	
	public void setSchooldata(String name,String WMYfriend,String Frdname,String LIFE,String  stre)
	{
		Schoolname= name;
		whyManayfriend=WMYfriend;
		frindname=Frdname;
		life=LIFE;
		stress=stre;
	}
	public void getSchooldata() {
		System.out.println("School name: "+Schoolname);
		System.out.println("How Many friend: "+whyManayfriend);
		System.out.println("frind name: "+frindname);
		System.out.println("life: "+life);
		System.out.println("stress: "+stress);
		
	}
	public static void main(String[] args) {
		Schoolday day =new Schoolday();
		day.setSchooldata("MSM high schhol", "tow", "kundan and saurabh", "full enjoy", "free");
		day.getSchooldata();
	}

}
