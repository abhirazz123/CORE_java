package DEC_05.instance_of;

class alpha {
	
}
class Beta extends alpha {
	
}
class gamma extends Beta {
	
}
public class InstanceDemo2 {

	public static void main(String[] args) {
		gamma g  = new gamma();
		
		if(g instanceof gamma ) {
			System.out.println("g is pointing to gamma");
		}
		if (g instanceof alpha) {
			System.out.println("g is pointing to aalpha ");
		}
		if (g instanceof Beta ) {
			System.out.println("g is pointing to Beta");
		}
		if (g instanceof Object ) {
			System.out.println("g is pointing to Boject");
		}
	}
	

}
