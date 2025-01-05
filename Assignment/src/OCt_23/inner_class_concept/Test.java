package OCt_23.inner_class_concept;

 class Test {
static int a = 100; // class Variable Static filed 
int b = 200;	 // Instance Variable Or non static  field 
public void accept(int c ) {
	int d =400;
	System.out.println(Test.a);
	System.out.println(this.b);
	System.out.println(c);
	System.out.println(d);
}
}
