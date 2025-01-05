package OCT_19.BLC_and_ELC_class;

public class TableDemo {
 public static int  printTable(int num) {
	 for ( int i = 1 ; i <=10; i++)
	 {
		 System.out.print("\t"+i+"X"+num+"="+(num*i));
	 }
	 System.out.println(" ");
	return num;
 }
}
