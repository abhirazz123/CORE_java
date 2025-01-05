package OCT_16;
/*public class Test
{
	public static void main(String args[])
	{
		boolean x = true;
		int a;
		if(x) a = x ? 1: 2;
		else a = x ? 3: 4;
		System.out.println(a);
	}
}*/
/*public class Test
{
	public static void main(String args[])
	{
		boolean x = false;
		int a;
		if(x) a = x ? 1: 2;
		else a = x ? 3: 4;
		System.out.println(a);
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		int i = 15;
		int j = 21;
		System.out.println((i < j) ? i++ : j--);
	}
}

public class Test
{
    public static void main(String[] args) 
    {
    char a = 'A';
    int i = 1;
    System.out.println(true ? a : 0);
    System.out.println(false ? i : a);
    }
}

class Test64 
{
	public static void main(String[] args) 
	{
		if((call(3)) ||(call(7)))
		{
			System.out.println("Result is true");			
		}
		if((call(6)) ||(call(9)))
		{
			System.out.println("Result is true");			
		}
	}
	public static boolean call(int i)
	{
		if(i<5)
		{
			System.out.println("i < 5");
			return true;
		}
		else
		{
			System.out.println("i>=5");
			return false;
		}
	}
}

class Test 
{
	public static void main(String[] args) 
	{
		boolean b=false;
		if(b=true)
		{
		System.out.println("Assigning not comparing..");
		}
		else
		{
			System.out.println("Bad");
		}
	}
}class Test64 
{
	public static void main(String[] args) 
	{
		if((call(3)) ||(call(7)))
		{
			System.out.println("Result is true");			
		}
		if((call(6)) ||(call(9)))
		{
			System.out.println("Result is true");			
		}
	}
	public static boolean call(int i)
	{
		if(i<5)
		{
			System.out.println("i < 5");
			return true;
		}
		else
		{
			System.out.println("i>=5");
			return false;
		}
	}
}
public class Test
{
    public static void main(String[] argv)
    {
       byte i=10;
       byte j = 10;
       byte z = i * j;
       System.out.println(z);

    }
}


public class Test
{
       public static void main(String[] argv)
       {
             String a = "a";
             int  b = 1;
             String c = a + b;
             System.out.println(c);
       }
}
public class Test
{
     public static void main(String[] argv) 
     {
          int a = 9;
          int b = 65;
          int c = -12;
          float d = 9.0F;
          char e = 'A';
          System.out.println(a < b);//t
          System.out.println(d < c);//f
          System.out.println(e <= a);//f
          System.out.println(a > d);//f
          System.out.println(c >= e);//f
     }
}
public class Test
{
      public static void main(String[] argv) 
      {
            char a = 'A';
            float f = 100.11F;
            if (a < f) 
            {
                  System.out.println("a < f");//t
            }
      }
}

public class Test 
{
      public static void main(String[] argv) 
      {
           char a = 'A';
           boolean b = true;
           if (a > b)//errer 
           {
                System.out.println("a > b");
           }
           System.out.println();
      }
}
public class Test
{
        public static void main(String[] argv)
        {
              while(false)
	      {
	      System.out.println("Not Executed!!!");
	      }
        }
}
public class Test
{
        public static void main(String[] argv)
        {
              String s = "123";
              s += "45";
              s += 67;
              System.out.println(s);
              int b = 2;
              System.out.println("" + b + 3);
        }
}*/
class Test
{
     public static void main(String args[])
     {
          String s = new String("Food");
          if(s instanceof String)
          {
                System.out.println("s is a String");
          }
     }
}