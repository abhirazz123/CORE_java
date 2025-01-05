package NOV_28.Polymorphism.var_args_Overloading;

class Hetro
{
	public void acceptHetro(Object ...x)
	{
		for(Object y : x) 
		{
			System.out.println(y);
		}
	}
}

public class VarArgsDemo3 {
	public static void main(String[] args) {
		Hetro h = new Hetro();
		h.acceptHetro(10,89.90,34.89, new String ("NIT"),"radhe radhe");
				
		
	}

}
