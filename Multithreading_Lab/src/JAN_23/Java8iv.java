package JAN_23;
class nit implements Runnable{

	@Override
	public void run() {
		 for(int a= 0; a<10 ; a++)
		 {
			 System.out.println("Naresh IT1");
			 try {
				 Thread.sleep(2000);
			 }catch(InterruptedException e) {
				 System.out.println("NIT Thread Faild");
				 
			 }
		 }
		
	}
	
}


public class Java8iv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
