package DIC_05.instance_of;

class alpha 
{
	
}
class Beta  extends alpha{
	
}
class gamma extends Beta{
	
}
public class InstanceDemo2 {

	public static void main(String[] args) {
		gamma g  = new gamma();
		if(g instanceof gamma) {
			System.out.println("g is pointing to gamma Object ");
		}
		if (g instanceof Beta) {
			System.out.println("g is pointing to beta object ");
		}
		if (g instanceof alpha) {
			System.out.println("g is pointing to alpha object ");
		}
		if ( g instanceof Object) {
			System.out.println("g is pointing to Object memory ");
		}
		

	}

}
