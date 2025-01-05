package DIC_16;

@FunctionalInterface
interface Str
{
	int methodStr(String str);
}
public class FunctionalInterface4 {
	public static void main(String[] args) {
		//Str str = (String s) -> "2";
		Str str = (String s) ->s.length() ;
		System.out.println(str.methodStr("2"));
	}
}