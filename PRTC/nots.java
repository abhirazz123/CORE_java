20-12-2024
-----------
Exception Handling :
--------------------
An exception is an abnormal situation OR un-expected situation in a normal execution flow.

Due to an exception, the execution of the program will be disturbed first and then terminated permanently.

Exception always encounter at runtime only.

Exception encounter due to the following reasons :

  1) The Wrong input given by the user.
  2) Due to dependency, When one part of the program is dependent to another part to complete the task then there might be a chance of getting an exception. 

---------------------------------------------------------------
Different Crieteria of Exception :
----------------------------------
The following are the different criteria for exception :

1) java.lang.ArithmeticException

Whenever we divide a number by zero(an int value) then we will get a RuntimeException i.e java.lang.ArithmeticException.

   int x = 10;
   int y = 0;
   int z = x/y;  //java.lang.ArithmeticException.
   System.out.println(z);
   

2) java.lang.ArrayIndexOutOfBoundsException
   If we try to access the index of the array where element is not available then we will get java.lang.ArrayIndexOutOfBoundsException

   int []arr = {10,20,30};
   System.out.println(arr[3]); //No value available for 3rd index

3) java.lang.StringIndexOutOfBoundsException
   While retrieving the character from the String, if we pass 
   any negative index then we will get java.lang.StringIndexOutOfBoundsException

   String str = "Hyderabad";  
   System.out.println(str.substring(-2,7));

Note : IndexOutOfBoundsException is the super for both the 
       folowing classes
       ArrayIndexOutOfBoundsException
       StringIndexOutOfBoundsException
       
4) java.lang.NegativeSizeArrayException
   While defining an array, the size of the Array must be 
   positive integer value otherwise we will get java.lang.NegativeArraySizeException
   
5) java.lang.NullPointerException
   If any refrence variable is pointing to null literal then we 
   can't invoke any non static method on this reference variable which is pointing to null otherwise we will get 
   NullPointerException.
   
   String str = null;
   System.out.println(str.length()); //NullPointerException
   
   OR
   --
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your Name :");
   String name = sc.nextLine();    
		
   System.out.println(name.length());  //No Exception
   System.out.println(name.toUpperCase()); //No Exception
   Here we will not get any exception even we provide null
   
6) java.lang.NumberFormatException 
----------------------------------
   If we try to convert a String value into primitive OR Wrapper type but if the number is not available in numeric
   format then we will get java.lang.NumberFormatException
   
   String str = "NIT";
   //int p = Integer.parseInt(str);		       
   Integer w = Integer.valueOf(str);

7) java.util.InputMismatchException
   While reading the data through Scanner class if the input 
   is not is a proper format then we will get java.util.InputMismatchException

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your Roll :");
   int roll = sc.nextInt();
		 
   System.out.println(roll);

-------------------------------------------------------------
Exception Hierarchy :
----------------------
Diagram (20-DEC-24)

Note :- As a developer we are responsibe to handle the Exception. System admin is responsibe to handle the error because we cannot recover from error.
-------------------------------------------------------
23-12-2024
-----------
Exception format :
------------------
In java, If we want to print any exception object by using print() statement then the java software people has provided
the following format :

Fully Qualified Name (Package Name + class Name) : errorMessage

package com.ravi.exception;

public class ExceptionFormat {

	public static void main(String[] args) 
	{
		ArithmeticException e1 = new ArithmeticException("Divided the number by zero");
		System.out.println(e1.toString()); 
		
		//java.lang.ArithmeticException : Divided the number by zero

	}

}
-----------------------------------------------------------
WAP to show that java.lang.Exception is the super class for all the exceptions (Checked + Unchecked)

package com.ravi.exception;

import java.io.IOException;

public class ExceptionSuper 
{
	public static void main(String[] args) 
	{
		Exception e1 = new ArithmeticException();
		System.out.println(e1);
		
		e1 = new ArrayIndexOutOfBoundsException();
		System.out.println(e1);
		
		e1 = new NullPointerException();
		System.out.println(e1);
		
		e1 = new NumberFormatException();
		System.out.println(e1);
		
		e1 = new IOException();
		System.out.println(e1);
	}

}
------------------------------------------------------------
WAP that describes that whenever an exception is encounter in the program then program will be terminated in the middle.

package com.ravi.exception;

import java.util.Scanner;

public class AbnormalTermination 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method Started!!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of x :");
		int x = sc.nextInt();
		
		System.out.print("Enter the value of y :");
		int y = sc.nextInt();
		
		int result = x/y;
		System.out.println("Result is :"+result);
		
		System.out.println("Main method Completed!!!");
		sc.close();		
	}
}

Note : In the above program, If we enter the value of y as 0 then our program will be terminated abnormally, JVM has 
default exception handler, which will terminate the program in the middle (abnormal termination) and provide the execption message with line number.
-------------------------------------------------------------
In order to work with exception, java software people has provided the following keywords :

1) try block
2) catch block
3) finally block [Java 7 try with resourses]
4) throw
5) throws
-----------------------------------------------------------
Key points to remember :
--------------------------------
-> With try block we can write either catch block or finally block or both.
-> In between try and catch we can't write any kind of statement.
-> try block will trace our program line by line.
-> If we have any exception inside the try block,With the help of JVM, try block will automatically  create the appropriate Exception object and then throw the Exception Object to the nearest catch block.
-> In the try block whenever we get an exception the control will directly jump to the nearest catch block so the remaining code of try block will not be executed.
 -> catch block is responsible to handle the exception.
 -> catch block will only execute if there is an exception inside try block.
 ------------------------------------------------------------
try block :
-----------
Whenever our statement is error suspecting statement OR Risky statement then we should write that statement inside the try block.

try block must be followed either by catch block or finally block or both.

*try block is responsible to trace our code line by line, if any execption encounter then with the help of JVM, TRY BLOCK WILL CREATE APPROPRIATE EXECPTION OBJECT, AND THROW THIS EXCEPTION OBJECT to the nearest catch block.

After the execption in the try block, the remaining code of try block will not be executed because control will directly transfer to the catch block.

In between try and catch block we cannot write any kind of statement.

catch block :
--------------
The main purpose of catch block to handle the exception which is thrown by try block.

catch block will only executed if there is an exception in the try block.
-------------------------------------------------------------
package com.ravi.basic;

import java.util.Scanner;

public class TryDemo 
{
	public static void main(String[] args)  
	{		
		   System.out.println("Main method started....");	
		   Scanner sc = new Scanner(System.in);
		   
		   try
		   {
			   System.out.print("Enter the value of x :");
			   int x = sc.nextInt();
			   
			   System.out.print("Enter the value of y :");
			   int y = sc.nextInt();
			   
			   int result = x/y;
			   System.out.println("Result is :"+result);
			   System.out.println("End of try block");
			   
		   }
		   catch(Exception e)
		   {
			  System.out.println("Inside Catch Block");
			  System.err.println(e); 
		   }
		   System.out.println("Main method ended....");
		   sc.close();
	}
}
In the above program if we put the value of y as 0 but still program will be executed normally because we have used try-catch so it is a 
normal termination even we have an exception in the program.
-------------------------------------------------------------
24-12-2024
-----------
public class Main 
{
	public static void main(String[] args) 
	{
		try
		{
		  //System.out.println(10/0);
		  
		            //OR
			    
		  throw	new ArithmeticException("I am dividing no by zero");
		}
		catch(Exception e)
		{
			System.err.println("Inside Catch Block");
			System.err.println(e);
		}
	}
}

From the above program it is clear that try block implicitly creating the exception object with the help of JVM and throwing the execption object to the nearest catch block.
------------------------------------------------------------------
The main purpose of Exception handling to provide user-friendly message to our end user as shown in the program.

package com.ravi.basic;

import java.util.Scanner;

public class CustomerDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome client, Welcome to my application");
		Scanner sc = new Scanner(System.in);
		
	    try
	    {
	    	System.out.print("Enter the value of a :");
			int a = sc.nextInt();
			
			System.out.print("Enter the value of b :");
			int b = sc.nextInt();			
			
			int result = a/b;
			System.out.println("Result is :"+result);
	    }
	    catch(Exception e)
	    {
	    	System.err.println("Sir, Please don't put zero here");
	    }

	    System.out.println("Thank you client, Have a nice Day!!!");
	    sc.close();
	}

}

Exception handlinag = No Abnormal Termination + User-friendly message on wrong input given by the client.
=================================================================
Throwable class Method to print Exception :
--------------------------------------------
Throwable class has provided the following three methods :

1) public String getMessage() :- It will provide only error message.

2) public void printStackTrace() :-  It will provide the complete details regarding exception like exception class name, exception error message, exception class location, exception method name and exception line number.

3) public String toString() :- It will convert the exception Object into String representation.
------------------------------------------------------------------
package com.ravi.basic;

public class PrintStackTrace 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started...");		
		try
		{
			String x = "NIT";
			int y = Integer.parseInt(x); 
			System.out.println(y);	
		}
		catch(Exception e)
		{
			e.printStackTrace(); //For complete Exception details
			System.out.println("---------------------------");
			System.out.println("............................");
			System.err.println(e.getMessage()); //only for Exception message	
			System.out.println("..............");
			System.err.println(e.toString());
		}
		System.out.println("Main method ended...");		

	}

}
-----------------------------------------------------------------
Working with Specific Exception :
---------------------------------
While working with exception, in the corresponding catch block we can take Exception (super class) which can handle any type of Exception.

On the other hand we can also take specific type of exception (ArithmetiException, InputMismatchException and so on) which will handle only one type i.e specific type of exception.

package com.ravi.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpecificException 
{
	public static void main(String[] args) 
	{
       System.out.println("Main started");
		
		Scanner sc = new Scanner(System.in);
		
		try
		{			
			System.out.print("Enter your Roll :");
			int roll = sc.nextInt();  
			System.out.println("Your Roll is :"+roll);
			
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}		
		sc.close();
		System.out.println("Main ended");
	}
}
------------------------------------------------------------------

public class Main 
{
	public static void main(String[] args) 
	{
		try
		{
			throw new Error();
		}
		catch (Exception e)
		{
			System.err.println("Catch");
			System.err.println(e);
		}
	}
}


Note : Here the catch block is unable to handle the exception
 because there is no relation between Error and Exception, both are sub class of Throwable class.
 
 In the corresponding catch block, If we write Error OR Throwable 
 then we catch block would be executed.
 -----------------------------------------------------------------
26-12-2024
-----------
Working with Infinity and Not a number(NaN) :
---------------------------------------------
10/0    -> Infinity (Java.lang.ArithmeticException)
10/0.0  -> Infinity  (POSITIVE_INFINITY)

0/0     -> Undefined (Java.lang.ArithmeticException)
0/0.0   -> Undefined  (NaN)

While dividing a number with Integral literal in both the cases i.e Infinity (10/0) and Undefined (0/0) we will get java.lang.ArithmeticException because java software people has not provided any final, static variable support to deal with Infinity and Undefined.

On the other hand while dividing a number with with floating point literal in the both cases i.e Infinity (10/0.0) and Undefined (0/0.0) we have final, static variable support so the program will not be terminated in the middle which are as follows

10/0.0 = POSITIVE_INFINITY
-10/0.0 = NEGATIVE_INFINITY
0/0.0 = NaN

java.lang.Float and java.lang.Double classes are provided the support for these final and static variable, the same OR same type of variables are not available in Integeral Literal classes.
-----------------------------------------------------------------
package com.ravi.basic;

public class InfinityFloatingPoint 
{	
	public static void main(String[] args) 
	{
	   System.out.println("Main Started");
	   System.out.println(10/0.0); 
	   System.out.println(-10/0.0); 
	   System.out.println(0/0.0);  
	   System.out.println(10/0); 
	   System.out.println("Main Ended");
	}

}
-----------------------------------------------------------------
Working with multiple try catch :
---------------------------------
According to our application requirement we can provide multiple try-catch in my application to work with multiple execptions.

package com.ravi.basic;
public class MultipleTryCatch 
{
	public static void main(String[] args) 
	{
	  System.out.println("Main method started!!!!");
	  
	  try
	  {
		  int arr[] = {10,20,30};
		  System.out.println(arr[3]);
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.err.println("Array index is out of limit!!!");
	  }
	  
	  try
	  {
		 String str = null;
		 System.out.println(str.length());
	  }
	  catch(NullPointerException e)
	  {
		  System.err.println("ref variable is pointing to null");
	  } 
	  
	  System.out.println("Main method ended!!!!");	
	}
}

Note : Here we are getting all the execptions messages through catch blocks at a time so it is not a better approach from client point of view, We should always provide only one error message to our client.
---------------------------------------------------------------
* Single try with multiple catch block :
-----------------------------------------
According to industry standard we should write try with multiple catch blocks so we can provide proper information for each and every exception to the end user.

While working with multiple catch block always the super class catch block must be last catch block.

From java 1.7v this multiple exceptions we can write in a single catch block by using | symbol.

If try block is having more than one exception then always try block will entertain only first exception because control will transfer to the nearest catch block.

package com.ravi.basic;
public class MultyCatch 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Started...");		
		try
		{
			int c = 10/2;			
			System.out.println("c value is :"+c);	
			
			int []x = {12,78,56};
			System.out.println(x[4]);			
		}
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.err.println("Array is out of limit...");
		}
		catch(ArithmeticException e1)
		{
			System.err.println("Divide By zero problem...");
		}
		catch(Exception e1)
		{
			System.out.println("General");
		}			
								
		System.out.println("Main Ended...");
	}
}
------------------------------------------------------------------
package com.ravi.basic;

public class MultyCatch1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started!!!");
		try
		{
		   String str1 = null;
		   System.out.println(str1.toUpperCase()); //NULL
		   
		   String str2 = "Ravi";
		   int x = Integer.parseInt(str2);
		   System.out.println("Number is :"+x);
		}
		catch(NumberFormatException  | NullPointerException  e)
		{
		  if(e instanceof NumberFormatException)
		  {
			  System.err.println("Number is not in a proper format");
		  }
		  else if(e instanceof NullPointerException)
		  {
			  System.err.println("ref variable is pointing to null");
		  }
		}

		System.out.println("Main method ended!!");
	}

}
------------------------------------------------------------------
27-12-2024
-----------
finally block [100% Guaranteed for Exceution]
---------------------------------------------
finally is a block which is meant for Resource handling purposes.

According to Software Engineering, the resources are memory creation, buffer creation, opening of a database, working with files, working with network resourses and so on.

Whenever the control will enter inside the try block always the finally block would be executed.

We should write all the closing statements inside the finally block because irrespective of exception finally block will be executed every time.

If we use the combination of try and finally then only the resources will be handled but not the execption, on the other hand if we use try-catch and finally then execption and resourses both will be handled.
-----------------------------------------------------------------
package com.ravi.basic;

public class FinallyBlock 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		
		try
		{			
			System.out.println(10/0);			
		}		
		finally
		{	
			System.out.println("Finally Block");
		}
		
		System.out.println("Main method ended");
	}

}

Note :- In the above program finally block will be executed, even we have an exception in the try block but here only the resourses will be handled but not the exception.
---------------------------------------------------------------
package com.ravi.basic;

public class FinallyWithCatch 
{
	public static void main(String[] args) 
	{		
		try
		{			
		    int []x = new int[-2];	
		    x[0] = 12;
		    x[1] = 15;
		    System.out.println(x[0]+" : "+x[1]);	   
		   
		}
		catch(NegativeArraySizeException e)
		{		
			System.err.println("Array Size is in negative value...");
			 
		}
		finally
		{
		   System.out.println("Resources will be handled here!!");		   
		}
		System.out.println("Main method ended!!!");
	}
}


In the above program exception and resourses both are handled because we have a combination of try-catch and finally.

Note :- In the try block if we write System.exit(0) and if this line is executed then finally block will not be executed.
-----------------------------------------------------------------
Limitation of finally Block :
------------------------------
The following are the limitation of finally block :

1) In order to close the resourses, user is responsible to write finally block manually.

2) Due to finally block the length of the program will be increased.

3) In order to close the resourses inside the finally block, we need  to declare the resourses outside of try block.

package com.ravi.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyLimitation 
{
	
	public static void main(String[] args) 
	{
	   Scanner sc = null;
       try
       {
    	   sc = new Scanner(System.in);
    	   System.out.println("Enter your Marks :");
    	   int marks = sc.nextInt();
    	   System.out.println("Marks is :"+marks);    	   
       }
       catch(InputMismatchException e)
       {
    	   System.err.println("Input is invalid");
       }
       finally
       {
    	   System.out.println("Finally block");
    	   sc.close();
       }
		
	}
}
-----------------------------------------------------------------
** try with resourses :
-----------------------

To avoid all the limitation of finally block, Java software people introduced a separate concept i.e try with resources from java 7 onwards.

Case 1:
-------
try(resource1 ; resource2)  //Only the resources will be handled
{
}

Case 2 :
----------
//Resources and Exception both will be  handled
try(resource1 ; resource2) 
{                          
}
catch(Exception e)
{
}

Case 3 :
----------
try with resourses enhancement from java 9v

Resourse r1 = new Resourse();
Resourse r2 = new Resourse();

try(r1; r2)
{
}
catch(Exception e)
{
}


There is a predefined interface available in java.lang package called AutoCloseable which contains predefined abstract method i.e close() which throws Exception.

There is another predefined interface available in java.io package called Closeable, this Closeable interface is the sub interface for AutoCloseable interface.

public interface java.lang.AutoCloseable
{
   public abstract void close() throws Exception;
}
public interface java.io.Closeable extends java.lang.AutoCloseable
{
   void close() throws IOException;
}

Whenever we pass any resourse class object as part of try with resources as a parameter then that class must implements either Closeable or AutoCloseable interface so, try with resourses will automatically call the respective class
close() method even an exception is encountered in the try block.

ResourceClass rc = new ResourceClass();
try(rc)  
{                                              
}                                               
catch(Exception e)                             
{                                          

}

This ResourceClass must implements either Closeable or AutoCloseable interface so, try block will automatically call the close() method as well as try block will get the guarantee of close() method support in the respective class.


The following program explains how try block is invoking the close() method available in DatabaseResource class and FileResourse class.

3 files :
----------
DatabaseResourse.java
----------------------
package com.ravi.try_with_resourses;

public class DatabaseResourse implements AutoCloseable
{
	@Override
	public void close() throws Exception 
	{
		System.out.println("Database Resourse Closed!!!");
		
	}

}

FileResourse.java
------------------

package com.ravi.try_with_resourses;

import java.io.Closeable;
import java.io.IOException;

public class FileResourse implements Closeable
{
	@Override
	public void close() throws IOException 
	{
		System.out.println("File Resourse Closed!!!");
		
	}

}

Main.java
----------
package com.ravi.try_with_resourses;

public class Main 
{
	public static void main(String[] args) throws Exception
	{
		DatabaseResourse dr = new DatabaseResourse();
		FileResourse fr = new FileResourse();
		
		try(dr;fr)
		{
		  System.out.println(10/0);	
		}
		catch(ArithmeticException e)
		{
			System.err.println("Divide by zero problem");
		}
		System.out.println("Main method Completed!!");
	}

}

------------------------------------------------------------------
//Program to close Scanner class automatically using try with resourses

package com.ravi.try_with_resourses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourses {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc)
		{
			System.out.println("Enter your Salary :");
			double sal = sc.nextDouble();
			System.out.println("Salary is :"+sal);
		}
		catch(InputMismatchException e)
		{
			System.err.println("Input is Inavlid");
		}
		

	}

}

Note :- Scanner class internally implementing Closeable interface so it is providing auto closing facility from java 1.7, as a user we need to pass the reference of Scanner class inside try with resources try()


Whenver we write try with resourses then automatically compiler will generate finally block internally to close the resourses automatically.
-----------------------------------------------------------------
28-12-2024
-----------
Nested try block :
------------------
If we write a try block inside another try block then it is called Nested try block.

try  //Outer try             
{
  statement1;
     try  //Inner try
     {
        statement2;
     }
     catch(Exception e) //Inner catch
     {
     }
}
catch(Exception e) //Outer Catch
{
}

The execution of inner try block depends upon outer try block that means if we have an exception in the Outer try block then inner try block will not be executed.
------------------------------------------------------------------
package com.ravi.basic;

public class NestedTryBlock 
{
	public static void main(String[] args) 
	{		
	      try  //outer try
	      {
	    	    String x = "null";
	    	    System.out.println("It's length is :"+x.length());
	    	        
		    	  try  //inner try
		    	  {
		    		 String y = "NIT"; 
		    		 int z = Integer.parseInt(y);
		    		 System.out.println("z value is :"+z);	    				    		  
		    	  }
		    	  catch(NumberFormatException e)
		    	  {
		    		System.err.println("Number is not in a proper format");  
		    	  }
	      }
	      catch(NullPointerException e)
	      {
	    	  System.err.println("Null pointer Problem"); 	    	 
	      }	      
	}
}
-----------------------------------------------------------------
Writing try-catch inside catch block :
---------------------------------------
We can write try-catch inside catch block but this try-catch block will be exceuted if the catch block will executed that means if we have an exception in the try block.

package com.ravi.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithCatchInsideCatch 
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc)
		{			
			System.out.print("Enter your Roll number :");
			int roll = sc.nextInt();
			System.out.println("Your Roll is :"+roll);			
			
		}	
		catch(InputMismatchException e)
		{
			System.err.println("Provide Valid input!!");
			
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException e1)
			{
			  System.err.println("Divide by zero problem");	
			}
			
		}
		finally
		{
			try
			{
				throw new ArrayIndexOutOfBoundsException("Array is out of bounds");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.err.println("Array is out of Bounds");
			}
		}
	}

}

Note : inside finally block we can write try catch block.
-----------------------------------------------------------------

try-catch with return statement
-------------------------------
If we write try-catch block inside a method and that method is returning some value then we should write return statement in both the places i.e inside the try block as well as inside the catch block.

We can also write return statement inside the finally block only, if the finally block is present. After this return statement we cannot write any kind of statement. (Unrechable)

Always finally block return statement having more priority then try-catch return statement.
-----------------------------------------------------------------
package com.ravi.advanced;
public class ReturnExample
{
    public static void main(String[] args) 
    {     	
       System.out.println(methodReturningValue());        
    }	
	
	
	public static int methodReturningValue()
    {
        try
        {
            System.out.println("Try block");
            return 10/0;    
        }
        catch (Exception e)
        {
            System.out.println("catch block");         
           return 20;  //return statement is compulsory  
        }
        
       // System.out.println("Unreachable code");
               
    }
}
----------------------------------------------------------------
package com.ravi.advanced;

public class ReturnExample1 {

	public static void main(String[] args)
	{
		System.out.println(m1());
	}

	@SuppressWarnings("finally")
	public static int m1()
	{	
		try
		{
			System.out.println("Inside try");
			return 100;
		}
		catch(Exception e)
		{
			System.out.println("Inside Catch");
			return 200;
		}
		finally
		{
			System.out.println("Inside finally");
			return 300;
		}
		
		// System.out.println("....");   Unreachable line
	}
}
------------------------------------------------------------------
Initialization of a variable in try and catch :
-----------------------------------------------
A local variable must be initialized inside try block as well as catch block OR at the time of declaration.

If we initialize inside the try block only then from catch block we cannot access local variable value, Here initialization is compulsory inside catch block.

package com.ravi.basic;

public class VariableInitialization 
{
	public static void main(String[] args)
	{      
	   int x;
	   try
	   {		   
		 x = 100;
		 System.out.println(x);
	   }
	   catch(Exception e)
	   {
		   x = 200;
		   System.out.println(x);
	   }      
       System.out.println("Main completed!!!");
	}

}
-----------------------------------------------------------------
30-12-2024
-----------
**Difference between Checked Exception and Unchecked Exception :
----------------------------------------------------------------
Checked Exception :
----------------------
A checked exception is a common exception that must be throws or handled by the application code where it is thrown, Here compiler takes very much care and wanted the clarity regarding the exception by saying that, by using this code you may face some problem at runtime and you did not report me how would you handle this situation at runtime are called Checked exception, so provide either try-catch or declare the method as throws.

Except RuntimeException, all the checked exceptions are directly sub class of java.lang.Exception OR Throwable.

Eg:
---
FileNotFoundException, IOException, InterruptedException,ClassNotFoundException, SQLException, CloneNotSupportedException, EOFException and so on

Unchecked Exception :-
--------------------------
An unchecked exception is rare and any exception that does not need to be throw by throws keyword or handled by the application code where it is thrown, here compiler does not take any care are called unchecked exception.

Unchecked exceptions are directly entertain by JVM because they are rarely occurred in java.

All the un-checked exceptions are sub class of RuntimeException

RuntimeException is also Unchecked Exception.

All the Errors comes under Unchecked Exception.

Eg:
---
ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException, NumberFormatException, ClassCastException, ArrayStoreException and so on.
-----------------------------------------------------------------
Some Bullet points regarding Checked and Unchecked :
-----------------------------------------------------
Checked Exception :
------------------
  1) Common Exception
  2) Compiler takes care (Will not compile the code)
  3) Handling is compulsory (try-catch OR throws)
  4) Directly the sub class of java.lang.Exception OR Throwable

Unchecked Exception :
----------------------
  1) Rare Exception
  2) Comiler will not take any care
  3) Handling is not Compulsory
  4) Sub class of RuntimeException

-------------------------------------------------------------------
*Why compiler takes very much care regarding the checked Exception ?
---------------------------------------------------------------
As we know Checked Exceptions are very common exception so in case of checked exception "handling is compulsory" because checked Exception depends upon other resources as shown below.

IOException (we are depending upon System Keyboard OR Files )
FileNotFoundException(We are depending upon the file)
InterruptedException (Thread related problem)
ClassNotFoundException (class related problem)
SQLException (SQL related or database related problem)
CloneNotSupportedException (Object is the resourse)
EOFException(We are depending upon the file)
-------------------------------------------------------------------
When to provide try-catch or declare the method as throws :-
-----------------------------------------------------------
try-catch
----------
We should provide try-catch if we want to handle the exception in the method where checked exception is encountered, as well as if we want to provide user-defined messages to the client.

throws :
--------
throws keyword describes that the method might throw an Exception, It also might not. It is used only at the end of a
method declaration to indicate what exceptions it supports OR what type of Exception it might throw which will be handled by JVM (not recommended) or caller method.

Note :- It is always better to use try catch so we can provide appropriate user defined messages to our client.
--------------------------------------------------------------------

Exception propagation [Propagation of Exception from Callee to Caller]
------------------------------------------------------------------
Whenever we call a method and if the the callee method contains any kind of exception (checked OR Unchecked) and if callee method doesn't contain any kind of exception handling mechanism (try-catch OR throws) then JVM will propagate the exception to caller method for handling purpose. This is called Exception Propagation.

If the caller method also does not contain any exception handling mechanism then JVM will terminate the method from the stack frame hence the remaining part of the method(m1 method) will not be executed even if we handle the exception in another caller method like main.

If any of the the caller method does not contain any exception handling mechanism then exception will be handled by JVM, JVM has default exception handler which will provide the exception message and terminates the program abnormally.[30-DEC]
---------------------------------------------------------------------Exception Propagation program :
--------------------------------
package com.ravi.custom_exception;

public class ExceptionPropagationWithUnchecked {

	public static void main(String[] args) 
	{
	   System.out.println("Main Method started..");	
	  try
	  {
		  m1();
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println("Handled in main");
	  }
	   System.out.println("Main Method ended..");	
	}
	public static void m1() 
	{
	   System.out.println("M1 Method started..");	
	   m2();
	   System.out.println("M1 Method ended..");	
	}
	public static void m2() 
	{		
		throw new ArithmeticException();		
	}
}
--------------------------------------------------------------------
package com.ravi.exception;

public class ExceptionPropagationWithChecked {

	public static void main(String[] args) 
	{
	   System.out.println("Main Method started..");	
	   try
	   {
		   m1();
	   }
	   catch(ClassNotFoundException e)
	   {
		   System.out.println("Handled by main method");
	   }
	   System.out.println("Main Method ended..");	
	}
	public static void m1() throws ClassNotFoundException
	{
	   System.out.println("M1 Method started..");	
	   m2();
	   System.out.println("M1 Method ended..");	
	}
	public static void m2() throws ClassNotFoundException
	{		
		System.out.println("M2 method Body");		
		
		Class.forName("Sample");
	}
}
---------------------------------------------------------------------
** What is the difference between throw and throws :
------------------------------------------------------
throw [THROWING THE EXCEPTION OBJCET EXPLICITLY.]
------------------------------------------------------
We should use throw keyword to throw the exception object explicitly, In case of try block, try block is responsible to create the exception object with JVM as well as throw the exception object to the nearest catch block 
but if a developer wants to throw exception object explicitly then we use throw keyword.

           throw new ArithmeticException();
	   throw new LowBalanceException();

after using throw keyword the control will transfer to the nearest catch block so after throw keyword statement, the remaining statements are un-reachable.

throws :- 
---------
throws keyword describes that the method might throw an Exception, It also might not. It is used only at the end of a
method declaration to indicate what exceptions it supports OR what type of Exception it might throw.

It is used to skip from the current situation so now the execption will be propagated to the caller method OR JVM for 
handling purpose.

It is mainly used to work with Checked Exception.
---------------------------------------------------------------------
Types of exception in java :
-------------------------------
Exception can be divided into two types :

1) Predefined Exception OR Built-in Exception

2) Userdefined Exception OR Custom Exception

Predefined Exception :-
-------------------------
The Exceptions which are already defined by Java software people for some specific purposes are called predefined Exception or Built-in exception.
Ex :
----
IOException, ArithmeticException and so on

Userdefined Exception :-
---------------------------
The exceptions which are defined by user according to their own use and requirement are called User-defined Exception.

Ex:-
----
InvalidAgeException, GreaterMarksException.
---------------------------------------------------------------------
How to develop User-defined Exceptions :
-----------------------------------------
As a developer we can develop user-defined checked and user-defined unchecked exception.

If we want to develop checked exception then our user-defined class must extends from java.lang.Exception, on the other hand if we want to develop un-checked exception then our user-defined class must extends from java.lang.RuntimeException.

In the user-defined exception class, we should write No argument constructor(in case if we don't want to pass any error message) and we should write parameterized constructor with String errorMessage as a parameter (in case if we  want to pass any error message) with super keyword.

In order to throw the exception object explicitly we should use throw keyword as well as our user-defined class object must be of Throwable type.

WAP to develop user-defined checked Exception :
-----------------------------------------------

package com.ravi.custom_exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception
{
	public InvalidAgeException()
	{		
	}
	
	public InvalidAgeException(String errorMessage)
	{
		super(errorMessage);
	}
}

public class CustomCheckedException 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.print("Enter your Age :");
			int age = sc.nextInt();
			validateAge(age);
		}
		catch (InvalidAgeException e) 
		{
			System.err.println("You are not allowed for Movie "+e);
		}
		
	}
	
	public static void validateAge(int age) throws InvalidAgeException
	{		
		if(age<18)
		{
			throw new InvalidAgeException("Age is Invalid");
			
		}
		else
		{
			System.out.println("You are allowed for Movie");
		}
		
		
	}

}
--------------------------------------------------------------------
01-01-2025
----------
WAP to develop user-defined un-checked Exception :
---------------------------------------------------
package com.ravi.exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class GreaterMarksException extends RuntimeException
{
	public GreaterMarksException()
	{		
	}
	
	public GreaterMarksException(String errorMessage)
	{
	   super(errorMessage);	
	}
}


public class UserDefinedUnchecked {

	public static void main(String[] args) 
	{       
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.print("Enter your Marks :");
			int marks = sc.nextInt();
			validateMarks(marks);
		}
		catch(GreaterMarksException e)
		{
			System.out.println(e);
		}

	}

	public static void validateMarks(int marks)
	{
		if(marks > 100)
		{
			throw new GreaterMarksException("Invalid Marks");
		}
		else
		{
			System.out.println("Your Marks is :"+marks);
		}
	}
}
----------------------------------------------------------------------
Some Basic Rules related to Checked Exception :
------------------------------------------------
a) If the try block does not throw any checked exception then in the corresponding catch block we can't handle checked exception.It will generate compilation error i.e "exception never thrown from the corresponding try statement"

Example :-

public class Test 
{
	public static void main(String[] args) 
	{
		try
		{
	          //try block is not throwing checked exception
		  //i.e. InterruptedException
		}
		catch (InterruptedException e) //error
		{
		}

	}

}

Note :- The above rule is not applicable for Unchecked Exception

               try
		{
			
		}
		catch(ArithmeticException e)  //Valid
		{
			e.printStackTrace();
		}

----------------------------------------------------------------------
b) If the try block does not throw any exception then in the corresponding catch block we can write Exception OR Throwable because both are the super classes for all types of Exception whether it is checked or unchecked.

package com.ravi.method_related_rule;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.ravi.basic.ThrowException;

public class CatchingWithSuperClass 
{
	public static void main(String[] args) 
	{		
		try
		{
			
		}
		catch(Exception e)  //Exception and Throwable both are allowed
		{
          e.printStackTrace();			
		}

	}

}
----------------------------------------------------------------------
c) At the time of method overriding if the super class method does not reporting or throwing checked exception then the overridden method of sub class not allowed to throw checked exception otherwise it will generate compilation error but overridden method can throw Unchecked Exception.

package com.ravi.method_related_rule;

import java.io.FileNotFoundException;
import java.io.IOException;

class Super
{
	public void show()  
	{
		System.out.println("Super class method not throwing checked Exception");
	}
}
class Sub extends Super
{
	@Override
	public void show() throws ClassNotFoundException //error
	{
		System.out.println("Sub class method should not throw checked Exception");
	}
}

public class MethodOverridingWithChecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
---------------------------------------------------------------------
d) If the super class method declare with throws keyword to throw a checked exception, then at the time of method overriding, sub class method may or may not use throws keyword.
               If the Overridden method is also using throws
 keyword to throw checked exception then it must be either same exception class or sub class, it should not be super class as well as we can't add more exceptions in the overridden method.


package com.ravi.method_related_rule;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base
{
	public void show() throws FileNotFoundException
	{
		System.out.println("Super class method ");
	}
}
class Derived extends Base
{
	public void show() throws IOException  //error
	{
		System.out.println("Sub class method ");
	}
}

public class MethodOverridingWithThrows 
{
	public static void main(String[] args) 
	{
	  System.out.println("Overridden method may or may not throw checked exception but if it is throwing then must be same or sub class");	
	}

}
----------------------------------------------------------------------
e) Just like return keyword we can't use throw keyword inside static and non static block  to throw an exception because all initializers must be executed normally.

We can use throw keyword in the protection of try-catch so the code will be executed normally.


public class Main 
{
	
	{
		try
		{
			throw new ArithmeticException();
		}
		catch (ArithmeticException e)
		{
			 System.out.println("Normal Termination");
		}
	}
	
	public static void main(String[] args) 
	{	
	  new Main();
	  System.out.println("Main");
	}

}
----------------------------------------------------------------------
public class ArrayStoreException {

	public static void main(String[] args) 
	{
		Object []obj = new String[3]; //valid with Array
		obj[0] = "Ravi";
		obj[1] = "hyd";
		obj[2] =  67.90; //java.lang.ArrayStoreException
		
		System.out.println(Arrays.toString(obj));

	}

}
--------------------------------------------------------------
public boolean equals(Object obj) :
-----------------------------------
There is predefined non static method called equals(Object obj) which is available in java.lang.Object class. 

It is used to compare two objects based on the memory reference or memory address so we can say the object class equals() method behavior is similar to == operator because internally, It uses == operator only as shown in the program.


package com.ravi.equals;

class Employee extends Object
{
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}	
	
}

public class EqualsDemo 
{
	public static void main(String[] args)
	{
	   Employee e1 = new Employee(111, "Scott"); //1000x	
	   Employee e2 = new Employee(111, "Scott"); //2000x	
	   
	   System.out.println(e1==e2); //false
	   System.out.println(e1.equals(e2)); //false [== operator]

	}

}

In the above program equals(Object obj) methdo will return false because internally object class equals(Object obj) method uses == operator.

We can override this equals(Object obj) method in the Employee class for content comparison. Eclipse IDE provides auto generate facility to override hashCode() and equals(Object obj).

package com.ravi.equals;

import java.util.Objects;

class Employee extends Object
{
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	//Auto generated by Eclipse IDE
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName);
	}

        //Overriding equals(Object obj) method for content
	comparison
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName);
	}	
	
	
	
}

public class EqualsDemo 
{
	public static void main(String[] args)
	{
	   Employee e1 = new Employee(111, "Scott");	
	   Employee e2 = new Employee(111, "Scott");	
	   
	  
	   System.out.println(e1.equals(e2));  //true

	}

}


Note : In the above program we will get the output as true because the overridden equals(Object obj) method will compare the content of the both the objects. It is auto generated method i.e equals() and hashCode() method

There is contract between equals() and hashCode() method is, we should always overridde both the methods together.
--------------------------------------------------------------
Record class in java [java 17 features]
-----------------------------------------
public abstract class Record extends Object.

record Student(){} //final class Student extends Record [Compiler generated code]

It is a new feature introduced from java 17.(In java 14 preview version)

As we know only objects are moving in the network from one place to another place so we need to write BLC class with nessacery requirements to make BLC class as a Data carrier class.

Records are immutable data carrier so, now with the help of record we can send our immutable data (final data) from one application to another application.

It is also known as DTO (Data transfer object) OR POJO (Plain Old Java Object) classes.

It is mainly used to concise our code as well as remove the boiler plate code.

In record, automatically constructor will be generated which is known as canonical constructor and the variables which are known as components are by default final.

In order to validate the outer world data, we can write our own constructor which is known as compact constructor.

Record will automatically generate the implemenation of toString(), equals(Object obj) and hashCode() method.

We can define static and non static method as well as static variable  and static block inside the record. We cannot define instance variable and instance block inside the record.

We cann't extend or inherit records because by default every record is implicilty final and It is extending from java.lang.Reocrd class, which is an abstract class.

We can implement an interface by using record.

We don't have setter facility in record because by default components are final.

3 files :
---------
ProductClass.java(C)
------------------
package com.ravi.record;

import java.util.Objects;

public class ProductClass 
{
	private Integer productId;
	private String productName;

	public ProductClass(Integer productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "ProductClass [productId=" + productId + ", productName=" + productName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, productName);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductClass other = (ProductClass) obj;
		return Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName);
	}
}

ProductRecord.java(R)
----------------------
package com.ravi.record;


public record ProductRecord(Integer productId, String productName)
{
	
	//to validate Outer world data (Compact constructor)	
	public ProductRecord
	{
	   if(productId <= 0)
	   {
		   System.err.println("Invalid Id");
	   }
	   
	}

}

MainClass.java
---------------
package com.ravi.record;

public class MainClass {

	public static void main(String[] args) 
	{
		ProductClass p1 = new ProductClass(111, "Camera");
		System.out.println(p1);
		ProductClass p2 = new ProductClass(111, "Camera");
		System.out.println(p1.equals(p2));
		System.out.println(p1.getProductName());
		
		
		
		System.out.println("....................................");
		ProductRecord r1 = new ProductRecord(999, "Laptop");
        System.out.println(r1);
        ProductRecord r2 = new ProductRecord(999, "Laptop");
        System.out.println(r1.equals(r2));
        System.out.println(r1.productName());
	}

}
==============================================================
03-01-2025
-----------
Multithreading :
----------------
Uniprocessing :- 
----------------
In uniprocessing, only one process can occupy the memory So the major drawbacks are 

1) Memory is westage
2) Resources are westage
3) Cpu is idle

To avoid the above said problem, multitasking is introduced.

In multitasking multiple tasks can concurrently work with CPU so, our task will be completed as soon as possible.

Multitasking is further divided into two categories.

a) Process based Multitasking
b) Thread based Multitasking

[Diagram : 03-JAN]
Process based Multitasking :
----------------------------
If a CPU is switching from one subtask(Thread) of one process to another subtask of another process then it is called Process based Multitasking.

Thread based Multitasking :
---------------------------
If a CPU is switching from one subtask(Thread) to another subtask within the same process then it is called Thread based Multitasking.

What is Thread in java ?
-------------------------
A thread is light weight process and it is the basic unit of CPU which can run concurrently with another thread within the same context (process).

It is well known for independent execution. The main purpose of multithreading to boost the execution sequence.

A thread can run with another thread concurrently within the same process so our task will be completed as soon as possible.

In java whenever we define main method then JVM internally creates a thread called main thread under main group.

Program that describes that main is a Thread :
-----------------------------------------------
Whenever we define main method then JVM will create main thread internally under main group, the purpose of this main thread to execute the entire main method code.

In java there is a predefined class called Thread available in java.lang package, this class contains a predefined static factory method currentThread() which will provide currently executing Thread Object.

  public native static Thread currentThread()

Thread t = Thread.currentThread(); //static Factory Method

Thread class has provided predefined method getName() to get the name of the Thread.
                 
		 public String getName();


Program to show main is a thread without method chaning :
-----------------------------------------------------------
public class Main 
{
	public static void main(String[] args) 
	{	
      Thread t1 = Thread.currentThread();
	  System.out.println("Current thread Name is :"+t1.getName());
	}

}

Program to show main is a thread with method chaning :
-------------------------------------------------------
package com.ravi.mt;

public class MainThread 
{
	public static void main(String[] args)
	{
		String name = Thread.currentThread().getName();
		System.out.println("Current Thread Name is :"+name);

	}

}

Note : The main pupose of main thread to execute the entire main method.
--------------------------------------------------------------
How to create user-defined thread ?
-----------------------------------
In order to create user-defined thread we can use the following two packages :

 1) By using java.lang package [JDK 1.0]
  2) By using java.util.concurrent sub package [JDK 1.5]

 
Creating Thread by using java.lang package :
--------------------------------------------
In order to create user-defined thread by using java.lang package we can use the following two techniques :

a) By extending java.lang.Thread class
b) By implementing java.lang.Runnable interface (Functional interface)
 
Note : java.lang.Thread class and java.lang.Runnable interface 
       both are available in java.lang package from JDK 1.0V.
 -------------------------------------------------------------
04-01-2025
-----------
Creating a user thread by extends Thread class approach :
----------------------------------------------------------
public synchronized void start() :
-----------------------------------
start() is a predefined non static method of Thread class which internally performs the following two tasks :

1) It will make a request to the O.S to assign a new thread for concurrent execution.

2) It will implicitly call run() method on the current object.
-------------------------------------------------------------------

package com.ravi.mi;

class Test extends Thread
{
	@Override
	public void run()
	{
		
		System.out.println("Child Thread is running!!!"); 
	}
}

public class UserThread 
{
	public static void main(String[] args)
	{
		System.out.println("Main thread started!!!"); 
		
		Test t1 = new Test();
		t1.start();
				
		System.out.println("Main thread ended!!!"); 

	}

}

In the above program, we have two threads, main thread which is responsible to execute main method and Thread-0 thread which is 
responsible to execute run() method. [04-JAN-25]

In entire Multithreading start() is the only method which is responsible to create a new thread.
------------------------------------------------------------------
public final boolean isAlive() :-
-----------------------------
It is a predefined non static method of Thread class through which we can find out whether a thread has started or not ?

As we know a new thread is created/started after calling start() method so if we use isAlive() method before start() method, 
it will return false but if the same isAlive() method if we invoke after the start() method, it will return true.

We can't restart a thread in java if we try to restart then It will generate an exception i.e java.lang.IllegalThreadStateException


package com.ravi.is_alive;

class Demo extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child Thread is running in a separate Stack");
	}
}

public class IsAlive {

	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		System.out.println("Is child thread started before start() :"+d1.isAlive());
		
		d1.start();
		System.out.println("Is child thread started after start():"+d1.isAlive());
		
		d1.start();  //java.lang.IllegalThreadStateException 
	
	}
}
-------------------------------------------------------------------
package com.ravi.basic;

class Stuff extends Thread
{
	@Override
	public void run() 
	{		
		String name = Thread.currentThread().getName();		
		System.out.println("Child Thread is Running, name is :"+name);
	}	
}
public class ExceptionDemo 
{
	public static void main(String[] args)
	{		
		String name = Thread.currentThread().getName();		
	    System.out.println(name+" thread started");		
	
		Stuff s1 = new Stuff(); 
		Stuff s2 = new Stuff(); 		
				
		s1.start();
		s2.start();
		
		System.out.println(10/0);
		
		System.out.println("Main Thread Ended");
	}

}

Note :- Here main thread is interrupted due to AE but still child thread will be executed because child threads are executing with separate Stack
-------------------------------------------------------------------
05-01-2025
-----------
WAP to show that when we work with multiple threads then processor will frequently move from one thread to another thread.

package com.ravi.basic;

class Sample extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("i value is :"+i+ " by "+name+ " thread");
		}
		
	}
}

public class ThreadLoop 
{	
	public static void main(String[] args)
	{	
		Sample s1 = new Sample();
		s1.start();
		
	
       String name = Thread.currentThread().getName();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("i value is :"+i+ " by "+name+ " thread");
		}
		
		int x = 1;
		do
		{
			System.out.println("India by :"+name);
			x++;
		}
		while(x<=10);
		
		
	}
}

In the above program, Processor is frequently moving from main thread to child thread.
------------------------------------------------------------------
How to set and get the name of the Thread : 
--------------------------------------------------
Whenever we create a userdefined Thread in java then by default JVM assigns the name of thread is Thread-0, Thread-1, Thread-2 and so on.

If a user wants to assign some user defined name of the Thread, then Thread class has provided a predefined method called setName(String name) to set the name of the Thread.

On the other hand we want to get the name of the Thread then Thread class has provided a predefined method called getName().

public final void setName(String name)  //setter

public final String getName()  //getter
------------------------------------------------------------------
package com.ravi.basic;
class DoStuff extends Thread  
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Running Thread name is :"+name);
	}
}
public class ThreadName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		DoStuff t1 = new DoStuff(); 
		DoStuff t2 = new DoStuff(); 
			
		
		
		t1.start();			
		t2.start();	
		
			
			
	System.out.println(Thread.currentThread().getName()+" thread is running.....");
	}
}

We are not providing the user-defined names so by default the name of thread would be Thread-0, Thread-1.
------------------------------------------------------------------
package com.ravi.basic;
class Demo extends Thread
{
	@Override
	public void run()
	{
		 String name = Thread.currentThread().getName();
		 System.out.println("Running Thread name is :"+name);
	}
}
public class ThreadName1 
{
	public static void main(String[] args) 
	{
	   Thread t = Thread.currentThread();
	   t.setName("Parent");
	   
	   Demo d1 = new Demo();
	   Demo d2 = new Demo();
	   
	   d1.setName("Child1");
	   d2.setName("Child2");
	   
	   d1.start();
	   d2.start();
	   
	   String name = Thread.currentThread().getName();
	   System.out.println(name + " Thread is running Here..");
	   
	   
	}
}

Note : Here we are providing the user-defined name i.e child1 and child2 for both the user-defined thread.
-------------------------------------------------------------------
package com.ravi.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

class BatchAssignment extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		if(name !=null && name.equalsIgnoreCase("Placement"))
		{
			this.placementBatch();
		}
		else if(name !=null && name.equalsIgnoreCase("Regular"))
		{
			this.regularBatch();
		}
		else
		{
			throw new NullPointerException("Name can't be null");
		}
	}
	
	public void placementBatch()
	{
		System.out.println("I am a placement batch student.");
	}
	
	public void regularBatch()
	{
		System.out.println("I am a Regular batch student.");
	}
}


public class ThreadName2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
		try(sc)
		{
			System.out.print("Enter your Batch Title :");
			String title = sc.next();
			
			BatchAssignment b = new BatchAssignment();
			b.setName(title);
			
			b.start();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input");
		}
		
		
	}

}
------------------------------------------------------------------
Thread.sleep(long millisecond) :
-------------------------------
If we want to put a thread into temporarly waiting state then we should use sleep() method.

The waiting time of the Thread depends upon the time specified by the user in millisecond as parameter to sleep() method.

It is a static method of Thread class.

Thread.sleep(1000); //Thread will wait for 1 second


It is throwing a checked Exception i.e InterruptedException because there may be chance that this sleeping thread may be interrupted by a thread so provide either try-catch or declare the method as throws.

-------------------------------------------------------------------
package com.ravi.basic;

class Sleep extends Thread
{
   @Override
   public void run() 
   {	
	   
	 for(int i=1; i<=10; i++)
	 {
		System.out.println("i value is :"+i);
		try
		{
			 Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread is interrupted "+e);
		}
	 }
   }
   
}
public class SleepDemo 
{
	public static void main(String[] args)  
	{
	   Sleep s1 = new Sleep();
	   s1.start();	 
	  	  
	}
}

Note : Here child thread is not interrupted, so catch block will not be executed.
------------------------------------------------------------------
package com.ravi.basic;

class MyTest extends Thread 
{		
		
	@Override
	public void run()  
	{		
		System.out.println("Child Thread id is :"+Thread.currentThread().getId());  
		
		for(int i=1; i<=5; i++) 
		{
			System.out.println("i value is :"+i); //11  22  33   44   55
			try
			{
				Thread.sleep(1000);				
			}
			catch(InterruptedException e)
			{
				System.err.println("Thread has Interrupted");
			}
		}
	}
}
public class SleepDemo1 
{
	public static void main(String[] args) 
	{		
		System.out.println("Main Thread id is :"+Thread.currentThread().getId());  //1
		
		MyTest m1 = new MyTest();		
		MyTest m2 = new MyTest();
		
		m1.start();
		m2.start();			
	}
}
-----------------------------------------------------------------
Thread life cycle :
-------------------













