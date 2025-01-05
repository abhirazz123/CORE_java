package OCT_17.Switch_Demo;

public class SwitchDemo7 {

	public static void main(String[] args) {
		   byte b = 90;

		   switch(b)
			{
	           //case 128 :  //error
			case (byte) 128 :
				   System.out.println("It is case 127");
			   break;
			}
	}

}
