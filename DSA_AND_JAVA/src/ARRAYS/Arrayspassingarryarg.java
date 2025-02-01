package ARRAYS;

public class Arrayspassingarryarg {
	public static void upedet(int marks[]) {
		int noChangable = 10;
		for(int i = 0;  i< marks.length; i++) {
		
			marks[i] = marks[i]+1;
		}	
	}
	public static void main(String[] args) {
		int marks [] = {97,98,99};
		int noChangable = 5;
		upedet(marks);
		System.out.println(noChangable);
		
		for(int i = 0 ; i<marks.length; i ++) {
			System.out.println(marks[i]);
		}
		
		
		
	}
	
 
}
