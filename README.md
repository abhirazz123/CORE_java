28-09-2024
----------
javaravishanker@gmail.com
9835647014


History of Java :
------------------
Java was developed by Sun microsystem but on 27th January 2010, Java was overtaken by Oracle Corporation so now java is the product of 
Oracle Corporation.

The first version of java was released on 23rd January 1996.

Fisrt Name of Java  : OAK (Tree Name)
       Developed By : James Gosling and his friends
       Project Name : Green Project
      First release : 23rd Jan 1996 (JDK 1.0)
               Java : It is an island in indonesia 
    Official Symbol : Coffee Cup
--------------------------------------------------------------------
What is a function ?
---------------------
A function is a self defined block which is used for performing some 
opertion, calculation or  printing the data.

Function can be divided into two types :
----------------------------------------
1) Predefined OR Built-in function :
------------------------------------
The function which is written by language createor OR user for some 
specific purpose is called predefined function.


2) User-defined Function :
--------------------------
The functions which are defined by user for performing some specific task are called User-defined function.

Advantages of Function :
-------------------------
1) Modularity : 
---------------
Dividing the bigger task into number of smaller task.

2) Easy to understand :
-----------------------
Once the task is divided into number of independent modules then it is easy to understand the entire module.

3) Reusability :
-----------------
We can reuse a particular module for 'n' number of times.

Note :In java, we always reuse our java classes.

4) Easy debugging :
-------------------
Each module is isolated from another module so the debugging is easy because we can debug only one module where we have syntax or semantics error.

===================================================================
Why we pass parameter to a function ?
-------------------------------------------
We should pass parameter to a function for getting more information regarding the function.

If We don't pass parameter then the informations are not complete, It is partial information.

Example :
---------
public void deposit(double amount)
{
}

public void doSum(int x, int y)
{
}

public void sleep(int hours)
{
}

===================================================================
Why functions are called Method in java ?
------------------------------------------
In C++ language, there is a facility to write a function inside the class as well outside of the class by using scope resolution operator (::) but in java we can write a function inside the class only, we can't define a function outside of the class, that is reason functions are called Method in java.  
----------------------------------------------------------------
30-09-2024
-----------
**What is platform independency in java ?
----------------------------------------
C and C++ programs are platform dependent programs that means the .exe file created on one machine will not be executed on the another machine if the system configuration is different.

That is the reason C and C++ programs are not suitable for website development.

The role of java compiler :
---------------------------
1) Syntax verification.
2) Verify the compatibility issues (L.H.S = R.H.S)
3) Will Convert Source code into byte code.


Java is a platform independent language. Whenever we write a java program, the extension of java program must be .java. 

Now this .java file we submit to java compiler (javac) for compilation process. After successful compilation the compiler will generate a very special machine code file i.e .class file (also known as bytecode). Now this .class file we submit to JVM for execution purpose.

The role of JVM is to load and execute the .class file. Here JVM plays a major role because It converts the .class file into appropriate machine code instruction (Operating System format) so java becomes platform independent language and it is highly suitable for website development.[30-SEP-24]

Note :- We have different JVM for different Operating System that means JVM is platform dependent technology where as Java is platform Independent technology.

JVM internally contains an interpreter so it executes the code line by line. It is written in 'C'langugae hance platform dependent.
----------------------------------------------------------------
**What is the difference between bit code and byte code ?
-------------------------------------------------------
Bit code is directly understood by Operating System but on the other hand byte code is understood by JVM, JVM is going to convert this byte code into appropriate machine understandable format. [30-SEP-24]

Note : All the browsers internally contain JVM are known as
       JEB (Java Enabled Browsers) browser.
----------------------------------------------------------------
01-10-2024
-----------
Difference between Compiler (javac) and Interpreter (JVM)
-----------------------------------------------------------
Paint Diagram [01-OCT] 

*Difference between JDK, JRE, JVM and JIT Compiler :
-----------------------------------------------------
Paint Diagram [01-OCT] 

JDK :
------
It stands for Java Devleopment Kit. It is a developer version that
means by using JDK we can develop as well as execute our java 
programs.
In order to develop and execute it supports various JDK tools which are as follows :

 a) javac	: java compiler, responsible for compilation.
 b) java	: Java launcher,responsible for executing java 
                  program.
 c) jdb		: java debugger, for debugging purpose
 d) jconsole	: java Console, to display the output in the 
                  console.
 e) javap	: java Profiler, To get the details of a class
 f) javadoc	: Java documention, for Generating java 
                  documentation.
		  
		  
JRE :
-----
It stands for Java Runtime Environment. It is a client version so
by using JRE we can only execute our java program. 

From java 11 version we don't have separate JRE folder, java software people removed this folder from software so, from java 11 version we can directly execute our java program without compilation.
 
java FileName.java [This is the command to directly execute our
                    java code]
 
 
JVM :
-----
The main purpose of JVM to load and execute the byte code. It provides, security, memory management by  garbage collector, JIT compiler for fast execution and so on. 

The .class file generated by java compiler first verified by ByteCode Verifier (One component of JVM) so java is the most 
secure language in IT market.


What is JIT Compiler :
-----------------------
As we know, Our interpreter is slow in nature so to boost up the java execution, we have JIT (Just In time) compiler support.

It holds the repeated code instrauction and native code instruction, It will directly provide these two instrution at time 
of line by line execution so our interpreter executes the code
in more efficient way hance the overall execution becomes very fast.
-----------------------------------------------------------------
What is data type in java ?
----------------------------
A data type describes, what type of value the varaiable will hold.
In hava we have 2 types of data types :
 
Data type diagram is available in paint diagram [02-OCT] 
------------------------------------------------------------------
What is the difference between statically typed and Dynamically typed language?

Statically Typed Language :
----------------------------
The languages where data type is compulsory before initialization of a variable are called statically typed language.
In these languages we can hold same kind of value during the execution of the program.

Ex:- C,C++,Core Java, C#              

Dynamically Typed Langauge :
-----------------------------
The languages where data type is not compulsory and it is optional before initialization of a variable then it is called dynamically typed language.

In these languages we can hold different kind of value during the execution of the program.
Ex:- Visual Basic, Javascript, Python
-----------------------------------------------------------------
What is comments in java ?
--------------------------
Comments are used to enhance the readability of the code. It is ignored by the compiler.

In java we have 3 types of commants :

1) Single Line Comment 
   //
   
2) Multiline Comment
   /*
     Java Source code.   
   */

3) Documentation Comment
   /**
      Name of the Project : Online Shopping
        Number of Modules : 36
	Date of creation  : 2nd Feb 2024
	Last Modification : 30th Sep 2024
	           Author : Green Team
   */
------------------------------------------------------------------
WAP in Java to display welcome message :
----------------------------------------
public class Welcome   
{
        public static void main(String[] args) 
	{
		System.out.println("Welcome Batch 39!");
	}
	
}
 
   
Description of main() method :
-----------------------------------   
public :-
--------
public is an access modifier in java. The main method must be declared as public otherwise JVM cannot execute our main method or in other words JVM can't enter inside the main method for execution of the program.

If main method is not declared as public then program will compile but it will not be executed by JVM.

Note :- From java compiler point of view there is no rule (syntax rule) to declare our methods as public.   

------------------------------------------------------------------
static :
--------
As of now, In java we have 2 types of Methods :

 a) static method : Declared with static keyword
 b) non static method : Not declared with static keyword.

 static method (OBJECT IS NOT REQD) :
 ------------------------------------
 Case 1:
 --------
 Any static method we can call with the help of class name if the static method is declared in another class, Here Object is not
 required.
 
 public class Demo 
 {
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		Sample.greet();
	}
}

class Sample
{
	public static void greet()
	{
		System.out.println("Good Morning All");
	}
}

Case 2 :
---------
If a static method is declared in the same class where main method is available then we can call the static method directly, Here class name is also not required.

public class Welcome   
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome Batch 39!");
		m1();
	}
	
	public static void m1()
	{
		System.out.println("Hi I am m1 method");
	}
	
}

Our main method must be declared as static so object is not required, JVM can call this main method with the help of class name.
If we don't declare our main method as static then code will compile but it will not be executed by JVM.
-----------------------------------------------------------------
03-10-2024
----------
void :-
-------
It is a keyword. It means no return type. Whenever we define any method in java and if we don't want to return any kind of value from that particular method then we should write void before the name of the method.

Eg:

public void input()                        public int accept()
{                                           {
}                                               return 15;
					    }

Note :- In the main method if we don't write void or any other kind of return type then it will generate a compilation error.

In java whenever we define a method then compulsory we should define return type of method.(Syntax rule)

main method return type must be void because JVM will not accept any return value from the user.
-----------------------------------------------------------------
main() method :
---------------
It is a user-defined method because a user is responsible to define some logic inside the main method.

main() method is very important method because every program execution will start from main() method only, as well as the execution of the program ends with main() method only.
-----------------------------------------------------------------
Q) Can we write multiple method with same name ?
------------------------------------------------
Yes, We can write multiple methods with same name but parameter must be different otherwise code will not compile.

Note :- We can also write multiple main methods with different parameter but JVM will always execute the main method which takes String [] args (String array) as a parameter as shown in the program below.

public class Welcome   
{
	public static void main(String[] args) 
	{	
	  System.out.println("String array Variable");	 
	}	

	public static void main(int x) 
	{	
	  System.out.println("int Ordinary Variable ");	  
	}	
}

Output is : String array Variable
-----------------------------------------------------------------
String [] args :    
----------------
String is a predefined class in java available in java.lang package (just like header file) and args is an array variable 
of type String so, it can hold multiple values.

IQ :
----
Why the main method of java accepts String array as a parameter ?
-----------------------------------------------------------------
String is a collection of alpha-numeric character so it can accept all different kind of values. Java software people has
provided String array as a parameter so it can ACCEPT MULTIPLE 
VALUES OF DIFFERENT TYPE, that means providing more wider scope to accept hetrogeneous types of values.
-----------------------------------------------------------------
System.out.println() :
----------------------
It is an output statement in java, By using this statement we can print different types of values on the console. 

In this statement System is a predefined class available in java.lang pacakage, out is a reference variable of type PrintStream class available in java.io package and println() is 
a predefined method available in PrintStream class.

Note :Actually It is HAS-A relation concept, System class has 
PrintStream class as shown below.

class System
{
  final static PrintStream out;  //HAS-A Relation
}
================================================================
WAP in java to add two numbers :
--------------------------------
public class Addition 
{
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println(z);
	}
}

Here we are getting the output as 30 but it is not user-friendly message.
----------------------------------------------------------------
How to provide user-friendly message :
--------------------------------------
In order to provide user-friendly message to the end user we should use '+' operator i.e string concatenation operator.

Program
---------
public class AdditionWithMessage 
{
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println("Sum is :"+z);
	}
}
-----------------------------------------------------------------
WAP to add two numbers without using 3rd Variable
--------------------------------------------------
public class AdditionWithout3rdVariable 
{
	public static void main(String[] args) 
	{
		int x = 100;
		int y = 200;		
		System.out.println("Sum is :"+x+y); //100200
		System.out.println(+x+y); //300
		System.out.println(""+x+y);//100200
		System.out.println("Sum is :"+(x+y)); //Sum is 300
	}
}
----------------------------------------------------------------
04-10-2024
----------
IQ
--
public class StringConcatenationDemo 
{
	public static void main(String[] args) 
	{
		String str = 25 + 25 +"NIT"+ 50 + 50;
		System.out.println(str);
	}
}
----------------------------------------------------------------
Command Line Argument :
-----------------------
Whenever we pass any argument to the main method then it is called Command Line Argument. 

Example :

public static void main(String [] args) //Command Line Argument
{
}

By using comnmand line Argument, We can pass some value at runtime.

The advantage of command line argument is, single time compilation and number of times execution with different value.
=================================================================
//Program to accept the value from command line Argument
public class Command 
{
	public static void main(String[] args) 
	{
		System.out.println(args[0]);
	}
}

javac Command.java
java Command Scott Smith 
Output is : Scott
-----------------------------------------------------------------
//Program to pass some numberic value as a String value
public class CommandValue 
{
	public static void main(String[] cmd) 
	{
		System.out.println(cmd[1]);
	}
}

javac CommandValue.java
java CommandValue 100 200
Output is : 200
-----------------------------------------------------------------
//Accepting the full name from command Line Argument

public class FullNameUsingCommand
{
	public static void main(String[] name) 
	{
		System.out.println(name[0]);		
	}
}

javac FullNameUsingCommand.java
java FullNameUsingCommand "Virat Kohli"

Output : Virat Kohli
-----------------------------------------------------------------
public class Command 
{
	public static void main(String[] args) 
	{
		System.out.println("Command Line Argument!!!");
		System.out.println(args[0]); 
	}
}

javac Command.java
java Command        [Not passing any value at runtime]

While working with command line argument, if we are using the index in the program but not passing any value at runtime to
command line argument then we will get an exception 
java.lang.ArrayIndexOutOfBoundsException.
-----------------------------------------------------------------
How to find out the length of an array variable ?
--------------------------------------------------
In order to find out the length of an array variable, Arrays class has provided a predefined variable OR property called length as shown in the programs below.

//Finding the length of an array
public class ArrayLength 
{
	public static void main(String[] args) 
	{
		int []arr = {10, 20,30, 40};
		System.out.println(arr.length);
	}
}
-------------------------------------------------------------------
//Finding the length of an array by using Command Line Argument

public class ArrayLengthUsingCommand 
{
	public static void main(String[] args) 
	{
		System.out.println("The length of array is :"+args.length);
	}
}

javac ArrayLengthUsingCommand.java
java ArrayLengthUsingCommand
Output : The length of array is 0
java ArrayLengthUsingCommand 12 
Output : The length of array is 1
java ArrayLengthUsingCommand 12 14
Output : The length of array is 2
-------------------------------------------------------------------
//WAP to add two numbers by using Command Line Argument
public class CommandAdd 
{
	public static void main(String []args) 
	{
		System.out.println(args[0] + args[1]); 
	}
}

javac CommandAdd.java
java CommandAdd 100 200
Output is : 100 200 [Here '+' works as String Concatenation Optr]
===============================================================
How to convert a String into integer value :
--------------------------------------------
There is a predefined class called Integer available in java.lang pacakge, It provides a predefined static method called parseInt(String x) which accepts a single String type parameter and convert this String into int type becauase the return type of this parseInt(String x) method is int type.


public class CommandAddition 
{
	public static void main(String[] num) 
	{
		//Converting String to integer
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		
		int sum = a + b;
		
		System.out.println("The Sum is :"+sum);
		
	}
}

javac CommandAddition.java
java CommandAddition 12 12

Output : The Sum is 24 
---------------------------------------------------------------
Converting String to float
---------------------------
float f = Float.parseFloat(String x);

Converting String to double :
------------------------------
double d = Double.parseDouble(String x);
--------------------------------------------------------------05-10-2024
---------
WAP to find out the square of the number by using Command line Argument.

public class FindSquare 
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);
		System.out.println("Square of "+num+" is :"+(num*num));
	}
}

javac FindSquare.java
java FindSquare 12

output is : Square of 12 is 144
--------------------------------------------------------------
Eclipse IDE :
-------------
IDE stands for "Integrated Development Environment". By using eclipse IDE, we can develop, compile and execute our java program in a single window.

The main purpose of Eclipse IDE to reduce the development time, once the development time will be reduced then automatically the cost of the project will be reduced.

How to create a Project in Eclipse IDE :
----------------------------------------
File -> new -> Project OR Java Project -> Provide the name for
the project (Batch39) -> Finish 

What is a Package in java :
----------------------------
A package is nothing but folder in windows. It is used to arrange the classes and interfaces into a particular group.

If we arrange our java classes into a particular group by using pacakges (folders) then we will get the following two advantages :

1) Fast searching is possible.
2) Name can be reusable.

Program that describes a package is folder in windows :
--------------------------------------------------------
A package is a keyword in java and it must be the first statement of any java program.

package sum;
public class Addition
{
	
}  

Command for compilation of the classes which contains Package statement. 

[javac -d . FileName.java ]

javac  -d  .  Addition.java

It will compile Addition.java, Addition.java contains sum package, one package i.e folder called sum will be created and automatically Addition.class file will be placed inside the package or folder called sum.

Types of Packages :
---------------------------
1) Predefined OR Built-in package : The packages which are created by java software people for arranging the programs are called predefined package.

Example : java.lang, java.util, java.io, java.sql, java.net and so on

2) Userdefined Package OR Custom package : The packages which are created by user for arranging the user-defined programs are called user-defined package.

Example :
basic;
com.ravi.basic;
com.tcs.online_shopping;
---------------------------------------------------------------
WAP in eclipse IDE for finding the area of the circle :
-------------------------------------------------------
package com.ravi.command_line_Argument;

public class FindingAreaOfCircle {

	public static void main(String[] args) 
	{
		//Converting String to double
		 double radius = Double.parseDouble(args[0]);
		 final double PI = 3.14;  
		 
		 double area = PI * radius * radius;
		 System.out.println("Area of Circle is :"+area);
		 

	}

}

Steps to execute the command Line Argument Program using Eclipse IDE
---------------------------------------------------------------------
Right click on the program -> Run As -> Run configuration -> Check your main class name -> select argument tab -> pass the appropriate value -> Run
---------------------------------------------------------------
WAP to find out the area of rectangle :
----------------------------------------
package com.ravi.command_line_Argument;

public class AreaOfRectangle {

	public static void main(String[] args) 
	{
		int length = Integer.parseInt(args[0]);
		int breadth = Integer.parseInt(args[1]);
		
		int area = length * breadth;
		System.out.println("Area of rectangle is :"+area);

	}

}
--------------------------------------------------------------
WAP in java to pass some value from command line argument based on the following criteria :

If the array length is 0 : It should print length is 0
If the array length is 1 : It should find the cube of the number
if the array length is 2 : It should print sum of the number

package com.ravi.command_line_Argument;

public class ArrayCalculationOnLength {

	public static void main(String[] args) 
	{
		if(args.length==0)
		{
			System.err.println("Length is 0");
		}
		else if(args.length == 1)
		{
			int num = Integer.parseInt(args[0]);
			System.out.println("Cube of "+num+" is :"+(num*num*num));
		}
		else if(args.length ==2)
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int sum = a + b;
			System.out.println("Sum is :"+sum);
		}

	}

}
---------------------------------------------------------------
WAP to show how exactly Integer.parseInt works internally ?
------------------------------------------------------------
package com.ravi.command_line_Argument;

class Integer
{
	public static int getSquare(int num)
	{
		return num*num;
	}
	
	public static int getCube(int num)
	{
		return num*num*num;
	}
}

public class IntegerClassDemo
{
	public static void main(String[] args) 
	{
		int square = Integer.getSquare(10);
        System.out.println("Squre is :"+square);
        
        int cube = Integer.getCube(4);
        System.out.println("Cube is :"+cube);
	}

}
---------------------------------------------------------------
07-10-2024
----------
Naming convention in java ?
----------------------------
Naming convention provides two important characteristics :

 a) Standard Code (Industry accepted code)
 b) Readability of the code will enhance.
 
1) How to write a class in java :
----------------------------------
While writing a class in java, we should follow pascal naming convention, According to this each word first character must be capital and it should not contain any space. In java a class represents noun.

Example :
ThisIsExampleOfClass     

System
String 
Integer
CommandAddition
ArrayIndexOutOfBoundsException
DataInputStream.
 
2) How to write a method in java :
---------------------------------- 
While writing a method in java we should follow camel case  
naming convention, According to this naming convention first world will be in small and 2nd word onwards, each word first character must be capital. In java a method represents verb.

Example :
thisIsExampleOfMethod()
read()
readLine()
parseInt()
charAt()
toUpperCase()

3) How to write a field/variable in java :
-------------------------------------------
While writing a variable we should follow camel case naming convention but unlike method variable does not have () symbol.

Example :
----------
rollNumber    
customerName
customerBill
studentName
playerName

4) How to write a final and static variable :
---------------------------------------------
While writing the final and static variable we should follow snake_case naming convention.

Example :
Integer.MIN_VALUE  [MIN_VALUE is final and static variable]
Integer.MAX_VALUE  [MAX_VALUE is final and static variable]

5) How to write a package :
---------------------------
A package must be written in lower case only. Generally it is reverse of company name.

com.nit.basic
com.tcs.introduction
com.wipro.shopping

===============================================================
Tokens in java :
----------------
Token is the smallest unit of the program which is identified by the compiler.

Without token we can't complete statement or expression in java.

Token is divided into 5 types in java

  1) Keyword
  2) Identifier
  3) Literal
  4) Punctuators (Seperators)  
  5) Operator


Keyword
--------
A keyword is a predefined word whose meaning is already defined by the compiler.

In java all the keywords must be in lowercase only.

A keyword we can't use as a name of the variable, name of the class or name of the method.  

true, false and null look like keywords but actually they are literals.

As of now, we have 67 keywords in java.
--------------------------------------------------------------------
Identifiers :
--------------
A name in java program by default considered as identifiers.

Assigned to variable, method, classes to uniquely identify them.

We can't use keyword as an identifier.

Ex:-

class Fan 
{
   int coil  ;
   
   void switchOn()  
   {
   }
}

Here Fan(Name of the class), coil (Name of the variable) and switchOn(Name of the Method) are identifiers.

Rules for defining an identifier :
------------------------------------
1) Can consist of uppercase(A-Z), lowercase(a-z),  digits(0-9), $ sign, and underscore (_)
2) Begins with letter, $, and _
3) It is case sensitive
4) Cannot be a keyword
5) No limitation of length 
---------------------------------------------------------------
Literals :
----------
Any constant which we are assiging to variable is called Literal.

In java we have 5 types of Literals :

1) Integral Literal
2) Floating Point Literal
3) Boolean Literal
4) Character Literal
5) String Literal

Note : null is also a literal
---------------------------------------------------------------
Integral Literal :
------------------
If any numberic literal does not contain decimal or fraction
then it is called Integral Literal.
Example :  12, 89, 45 

In integral literal we have 4 data types :
 a) byte (8 bits)
 b) short (16 bits)
 c) int (32 bits)
 d) long (64 bits)

An integral literal we can represent in four different forms 

  1) Decimal Literal (Base 10)
  2) Octal Literal (Base 8)
  3) Hexadecimal Literal (Base 16)
  4) Binary Literal (Base 2) [Available from JDK 1.7v]

Decimal Literal :
-----------------
By default our numeric literals are decimal literal. Here base is 10 so, It accepts 10 digits i.e. from 0-9.

Example : 
int x = 20;
int y = 123;
int z = 234;

Octal Literal :
---------------
If any Integer literal starts with 0 (Zero) then it will become octal literal. Here base is 8 so it will accept 8 digits i.e 0 to 7.

Example :

int a = 018; //Invalid becuase it contains digit 8 which is out of range
int b = 0777; //Valid
int c = 0123; //Valid

Hexadecimal Literal :
---------------------
If any integric literal starts with 0X or 0x (Zero capital X Or 0 small x) then it is hexadecimal literal. Here base is 16 so it will accept 16 digits i.e 0 to 9 and A to F OR [a to f]

Example :

int x = 0X12; //Valid
int y = 0xadd; //Valid
int z = 0Xface; //valid
int a = 0Xage; //Inavlid because character 'g' out of range

Binary Literal :
---------------
If a numeric literal starts with 0B (Zero capital B) or 0b (Zero small b) then it will become Binary literal. Binary literal is available from JDK 1.7v.
Here base is 2 so it will accept 2 digits i.e 0 and 1.

Example :
----------
int x = 0B101; //valid
int y = 0b111; //Valid
int z = 0B112; //Invalis [2 is out of range]

The deafult type is decimal literal so to generate the output for any different literal JVM converts into decimal literal.
--------------------------------------------------------------

//Octal Litearl
public class OctalDemo
{
	public static void main(String [] args)
	{
           int x = 015;
	   System.out.println(x); //13
    }
}  

--------------------------------------------------------------
//Hexadecimal Litear
public class HexadecimalDemo 
{
	public static void main(String[] args) 
	{
		int a = 0xadd;
		System.out.println(a);//2781
	}
}
--------------------------------------------------------------
//Binary Literal
public class BinaryDemo 
{
  public static void main(String [] args)
  {
     int x = 0B101;  
	 System.out.println(x); //5
     
  }
}
--------------------------------------------------------------
08-10-2024
-----------
By default every integral literal is of type int only. byte and short are below than int so we can assign integral literal(Which is by default int type) to byte and short but the values must be within the range. [for Byte -128 to 127 and for short -32768 to 32767]

Actually whenever we are assigning integral literal to byte and short data type then compiler internally converts into corresponding type.

byte b = (byte) 12; [Compiler is converting int to byte]
short s = (short) 12; [Compiler is converting int to short]

In order to represent long value we should use either L OR l (Capital L OR Small l) as a suffix to integral literal.

According to IT industry, we should use L bacause l looks like digit 1.
-------------------------------------------------------------
/* By default every integral literal is of type int only*/
public class Test4
{
public static void main(String[] args)
	{
           byte b = 128; //error
	   System.out.println(b);
		
	   short s = 32768; //error
	   System.out.println(s);
    }
}
--------------------------------------------------------------
//Assigning smaller data type value to bigger data type
public class Test5
{
public static void main(String[] args)
	{
   	    byte b = 125;  
		short s = b;  //[Implicit OR Automatic OR Widening]
		System.out.println(s);
	}
}
-------------------------------------------------------------
//Converting bigger type to smaller type
public class Test6
{
public static void main(String[] args)
	{
		short s = 127; 
		byte b = (byte) s; //[Explicit OR Manual OR Narrowing]
		System.out.println(b);
	}
}
-------------------------------------------------------------
public class Test7
 {
 public static void main(String[] args)
 {
		byte x = (byte) 1L; 
		System.out.println("x value  = "+x);

		long l = 29L;
		System.out.println("l value  = "+l);

        int y =  (int) 18L; 
		System.out.println("y value  = "+y);
 
  }
 }   
-------------------------------------------------------------
Is java pure Object Oriented Language ?
---------------------------------------
No, Java is not a pure object oriented langauge because it is accepting primary data type, Actually any language which accepts primary data type is not a pure object oriented language.

Only Objects are moving in the network but not the primary data type so java has introduced Wrapper class concept to convert the primary data types into corresponding wrapper object.

Primary Data type           Wrapper Object
	byte		:	Byte
	short		:	Short
	int		:	Integer
	long		:	Long
	float		:	Float
	double		:	Double
	char		:	Character
	boolean		:	Boolean


Note : Apart from these 8 data types, Everything is an object in java so, if we remove all these 8 data types then java will become pure OOP language.
-------------------------------------------------------------
//Wrapper claases
public class Test8 
{
	public static void main(String[] args) 
	{
		Integer x = 24;  
		Integer y = 24;
		Integer z = x + y;
		System.out.println("The sum is :"+z);	
		
		Boolean b = true;
		System.out.println(b);

		Double d = 90.90;
		System.out.println(d);

		Character c = 'A';
		System.out.println(c);
	}
}
-------------------------------------------------------------
09-10-2024
----------
How to find out the minimum, maximum value as well as size of different data types :

The Warpper classes like Byte, Short, Integer and Long has provided predefined static and final variables to represent minimum value, maximum value as well as size of the respective data type.

Example : 

If we want to get the minimum value, maximum value as well as size of byte data type then Byte class (Wrapper class) has provided the following final and static variables

Byte.MIN_VALUE   : -128

Byte.MAX_VALUE   :  127

Byte.SIZE        :  8 (bits format)
-------------------------------------------------------------
 //Program to find out the range and size of Integeral Data type
public class Test9 
{
	public static void main(String[] args) 
	{
		System.out.println("\n Byte range:");
		System.out.println(" min: " + Byte.MIN_VALUE);
		System.out.println(" max: " + Byte.MAX_VALUE);
		System.out.println(" size :"+Byte.SIZE);
 
		System.out.println("\n Short range:");
		System.out.println(" min: " + Short.MIN_VALUE);
		System.out.println(" max: " + Short.MAX_VALUE);
		System.out.println(" size :"+Short.SIZE);

		System.out.println("\n Integer range:");
		System.out.println(" min: " + Integer.MIN_VALUE);
		System.out.println(" max: " + Integer.MAX_VALUE);
		System.out.println(" size :"+Integer.SIZE);

		System.out.println("\n Long range:");
		System.out.println(" min: " + Long.MIN_VALUE);
		System.out.println(" max: " + Long.MAX_VALUE);
		System.out.println(" size :"+Long.SIZE);
		
	}
}
-------------------------------------------------------------
Providing _ (underscore) in integeral Literal :
------------------------------------------------
In Order to enhance the readability of large numeric literals, Java software people has provided  _ (underscore) from JDK 1.7v. While writing the big numbers to separate the numbers we can use _

We can't start or end an integral literal with _ we will get compilation error.

//We can provide _ in integral literal
public class Test10 
{
	public static void main(String[] args) 
	{
	    long mobile = 98_1234_5678L;
		System.out.println("Mobile Number is :"+mobile);
	}
}
-------------------------------------------------------------
public class Test11 
{
	public static void main(String[] args) 
	{
		final int x = 127;  //instead of const we should use final 
		byte b = x;
		System.out.println(b);
	}
}

Note: It is a valid program will generate the output.
-----------------------------------------------------------------
var keyword in java :
---------------------
var keyword is introduced from java 10v. 
It can be used inside the method only.
It must be initialized in the same line where we are declaring the variable with var keyword.
It is also known as local variable type inference.

//var keyword [Introduced from java 10]
public class Test12 
{
	public static void main(String[] args) 
	{
		   var x = 12;		       
		   System.out.println(x);	
		   
		    x = 90;
			System.out.println(x);
			
			// x = "NIT";  //Invalid 
			
	}
}
-----------------------------------------------------------------
How to convert decimal number to Octal, Hexadecimal and Binary :
----------------------------------------------------------------
Integer class has provided the following static methods to convert decimal to octal, hexadecimal and binary.

1) public static String toBinaryString(int x) : Will convert the decimal into binary in String format.

2) public static String toOctalString(int x) : Will convert the decimal into octal in String format.

3) public static String toHexString(int x) : Will convert the decimal into hexadecimal in String format.

-----------------------------------------------------------------
// Converting from decimal to another number system
public class Test12 
{
      public static void main(String[] argv) 
      {
		   //decimal to Binary
           System.out.println(Integer.toBinaryString(7)); //111

		   //decimal to Octal  
           System.out.println(Integer.toOctalString(15)); //17

		   //decimal to Hexadecimal
           System.out.println(Integer.toHexString(2781)); //add 
		   
      }
}
=================================================================
floating point literal :
------------------------
If any numeric literal contains decimal or fraction then it is called floating point literal.
Example : 12.3, 90.7, 56.6

In floating point literal we have 2 data types :  
    a) float (32 bits)
    b) double (64 bits)

By default every floating point literal is of type double only so, the following statement will generate compilation error.
        float f1 = 1.2;  //Invalid
	
	
Even though every floating point literal is of type double only
but still compiler has provided the following two flavors to 
represent the double value explicitly just to enhance the 
readability of the code. 
           double d1 = 12D;
	   double d2 = 78d;

A floating point literal we can represnt in exponent form.
              double d1 = 15e2;  [15 X 10 to the power of 2]

	      
* An integral literal we can represent in four different forms i.e decimal, octal, hexadecimal and binary but floating point literal we can represent in only one form i.e decimal.

* An integral literal i.e byte, short, int and long we can assign to floating point literal but floating point literal we can't assign to integral literal.
-----------------------------------------------------------------
public class Test 
{
	public static void main(String[] args) 
	{
		float f = 2.0; //error
		System.out.println(f);				
	}
}
-----------------------------------------------------------------
public class Test1 
{
	public static void main(String[] args) 
	{		
		float b = 15.29F;
		float c = 15.25f;
		float d = (float) 15.30;

		System.out.println(b + " : "+c+ " : "+d);
       
	}
}
----------------------------------------------------------------
public class Test2 
{
	public static void main(String[] args) 
	{
		double d = 15.15;
		double e = 15d;
		double f = 15.15D;
		
		System.out.println(d+" , "+e+" , "+f);
	}
}
-----------------------------------------------------------------
public class Test3 
{
	public static void main(String[] args) 
	{
		 double x = 0129.89;  

		 double y = 0167;

		 double z = 0178; 

		System.out.println(x+","+y+","+z);
	}
}
----------------------------------------------------------------
class Test4 
{
	public static void main(String[] args) 
	{
		double x = 0X29;  

		double y = 0X9.15; //error 
		
		System.out.println(x+","+y);
	}
}
-----------------------------------------------------------------
public class Test5 
{
	public static void main(String[] args) 
	{
		double d1 = 15e-3;
		System.out.println("d1 value is :"+d1);		

		double d2 = 15e3;
		System.out.println("d2 value is :"+d2);		
	}
}
----------------------------------------------------------------
public class Test6 
{
	public static void main(String[] args) 
	{
		double a = 0791; //error

		double b = 0791.0; 

		double c = 0777;  

		double d = 0Xdead; 
		
		double e = 0Xdead.0; //error
	}
}
-----------------------------------------------------------------
public class Test7 
{
	public static void main(String[] args) 
	{
	   double a = 1.5e3;  
	   float b = 1.5e3; //error  
	   float c = 1.5e3F; 	   
	   double d = 10; 	   
	   int e = 10.0; //error   
	   long f = 10D; //error  
	   int g = 10F;   //error  
	   long l = 12.78F; //error  
	}
}
-----------------------------------------------------------------
//Range and size of floating point literal 
public class Test8 
{
	public static void main(String[] args)    
	{
		System.out.println("\n Float range:");
		System.out.println(" min: " + Float.MIN_VALUE);
		System.out.println(" max: " + Float.MAX_VALUE); 
		System.out.println(" size :"+Float.SIZE);

		System.out.println("\n Double range:");
		System.out.println(" min: " + Double.MIN_VALUE);
		System.out.println(" max: " + Double.MAX_VALUE);
		System.out.println(" size :"+Double.SIZE);
	}
} 
-----------------------------------------------------------------
14-10-2024
----------

Boolean literal :
-----------------
It is used to represent two states i.e true or false.

 Example :  boolean isValid = true;
            boolean isEmpty = false;

In boolean literal we have only one data type i.e boolean data type which accepts 1 bit of memory as well as it depends upon JVM implementation.


Unlike C and C++, we can't assign integral literal to boolean 
data type.

   boolean b = 0; [Valid in C language but Invalid in java]
   boolean c = 1; [Valid in C language but Invalid in java]


We can't assign String literal to boolean data type.

     boolean b = "true";  //Invalid
     
---------------------------------------------------------------
//Programs :
------------
public class Test1
{
    public static void main(String[] args)
    {
        boolean isValid = true;   
        boolean isEmpty = false;
		
        System.out.println(isValid);
        System.out.println(isEmpty);
     }
}
---------------------------------------------------------------
public class Test2
{
    public static void main(String[] args)
    {
	boolean c = 0; //Invalid
        boolean d = 1; //Invalid
        System.out.println(c);
        System.out.println(d);       
    }
}
--------------------------------------------------------------
public class Test3 
{
	public static void main(String[] args) 
	{
		boolean x = "true";  
		boolean y = "false";  
		System.out.println(x);
        System.out.println(y); 
	}
}
---------------------------------------------------------------
Char Literal :
--------------
It is also known as Character Literal.

In character Literal we have only one data type i.e char data type which accepts 16 bits of memory.

We can represent character literal by using the following ways :

  a) Single Character enclosed with single quotes.

     Example : char ch = 'A';

  b) In older languages like C and C++, which supports ASCII format and the range is 0 - 255, On the other hand java supports UNICODE format where the range is 0 - 65535. [0 is the minimum range and 65535 is the maximum range]
  
            char ch1 = 65535;  //Valid
	    char ch2 = 65536;  //Invalid  
	    
  c) We can assign character literal to integral literal to know  the UNICODE numeric value of that particular character.
                  
	          int x = 'A';    [UNICODE = ASCII + NON ASCII]


  d) We can also represent a char literal in 4 digit hexadecimal number where the format is 
     
                      '\udddd'   [Hexadecimal format]
		       
		       Here u menas Unicode and d represents
		       digits.	       
		       

   In this hexadecimal format the range is given below :
   
                '\u0000'   [Minimum Range]
		
		'\uffff'   [Maximum Range]


   e) All the escape sequences are also represented as a char
      literal
      
              char c = '\n';

---------------------------------------------------------------
public class Test1 
{
	public static void main(String[] args) 
	{
		char ch1 = 'a';
		System.out.println("ch1 value is :"+ch1); 

		char ch2 = 97;   
		System.out.println("ch2 value is :"+ch2); 
      
		
	}
}
--------------------------------------------------------------
public class Test2 
{
	public static void main(String[] args) 
	{
		int ch = 'A';
		System.out.println("ch value is :"+ch);
	}
}
---------------------------------------------------------------
//The UNICODE value for ? character is 63 
public class Test3 
{
	public static void main(String[] args) 
	{
		char ch1 = 63;  
		System.out.println("ch1 value is :"+ch1);
		
		char ch2 = 64;  
		System.out.println("ch2 value is :"+ch2); 

		char ch3 = 65; 
		System.out.println("ch3 value is :"+ch3); 
	}
}
--------------------------------------------------------------
public class Test4 
{
	public static void main(String[] args) 
	{
		char ch1 = 45789;
        System.out.println("ch1 value is :"+ch1); 

		char ch2 = 0Xadd;  		
		System.out.println("ch2 value is :"+ch2); 
		
		
	}
}

Note : We will get the output as ? because the equivalant language translator is not available in the System.
---------------------------------------------------------------
//Addition of two character in the form of Integer
public class Test5
{
public static void main(String txt[])
  {
	int x = 'A'; 
    int y = 'B';
    
	System.out.println(x + y);
	System.out.println('A'+'A');   
   } 
} 
--------------------------------------------------------------
//Range of UNICODE Value (65535) OR '\uffff'
class Test6 
{
	public static void main(String[] args) 
	{
		char ch1 = 65535; 
		System.out.println("ch value is :"+ch1);

		char ch2 = 65536; //error
		System.out.println("ch value is :"+ch2);
	}
}
---------------------------------------------------------------
//WAP in java to describe unicode representation of char in hexadecimal format
public class Test7 
{
	public static void main(String[] args) 
	{
		int ch1 = '\u0000'; 
		System.out.println(ch1);

		int ch2 = '\uffff'; 
		System.out.println(ch2);

		char ch3 = '\u0041'; 
        System.out.println(ch3); //A  

		char ch4 = '\u0061';
		System.out.println(ch4); //a
	}
}
---------------------------------------------------------------
class Test8 
{
	public static void main(String[] args) 
	{
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';

		System.out.println("c1 = "+c1+", c2 ="+c2+", c3 ="+c3);
	}
}
---------------------------------------------------------------
class Test9 
{
	public static void main(String[] args) 
	{
		int x = 'A';
		int y = '\u0041';
		System.out.println("x = "+x+" y ="+y);
	}
}
---------------------------------------------------------------
//Every escape sequence is char literal
class Test10 
{
	public static void main(String [] args) 
	{
		char ch ='\n';
		System.out.println("Hello");
		System.out.println(ch);
		
	}
}
--------------------------------------------------------------
public class Test11  
{
	public static void main(String[] args) 
	{
		System.out.println(Character.MIN_VALUE); //white space
		System.out.println(Character.MAX_VALUE); //?
		System.out.println(Character.SIZE); //16 bits
		
	}
}
------------------------------------------------------------
String Literal :
-----------------
String is a predefined class available in java.lang Package.

String is a collection of alpha-nemeric character which is enclosed by double quotes. These characters can be alphabets, numbers, symbol or any special character.

In Java, String can be created by using 3 ways :

1) By using String Literal :
   String str1 = "India";
   
2) By using new keyword :
   String str2 = new String("Hyderabad");
   
3) By using Character Array      [Old Technique]
   char ch[] = {'R', 'A', 'J'};
---------------------------------------------------------------
//Three Ways to create the String Object
public class StringTest1 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello World";       //Literal
		System.out.println(s1);

		String s2 = new String("Ravi"); //Using new Keyword
		System.out.println(s2);

		char s3[] = {'H','E','L','L','O'}; //Character Array 
		System.out.println(s3);

	}
}
---------------------------------------------------------------
//String is collection of alpha-numeric character
public class StringTest2 
{
	public static void main(String[] args) 
	{
		String x="B-61 Hyderabad";
		System.out.println(x);
		
		String y = "123";  
		System.out.println(y);

		String z = "67.90";       
		System.out.println(z);

		String p = "A";        
		System.out.println(p);
	}
}
--------------------------------------------------------------
//IQ
public class StringTest3
{
	public static void main(String []args)
	{		
		String s = 15+29+"Ravi"+40+40; 
		System.out.println(s);	
		
	}
}
---------------------------------------------------------------
4) Punctuators :
----------------
It is  also called separators.

It is used to inform the compiler how things are grouped in the code.

()  {}   []   ;   ,   .   @   … (var args)  
---------------------------------------------------------------
5) Operators      
------------
It is a symbol which describes that how a calculation will be performed on operands. 

Types Of Operators :
------------------------
1) Arithmetic Operator (Binary Operator)

2) Unary Operators

3) Assignment Operator

4) Relational Operator

5) Logical Operators (&&  ||  !)  

6) Boolean Operators (&  |)

7) Bitwise Operators (^  ~)

8) Ternary Operator

*9) Member Operator( Dot . Operator)

*10) new Operator

*11) instanceof Operator [It is also relational operator]
---------------------------------------------------------------
15-10-2024
-----------
Basic Concepts of Operators :
-----------------------------
class Test 
{
	public static void main(String[] args) 
	{
        int x = 15;
		int y = x++;
		System.out.println(x + " : "+ y);
	}
}
---------------------------------------------------------------
class Test 
{
	public static void main(String[] args) 
	{
        int x = 15;
		int y = --x;
		System.out.println(x + " : "+ y);
	}
}
--------------------------------------------------------------
class Test 
{
	public static void main(String[] args) 
	{
                int x = 15;
		int y = ++5; //error
		System.out.println(x + " : "+ y);
	}
}
---------------------------------------------------------------
class Test 
{
	public static void main(String[] args) 
	{
        int x = 5;
	    int y = ++(++x); //error
	    System.out.println(x +": "+y);
	}
}
--------------------------------------------------------------
class Test 
{
	public static void main(String[] args) 
	{
        char ch = 'A';
	    ch++;
	    System.out.println(ch);
	}
}
---------------------------------------------------------------
class Test 
{
	public static void main(String[] args) 
	{
        double d1 = 12.12;
	    d1++;
	    System.out.println(d1);
	}
}

Note : Increment and decrement operator we can apply on any primitive data type except boolean.
---------------------------------------------------------------
Local Variable in java ?
-------------------------
If we declare a variable inside a method OR block OR Constructor then it is called local/Automatic/Temporary/Stack variable.

Example :

public void m1()
{
   int x = 100;  //Local Variable
}

A local variable must be initialized by the developer before use because local variable does not have default values.

We can't apply any kind of access modifier on local variable except final. 

As far as it's accessibility is concerned, It is accessible within the same method only.

A local variable we can't use without pre declaration.

 public static void main(String[] args) 
 {
	System.out.println(x); //error
	int x = 100;		
 }

Program :
----------
class Test 
{
	public static void main(String[] args) 
	{
		 final int x = 100;	
		 System.out.println(x);
		
	}	 
}
---------------------------------------------------------------
Why we can't use a local variable outside of the method OR block OR Constructor ?
----------------------

In java, Every methods are executed in a special memory called
Stack Memory.

Stack Memory works on LIFO (Last In First Out) basis.

In java, Whenever we call a method then a separate Stack Frame will be created for each and every method.[15-OCT]

Once the method execution is over then the corresponding method 
Stack frame will also be deleted from Stack Area, that is the reason we can't use local variable outside of the method. 

Each stack frame contains 3 parts :
   1) Local Variable Array
   2) Frame Data
   3) Operand Stack

Program that describes method Execution in Stack memory :
---------------------------------------------------------
package com.ravi.method_demo;

public class MethodExecution {

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started!!!");		
		m1();		
		System.out.println("Main Method Ended!!!");
	}

	public static void m1() 
	{
		System.out.println("m1 Method Started!!!");		
		m2();		
		System.out.println("m1 Method Ended!!!");
	}
	
	public static void m2() 
	{
		System.out.println("Hii I am m2 method");			
	}
}
---------------------------------------------------------------
Limitation of Commnd line Argument ?
-------------------------------------
As we know by using Command Line Argument, we can pass some value at runtime, These values are stroed in String array variable and then only the exceution of the program will be started.
In Command line Argumenet we can't ask to enter the value from our end user as shown in the Program.

package com.ravi.method_demo;

public class CommandLimitation 
{
	public static void main(String[] args)
	{
		System.out.print("Enter your Gender :");
		char gender = args[0].charAt(0);
		System.out.println("Your Gender is :"+gender);

	}

}

Note : In the above program, after providing the gender value, It is asking for Gender which is not a recommended way.

Note : charAt(int index) is a predefined method of String class
       which will retrieve the character based on the index
       position and the return type of this method is char.
       
       public char charAt(int index)
===============================================================
How to read the data from the End use with user friendly mesasage :

There are so many ways to read the data from end user which are as follows :

1) java.io.DataInputStream
2) java.io.BufferedReader
3) System.in.read();
4) java.io.Console
5) java.util.Sacnner

How to read the data by using java.util.Scanner class :
--------------------------------------------------------
java.util.Scanner is a predefined class to read the data from the clinet with user-friendly message available from JDK 1.5v.

static variables of System class :
-----------------------------------
System class has provided 3 final and static variables which are as follows :

1) System.out : Used to print normal message.

2) System.err : Used to print error message.

3) System.in : Used to read the data from the Source.

How to create the Object for Scanner class :
---------------------------------------------
Scanner sc = new Scanner(System.in);

Methods of Scanner class :
---------------------------
1) public String next() : Used to read a Single Word.

2) public String nextLine() : Used to read multiple words or 
                              complete line.
			      
3) public byte nextByte() : Used to read byte value.

4) public short nextShort() : Used to read short value.

5) public int nextInt() : Used to read int value.

6) public long nextLong() : Used to read long value.

7) public float nextFloat() : Used to read float value.

8) public double nextDouble() : Used to read double value.

9) public boolean nextBoolean() : Used to read boolean value.

10) public char next().charAt(0) : Used to read character value
---------------------------------------------------------------
16-10-2024
-----------
WAP to read a name from the Scanner class.
------------------------------------------
import java.util.Scanner;
public class ReadName 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter your Name :");
		String name =  sc.nextLine();
		System.out.println("Your Name is :"+name);
	}
}
---------------------------------------------------------------
//WAP to read a character from Scanner class

package com.ravi.scanner_demo;

import java.util.Scanner;

public class ReadCharacter 
{
	public static void main(String[] args) 
	{
		var sc = new Scanner(System.in);
		System.out.print("Enter a Character :");
		char gen = sc.next().charAt(0);
		System.out.println("Your Gender is :"+gen);
                sc.close();
	}

}
---------------------------------------------------------------
//WAP to read employee data using Scanner class

package com.ravi.scanner_demo;

public class ReadEmployeeData {

	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
				
		System.out.print("Enter Employee Id :");
		int id = sc.nextInt(); //123 
		
		System.out.print("Enter Employee Name :");
		String name = sc.nextLine(); //Buffer Problem	
		name = sc.nextLine();
		
		System.out.println("Printing Employee Data");
		
		System.out.println("Employee Id is :"+id);
		System.out.println("Employee Name is :"+name);
		sc.close();
		
		
	}

}
---------------------------------------------------------------
Expression Conversion :
-----------------------
Whenever we are working with Arithmetic Operator (+,-,*,/,%) or unary minus operator, after expression exeution the result will be converted (Promoted) to int type, Actually to store the result minimum 32 bits format is required.


class Test 
{
	public static void main(String[] args) 
	{      
		byte b = 1;
		byte c = 2;
		byte d = b + c; //error
		System.out.println(d);
		
	}
	
}

After Arithmetic operator expression the result will be promoted to int type so, to hold the result minimum 32 bit data is required.
---------------------------------------------------------------
class Test 
{
	public static void main(String[] args) 
	{      
		byte b = 1;
		byte c = 2;
		byte d = (byte)(b + c);  //Valid
		System.out.println(d);
		
	}
	
}
--------------------------------------------------------------
Unary Minus Operator :
-----------------------
class Test 
{
	public static void main(String [] args) 
	{	
		int x = 15;
		System.out.println(-x);
	}
	
	
}
---------------------------------------------------------------
class Test 
{
	public static void main(String [] args) 
	{	
		byte b = 1;
		short c = -b; //error
		System.out.println(c);

	}
	
}

In Arithmetic operator OR Unary minus operator, the result will be promated to int type (32 bits) so to hold the result int data type is reqd.
---------------------------------------------------------------
class Test 
{
	public static void main(String [] args) 
	{	
		byte b = 1;
		b += 2;  	
		System.out.println(b);

	}
	
}
In the above program we are using short hand operator so we will get the result in byte format also.
---------------------------------------------------------------
class Test 
{
	public static void main(String [] args) 
	{	
		  int z = 5;
		  if(++z > 5 || ++z > 6)   //Logical OR
		  {
			  z++;
		  }
		  System.out.println(z);  //7

         System.out.println("................");

		  z = 5;
		  if(++z > 5 | ++z > 6)   //Boolean OR
		  {
			  z++;
		  }
		  System.out.println(z); //8

	}
	
}
--------------------------------------------------------------
Program on Boolean AND operator :
----------------------------------
class Test 
{
	public static void main(String [] args) 
	{	
		int z = 5;
		if(++z > 6 & ++z> 6)
		{
			System.out.println("Inside If");
			z++;			
		}
		System.out.println(z);

	}
	
}
---------------------------------------------------------------
Working with Bitwise AND(&), Bitwise OR(|) and Bitwise X-OR (^) :
---------------------------------------------------------------
class Test 
{
	public static void main(String [] args) 
	{	
		System.out.println(false ^ true);
	}	
	
}

Note : If both the inputs are alternate of each other then we will get true otherwise we will get false.[Same input output will be false]

----------------------------------------------------------------
class Test 
{
	public static void main(String [] args) 
	{	
		System.out.println(5 & 6); //4
		System.out.println(5 | 6); //7
		System.out.println(5 ^ 6); //3
		

	}
	
}
---------------------------------------------------------------
Bitwise Complement Operator (~) :
---------------------------------
It will not work with boolean type.

public class Test 
{
	public static void main(String [] args) 
	{	
		System.out.println(~true);//error	

	}
	
}  
----------------------------------------------------------------
class Test 
{
	public static void main(String [] args) 
	{			
		System.out.println(~-5); // 4	
		System.out.println(~5);  //-6
		
	}
	
}
----------------------------------------------------------------
Member access operator (.) :
-----------------------------
It is called Member access operator, by using this we can access the member of the class.
In the following program we have static method in the Welcome class, in order to call the static method we can use Welcome class and to access the static method of Welcome class we should use .(Dot) operator.

package com.ravi.operator;

class Welcome
{
	static int x = 100;
	public static void greet()
	{
		System.out.println("Hello batch 39");
	}	
}

public class MemberAccessOperator 
{
	public static void main(String[] args)
	{		
      System.out.println(Welcome.x);
      Welcome.greet();
	}

}
----------------------------------------------------------------
new Keyword :
-------------
It is also an operator.
It is used to create the object and initialize the non static member with default value.

package com.ravi.operator;

class Welcome
{
	int x = 100;  //non static variable
	public  void greet() //non static method
	{
		System.out.println("Hello batch 39");
	}	
}

public class MemberAccessOperator 
{
	public static void main(String[] args)
	{		
        Welcome w = new Welcome();
        System.out.println(w.x);
        w.greet();
	}

}
----------------------------------------------------------------
17-10-2024
-----------
What is drawback of if condition :-
---------------------------------------
The major drawback with if condition is, it checks the condition again and again so It increases the burdon over CPU so we introduced switch-case statement to reduce the overhead of the CPU.


Switch case statement in java :
-------------------------------
It is a selective statement so, we can select one statement among the available statements.

break is optional but if we use break then the control will move from out of the switch body.

We can write default so if any statement is not matching then default will be executed.

In switch case we can't pass long, float and double and boolean value.

[long we can pass in switch case from java 14v]

We can pass String from JDK 1.7v and we can also pass enum from JDK 1.5v. 
----------------------------------------------------------------
import java.util.*;
public class SwitchDemo 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Character :"); 
		char colour = sc.next().toLowerCase().charAt(0); 
		

		switch(colour)      
		{
		case 'r' : System.out.println("Red") ; break;
		case 'g' : System.out.println("Green");break;
		case 'b' : System.out.println("Blue"); break;
		case 'w' : System.out.println("White"); break;
		default : System.out.println("No colour");
		}
		System.out.println("Completed") ;
	}
}

----------------------------------------------------------------
import java.util.*;
public class SwitchDemo1
{
public static void main(String args[]) 
  {	
		System.out.println("\t\t**Main Menu**\n");	
		System.out.println("\t\t**100 Police**\n");
		System.out.println("\t\t**101 Fire**\n");
		System.out.println("\t\t**102 Ambulance**\n");
		System.out.println("\t\t**139 Railway**\n");
		System.out.println("\t\t**181 Women's Helpline**\n");		

		System.out.print("Enter your choice :");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();	
		
		switch(choice)
		{
		case 100:
		System.out.println("Police Services");
		break;
		case 101:
		System.out.println("Fire Services");
		break;
		case 102:
		System.out.println("Ambulance Services");
		break;
		case 139:
		System.out.println("Railway Enquiry");
		break;
		case 181:
		System.out.println("Women's Helpline ");
		break;
		default:
		System.out.println("Your choice is wrong");		
		} 
    }
}
----------------------------------------------------------------
import java.util.*;
public class SwitchDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the season :");
		String season = sc.next().toLowerCase();

		switch(season)  //String allowed from 1.7
		{
			case "summer" :
				 System.out.println("It is summer Season!!");
			 break;

			 case "rainy" :
				 System.out.println("It is Rainy Season!!");
			 break;
		}
	}
}
----------------------------------------------------------------

public class Test2 
{
	public static void main(String[] args) 
	{
		double val = 1;
		switch(val)  //Error, can't pass long, float and double
		{
			 case 1:
				 System.out.println("Hello");
			 break;
		} 
	}
}
----------------------------------------------------------------
public class Test 
{	
	public static void main(String[] args) 
	{	
	   float l = 12L;

	   switch(l)
		{
           case 12 :
			   System.out.println("It is case 12");
		   break;
		}
	}

}

Note : We can't pass float and double value.
-----------------------------------------------------------------------
public class Test 
{	
	public static void main(String[] args) 
	{	
	        int x = 12;
		int y = 12;

	   switch(x)
		{
                   case y :  //error
			   System.out.println("It is case 12");
		   break;
		}
	}

}

Note : In the label of switch we should take constant value.
------------------------------------------------------------------------
public class Test 
{	
	public static void main(String[] args) 
	{	
	        int x = 12;
		final int y = 12;

	   switch(x)
		{
           case y :
			   System.out.println("It is case 12");
		   break;
		}
	}

}
-----------------------------------------------------------------------
public class Test 
{	
	public static void main(String[] args) 
	{	
	   byte b = 90;

	   switch(b)
		{
           case 128 :  //error
			   System.out.println("It is case 127");
		   break;
		}
	}

}

Note : Value 128 is out of the range of byte and same applicable for short data type
----------------------------------------------------------------
Loops in java :
---------------
A loop is nothing but repeatation of statements based on the 
specified condition.

In java we have 4 types of loops :
----------------------------------
1) do-while loop
2) while loop
3) for loop
4) for each loop


do-while loop :
----------------
class Test 
{	
	public static void main(String [] args) 
	{
        do
        {
			int x = 1;  //block [Local Variable]
			System.out.println(x);
			x++;
        }
        while (x<=10);	//error	
	}
	
}

Note : x variable is declared inside the do block so we can't use outside of the block.
----------------------------------------------------------------
class Test 
{	
	public static void main(String [] args) 
	{
	 int x = 1;  
        do
        {		
			System.out.println(x);
			x++;
        }
        while (x<=10);		
	}
	
}
----------------------------------------------------------------
Progran on while loop :
-----------------------
class Test 
{	
	public static void main(String [] args) 
	{
		int x = 10;
		while(x>=-1)
		{
			System.out.println(x);
			x--;
		}
	}
	
}

---------------------------------------------------------------
Program on for loop :
---------------------
public class ForLoop 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=10; i++)
		{
                   System.out.println(i);
		}
	}
}
----------------------------------------------------------------
for-each loop in java :
------------------------
It is also known as enhaned for loop, introduced from JDK 1.5

It is used to retrieve the value from the Collection like array.

It will fetch the values one be one from the Collection data so, It is known as for each loop.
----------------------------------------------------------------
import java.util.*;
public class ForEachDemo1 
{	
	public static void main(String [] args) 
	{
		int []arr = {50,40,30,20,10};
		
		Arrays.sort(arr);     
		
		for(int x : arr)   
		{
			System.out.println(x);
		}	
	}
	
}

How to sort Array data :
--------------------------
In java.util pacakge, there is a predefined class called Arrays which has various static methods to sort the array in ascending or alphabetical order.

Example :
           Arrays.sort(int []arr);  //For sorting int array
	   Arrays.sort(Object []arr) //For sorting String array
	   
	   	   
public class ForEachDemo2 
{
	public static void main(String[] args) 
	{
		String cities[] = {"Hyd","Pune","Ajmer","Mumbai"};
		
		java.util.Arrays.sort(cities);
		
		for(String city : cities)
		{
			System.out.println(city);
		}		
	}
}
---------------------------------------------------------------
In java, Array can also take hetrogeneous by using Object class.

public class ForEachDemo3 
{
	public static void main(String[] args) 
	{
		Object []arr = {12, 90.90, 'A', "NIT", new String("Hyd")};
		
			
		for(Object x : arr)
		{
			System.out.println(x);
		}
	}
}

Note : By using Object array we can also take hetrogeneous types 
of datain java array but these data can't be sorted, If we try to sort then we will get a runtime Exception i.e java.lang.ClassCastException.
---------------------------------------------------------------
18-10-2024
-----------
What is BLC and ELC class in java ?
------------------------------------
BLC :
------
BLC statnds for Business Logic class, In this class we are responsible to write the logic. This class will not contain main method.
The main purpose of this BLC class to reuse this class in various packages.

Example :
----------
//BLC
public class Calculate
{
  //Here We are responsible to write the logic
}

ELC :
-----
It stands for Executable Logic class, It will not contain any logic but the execution of the program will start from this ELC class because it contains main method.

Example :
---------
//ELC
public class Main
{
  public static void main(String [] args)
  {
  }
}
----------------------------------------------------------------
How to reuse a class in java ?
-------------------------------
The slogan of java is "WORA" write once run anywhere.

A public class created in one package can be reuse from different packages also by using import statement.

In a single java file, we can declare only one public class that must be our .java file and that class can be reusable to all the packages.

*In a single java file, we can write only one public class and multiple non-public classes but it is not a recommended approach because the non public class we can use within the same package only.

So the conclusion is, we should declare every java class in a separate file to enhance the reusability of the BLC classes.
[Note we have 10 classes -> 10 java files]

Program that describes how to reuse a java BLC class in another package :

Here we have 2 packages :
-------------------------
 1) com.nit.m1
 2) com.nit.m2

Calculate.java [BLC]
---------------------
package com.nit.m1;

//BLC
public class Calculate 
{
   public static void getSquare(int x)
   {	  
	   System.out.println("Square of "+x+" is :"+(x*x));
   }
}

Arithmetic.java [BLC]
----------------------
package com.nit.m1;

public class Arithmetic  
{
	public static void doSum(int x, int y)
	{
		System.out.println("Sum is :"+(x+y));
	}
}

Now we will write an ELC class in another package to reuse these 
BLC classes which are declared in com.nit.m1 package.

ELC.java [ELC]
---------------
package com.nit.m2;

import com.nit.m1.Arithmetic;
import com.nit.m1.Calculate;

public class ELC 
{
	public static void main(String[] args) 
	{
		Calculate.getSquare(12);
		System.out.println("........");
		Arithmetic.doSum(100, 200);
       
	}

}
-----------------------------------------------------------------
How many .class file will be created in the above approach :
------------------------------------------------------------
For a public class in a single file, Only 1 .class file will be created.

For a public class in a single file which contains n number of non public classes then compiler will generate n (number of .java) number of .class file.

Example :
----------
public class Test  
{
	
}

class A
{
}

class B
{
}

class C
{
}

Note : Here total 4 .class file will be generated.
-----------------------------------------------------------------
Working with static method and method return type :
---------------------------------------------------
static method :
---------------
If a method is declared with static keyword (like main method) then it is called static method.

In order to call a static method, Object is not required, We can call static method directly with the help of class name.

-----------------------------------------------------------------
//A static method can be directly call within the same class
package com.ravi.pack1;

public class Test1
{
	public static void main (String[] args)
	{
		square(5); 	    
	}

	public static void square(int x)
	{  
	  System.out.println("Square is :"+(x*x));
	}
}
	
Note : Any static method defined in the ELC class, we can direcytly call from main method.
-----------------------------------------------------------------
2 files :
----------
GetSquare.java
---------------
package com.ravi.pack2;

//BLC
public class GetSquare 
{
   public static void getSquareOfNumber(int num)
   {
	   System.out.println("Square of "+num+" is :"+(num*num));
   }
}

Test2.java
-----------
package com.ravi.pack2;

import java.util.Scanner;

//ELC
public class Test2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side :");
		int side = sc.nextInt();		
		GetSquare.getSquareOfNumber(side);
		sc.close();
		
	}
}

Note : In the above program there is no communication from BLC module to ELC module, ELC module is sending the value to BLC module but BLC module is not returining any kind of value.
-----------------------------------------------------------------
2 files :
---------
FindSquare.java
-----------------
//A static method returning integer value 
package com.ravi.pack3;

//BLC
public class FindSquare
{
	public static int getSquare(int x)
	{
		return (x*x);
	}
}

Test3.java
-----------
package com.ravi.pack3;

import java.util.Scanner;

//ELC
public class Test3
{
	public static void main (String[] arg)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of side :");
		int side = sc.nextInt();
		
	    int value = FindSquare.getSquare(side);
	    System.out.println("Square of "+side+" is :"+value);
	    sc.close();
	}
}
-----------------------------------------------------------------
2 files :
---------
Calculate.java
---------------
/*Program to find out the square and cube of 
  the number by following criteria
 * 
a) If number is 0 or Negative it should return -1
b) If number is even It should return square of the number
c) If number is odd It should return cube of the number
*/

package com.ravi.pack4;

//BLC
public class Calculate 
{
  public static int getSquareAndCube(int num)
  {
	  if(num <=0)
	  {
		  return -1;
	  }
	  else if(num%2==0)
	  {
		  return num*num;
	  }
	  else
	  {
		  return num*num*num;
	  }
  }
  
}

Test4.java
------------
package com.ravi.pack4;

import java.util.Scanner;

public class Test4 
{	
   public static void main(String[] args) 
   {
	 Scanner sc = new Scanner(System.in);	 
	 System.out.print("Enter a number :");
	 int num = sc.nextInt();
	
	int squareAndCube = Calculate.getSquareAndCube(num);
	System.out.println("Result is :"+squareAndCube);
	sc.close();
	 
   }	
	
}
-----------------------------------------------------------------
2 files :
----------
Rectangle.java
---------------
package com.ravi.pack5;

//BLC
public class Rectangle 
{	
  public static double getAreaOfRectangle(double length, double breadth)
  {	  
	  return (length * breadth);
  }
  
}


Test5.java
-----------
package com.ravi.pack5;

import java.util.Scanner;

public class Test5 
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the length of the Rect :");
	  double length = sc.nextDouble();
	  
	  System.out.print("Enter the breadth of the Rect :");
	  double breadth = sc.nextDouble();
	  
	  
	  double areaOfRectangle = Rectangle.getAreaOfRectangle(length, breadth);
	  
	  System.out.printf("Area of Rectangle is :%.2f",areaOfRectangle);
	  sc.close();
	  
	}
}

-----------------------------------------------------------------
2 files :
----------
EvenOrOdd.java
--------------
package com.ravi.pack6;

//BLC
public class EvenOrOdd 
{
	public static boolean isEven(int num)
    {
        return (num % 2 == 0);
    }
}

Test6.java
-----------
package com.ravi.pack6;

import java.util.Scanner;

//ELC
public class Test6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();
		
	    boolean isEven = EvenOrOdd.isEven(num);
	    System.out.println(num+" is Even ?:"+isEven);
	    
	    System.out.print("Enter another Number :");
		num = sc.nextInt();
	    
	    isEven = EvenOrOdd.isEven(num);
	    System.out.println(num+" is Even ?:"+isEven);
	    sc.close();
	}

}
----------------------------------------------------------------
2 files :
----------
Circle.java
-------------
//Area of Circle
//If the radius is 0 or Negative then return -1.

package com.ravi.pack7;
public class Circle 
{
  public static String getAreaOfCircle(double radius)
  {		 
	  if(radius <=0)
	  {
		  return ""+(-1);
	  }
	  else
	  {
		  final double PI = 3.14;
		  double areaOfCircle = PI * radius * radius;
		  return ""+areaOfCircle;
	  }
	  
  }
}
Test7.java
------------

package com.ravi.pack7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test7 
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius :");
		double radius = sc.nextDouble();
		
		String areaOfCircle = Circle.getAreaOfCircle(radius);	
		System.out.println(areaOfCircle);
		
		sc.close();
		
		
	
	}
}
-----------------------------------------------------------------
19-10-2024
-----------
2 files :
----------
Student.java
------------
package com.ravi.pack8;

//BLC
public class Student 
{
 public static String getStudentDetails(int roll, String name, double fees)
  {
	//[Student name is : Ravi, roll is : 101, fees is :1200.90] 
	 
	 return "[Student name is :"+name+", roll is :"+roll+", fees is :"+fees+"]";
  } 
 
}

Test8.java
-----------
package com.ravi.pack8;

public class Test8 
{
	public static void main(String[] args)
	{
	   System.out.println(Student.getStudentDetails(101, "Smith", 12000.99));
	   
	}

}

Note : we can call any method whose return type is not void by using System.out.println() method but we can't call a method whose return type is void.

class Alpha
{
  public static void m1()
  {
  }
  
  public static int m2()
  {
  }
}

System.out.println(Alpha.m1());  //error
System.out.println(Alpha.m2());  //Valid
----------------------------------------------------------------
2 files :
---------
Table.java
------------
package com.ravi.pack9;

//BLC 
public class Table 
{
  public static void printTable(int num) //5 X 1 = 5
  {
	 for(int i=1; i<=10; i++)
	 {
		 System.out.println(num+" X "+i+" = "+(num*i));
	 }
	 System.out.println("...................");
	  
  }
}

Test9.java
-----------
package com.ravi.pack9;

//ELC 
public class Test9 
{
	public static void main(String[] args) 
	{		
		for(int i=1; i<=10; i++)
		{
			Table.printTable(i);
		}
	}

}
-----------------------------------------------------------------
Types of Variables in java :
-----------------------------
In java, Based on the data types variables are divided into two 
types :

   1) Primitive Variables
   2) Reference Variables

1) Primitive Variables :
------------------------
If a variable is declared with primitive data types like byte, short, int, long and so on then it is called Primitive Variables.

Example :

 byte x = 12;
 int y = 90;
 boolean isEmpty = false;

On primitive variables we can't assign null literal as well as 
with primitive variables we can't call a method.

int x = null;  //Invalid
    
int y = 12;
    y.m1(); //Invalid
    

Reference Variables :
---------------------
In java, If a variable is declared with class name then it is called reference variable.

Example :

   Integer x = 19;  
   String str = "India";
   Student st;
   Customer c = null;
   
On reference variable we can assign null as well as we can call a method.

 String str = null;  //Valid
 String y = "India";
 y.toUpperCase(); //valid
   
Based on the Declaration position, these two variables are further classified into 4 categories :

  1) Class Variable OR Static Field
  2) Instance Variable OR Non Static field
  
  3) Local Variable
  4) Parameter Variable
  
Program on Primitive Variables :
--------------------------------
package com.ravi.variable_type;

class Test
{
	static int a; //static Field OR Class Variable
	int b;        //Non Static Field OR Instance Variable
	
	public void accept(int c)  //C is parameter Variable
	{
		int d = 400;           //d is a local Variable
		
		System.out.println("Class Variable :"+a);
		System.out.println("Instance Variable :"+b);
		System.out.println("Parameter Variable :"+c);
		System.out.println("Local Variable :"+d);
		
	}	
}
public class PrimitiveVariablesDemo 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.accept(300);
	}

}

Output : 0
         0
	 300
	 400
-----------------------------------------------------------------
Program on Reference Variable :
-------------------------------
package com.ravi.variable_type;

import java.util.Scanner;

class Student
{
	Student s1 = null; //Instance + Reference Variable
	static Scanner sc = new Scanner(System.in); //Static + Reference Var
	
	public void accept(Student st) //st parameter variable
	{
		Student s2 = new Student();  //s2 local Variable
		System.out.println("Executed");
	}	
}

public class ReferenceVariable {

	public static void main(String[] args) 
	{
		Student student = new Student();
		student.accept(student);

	}

}
=================================================================
21-10-2024
----------
Object Oriented Programming (OOPs) 
----------------------------------
What is an Object?
------------------
An object is a physical entity which exist in the real world.
Example :- Pen, Car, Laptop, Mouse, Fan and so on

An Object is having 3 characteristics :

   a) Identification of the Object (Name of the Object)
   b) State of the Object (Data OR Properties OR Variable of Object)
   c) Behavior of the Object (Functionality of the Object)

OOP is a technique through which we can design or develop the programs using class and object.

Writing programs on real life objects is known as Object Oriented Programming.

Here in OOP we concentrate on objects rather than function/method.

Advantages of OOP :
--------------------
1) Modularity  (Dividing the bigger task into smaller task)
2) Reusability (We can reuse the component so many times)
3) Flexibility (Easy to maintain [By using interface])

Features of OOP :
-----------------
1) Class
2) Object
3) Abstraction
4) Encapsulation
5) Inheritance
6) Polymorphism
================================================================
What is a class?
-----------------
A class is model/blueprint/template/prototype for creating the object.

A class is a logical entity which does not take any memory.

A class is a user-defined data type which contains data member and member function.

public class Employee
{
    Employee Data (Properties) 
         +
    Employee behavior (Function/Method)
}

A CLASS IS A COMPONENT WHICH IS USED TO DEFINE OBJECT PROPERTIES AND OBJECT BEHAVIOR.

----------------------------------------------------------------
WAP to initialize the Object properties using Object reference ?
 
2 files :
----------
Student.java
------------
package com.ravi.oop;

//BLC
public class Student 
{
   String name;  //Instance Variable
   double height; //Instance Variable
   int rollNumber; //Instance Variable
   
   //Object Behavior
   public void talk()
   {
	   System.out.println("Hello Everyone, My name is :"+name);
	   System.out.println("My Roll number is :"+rollNumber);
	   System.out.println("And my height is :"+height);
	   
   }
   
   public void writeExam()
   {
	   System.out.println("Every Saturday "+name+ " is writing exam for Enjoying sunday");
   }
   
   
   
}

StudentDemo.java
-----------------
package com.ravi.oop;

//ELC
public class StudentDemo 
{	
	public static void main(String[] args) 
	{
		Student raj = new Student();
		
		//Initialize the Object Properties using reference variable
		raj.name = "Raj Gourav";
		raj.rollNumber = 111;
		raj.height = 5.9;
		
		//Calling the behavior
		raj.talk();
		raj.writeExam();
		
		System.out.println("===================");
		
		Student priya = new Student();
		priya.name = "Priya";
		priya.height = 5.6;
		priya.rollNumber =222;
		
		priya.talk();
		priya.writeExam();
		
		
	}

}

Steps for creating Object Orineted Programming 

Step 1 :-  Create the Object based on the BLC class inside ELC 
           class

Step 2 :- Define all the object properties and behavior inside
          the BLC class based on your imagination/thinking.

Step 3 :- Initialize all the object properties with user friendly value by using reference variable.

step 4 :- call the behavior (calling the methods)
----------------------------------------------------------------
22-10-2024
-----------
How to initialize the Object properties using Object reference 
through Scanner class

2 files :
----------
Product.java
-------------
package com.ravi.oop;

public class Product 
{
	String laptopBrand;
	double laptopPrice;
	boolean isTouchScreen;
	
	public void getLaptopInformation()
	{
		System.out.println("Laptop Brand is :"+laptopBrand);
		System.out.println("Laptop Price is :"+laptopPrice);
		System.out.println("Is laptop touch screen ?:"+isTouchScreen);
	}
}

ProductDemo.java
-----------------
package com.ravi.oop;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) 
	{
		Product laptop = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Laptop Brand :");
		laptop.laptopBrand = sc.nextLine();
		
		System.out.print("Enter Laptop Price :");
		laptop.laptopPrice = sc.nextDouble();
		
		System.out.print("Is it touch screen Laptop :");
		laptop.isTouchScreen = sc.nextBoolean();
		
		laptop.getLaptopInformation();
		sc.close();		

	}

}
---------------------------------------------------------------
What is instance OR Non static variable :
-----------------------------------------
It is a class level variable so It has default value.

If a non static variable is defined inside a class but outside of a method then it is called instance variable.

Example :
----------
public class Student
{
   int rollNumber;  //Instance Variable [Object Properties]
   
   public void setStudentData()
   {
   }
}

An instance variable life starts at the time of creating the object, Without object we can't think about instance variable.

public class Test 
{
	int x = 100;
	
	public static void main(String[] args) 
	{
		System.out.println(x); //error
	}
}

As far as its accessibility is concerned, It is accessible within the same class as well as depends upon the access modifier applied on the instance variable.
---------------------------------------------------------------
Parameter Variable :
---------------------
It is a method level variable hence does not have default value.

If a variable is declared inside a method parameter (not inside method body) then it is called Parameter Variable.

End user is responsible to initialize the parameter variable.

As far as it's scope is concerned, It is accessible within the same method body only.

public class Employee
{
   int employeeId;
   
   public void set(int id)  //id is parameter variable
   {
   }
}
===============================================================
2 files :
---------
Employee.java
---------------
package com.ravi.oop;

public class Employee 
{
   int employeeId;
   String employeeName;
   double employeeSalary;
   String employeeAddress;
   
   public void setEmployeeData(int id, String name, double sal, String addr)
   {
	   employeeId = id;
	   employeeName = name;
	   employeeSalary = sal;
	   employeeAddress = addr;		   
   }
   
   public void getEmployeeData()
   {
	   System.out.println("Employee Id is :"+employeeId);
	   System.out.println("Employee Name is :"+employeeName);
	   System.out.println("Employee Salary is :"+employeeSalary);
	   System.out.println("Employee Address is :"+employeeAddress);
   }
   
	
}

EmployeeDemo.java
------------------
package com.ravi.oop;

public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Employee scott = new Employee();
		scott.setEmployeeData(111, "Scott", 55000, "S R Nagar");
		scott.getEmployeeData();
		
		System.out.println("================");
		Employee smith = new Employee();
		smith.setEmployeeData(222, "Smith", 56000, "Ameerpet");
		smith.getEmployeeData();
		
	}

}
================================================================
Constructor [Introduction Only]
--------------------------------
If the name of the class and name of the method both are exactly same and it does not contain any return type then it is called Constructor.

public class Example 
{  
   public Example() //Constructor
   {
   }
}
----------------------------------------------------------------
Default Constructor added by java compiler :
---------------------------------------------
In java, Whenever we write a class and if a programmer does not 
write any kind of constructor in the class then automatically one default constructor will be added by the compiler in the class.

public class Example
{
   
}

javac Example.java
------------------
public class Example
{
    public Example() //Default Constructor added by compiler
    {
    }
}

Every java class must have at-least one constructor [We can't think about java class without constructor] either implicitly added by java compiler OR explicitly written by programmer.

The access modifer of default constructor (added by compiler) depends upon class access modifier, if class is public then the access modifier of default constructor is also public.

Example :
----------
public class Demo 
{
	
}

javac Demo.java
javap Demo.class  [You Can see the constructor added by compiler]
----------------------------------------------------------------
Why compiler is adding default constructor to our class :
---------------------------------------------------------
We have 2 reasons that why compiler is adding default constructor :

1) Without default constructor, Object creation is not possible in java by using new keyword.


2) As we know only class level variables are having default values so,  default constructor will initialize all the instance variables with default values with the help of new keyword.
  
 Data type - Default value
   byte  - 0
   short - 0
   int   - 0
   long  - 0
   float - 0.0
   double - 0.0
   char - (space) '\u0000'  
   boolean - false
   String - null
   Object - null (For any class i.e reference variable the default value is null)
===============================================================
package com.ravi.oop;

public class Employee 
{
        int id;
	String name;
	double salary;
   
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args)
	{
	   Employee emp = new Employee();
	   emp.show();
	}
}

Output is : 0  null 0.0
--------------------------------------------------------------
23-10-2024
-----------
Initializing the instance variable using parameter variable as per requirement :

2 files :
----------
Employee.java
--------------
package com.nit.oop;

public class Employee 
{
    int employeeId;
    String employeeName;
    double employeeSalary;   
    char employeeGrade;
    
    public void setEmployeeData(int id, String name, double salary)
    {
    	employeeId = id;
    	employeeName = name;
    	employeeSalary = salary;
    }
    
    public void calculateEmployeeGrade()
    {
    	if(employeeSalary >=90000)
    	{
    		employeeGrade = 'A';
    	}
    	else if(employeeSalary >=75000)
    	{
    		employeeGrade = 'B';
    	}
    	else if(employeeSalary >=50000)
    	{
    		employeeGrade = 'C';
    	}
    	else
    	{
    		employeeGrade = 'D';
    	}
    }   

    public void getEmployeeData()
    {
    	System.out.println("Employee Id is :"+employeeId);
    	System.out.println("Employee Name is :"+employeeName);
    	System.out.println("Employee Salary is :"+employeeSalary);
    	System.out.println("Employee Grade is :"+employeeGrade);    
    } 
    
}

EmployeeDemo.java
-----------------
package com.nit.oop;

public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Employee scott = new Employee();
		scott.setEmployeeData(101, "Scott", 74000);	
		scott.calculateEmployeeGrade();
		scott.getEmployeeData();

	}

}

Note : In the above program all the object properties are not 
       initialized with parameter variable, actually employeeGrade is initialized by employeeSalary.
----------------------------------------------------------------
Note : Upto Here we have alreday learned the followinbg ways to initialize the object properties :

1) By using Object Reference (Reference Variable)
2) By using Method without parameter
3) By using Method Parameter (Initializing the Object Properties through parameter variable)
----------------------------------------------------------------
What is Variable Shadow in java ?
---------------------------------
[Method Level variables are having more priority than class level variables inside method, block OR Constructor]

Variable shadowing in Java occurs when a variable declared within a certain scope (like a method or a block or Constructor) has the same name as a variable declared in an outer scope (class Level). 

In variable Shadow, the variable in the inner scope hides the variables in Outer scope so known as variable shadowing.

This means that within the inner scope (Method, block Or Constructor), when we refer to the variable directly by name, We are actually referring to the inner variable, not the outer variable.

2 files :
----------
Student.java
--------------
package com.nit.oop;

public class Student 
{
    int id = 100;
	String name = "Scott";
		
	public void accept()
	{
		int id = 200;
		String name = "Smith";		
		System.out.println(id +" : "+name);
	}	
	
	public void input(int id, String name)
	{
		System.out.println(id +" : "+name);
	}
	
}
StudentDemo.java
-----------------
package com.nit.oop;

public class StudentDemo {

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.accept();
		s.input(300, "John");
	}

}
----------------------------------------------------------------
this keyword in java :
----------------------
Whenever instance variable name and parameter variable name both are same then at the time of instance variable initialization our runtime environment will provide more priority to parameter variable/local variable, parameter variables are hiding the instance variables (Due to variable shadow)

To avoid the above said problen, Java software people introduced "this" keyword.

this keyword always refers to the current object and instance variables are the part of the object so by using this keyword we can represent instance variable.

We cannot use this (non static member) keyword from static area (Static context).

2 files :
---------
Manager.java
--------------
package com.nit.oop;

public class Manager 
{
   int managerId;
   String managerName;
                                  
   public void setManagerData(int managerId, String managerName)
   {
	   this.managerId = managerId;  
	   this.managerName = managerName;
	   
   }
   
   public void getManagerData()
   {
	   System.out.println("Manager id is :"+managerId);
	   System.out.println("Manager name is :"+managerName);
   }
   
}

ThisKeywordExample.java
------------------------
package com.nit.oop;

public class ThisKeywordExample 
{
	public static void main(String[] args) 
	{
		Manager m1 = new Manager();
		m1.setManagerData(111, "Mr Smith");
	    m1.getManagerData();
	}
}

Note : this keyword is used to represent instance variable.
---------------------------------------------------------------
Local Search algorithm [Paint Diagram 24-OCT]:
----------------------------------------------
Program :
----------
package com.ravi.inner_class_concept;

class Test
{
	static int a = 100;  //Class Variable OR Static Field
	int b = 200;         //Instance Variable OR Non static Field
	
	public void accept(int c)
	{
		int d = 400;		
		System.out.println(Test.a);
		System.out.println(this.b);
		System.out.println(c);
		System.out.println(d);	
	}
}

public class Main {

	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.accept(300);
	}

}
---------------------------------------------------------------
How to print object properties by using toString() method :
-----------------------------------------------------------
If we want to print our object properties (Instance Variables) then we should generate(override) toString() method in our class from Object class.

Now with the help of toString() method we need not to write any display kind of method to print the object properties i.e instance variable.

In order to generate the toString() method we need to follow the steps
Right click on the program -> source -> generate toString()

In order to call this toString() method, we need to print the corresponding object reference by using System.out.println() statement.

Manager m = new Manager();
System.out.println(m); //Calling toString() method of Manager class

Employee e = new Employee();
System.out.println(e); //Calling toString() method of Employee class.

2 files :
----------
Product.java
-------------
package com.ravi.to_string_demo;

public class Product 
{
	int productId;
	String productName;

	public void setProductData(int productId, String productName) 
	{
		this.productId = productId;
		this.productName = productName;
	}

	@Override
	public String toString() 
	{
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}	
	

}

ProductDemo.java
-----------------
package com.ravi.to_string_demo;

public class ProductDemo 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product();
		p1.setProductData(111, "Laptop");
		System.out.println(p1);  //toSting() method of Product class
		
		Product p2 = new Product();		
		p2.setProductData(222, "Smart Phone");
		System.out.println(p2);
	}

}
--------------------------------------------------------------
25-10-2024
-----------
Role of instance variable while creating the Object :
-----------------------------------------------------
Whenever we create an object in java then a separate copy of all the instance variables will be created with each and every object as shown in the program.[25-OCT]

package com.ravi.variable_copy_demo;

public class Test 
{
	int x = 100;   //Non static field
	
	public static void main(String[] args)
	{
		Test t1 = new Test();
		Test t2 = new Test();
		
		++t1.x;   --t2.x;
		
		System.out.println(t1.x); //101
		System.out.println(t2.x); //99

	}
}
--------------------------------------------------------------
What is a static field ?
------------------------
It is a class level variable.

If a variable is declared with static modifier inside a class then it is called class variable OR static field.

A static field variable will be automatically initialized with default values and memory will be allocated (even the variable is final) AT THE TIME OF LOADING THE CLASS INTO JVM MEMORY.

In order to access the static member, we need not to create an object, here class name is required.
---------------------------------------------------------------
Role of static variable with Object creation :
----------------------------------------------
Whenever we create an object then a single copy of static variable will be created for all the objects and the same single copy of static variable will be sharable by all the objects as shown in the program.[25-OCT]

package com.ravi.variable_copy_demo;

public class Demo 
{
	static int x = 100; //static field
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		--d1.x;   --d2.x;
		
		System.out.println(d1.x);  //98
		System.out.println(d2.x); //98
	}
}

So, final conclusion is :

   Instance Variable = Multiple Copies
   Static Variable = Single Copy for all the objects

Basically static variables are used to save the memory.
---------------------------------------------------------------
When we should decalre a variable as static variable and when we should declare as variable as a non static variable ?

Non static Variable :
---------------------
Multiple copies will be created with each and every object.

If the value of the variable is different with respect to object then we should use instance variable OR non static field.

Static Field :
---------------
If the value of the variable is common with respect to object
then we should use static field OR class variable.

Example1 :
---------
public class Student
{
  int rollNumber;  //NSV 
  String studentName; //NSV
  String studentAddress//NSV
  static String collegeName = "VIT"; //SV
  static String courseName = "Java"; //SV
}

Example 2 :
------------
class Customer
{
   long accountNumber; //NSV
   String customerName; //NSV
   long mobileNumber; //NSV
   String customerAddress; //NSV
   static String IFSCCode = "SBIHYD08590"; //SV
   static String branchLocation = "Ameerpet"; //SV
}

Program :
----------
2 files :
---------
Student.java
-------------
package com.ravi.variable_copy_demo;

public class Student {
	int rollNumber;
	String studentName;
	String studentAddress;
	static String collegeName = "JNTU";
	static String courseName = "B.Tech";

	public void setStudentData(int rollNumber, String studentName, String studentAddress) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + this.rollNumber + ", studentName=" + this.studentName + ", studentAddress="
				+ this.studentAddress + ", College Name " + Student.collegeName + ", Course Name " + Student.courseName
				+ " ]";
	}

}

StudentDemo.java
-----------------
package com.ravi.variable_copy_demo;

public class StudentDemo 
{
	public static void main(String[] args) 
	{
		Student raj = new Student();
		raj.setStudentData(101, "Raj", "Ameerpet");
		
		Student priya = new Student();
		priya.setStudentData(102, "Priya", "S R Nagar");
		
		Student scott = new Student();
		scott.setStudentData(103, "Scott", "Koti");
		
		System.out.println(raj);
		System.out.println(priya);
		System.out.println(scott);

	}

}
--------------------------------------------------------------
Assignment :
-------------
Develop Bank and Customer application with valid SV and NSV
---------------------------------------------------------------
**What is Data Hiding ?
----------------------
Data hiding is nothing but declaring our data members with private access modifier so our data will not be accessible from outer world that means no one can access our data directly from  outside of the class.

*We should provide the accessibility of our data through methods so we can perform VALIDATION ON DATA which are coming from outer world.

2 files :
----------
Customer.java
---------------
package com.ravi.data_hiding;

public class Customer 
{
   private double balance = 10000;  //Data Hiding 
   
   public void deposit(double amount)
   {
	   //Validation on data
	   if(amount <=0)
	   {
		   System.err.println("Amount can't deposited");
	   }
	   else
	   {
		   this.balance = this.balance + amount;
		   System.out.println("After deposit :"+this.balance);
	   }
   }
   
   public void withdraw(double amount)
   {
	   this.balance = this.balance - amount;
	   System.out.println("After Withdraw :"+this.balance);
   }
   
   
}
BankingApplication.java
-----------------------
package com.ravi.data_hiding;

public class BankingApplication 
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		c1.deposit(10000);
		c1.withdraw(5000);

	}

}
---------------------------------------------------------------
What is Constructor ?
---------------------
What is the advantage of writing constructor in our class ?
------------------------------------------------------------
If we don't write a constructor in our program then variable initialization and variable re-initialization both are done in two different lines.

If we write constructor in our program then variable initialization and variable re-initialization both are done in the same line i.e at the time of Object creation. [26-OCT]

With Constructor approach, we need not to depend on method to re-initialize our instance variable with user value.
---------------------------------------------------------------
Defination of Constructor :
---------------------------
If the name of the class and name of the method both are exactly same and It should not contain any return type then it is called constructor.

The main purpose of constructor to initialize the object properties (Instance Variables) with user-defined value.

Every class must contain at-least one constructor either implicitly added by compiler or explicitly written by user.

Every time we create an object in java by using new keyword, at-least one constructor must be invoked.

A constructor never contain any return type including void also.

Example :
package com.ravi.command;

class Student
{
  public void Student() //Method
  {
	  System.out.println("I am Method");
  }  
  
  public static void main(String [] args)
  {
     Student s1 = new Student();
     s1.Student();
  }
}

A constructor may contain return keyword but not return keyword with value.

package com.ravi.command;

class Student
{
  public Student() 
  {
	  System.out.println("I am Constructor");
	  return;
  }  
  
  public static void main(String [] args)
  {
     Student s1 = new Student();
     
  }
}

A constructor is automatically called and executed at the time of creating the object.

================================================================
Types of constructor in java :
-------------------------------
We have 3 types of Constructors in java :

1) Default No argument Constructor [Added by compiler]
2) No Argument OR Parameter-less OR Non parameterized OR Zero
   argument Constructor.
3) Parameterized Constructor.

Default No Argument Constructor :
---------------------------------
Whenever we write a class and if we don't write any type of constructor then automatically one default constructor is added by the compiler.

The access modifier of default constaructor would be same as class access modifier.

It does not accept any parameter.

Example.java
--------------
public class Example 
{

}

javac Example.java

Example.class
------------
public class Example
{
   public Example() //default constructor
   {
   }
}
----------------------------------------------------------------
2) No Argument OR Parameter-less OR Non parameterized OR Zero
   argument Constructor.

If a user defines a constructor inside a class without argument then it is called no argument constructor.

No argument constructor and default constructor, both look like same the only difference is, default constructor means added by compiler and no argument constructor means written by user.

public class Student
{
  private int rollNumber;
  private String studentName;
  
  public Student() //No Argument Constructor
  {
     rollNumber = 111;
     studentName = "Raj";
  }
  
}  
  
No argument constructor is not recommended to initialize our object properties because due to no argument constructor all the object properties will be initialized with SAME VALUE as shown in the program.

2 files :
----------
Person.java
-------------
package com.ravi.constructor;

public class Person 
{
	private int personId;
	private String personName;

	public Person() // No Argument Constructor
	{
		personId = 111;
		personName = "Scott";
	}

	@Override
	public String toString() 
	{
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}
}

NoArgumentConstructor.java
---------------------------
package com.ravi.constructor;

public class NoArgumentConstructor 
{
	public static void main(String[] args) 
	{
		Person scott = new Person();
		System.out.println(scott);
		
		System.out.println("..............");
		
		Person smith = new Person();
		System.out.println(smith);

	}

}

Note : Actually No argument constructor is used to initialize the object properties with default values.
---------------------------------------------------------------
Parameterized Constructor :
---------------------------
If we pass one or more argument to the constructor then it is called parameterized constructor.

By using parameterized constructor all the objects will be initialized with different values.

Example :
----------
public class Employee
{
   int id;
   String name;
   
   public Employee(int id, String name)
   {
      this.id = id;
      this.name = name;
   }
 }
---------------------------------------------------------------
2 files :
---------
Dog.java
---------
package com.ravi.constructor;

public class Dog 
{
	private String dogName;
	private double dogHeight;
	private int dogAge;

	public Dog(String dogName, double dogHeight, int dogAge) {
		super();
		this.dogName = dogName;
		this.dogHeight = dogHeight;
		this.dogAge = dogAge;
	}

	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + ", dogHeight=" + dogHeight + ", dogAge=" + dogAge + "]";
	}	

}

ParameterizedConstructor.java
------------------------------
package com.ravi.constructor;

public class ParameterizedConstructor
{
	public static void main(String[] args) 
	{
		Dog tommy = new Dog("Tommy", 3.5, 4);
		System.out.println(tommy);
		
		Dog tiger = new Dog("Tiger", 4.5, 7);
		System.out.println(tiger);

	}

}
---------------------------------------------------------------
What is setter and getter :
----------------------------
setter : Used to modify the existing object data.
getter : Used to read the private data from BLC class.

2 files :
----------
Employee.java
--------------
package com.ravi.setter_getter;

public class Employee 
{
	private double employeeSalary;

	public Employee(double employeeSalary) 
	{
		super();
		this.employeeSalary = employeeSalary;
	}

	public double getEmployeeSalary() 
	{
		return this.employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) 
	{
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() 
	{
		return "Employee [employeeSalary=" + employeeSalary + "]";
	}	
}

Main.java
----------
package com.ravi.setter_getter;

public class Main {

	public static void main(String[] args)
	{
		Employee scott = new Employee(40000);
		System.out.println(scott);
		
		System.out.println("After 1 year, Salary Updated");
		
		scott.setEmployeeSalary(scott.getEmployeeSalary()+10000);
		System.out.println(scott);

	}

}

FINAL CONCLUSION :
-------------------
Parameterized Constructor : To initialize the Object properties with user values.

Setter : To modify the existing object data.[Only one data at a time] OR Writing Operation

Getter : To read/retrieve private data value outside of BLC class. [Reading Operation]
----------------------------------------------------------------
28-10-2024
----------
*** What is Encapsulation 
--------------------------
[Accessing our private data with public methods like setter and getter]
----------------------------------------------------------
Binding the private data with its associated method in a single unit is called Encapsulation.

Encapsulation ensures that our private data (Object Properties) must be accessible via public methods like setter and getter.

It provides security because our data is private (Data Hiding) and it is only accessible via public methods WITH PROPER DATA VALIDATION.

In java, class is the example of encapsulation.


How to achieve encapsulation in a class :
------------------------------------------
In order to achieve encapsulation we should follow the following two 
techniques :

1) Declare all the data members with private access modifiers (Data Hiding OR Data Security)

2) Write public methods to perform read(getter) and write(setter) operation on these private data like setter and getter.

Note : If we decalre all our data with private access modifier then it is called TIGHTLY ENCAPSULATED CLASS. On the other hand if we declare our data other then private access modifier then it is called Loosely Encapsulated class.

Program on Setter and Getter using Encapsulation :
--------------------------------------------------
2 files :
---------
Student.java
-------------
package com.ravi.setter_getter;

public class Student 
{
	private int studentId;  
	private String studentName; 
	private int studentMarks;
	private String studentAddress;

	public Student(int studentId, String studentName, int studentMarks, String studentAddress) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ ", studentAddress=" + studentAddress + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) 
	{
		this.studentAddress = studentAddress;
	}
}

StudentDemo.java
-----------------
package com.ravi.setter_getter;

public class StudentDemo {

	public static void main(String[] args) 
	{
		Student raj = new Student(111, "Raj", 90, "Ameerpet");
		System.out.println(raj);
		//Address Updated
		raj.setStudentAddress("S R Nagar");
		System.out.println(raj);
		
		int marks = raj.getStudentMarks();
		
		if(marks >= 90)
		{
			System.out.println(raj.getStudentName()+" is Excellent in Subject");
		}
		else if(marks >=75)
		{
			System.out.println(raj.getStudentName()+" is Very good in Subject");
		}
		else
		{
			System.out.println(raj.getStudentName()+" is good in Subject");
		}
		
		

	}

}
--------------------------------------------------------------
Method return type as a class :
--------------------------------
While declaring a method in java, return type is compulsory.
As a method return type we have following options

1) void as a retutn type of the Method

2) Any primitive data type as a return type of the method.

3) Any class name/interface / enum / record we can take as a return type of the method.

Case 1 :
---------
package com.ravi.method_return_type;

public class Test 
{  
	public Test accept()
	{
		return this;
		   OR
		 return null;
		   OR
		 return new Test();
	}
}

Case 2 :
---------
package com.ravi.method_return_type;

public class Demo 
{
   private int id;
   
   public Demo(int id)
   {
	   this.id = id;
   }
   
   public Demo get()
   {
      return new Demo(5);
   }
   
   
   
}

Note : Here the return value depends upon the available constructor in the class.
----------------------------------------------------------------
What is a Factory Method :
--------------------------
If a method return type is class name menas it is returning the Object of the class then it is called Factory Method.
---------------------------------------------------------------
2 files :
---------
Product.java
-------------
package com.ravi.method_return_type;

public class Product 
{
	private int productId;
	private String productName;
	private double productPrice;

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	public static Product getProductObject()
	{
		return  new Product(111, "Laptop", 92000.90);		
	}

}
ProductDemo.java
-----------------
package com.ravi.method_return_type;

public class ProductDemo {

	public static void main(String[] args)
	{
		Product product = Product.getProductObject();				
		System.out.println(product);
	}

}

In the avove program getProductObject() is providing only one product object so it is not recommended because the main purpose of any method to provide re-usability as shown in the program below.
----------------------------------------------------------------
2 files :
---------
Book.java
---------
package com.ravi.method_return_type;

import java.util.Scanner;

public class Book 
{
	private String bookTitle;
	private String authorName;

	public Book(String bookTitle, String authorName) 
	{
		super();
		this.bookTitle = bookTitle;
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", authorName=" + authorName + "]";
	}
	
	public static Book getBookObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book Title :");
		String title = sc.nextLine();
		System.out.print("Enter Author Name :");
		String author = sc.nextLine();
		
		return new Book(title, author);
	}	

}

BookDemo.java
-------------
package com.ravi.method_return_type;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Objects :");
		int noOfObj = sc.nextInt();
		
		for(int i=1; i<=noOfObj; i++)
		{
			Book object = Book.getBookObject();
			System.out.println(object);
		}
		
		sc.close();	
	}

}
--------------------------------------------------------------
29-10-2024
----------
What is Shallow and Deep copy in java :
----------------------------------------
Shallow Copy :
--------------
In Shallow copy, Only one Object will be created but the same object will be refered by multiple reference variables.

If we modify the object properties by any of the reference variable then original object will be modified as shown in the program.

2 files :
----------
Laptop.java
-------------
package com.ravi.shallow_copy;

public class Laptop 
{
	private String laptopBrand;
	private double laptopPrice;

	public Laptop(String laptopBrand, double laptopPrice)
	{
		super();
		this.laptopBrand = laptopBrand;
		this.laptopPrice = laptopPrice;
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}

	public double getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

	@Override
	public String toString() 
	{
		return "Laptop [laptopBrand=" + laptopBrand + ", laptopPrice=" + laptopPrice + "]";
	}
}

ShallowCopyDemo.java
---------------------

package com.ravi.shallow_copy;

public class ShallowCopyDemo {

	public static void main(String[] args) 
	{
		Laptop laptop1 = new Laptop("Acer", 60000);
		System.out.println(laptop1);
		
		Laptop laptop2 = laptop1;
		laptop2.setLaptopBrand("HP");
		laptop2.setLaptopPrice(80000);
		
		System.out.println(laptop1);
		System.out.println(laptop2);	
		
	}

}
-------------------------------------------------------------
Deep Copy :
-----------
In deep copy two different objects will be created, the 2nd object will copy the content of first object.

If we modify the object by using reference variable then only one object will be modified as shown below.

2 files :
----------
Product.java
-------------
package com.ravi.deep_copy;

public class Product 
{
	private int productId;
	private String productName;
	
	public Product()
	{
		productId = 0;
		productName = null;
	}

	public Product(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
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
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
}

DeepCopyDemo.java
-------------------
package com.ravi.deep_copy;

public class DeepCopyDemo 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(111, "Laptop");
		
		Product p2 = new Product();
		p2.setProductId(p1.getProductId());
		p2.setProductName(p1.getProductName());
		
		System.out.println("Before Modification...");
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("After Modification...");
		p1.setProductId(222);
		p1.setProductName("Camera");
		System.out.println(p1);
		System.out.println(p2);
		

	}

}

Note : Here only object content will be modified.
-------------------------------------------------------------
**Pass by Value :
-----------------
Java does not support pointers so java only works with pass by value only.

Pass by value means we are sending the copy of orginal data to the method.

package com.ravi.pass_by_value;

public class PassByValueDemo1 
{
	public static void main(String[] args) 
	{
		int x = 100;
		accept(x);
		System.out.println(x);
	}
	
	public static void accept(int y)
	{
		y = 200;
	}

}
--------------------------------------------------------------
package com.ravi.pass_by_value;

public class PassByValueDemo2 
{
	public static void main(String[] args) 
	{
		int x = 100;
		x = accept(x);
		System.out.println(x);
	}

	public static int accept(int y)
	{
		y = 200;
		return y;
	}
}
--------------------------------------------------------------
package com.ravi.pass_by_value;

class Customer
{
	private double customerBill = 12000;

	public double getCustomerBill() 
	{
		return customerBill;
	}

	public void setCustomerBill(double customerBill) 
	{
		this.customerBill = customerBill;
	}
	
}

public class PassByValueDemo3 
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer();  //customerBill = 12000
		accept(c1);
		System.out.println(c1.getCustomerBill()); ////customerBill = 18000		
	}	
	
	public static void accept(Customer cust)
	{
		cust.setCustomerBill(18000);
	}
}

Output : 18000
--------------------------------------------------------------
package com.ravi.pass_by_value;

class Customer
{
	private double customerBill = 12000;

	public double getCustomerBill() 
	{
		return customerBill;
	}

	public void setCustomerBill(double customerBill) 
	{
		this.customerBill = customerBill;
	}
	
}

public class PassByValueDemo4 
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer();  //customerBill = 12000		
		accept(c1);
		System.out.println(c1.getCustomerBill()); //12000	
	}	
	
	public static void accept(Customer cust)
	{
		cust = new Customer();
		cust.setCustomerBill(18000);
	}
}

Output : 12000
==============================================================
What is Garbage Collector in java -----------------------------------
It is an automatic memory management technique in java.

In C++ language, A programmer is responsible to allocate as well as de-allocate the memory otherwise we will get OutOfMemoryError.  

In java language, Programmer is only responsible to allocate the memory, Memory de-allocation is automatically done by garbage collector.

Garbage Collector is a daemon thread which is responsible to delete the objects from the HEAP Memory. Actually It scans the heap memory and identifying which objects are eligible for Garbage Collector.[THE OBJECTS WHICH DOES NOT CONTAIN ANY REFERENCES ONLY THOSE OBJECTS ARE ELIGIBLE FOR GC]

It internally uses an algorithm called Mark and Sweep algorithm to delete the un-used objects.

As a developer we can also explicitly call garbage collector by writing the following code

System.gc();

==============================================================
How many ways we can make an object eligible for Garbage Collector :
---------------------------------------------------------------
There are 3 ways we can make an object eligible for GC.

1) Assigning null literal to existing reference variable :
   Employee e1 = new Employee(111,"Ravi");
            e1 = null;

2) Creating an Object inside a method :

   public void createObject()
   {
      Employee e2 = new Employee();
   }
Here we are creating Employee object inside the method so, once the method execution is over then e2 will be deleted from the Stack Frame and the employee object will become eligible for GC.

3) Assigning new Object to the old existing reference variable:
   
   Employee e3 = new Employee();
   e3 = new Employee();

Earlier e3 variable was poting to Employee object after that a new Employee Object is created which is pointing to another memory location so the first object is eligible for GC.
==============================================================
30-10-2024
-----------
Memory in java :
------------------
In java, whenever we create an object then Object and its content (properties and behavior) are stroed in a special memory called HEAP Memory. Garbage collector visits heap memory only.

All the local variables and parameters variables are executed in Stack Frame and available in Stack Memory.
--------------------------------------------------------------
HEAP and STACK Diagram for CustromerDemo.java :
------------------------------------------------
class Customer
{
	private String name; 
	private int id; 

	public Customer(String name , int id) 
	{
		super();
		this.name=name;
		this.id=id;
	}

	public void setId(int id)  //setter  
	{
		this.id=id;
	}

	public int getId() //getter
	{
		return this.id;
	}
}

public class CustomerDemo
{
	public static void main(String[] args) 
	{
		int val = 100;

		Customer c = new Customer("Ravi",2);

        m1(c);   
		
		//GC [Only 1 object is eligible for GC i.e 3000x] 
		
		System.out.println(c.getId());
	}

	public static void m1(Customer cust) 
	{
		cust.setId(5);

	    cust = new Customer("Rahul",7);

		cust.setId(9);
		System.out.println(cust.getId());
	}
}  
    
//Output 9 5
===============================================================
HEAP and STACK Diagram for Sample.java
---------------------------------------
public class Sample
{	
	private Integer i1 = 900;

	public static void main(String[] args) 
	{
		Sample s1 = new Sample();    
		                              
		Sample s2 = new Sample();       

	    Sample s3 = modify(s2); 

		s1 = null;

         //GC [4 objects 1000x,2000x, 5000x and 6000x are eligible for GC]
		 
		System.out.println(s2.i1);		
	}
    public static Sample modify(Sample s)
	{
		s.i1=9;
		s = new Sample();
		s.i1= 20;  
        System.out.println(s.i1);
		s=null;
		return s;
	}
}

//20 9
---------------------------------------------------------------
Heap and Stack Digram for Test.java
------------------------------------
public class Test 
{
	Test t;
	int val;

	public Test(int val)  
	{
		this.val = val;
	}

	public Test(int val, Test t)
	{
		this.val = val;
		this.t = t;
	}

	public static void main(String[] args) 
	{
		Test t1 = new Test(100);
		
		Test t2 = new Test(200,t1);

		Test t3 = new Test(300,t1);

		Test t4 = new Test(400,t2);

		t2.t = t3; 
		t3.t = t4; 
		t1.t = t2.t; 
		t2.t = t4.t; 

	System.out.println(t1.t.val);
	System.out.println(t2.t.val);
	System.out.println(t3.t.val);
	System.out.println(t4.t.val);
	}
	
}  
---------------------------------------------------------------
01-11-2024
----------
HEAP and STACK Diagram for EmployeeDemo.java
--------------------------------------------
public class Employee
{
	int id = 100;
	
	public static void main(String[] args) 
	{
		int val = 200;

		Employee e1 = new Employee();     

		e1.id = val;

		update(e1);	  
		
		System.out.println(e1.id);

        Employee e2 = new Employee(); 

		e2.id = 900;
        
		switchEmployees(e2,e1); //3000x, 1000x

		  //GC [2 objects, 2000x and 4000x both are eligible]

			System.out.println(e1.id);
		    System.out.println(e2.id);
	    } 
		
	 public static void update(Employee e)  
	 {
        e.id = 500;
		e = new Employee();
		e.id = 400;
		System.out.println(e.id);
	 }

	 public static void switchEmployees(Employee e1, Employee e2)
	  {
		 int temp = e1.id; 
		 e1.id = e2.id; //500
		 e2 = new Employee();
		 e2.id = temp;
	  }
   }

//Output  400 500 500 500
---------------------------------------------------------------
HEAP and STACK diagram for Test.java
-------------------------------------
class Test
{
int x;  
int y;  

void m1(Test t)  //t -> 2000x
{
x=x+1;
y=y+2;
t.x=t.x+3;
t.y=t.y+4;
}
public static void main(String[] args)
{
Test t1=new Test(); //x , y , m1() 
Test t2=new Test(); //x , y , m1()  

t1.m1(t2);

System.out.println(t1.x+"... "+t1.y); 
System.out.println(t2.x+"... "+t2.y); 

t2.m1(t1);
System.out.println(t1.x+"... "+t1.y);
System.out.println(t2.x+"... "+t2.y);

t1.m1(t1);
System.out.println(t1.x+"... "+t1.y);
System.out.println(t2.x+"... "+t2.y);

t2.m1(t2);
System.out.println(t1.x+"... "+t1.y);
System.out.println(t2.x+"... "+t2.y);  
}
}
===============================================================

Passing an Object reference to the Constructor :(Copy Constructor)
--------------------------------------------------------------
We can pass an object reference to the constructor so we can copy the content of one object to another object.

The following program explains how to copy the content of Employee object to initialize Manager class properties :

3 files :
----------
Employee.java
--------------
package com.ravi.copy_constructor;

public class Employee  
{                      
	private int employeeId;
	private String employeeName;

	public Employee(int employeeId, String employeeName) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
}


Manager.java
-------------
package com.ravi.copy_constructor;

public class Manager 
{
	private int managerId;
	private String managerName;

	public Manager(Employee emp) // emp = e1
	{
		this.managerId = emp.getEmployeeId();
		this.managerName = emp.getEmployeeName();
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}

}

CopyConstructor.java
--------------------
package com.ravi.copy_constructor;

public class CopyConstructor 
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(111, "Scott");
        Manager m1 = new Manager(e1);
        System.out.println(m1);
	}

}

Note : Here by using Employee class properties, we are initializing the Manager class properties. 

The following program explains how to copy the content of one object of same class to another object of same class only.

Product.java
-------------
package com.ravi.copy_constructor;

public class Product 
{
	private int productId;
	private String productName;

	public Product(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	public Product(Product p)  //p = prod
	{
		this.productId = p.productId;
		this.productName = p.productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
}

CopyConstructorDemo.java
-------------------------
package com.ravi.copy_constructor;

public class CopyConstructorDemo 
{
	public static void main(String[] args) 
	{
		Product prod = new Product(101, "HP Laptop");
		Product p1 = new Product(prod);
		
		System.out.println(prod);
		System.out.println(p1);

	}

}
===============================================================
Constructor Overloading :
-------------------------
In the same class if we write more than one constructor where parameter must be different (If same, compilation error will be generated) then it is called constructor Overloading.

In order to call overloaded constructor we need not to create multiple objects, we can call all the overloaded constructors with one object only by using this() [this of]

this() is used to call current class overloaded constrcutor and it must be FIRST STATEMENT OF THE CONSTRUCTOR BODY.
--------------------------------------------------------------
Calculate.java
---------------
package com.ravi.constructor_overloading;

public class Calculate 
{
   public Calculate(int x, int y)
   {
	   System.out.println("Sum of "+x+" and "+y+ " is :"+(x+y));
   }
   
   public Calculate(int x)
   {
	   this(100,200);
	   System.out.println("Square of "+x+" is :"+(x*x));
	   
   }
}

package com.ravi.constructor_overloading;

public class ConstructorOverloading 
{
	public static void main(String[] args)
	{
		Calculate c1 = new Calculate(5);
	}

}
--------------------------------------------------------------
02-11-2024
----------
What is an instance block OR instance initializer in java ?
------------------------------------------------------------
It is a special block in java which is automatically executed at the time of creating the Object.

Example :

{
   //Instance OR Non static block
}

If a constructor contains first line as a super() statement then only compiler will add instance block in the 2nd line of constructor otherwise it will not be added by the compiler.

If constructor contains super() then non static block will be executerd before the body of the constructor.

The main purpose of instance block to initialize the instance variables (So It is called Instance Iniatilizer) of the class OR to write a common logic which will be applicable to all the objects.

If a class contains multiple non static blocks then it will be executed according to the order [Top to bottom]

Instance initializer must be executed normally that menas we can't interrupt the execution flow of any initializer hence we can't write return statement inside non static block.

If a user defines non static block after the body of the constructor then compiler will not placed in the 2nd line of the constructor. It will be executed as it is because compiler will search the NSB in the class level.
---------------------------------------------------------------
package com.ravi.instance_block;

class Sample
{
	{
		System.out.println("Instance OR Non static block");
	}
}

public class InstanceBlockDemo1 
{
	public static void main(String[] args) 
	{
		new Sample(); //Nameless OR Anonymous Object
		new Sample();
	}

}

Note : Instance block will be executed with object creation
---------------------------------------------------------------
package com.ravi.instance_block;

class Demo
{
	public Demo()
	{		
		System.out.println("Demo class Constructor");
	}
	
	{
		System.out.println("NSB");
	}
		
}

public class InstanceBlockDemo2 
{

	public static void main(String[] args) 
	{
		new Demo();

	}

}

Note : NSB will be executed before the constructor body.
--------------------------------------------------------------
package com.ravi.instance_block;

class Foo
{
	Foo()
	{
		System.out.println("No Argument Constructor");
	}
	
	Foo(int x)
	{
		System.out.println("Parameterized Constructor");
	}
	
	{
		System.out.println("NSB");
	}
	
}


public class InstanceBlockDemo3 {

	public static void main(String[] args)
	{
	    new Foo();
	    new Foo(10);

	}

}

Note : NSB will be placed inside all the constructors which contains super() in the first line.
--------------------------------------------------------------
package com.ravi.instance_block;

class Student
{
	public Student()
	{
		this(101,"Scott");
		System.out.println("No Argument Constructor");
	}
	
	public Student(int id, String name)
	{
		System.out.println("Parameterized Constructor");
	}
	
	{
		System.out.println("Object creation is in process");
	}
}


public class InstanceBlockDemo4 {

	public static void main(String[] args) 
	{
		new Student();
		System.out.println(".........");
		new Student();

	}

}

NOte : NSB will not be added to the constructor which contains this() as a first line of constructor.
--------------------------------------------------------------
package com.ravi.instance_block;

class Test
{
	int x;
	
	public Test()
	{
		x = 590;
		System.out.println("x value is :"+x);
	}	
	
	{
		x = 190;
		System.out.println("x value is :"+x);
	}	
}

public class InstanceBlockDemo5 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
	}

}

Note : NSM is also used to initialize the instance variable.
---------------------------------------------------------------
package com.ravi.instance_block;

class Customer
{
	private double bill;
	
	public Customer()
	{
		bill = 10000;
		System.out.println(bill);
	}
	{
		bill = 1000;
		System.out.println(bill);
	}
	
	{
		bill = 2000;
		System.out.println(bill);
	}
	
	{
		bill = 3000;
		System.out.println(bill);
	}
	
	{
		bill = 4000;
		System.out.println(bill);
	}
		
}

public class InstanceBlockDemo6 
{
   public static void main(String[] args) 
   {
	   new Customer();
   }
}

Note : It is executed top to bottom.
--------------------------------------------------------------
package com.ravi.instance_block;

class Manager
{
	int x = 10;
	
	{
		System.out.println("Instance Initializer");
		//return;
	}
	
	
	
}

public class InstanceBlockDemo7 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

Note : return statement not allowed.
---------------------------------------------------------------
package com.ravi.instance_block;

class Hello
{
	public Hello()
	{
		System.out.println("Constructor");
		{
			System.out.println("NSB2");
		}		
	}
	{
		System.out.println("NSB1");
	}	
}


public class InstanceBlockDemo8 
{
	public static void main(String[] args) 
	{
		new Hello();

	}

}
Note : If we wtite NSB after the body of the constructor then it will be executed as it is.
---------------------------------------------------------------

Order of instance variable initialization in the program life 
-------------------------------------------------------------
cycle :
------

All the instance variables are initialized in the following order during the life cycle :

1) It will initialized with default value at the time of Object
   creation. [new Demo(); Demo class instance variable will be initialized with default value, init method is working internally]
   
2) Now control will verify whether, we have initailized at the time of variable declaration or not.

3) Now control will verify whether, we have initailized 
   inside non static block or not. [If present]

4) Now control will verify whether, we have initailized in the 
   body of the constructor or not.
   
5) Now control will verify whether, we have initailized in the method body or not but it is not recommended because Object is already created, we need to call the method explicitly, It is not the part of the object.

Default value [new keyword] => At the time of declaration => in the body of non static block => in the body of constructor => Inside method body [Not Recommended]

package com.ravi.nsv_life_cycle;

class Test
{
	int x = 100;   //STEP 1
	
	{
		x = 200;  //STEP 2
	}
	
	Test()
	{
		
		x = 300; //STEP 3
	}	
	
}


public class LifeCycle 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test(); 
		System.out.println(t1.x); //300

	}

}
===============================================================
12-11-2024
----------
What is blank final field in java ?
------------------------------------
If a final instance variable is not initialized at the time of declaration then it is called blank final field.

final int A ; //Blank final field

A final variable must have user-defined value.

A blank final field can't be initialized by default constrcutor as shown in the program.

class Test 
{
	final int A;  //Blank final field
	
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		System.out.println(t1.A);
	}
}

A blank final field must be explicitly initialized by the user till the execution of constructor body[Till Object creation]. It can be iniatialized in the following two places :
  
   a) Inside a non static block [If available]
   b) Inside the constructor body

A blank final field can't be initialized by method.[Object creation is already completed]

A blank final field can also have default value

A blank final must be iniatilized explicitly by user in all the constructors available in the class.
----------------------------------------------------------------
package com.ravi.blank_final_field;

class Sample
{
	final int x; 
	
	{
		x = 123;
	}
	
	public Sample()
	{
		// x = 234;
	}
}


public class BlankFinalFieldDemo {

	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		System.out.println(s1.x);

	}

}

A blank final field must be initialized by the non static block constructor body
===============================================================
package com.ravi.blank_final_field;

class Test
{
	final int x; //blank final field
	
	{
		m1();
		x = 100;
	}
	
	public void m1()
	{
		System.out.println("Default value :"+x);
	}	
	
}

public class BlankFinalFieldDemo1 {

	public static void main(String[] args)
	{
		Test t1 = new Test();
		System.out.println("User Value :"+t1.x);

	}

}


Note : A blank final field can also have default value.
---------------------------------------------------------------
class Alpha
{
	 final int x ; //Blank final field	
	 
	public Alpha()
	{
	   x = 100;
	   System.out.println(x);
	}
	
	public Alpha(int y)
	{
		x = y;
		System.out.println(y);
	}
	
}
public class Test 
{	
	public static void main(String[] args) 
	{
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha(200);
	}
	
}  

A blank final filed must be initialized in all the objects.
--------------------------------------------------------------
Relationship between the classes :
----------------------------------
In java we have 2 types of relation in between the classes :

 a) IS-A Relation
 b) HAS-A Relation
 
IS-A Relation :
---------------
class Car
{
}
class Ford extends Car //[Ford IS-A car ]
{
}

HAS-A Relation :
-----------------
class Engine
{
}

class Car
{
   private Engine engine;  //Car HAS-A Engine.
}


IS-A relation we can achieve by using Inheritance Concept.
HAS-A relation we can achieve by using Association Concept.
================================================================
13-11-2024
-----------
Inheritance (IS-A Relation) :
--------------------------------
Deriving a new class (child class) from existing class (parent class) in such a way that the new class will acquire all the properties and features (except private) from the existing class is called inheritance.

It is one of the most imporatnt feature of OOPs which provides "CODE REUSABILITY".

Using inheritance mechanism the relationship between the  classes is parent and child. According to Java the parent class is called super class and the child class is called sub class.

In java we provide inheritance using 'extends' keyword.

*By using inheritance all the feature of super class is by default available to the sub class so the sub class need not to start the process from begning onwards.

Inheritance provides IS-A relation between the classes. IS-A relation is tightly coupled relation (Blood Relation) so if we modify the super class content then automatically sub class content will also modify.

Inheritance provides us hierarchical classification of classes, In this hierarchy if we move towards upward direction more generalized properties will occur, on the other hand if we move towards downwand more specialized properties will occur.
--------------------------------------------------------------------
Types of Inheritance in java :
------------------------------
Java supports 5 types of inheritance :

 1) Single level Inheritance
 2) Multi level Inheritance
 3) Hierarchical Inheritance
 4) Multiple Inheritance (Not supported using class)
 5) Hybrid Inheritance (Combination of two)

//Program on Single Level Inheritance :
---------------------------------------
package com.ravi.single_level_inheritance;

class Father
{
	public void house()
	{
		System.out.println("2 BHK house");
	}
	
}
class Son extends Father
{
	public void car()
	{
		System.out.println("Audi car");
	}
}

public class SingleLevel {

	public static void main(String[] args)
	{
		Son s1 = new Son();
		s1.car();
		s1.house();

	}

}
---------------------------------------------------------------------
//Program on Single Level Inheritance :
---------------------------------------
package com.ravi.single_level_inheritance;

class Super
{
	private int x,y;
	
	public void setData(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	
}
class Sub extends Super
{
	public void showData()
	{
		System.out.println("x value is :"+getX());
		System.out.println("y value is :"+getY());
	}
}

public class SingleLevelDemo {

	public static void main(String[] args) 
	{
	   Sub s1 = new Sub();
	   s1.setData(100, 200);
	   s1.showData();

	}

}

Note : By default private varaible of super class is not available to sub class, getter is required.
--------------------------------------------------------------

How to initialize the super class properties :
----------------------------------------------
super keyword is used to access the member or to access the memory of super class.

In order to initialize the super class properties we should use super keyword in the sub class as a first line of constructor.

super keyword always referes to its immediate super class.

Just like this keyword, super keyword (non static member) also we can't use inside static context.

super keyword we can use 3 ways in java :
------------------------------------------
1) To access super class variable (Variable Hiding)
2) To access super class method (Method Overriding)
3) To access super class constructor. (Constructor Chaining)

1) To access the super class variable (Variable Hiding) :
---------------------------------------------------------
Whenever super class variable name and sub class variable name both are same then it is called variable Hiding, Here sub class variable hides super class variable.

In order to access super class variable i.e super class memory, we should use super keyword as shown in the program.

SupervarDemo.java
------------------
package com.ravi.super_keyword;

class Father
{
	protected double balance = 50000;
	
}
class Daughter extends Father
{
	protected double balance = 18000; //Variable Hiding
	
	public void getBalance()
	{
		System.out.println("Daughter balance is :"+this.balance);
		System.out.println("Father balance is :"+super.balance);
	}
	
	
}
public class SupervarDemo {

	public static void main(String[] args)
	{
		Daughter d = new Daughter();
		d.getBalance();

	}

}

2) To call super class method :
-------------------------------
If the super class non static method name and sub class non static method name both are same (Method Overriding) and if we create an object for sub class then sub class method will be 
executed (bottom to top), if we want to call super class method from sub class method body then we we should use super keyword as shown in the program.


class Alpha
{
	public String toString()
	{
		return "India";
	}
}
class Beta extends Alpha
{
	public String toString() //Method Overriding
	{
		System.out.println(super.toString());
		return "Hyderabad";
	}
}
public class SuperMethodCall 
{	
	public static void main(String[] args) 
	{
		Beta b = new Beta();
		System.out.println(b.toString());
	}
	
}  

Note :
-------
From the above program, We will get two concepts

  1) Compiler and JVM both will search the member of the class 
     from bottom to top
  2) In order to access super class method (super class memory) we 
     should use super keyword in the sub class method body.
---------------------------------------------------------------------
3) To access the super class constructor (Constructor Chaining) :
----------------------------------------------------------------
Whenever we write a class in java and we don't write any kind of constructor to the class then the java compiler will automatically add one default no argument constructor to the class.

THE FIRST LINE OF ANY CONSTRUCTOR IS RESERVERD EITHER FOR super() or this() keyword that means first line of any constructor is used to call another constructor of either same class OR super class.

In the first line of any constructor if we don't specify either super() or this() then the compiler will automatically add super() to the first line of constructor.

Now the purpose of this super() [added by java compiler], to call the default constructor or No-Argument constructor of the super class.

In order to call the constructor of super class as well as same class, we have total 4 cases.

Case 1:
-------
super() : Automatically added by java compiler to maintain the 
          hierarchy in the first line of the Constructor. It
	  is used to call default OR no argument constructor 
	  of super class.

CallingNoArgument.java
----------------------
class Alpha
{
	public Alpha()
	{
		super();
		System.out.println("Alpha class");
	}
}
class Beta extends Alpha
{
	public Beta()
	{
		super();
		System.out.println("Beta class");
	}
}
public class CallingNoArgument 
{	
	public static void main(String[] args) 
	{
		Beta b = new Beta();
		
	}
	
}  
---------------------------------------------------------------------
Case 2 :
---------
super("Java") : Must be explicitly written by user in the
                first line of constructor [not inside a method]. It is used to call the parameterized constructor of super class.

package com.ravi.constructor_test;

class Super
{
	public Super(String str)
	{	
		System.out.println("My Institute name is :"+str);
	}
}
class Sub extends Super
{
   public Sub()
   {
	   super("NIT");
	   System.out.println("No argument constructor of sub class");
   }	
}
public class ParameterizedConstructor {

	public static void main(String[] args) 
	{
		Sub s = new Sub();
	}

}
--------------------------------------------------------------------
Program that describes default constructor and super() will be added by the compiler.

ConstructorDemo.java
---------------------
package com.ravi.super_demo;

class Alpha
{
	public Alpha()
	{
		System.out.println("Alpha class Constructor!!!");
	}
}
class Beta extends Alpha
{}

class Gamma extends Beta
{
	public Gamma()
	{
		System.out.println("Gamma class Constructor!!!");
	}
}

public class ConstructorDemo {

	public static void main(String[] args) 
	{
		new Gamma();
	}

}
-------------------------------------------------------------------
Case 3 :
--------
this() : Must be explicitly written by user in the
         first line of constructor. It is used to call
          no argument constructor of current class.

package com.ravi.constructor_test;

class Super
{
	public Super()
	{		 
		 System.out.println("No argument constructor of Super class");
	}
	
	public Super(String str)
	{	
		this();
		System.out.println("My Institute name is :"+str);
	}
}
class Sub extends Super
{	
   public Sub()
   {
	  super("NIT");  
	   System.out.println("No argument constructor of sub class");
   }	
}
public class NoArgumentOfCurrentClass {

	public static void main(String[] args) 
	{
		Sub s = new Sub();
	}

}
---------------------------------------------------------------------
Case 4 :
---------
this(15) : Must be explicitly written by user in the
           first line of constructor. It is used to call
           parameterized constructor of current class.


package com.ravi.constructor_test;

class Base
{
	
	public Base()
	{
		this(15);
		System.out.println("No Argument Constructor of Base class");
	}
	
	public Base(int x)
	{
		System.out.println("Parameterized Constructor of Base class :"+x);
	}
}

class Derived extends Base
{
	public Derived()
	{
		System.out.println("No Argument Constructor of Derived class");
	}
}

public class ParameterizedConstructorOfCurrent 
{
	public static void main(String[] args) 
	{
		Derived d = new Derived();
	}

}
=====================================================================
Program on super keyword :
---------------------------
package com.ravi.constructor_test;

class Shape
{
	protected int x;
	
	public Shape(int x)
	{
		this.x = x;
		System.out.println("x value is :"+this.x);
	}	
}

class Square extends Shape
{
	public Square(int side)
	{
		super(side);
	}
	
	public void getAreaOfSquare()
	{
		double area = x * x;
		System.out.println("Area of Square is :"+area);
	}
}



public class SuperDemo1 {

	public static void main(String[] args) 
	{
		Square ss = new Square(5);
		ss.getAreaOfSquare();

	}

}
--------------------------------------------------------------------
15-11-2024
-----------
//Program on Hierarchical Inheritance 

How to provide formatting for Decimal number :
----------------------------------------------
In java.text package, there is a predefined class called DecimalFormat through which we can provide formatting for Decimal number.

DecimalFormat df = new DecimalFormat("00.00");  //format [String pattern]
System.out.println(df.format(double d));

Note :- format is non static method of DecimalFormat class which accpts double as a parameter, and return type of this method is 
String.

public String format(double number)

package com.ravi.hierarchical_demo;

import java.text.DecimalFormat;
import java.util.Scanner;

class Shape
{
	protected int x;
	
	public Shape(int x)
	{
	  this.x = x;
	  System.out.println("x value is :"+x);
	}
}
class Circle extends Shape
{	
	final double PI = 3.14;
	
	public Circle(int radius)
	{
		super(radius);
	}
	
	public void areaOfCircle()
	{
		double area = PI * x * x;
		
		DecimalFormat df = new DecimalFormat("000.000");
		System.out.println("Area of Circle is :"+df.format(area));
	}	
}

class Rectangle extends Shape
{
	 protected int breadth;
	 
	 public Rectangle(int length, int breadth)
	 {
		super(length); 
		this.breadth = breadth;
	 }
	 
	 public void areaOfRectangle()
	 {
		 double area = super.x * this.breadth;
		 System.out.println("Area of Rectangle is :"+area);
	 }
}

public class HierarchicalDemo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of Circle :");
		int radius = sc.nextInt();
		
		Circle circle = new Circle(radius);
		circle.areaOfCircle();
		
		System.out.print("Enter the length of the Rectangle :");
		int length = sc.nextInt();
		System.out.print("Enter the breadth of the Rectangle :");
		int breadth = sc.nextInt();
		
		Rectangle rectangle = new Rectangle(length, breadth);
		rectangle.areaOfRectangle();
		
		sc.close();

	}

}
--------------------------------------------------------------------
//Program on Single Level Inheritance :
---------------------------------------
package com.ravi.inheritance;

class TemporaryEmployee {
	protected int employeeId;
	protected String employeeName;
	protected String employeeAddress;

	public TemporaryEmployee(int employeeId, String employeeName, String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

}

class PermanentEmployee extends TemporaryEmployee {
	protected String department;
	protected String designation;

	public PermanentEmployee(int employeeId, String employeeName, String employeeAddress, String department, String designation) 
	{
		super(employeeId, employeeName, employeeAddress);
		this.department = department;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", department=" + department + ", designation=" + designation + "]";
	}

	
	
	
}

public class SingleLevelInheritanceDemo 
{
	public static void main(String[] args)
	{
		PermanentEmployee p = new PermanentEmployee(1, "John", "Ameerpet", "IT", "developer");
		System.out.println(p);
	}

}
--------------------------------------------------------------------
//Program on Hierarchical Inheritance :
package com.ravi.hierarchical_demo;

class Employee
{
	protected double salary;
	public Employee(double salary) 
	{
		super();
		this.salary = salary;
	}
}
class Developer extends Employee
{
	public Developer(double salary) 
	{
		super(salary);
	}

	@Override
	public String toString() 
	{
		return "Developer [salary=" + salary + "]";
	}
	
	
}

class Designer extends Employee
{
	public Designer(double salary) 
	{
		super(salary);
	}

	@Override
	public String toString() {
		return "Designer [salary=" + salary + "]";
	}	
}
public class HierarchicalDemo1 {

	public static void main(String[] args)
	{
		Developer developer = new Developer(45000);
		System.out.println(developer);
		
		Designer designer = new Designer(20000);
		System.out.println(designer);
		

	}

}
---------------------------------------------------------------------

HOW MANY WAYS WE CAN INITIALIZE THE OBJECT PROPERTIES ?
-------------------------------------------------------
The following are the ways to initialize the object properties :
----------------------------------------------------------------
public class Test
{
   int x,y;
}


1) At the time of declaration :

   Example :
   
  public class Test
   {
      int x = 10;
      int y = 20;
   }

   Test t1 = new Test();   [x = 10  y = 20]
   Test t2 = new Test();   [x = 10  y = 20]

Here the drawback is all objects will be initialized with same value.
-----------------------------------------------------------------------

2) By using Object Reference :

   public class Test
   {
      int x,y;
   }
   
   Test t1 = new Test();   t1.x=10;   t1.y=20;
   Test t2 = new Test();   t2.x=30;   t2.y=40;

   Here we are getting different values with respect to object but here the program becomes more complex.
---------------------------------------------------------------
3) By using methods :

   A) First Approach (Method without Parameter)
   ----------------------------------------------
   public class Test
   {
      int x,y;

      public void setData()  
      {                         
         x = 100;  y = 200;
      }
   }

    Test t1 = new Test();  t1.setData();  [x = 100   y = 200]
    Test t2 = new Test();  t2.setData();  [x = 100   y = 200]
    
    Here also, all the objects will be iniatilized with same 
    value.

    B) Second Approach (Method with Parameter)
    -------------------------------------------
     public class Test
     {
      int x,y;

      public void setData(int x, int y)  
      {                        
         this.x = x;
	 this.y = y;
      }
   }
   
    Test t1 = new Test();  t1.setData(12,78);  [x = 12   y = 78]
    Test t2 = new Test();  t2.setData(15,29);  [x = 15   y = 29]

    Here the Drawback is initialization and re-initialization both are done in two different lines so Constructor introduced.
----------------------------------------------------------------------
4) By using Constructor 

   A) First Approach (No Argument Constructor)
   --------------------------------------------
   public class Test
   {
      int x,y;

      public Test()  //All the objects will be initialized with
      {                                             same value
         x = 0;  y = 0;
      }     
           
   }

    Test t1 = new Test();    [x = 0   y = 0]
    Test t2 = new Test();    [x = 0   y = 0]
    

    B) Second Approach (Parameterized Constructor)
    -----------------------------------------------
     public class Test
     {
      int x,y;      

      public Test(int x, int y)  
      {                        
         this.x = x;
	 this.y = y;
      }
   }

    Test t1 = new Test(12,78);    [x = 12   y = 78]
    Test t2 = new Test(15,29);    [x = 15   y = 29]

    This is the best way to initialize our instance variable because variable initialization and variable re-initialization both will be done in the same line as well as all the objects will be initialized with different values. 

    C) Third Approach (Copy Constructor)
    --------------------------------------

       public class Manager
       {
          private int managerId;
	  private String managerName;
          
	  public Manager(Employee emp)
	  {
	    this.managerId = emp.getEmployeeId();
	    this.managerName = emp.getEmployeeName();
          }
       }

Here with the help of Object reference (Employee class) we are 
initializing the properties of Manager class. (Copy Constructor)

        d) By using instance block (Instance Initializer)
	-------------------------------------------------
	
	public class Test
	{
	   int x,y;

           public Test()
	   {
	      System.out.println(x); //100
	      System.out.println(y); //200
	   }

           //Instance block
	   {
	       x = 100; 
	       y = 200;
	   }

------------------------------------------------------------------
5) By using super keyword :

   class Super
   {
     int x,y;

     public Super(int x , int y)
     {
        this.x = x;
	this.y = y;
     }
   }
   class Sub extends Super
   {
      Sub()
      {
         super(100,200); //Initializing the properties of super class
      }
   }

   new Sub();
=====================================================================
**Why java does not support multiple Inheritance ?
--------------------------------------------------
Multiple Inheritance is a situation where a sub class wants to inherit the properties two or more than two super classes.

In every constructor we have super() or this(). When compiler will add super() to the first line of the constructor then we have an ambiguity issue that super() will call which super class constructor as shown in the diagram [15-NOV-24]

It is also known as Diamond Problem in java so the final conclusion is we can't achieve multiple inheritance using classes but same we can achieve by using interface [interface does not contain any constructor]
---------------------------------------------------------------------
18-11-2024
----------
Access modifiers in java :
---------------------------
In order to define the accessibility level of the class as well as member of the class we have 4 access modifiers :

1) private (Within the same class)
2) default (Within the same package)
3) protected (Within the same package Or even from another 
              package by using Inheritance)
4) public (No Restriction)
---------------------------------------------------------------------
private :
---------
It is the most restrictive access modifier because the member declared as private can't be accessible from outside of the class.
In Java we can't declare an outer class as a private or protected. Generally we should declare the data member(variables) as private.

In java outer class can be declared as public, abstract, final, sealed and non-sealed only.

default :-
----------
It is an access modifier which is less restrictive than private. It is such kind of access modifier whose physical existance is not avaialble that means when we don't specify any kind of access modifier before the class name, variable name or method name then by default it would be default.

As far as its accessibility is concerned, default members are accessible within the same folder(package) only. It is also known as private-package modifier.


protected :
------------
It is an access modifier which is less restrictive than default because the member declared as protected can be accessible from the outside of the package (folder) too but by using inheritance concept.

2 files :
----------
Test.java  [It is available in com.ravi.m1 package]
----------------------------------------------------
package com.ravi.m1;

public class Test 
{
    protected int x = 500; 
}

ELC.java   [It is available in com.ravi.m2 package]
----------------------------------------------------
package com.ravi.m2;

import com.ravi.m1.Test;

public class ELC extends Test
{
	public static void main(String[] args) 
	{
		ELC e = new ELC();
		System.out.println(e.x); //x variable is accessible
	}                                  because declared with 
                                           Protected AM.
}
----------------------------------------------------------------------
public :
-------
It is an access modifier which does not contain any kind of restriction that is the reason the member declared as public can be accessible from everywhere without any restriction.

According to Object Oriented rule we should declare the classes and methods as public where as variables must be declared as private or protected according to the requirement.

Note : If a method is used for internal purpose only (like validation)
then we can declare that method as private method.It is called 
Helper method.
---------------------------------------------------------------------
--------------------------------------------------------------------
JVM Architecture with class loader sub system :
-----------------------------------------------
The entire JVM Architecture is divided into 3 sections :

1) Class Loader sub system
2) Runtime Data areas (Memory Areas)
3) Execution Engine

Class Loader Sub System :
-------------------------
The main purpose of Class Loader sub system to load the required .class file into JVM Memory from different memory loactions.

In order to load the .class file into JVM Memory, It uses an algorithm called "Delegation Hierarchy Algoroithm".

Internally, Class Loader sub system performs the following Task

      1) LOADING
      2) LINKING
      3) INITIALIZATION


LOADING :
---------
In order to load the required .class file, JVM makes a request to class loader sub system. The class loader sub system follows delegation hierarchy algorithm to load the required .class files from different areas.

To load the required .class file we have 3 different kinds of class loaders.

1) Bootstrap/Primordial class loader

2) Extension/Platform class loader

3) Application/System class loader

Bootstrap/Primordial class Loader :-
------------------------------------
It is responsible for loading all the predefined .class files that means all API level predefined classes are loaded by Bootstrap class loader.

It has the highest priority becuase Bootstrap class loader is the super class for Platform class loader.

It loads the classes from the following path 
C -> Program files -> Java -> JDK -> lib -> jrt-fs.jar 

Platform/Extension class loader :
----------------------------------
It is responsible to load the required .class file which is given by some 3rd party in the form of jar file.

It is the sub class of Bootstrap class loader and super class of Application class loader so it has more priority than Application class loader.

It loads the required .class file from the following path.
C -> Program files -> Java -> JDK -> lib -> ext -> ThirdParty.jar 

Command to create the jar file :
jar cf FileName.jar FileName.class         [*.class]

[If we want to compile more than one java file at a time then the command is :  javac *.java]

Application/System class loader :
---------------------------------------
It is responsible to load all userdefined .class file into JVM memory.

It has the lowest priority because it is the sub class Platform class loader.

It loads the .class file from class path level or environment 
variable.

How Delegation Hierarchy algorithm works :-
---------------------------------------------------
Whenever JVM makes a request to class loader sub system to load the required .class file into JVM memory, first of all, class loader sub system makes a request to Application class loader, Application class loader will delegate(by pass) the request to the Extension class loader, Extension class loader will also delegate the request to Bootstrap class loader.

Bootstrap class loader will load the .class file from lib folder(jrt-fs.jar) and then by pass the request back to extension class loader, Extension class loader will load the .class file from ext folder(*.jar) and by pass the request back to Application class loader, It will load the .class file from environment variable into JVM memory. 

Note :- 
------
If all the class loaders are failed to load the .class file into JVM memory then we will get a Runtime exception i.e java.lang.ClassNotFoundException.


Note : java.lang.Object is the first class to be loaded into JVM Memory.


Note : Always Super class will be loaded before sub class loading.
       [A child cannot exist without parent]
==================================================================
What is Method Chaning in java ?
--------------------------------
It is a technique through we call multiple methods in a single 
statement.

In this method chaining, always for calling next method we depend upon last method return type.

The final return type of the method depends upon last method call as shown in the program.

MethodChainingDemo1.java
--------------------------
package com.ravi.method_chaining;

public class MethodChainingDemo1 {

	public static void main(String[] args) 
	{
		String str = "india";
		char ch = str.concat(" is great").toUpperCase().charAt(0);
		System.out.println(ch);

	}

}

MethodChainingDemo2.java
-------------------------
package com.ravi.method_chaining;

public class MethodChainingDemo2 {

	public static void main(String[] args) 
	{
		String str = "Hyderabad";
		int len =  str.concat(" is an IT city").toLowerCase().length();
		System.out.println(len);
	}

}
---------------------------------------------------------------
20-11-2024
---------
Role of java.lang.Class class in class loading :
----------------------------------------------------
There is a predefined class called Class available in java.lang pacakge.

In JVM memory whenever we load a class then it is loaded in special memory called Method Area and retutn type is java.lang.Class class object.

   java.lang.Class cls = AnyClass.class
   
 java.lang.Class class contains a predefined non static method 
 called getName() through which we can get the fully qualified 
 name [Package Name + class Name]
 
 public String getName() : Provide fully qualified name of the class. 
---------------------------------------------------------------
WAP that describes java.lang.Class will hold any class .class file into JVM Memory.

package com.ravi.method_area;

class Employee{}

class Student{}

class Sample{}

public class ClassLoadingInformation 
{
	public static void main(String[] args) 
	{
		Class cls = Employee.class;
		System.out.println(cls.getName()); //FQN (Package name + class name)
		
		cls = Student.class;
		System.out.println(cls.getName());
		
		cls = Sample.class;
		System.out.println(cls.getName());
		
	}

}
----------------------------------------------------------------------
WAP that describes Application class loader is responsible to 
load the user defined .class file


java.lang.Class class has provided a predefined non static method called getClassLoader(), the return type of this method 
is ClassLoader class.[Factory Method]

This method will provide the class loader name which is responsible to load the .class file into JVM Memory.

public ClassLoader getClassLoader()


ApplicationClassLoaderDemo.java
-------------------------------

package com.ravi.method_area;

class Customer
{
	
}

public class ApplicationClassLoaderDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Customer.class file will be loaded by :");
		System.out.println(Customer.class.getClassLoader());

	}

}


WAP to describe that Platform class loader is the super class for 
application class loader.

getClassLoader() method return type is ClassLoader so further we can call any method of ClassLoader class, ClassLoader class
has provided a method called getParent() whose return type is again ClassLoader only.

public ClassLoader getParent();

PlatformClassLoaderDemo.java
-----------------------------
package com.ravi.method_area;

class Foo
{
	
}
public class PlatformClassLoaderDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Super class of application class loader is :");
		System.out.println(Foo.class.getClassLoader().getParent());

	}

}
------------------------------------------------------------------------
//Program to show Bootstarp class loader


package com.ravi.method_area;

class Foo
{
	
}
public class PlatformClassLoaderDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Super class of platform class loader is :");
		System.out.println(Foo.class.getClassLoader().getParent().getParent());

	}

}

Note :- Here we will get the output  as null because it is built in class loader for JVM which is used for internal purpose (loading only predefined .class file) so implementation is not provided hence we are getting null.
-----------------------------------------------------------------------
Linking Phase :
---------------
verify :-
-------
It ensures the correctness of the .class files, If any suspicious activity is there in the .class file then It will stop the execution immediately by throwing a runtime error i.e java.lang.VerifyError.

There is something called ByteCodeVerifier(Component of JVM), responsible to verify the loaded .class file i.e byte code. Due to this verify module JAVA is highly secure language. 

java.lang.VerifyError is the sub class of java.lang.linkageError

prepare : 
---------
[Static variable memory allocation + static variable initialization with default value even the variable is final]

It will allocate the memory for all the static data members, here all the static data member will get the default values so if we have static int x = 100; then for variable x  memory will be allocated (4 bytes) and now it will initialize with default value i.e 0, even the variable is final.

static Test t = new Test();

Here, t is a static reference variable so for t variable (reference variable) memory will be allocated as per JVM implementation i.e for 32 bit JVM (4 bytes of Memory) and for 64 bit (8 bytes of memory) and initialized with null.


Resolve :
---------
All the symbolic references (like #7) will be converted into direct references OR actual reference.

javap -verbose  FileName.class

Note :- By using above command we can read the internal details of .class file.
-----------------------------------------------------------------------
Initialization :
-----------------
Here class initialization will take place. All the static data member will get their actual/original value and we can also use static block for static data member initialization.

Here, In this class initialization phase static variable and static block is having same priority so it will executed according to the order.(Top to bottom)
-----------------------------------------------------------------------
21-11-2024
-----------
Static Block in java :
-----------------------
It is a special block in java which is automatically executed at the time of loading the .class file.

Example :

static
{

}

Static blocks are executed only once because in java we can load the .class files only once.

If we have more than one static block in a class then it will be executed according to the order [Top to bottom]


The main purpose of static block to initialize the static data member of the class so it is also known as static initializer.

In java, a class is not loaded automatically, it is loaded based on the user request so static block will not be executed everytime, It depends upon whether class is loaded or not. 

static blocks are executed before the main or any static method.

A static blank final field must be initialized inside the static block only.

static final int A;   //static blank final field

static
{
   A = 100;
}

A static blank final field also have default value.

We can't write any kind of return statement inside static block.

If we don't declare static variable before static block body execution then we can perform write operation(Initialization is possible due to prepare phase) but read operation is not possible directly otherwise we will get an error Illegal forward reference, It is possible with class name bacause now compiler knows that variable is coming from class area OR Method area.
-----------------------------------------------------------------------
//static block
class Foo
{		
	Foo()
	{
		System.out.println("No Argument constructor..");
	}

	{
		System.out.println("Instance block..");
	}

	static
	{
		System.out.println("Static block...");
	}
	
}
public class StaticBlockDemo 
{	
	public static void main(String [] args) 
	{		
		System.out.println("Main Method Executed ");		
	}	
}

Here Foo.class file is not loaded into JVM Memory so static block of Foo class will not be executed.
--------------------------------------------------------------
class Test
{
	static int x;

	static
	{
		x = 100;
		System.out.println("x value is :"+x);
	}
	
	static
	{
		x = 200;
		System.out.println("x value is :"+x);
	}

	static 
	{
		x = 300;
		System.out.println("x value is :"+x);
	}

	
}
public class StaticBlockDemo1   
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		System.out.println(Test.x);
	}
}

Note : If a class contains more than 1 static block then it will be executed from top to bottom.
--------------------------------------------------------------
class Foo
{	
	static int x;

    static
	{		
		System.out.println("x value is :"+x);
	}	
}

public class StaticBlockDemo2 
{
	public static void main(String[] args) 
	{
		 new Foo();
	}
}

Note : static variables are also having default value.
--------------------------------------------------------------
class Demo
{
	
	final static int a ;	//Blank static final field

	static
	{	
		m1(); 
		a = 100;	
		System.out.println("User Value :"+a);
	}
	
	public static void m1()
	{
		System.out.println("Default Value :"+a);
	}
	
	
}	
public class  StaticBlockDemo3
{
	public static void main(String[] args) 
		{		
	         System.out.println("a value is :"+Demo.a);		
	    }
}

A static black final field must be initailized inside static block only and it also contains default value.
------------------------------------------------------------------
class  A        //AD  BC  EF
{
	static 
	{
		System.out.println("A");
	}
	 
	{
		System.out.println("B");
	}

	A() 
	{		
		System.out.println("C");
	}
}
class B extends A
{
	static 
	{
		System.out.println("D");
	}

	 
	{
		System.out.println("E");
	}

	B() 
	{		
		System.out.println("F");
	}

}
public class StaticBlockDemo4 
{
	public static void main(String[] args) 
	{
		new B();  
	}
}
------------------------------------------------------------------
22-11-2024
-----------
//illegal forward reference

class Demo 
{	
    static
	{   
		i = 100;  //valid		
	}

    static int i;
}

public class StaticBlockDemo5
{
    public static void main(String[] args) 
	{
        System.out.println(Demo.i);
	}
}
------------------------------------------------------------------
class Demo 
{
    static 
	{   
		i = 100;
		//System.out.println(i);  //Invalid
		System.out.println(Demo.i); //Valid
    }

    static int i;
}

public class StaticBlockDemo6
{

    public static void main(String[] args) 
	{
		System.out.println(Demo.i);
	}
}
------------------------------------------------------------------
class StaticBlockDemo7 
{
	static 
	{
      System.out.println("Static Block");
	  return; 
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}
}

Note : All the initializer must be executed normally so we can't write return statement OR any transfer statement.
------------------------------------------------------------------
public class StaticBlockDemo8 
{
    final static int x; //Blank static final field

    static
	{		
		m1();		
		x = 15;		
	}

    public static void m1()
	{
		System.out.println("Default value of x is :"+x);
	}

	public static void main(String[] args) 
	{
		System.out.println("After initialization :"+StaticBlockDemo8.x);
	}
}

Note : A static blank final field must be initialized inside the 
       static block only as well as it has also default value.
 ----------------------------------------------------------------
class Test
{   
	public static final Test t1 = new Test(); //t1 = null
	
    static
	{
	   System.out.println("static block");
	}

	{
	   System.out.println("Non static block");
	}

	Test()
	{
		System.out.println("No Argument Constructor");
	}
	
}

public class StaticBlockDemo9 
{
	public static void main(String[] args) 
	{
		new Test();  //2 steps (class loading + Object creation)
	}
}

Note : First non static block, constructor then only static block will be executed.
==================================================================
Variable Memory Allocation and Initialization :
-------------------------------------------------
1) static field OR Class variable : 
-----------------------------------
Memory allocation done at prepare phase of class loading and initialized with default value even variable is final.

It will be initialized with Original value (If provided by user at the time of declaration) at class initialization phase.

When JVM will shutdown then during the shutdown phase class will be un-loaded from JVM memory so static data members are destroyed. They have long life.

2) Non static field OR Instance variable 
-----------------------------------------
Memory allocation done at the time of object creation using new keyword (Instantiation) and initialized as a part of Constructor with default values even the variable is final. [Object class-> at the time of declaration -> instance block -> constructor]

When object is eligible for GC then object is destroyed and all the non static data memebers are also destroyed with corresponding object. It has less life in comparison to static data members becuase they belongs to object.

3) Local Variable 
------------------
Memory allocation done at stack area (Stack Frame) and developer is responsible to initialize the variable before use. Once metod execution is over, It will be deleted from stack Frame henec it has shortest life.

4) Parameter variable 
----------------------
Memory allocation done at stack area (Stack Frame)  and end user is responsible to pass the value at runtime. Once metod execution is over, It will be deleted from stack Frame henec it has shortest life.

Note : We can done validation only one parameter variables.
------------------------------------------------------------------
Can we write a Java Program without main method ?
--------------------------------------------------
class WithoutMain
{
   static
   {
       System.out.println("Hello User!!");
       System.exit(0);
   }
}

It was possible to write a java program without main method till JDK 1.6V. From JDK 1.7v onwards, at the time of loading the .class file JVM will verify the presence of main method in the .class file. If main method is not available then it will generate a runtime error that "main method not found in so so class".
------------------------------------------------------------------
How many ways we can load the .class file into JVM memory :
-----------------------------------------------------------
There are so many ways to load the .class file into JVM memory but the following are the common examples :

1) By using java command

   public class Test
   {
   }

   javac Test.java
   java Test 

   Here we are making a request to class loader sub system to load Test.class file into JVM memory


2) By using Constructor (new keyword at the time of creating object).

3) By accessing static data member of the class.

4) By using inheritance 

5) By using Reflection API
------------------------------------------------------------------
//Program that describes we can load a .class file by using new keyword (Object creation) OR by accessing static data member of the class.

class Demo
{
	static int x = 10;
	static
	{
		System.out.println("Static Block of Demo class Executed!!! :"+x);
	}
}
public class ClassLoading 
{
	public static void main(String[] args) 
	{	
		System.out.println("Main Method");
		new Demo();
	    //System.out.println(Demo.x);	
	}
}
------------------------------------------------------------------
//Program that describes whenever we try to load sub class, first of all super class will be loaded. [before parent, child can't exist]

class Alpha
{
	static
	{
		System.out.println("Static Block of super class Alpha!!");
	}
}
class Beta extends Alpha 
{
	static
	{
		System.out.println("Static Block of Sub class Beta!!");
	}
}
class InheritanceLoading 
{
	public static void main(String[] args) 
	{
		 new Beta();
	}
}
------------------------------------------------------------------
Loading the .class file by using Reflection API :
-------------------------------------------------
java.lang.Class class has provided a predefined static factory method called forName(String className), It is mainly used to load the given .class file at runtime, The return type of this method is java.lang.Class

public static java.lang.Class forName(String className)

Note : This method throws a checked execption i.e ClassNotFoundException 

class Demo
{
   static
   {
       System.out.println("static block");
   }
}
public class Main
{
   public static void main(String [] args) throws ClassNotFoundException
   {
       Class.forName("Demo");
   }
}

-------------------------------------------------------------------
loading .class file by using Class.forName(String className) at runtime using Eclipse IDE :

package com.ravi.static_block;

class Ravi
{
	static
	{
		System.out.println("Static Block of Ravi class");
	}
}

public class ClassLoading 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class.forName("com.ravi.static_block.Ravi");
	}

}

Note : In eclipse IDE a class is represented by (FQN) Fully Qualified Name (Package Name + class name)
-------------------------------------------------------------------
** What is the difference between java.lang.ClassNotFoundException and java.lang.NoClassDefFoundError 


java.lang.ClassNotFoundException :-
-----------------------------------------
It occurs when we try to load the required .class file at RUNTIME by using Class.forName(String className) statement or loadClass() static of ClassLoader class and if the required .class file is not available at runtime then we will get an exception i.e java.lang.ClassNotFoundException

Note :- It does not have any concern at compilation time, at run time, JVM will simply verify whether the required .class file is available or not available.



package com.ravi.static_block;

class Ravi
{
	static
	{
		System.out.println("Static Block of Ravi class");
	}
}

public class ClassLoading 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class.forName("Ravi");
	}

}

Note : In the above program we will get get java.lang.ClassNotFoundException because Ravi class is not identified by Application class loader, In Eclise IDE Fully Qualified Name is reqd.
-------------------------------------------------------------------
java.lang.NoClassDefFoundError :
--------------------------------
It occurs when the class was present at the time of COMPILATION but at runtime the required .class file is not available(manualy deleted by user ) Or it is not available in the current directory (Misplaced) then we will get a runtime error i.e java.lang.NoClassDefFoundError.


class Hello
{
	public void greet()
	{
		System.out.println("Hello Batch 39");
	}
}
public class NoClassDefFoundErrorDemo 
{
	public static void main(String[] args) 
	{
		Hello h = new Hello();
		h.greet();
	}
}

Note : 1) After compilation delete Hello.class file from the current folder and execute the program, we will get java.lang.NoClassDefFoundError

       2) In order to solve the issue , we need to re-compile 
          the code to generate a new .class file.	  
-------------------------------------------------------------------
** A static method does not act on instance variable directly why?
 
 All the static members (static variable, static block, static method, static nested inner class) are loaded/executed at the time of loading the .class file into JVM Memory.

At class loading phase object is not created because object is created in the 2nd phase i.e Runtime data area so at the TIME OF EXECUTION OF STATIC METHOD AT CLASS LOADING PAHSE, NON STATIC VARIABLE WILL NOT BE AVAILABLE henec we can't access non static variable from static context[static block, static method and static nested inner class]

Test.java
----------
public class Test 
{
	int x = 100;
	
	public static void main(String[] args) 
	{
		System.out.println(x); //error
	}
}


class Test
{
	private int x;
	
	public Test(int x)
	{
		this.x = x;
	}
	
	public static void access()
	{
		System.out.println(x);	//error
	}	
}
public class StaticDemo 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test(10);
		Test.access();
	}
}

===================================================================
Accessing variable of Sub class and Super class by using static method.

package com.ravi.inheritance;

class Super
{
	protected int x = 100;
}
class Sub extends Super
{
	protected int x = 200; //Variable Hiding
	
	public static void access()
	{
		Sub s1 = new Sub();
		System.out.println(s1.x);
		
		Super s2 = s1;  //Up casting
		System.out.println(s2.x);
	}
}

public class StaticTest 
{
	public static void main(String[] args) 
	{
		Sub.access();
	}

}

===================================================================
25-11-2024
----------
Runtime Data Areas :
---------------------
It is also known as Memory Area.

Once a class is loaded then based on variable type method type it is divided into different memory areas which are as follows :

1) Method Area 
2) HEAP Area
3) Stack Area
4) PC Register
5) Native Method Stack

Method Area :
-------------
Whenever a class is loaded then the class is dumpped inside method area and returns java.lang.Class class.

It provides all the information regarding the class like name of the class, name of the package, static and non static fields available in the class, methods available in the class and so on.

We have only one method area per JVM that means for a single JVM we have only one Method area.

This Method Area OR Class Area is sharable by all the objects.
--------------------------------------------------------------
Program to Show From Method Area we can get complete information of the class. (Reflection API)

2 files :
---------
Test.java
-----------
package com.ravi.class_info;

import java.util.Scanner;

public class Test 
{
   int x = 100;
   static Scanner sc = new Scanner(System.in);
   static int y = 200;
   int z = 300;
   
   public void input() {}
   
   public static void accept() {}
      
   public void display() {}   
   
   public void show() {}
   
   public void m1() {}
   
}

ClassInformationDemo.java
--------------------------
package com.ravi.class_info;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInformationDemo 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
      Class cls =  Class.forName(args[0]);
      
      System.out.println("Class Name is :"+cls.getName());
      System.out.println("Package Name is :"+cls.getPackageName());
      
      Method[] methods = cls.getDeclaredMethods();
      System.out.println("Method names are :");
      int count = 0;
      for(Method method : methods)
      {
    	  System.out.println(method.getName());
    	  count++;
      }
      
      System.out.println("Total number of Methods are :"+count);
      
      count = 0;
      Field[] fields = cls.getDeclaredFields();
      
      System.out.println("Available fields are :");
      
      for(Field field : fields)
      {
    	  System.out.println(field.getName());
    	  count++;
      }
      System.out.println("Total number of fields are :"+count);
	}
}

javac ClassInformationDemo.java
java ClassInformationDemo FQN of the class



Note :- getDeclaredMethods() is a predefined non static method available in java.lang.Class class , the return type of this method is Method array where Method is a predefined class available in java.lang.reflect sub package.

getDeclaredFields() is a predefined non static method available in java.lang.Class class , the return type of this method is Field array where Field is a predefined class available in java.lang.reflect sub package.

Field and Method both the classes are providing getName() method to get the name of the field and Method.
=====================================================================
HEAP AREA :
-----------
Whenever we create an object in java then the properties and behavior of the object are strored in a special memory area called HEAP AREA.

We have only one HEAP AREA per JVM.
--------------------------------------------------------------
STACK Area :
------------
All the methods are executed as a part of Stack Area.

Whenever we call a method in java then internally one stack Frame will be created to hold method related information.

Every Stack frame contains 3 parts :
1) Local Variable arrays
2) Frame Data
3) Operand Stack.

We have multiple stack area for a single JVM.

Everytime we create a thread in java then JVM will create a separate Runtime Stack.[Multithreading]

=====================================================================
HEAP and STACK Diagram for Beta.java
------------------------------------

class Alpha
{
	int val;

	static int sval = 200;
	static Beta b = new Beta();

	public Alpha(int val)
	{
      this.val = val;
	}
}

public class Beta    
{
	public static void main(String[] args) 
	{
		Alpha am1 = new Alpha(9);
		Alpha am2 = new Alpha(2);

		Alpha []ar = fill(am1, am2); 

		ar[0] = am1; 
        System.out.println(ar[0].val); 
        System.out.println(ar[1].val);
	}

	public static Alpha[] fill(Alpha a1, Alpha a2)
	{
		a1.val = 15;   

        Alpha fa[] = new Alpha[]{a2, a1}; 
			
		return fa;
	}
}
---------------------------------------------------------------------
26-11-2024
----------
PC Register :
-------------
It stands for Program counter Register.

In order to hold the current executing instruction of running thread we have separate PC register for each and every thread.
----------------------------------------------------------------
Native Method Stack :
----------------------
Native method means, the java methods which are written by using native languages like C and C++. In order to write native method we need native method library support.

Native method stack will hold the native method information in a separate stack.
---------------------------------------------------------------------
Execution Engine : [Interpreter + JIT Compiler]

Interpreter 
------------
In java, JVM contains an interpreter which executes the program line by line. Interpreter is slow in nature because at the time of execution if we make a mistake at line number 9 then it will throw the execption at line number 9 and after solving the execption again it will start the execution from line number 1 so it is slow in execution that is the reason to boost up the execution java software people has provided JIT compiler.

JIT Compiler :
--------------
It stands for just in time compiler. The main purpose of JIT compiler to boost up the execution so the execution of the program will be completed as soon as possible.

JIT compiler holds the repeated instruction like method signature, variables, native method code and make it available to JVM at the time of execution so the overall execution becomes very fast.

=====================================================================
HAS-A Relation :
----------------
If we use any class (Engine class) as a property to another class (Car class) then it is called HAS-A relation.

class Engine
{
}

class Car
{
   private Engine engine;  //HAS-A relation
}


Association :
---------------
Association is a connection between two separate classes that can be built up through their Objects. 

The association builds a relationship between the classes and describes how much a class knows about another class. 

This relationship can be unidirectional or bi-directional. In Java, the association can have one-to-one, one-to-many, many-to-one and many-to-many relationships.

Example:-
One to One: A person can have only one PAN card
One to many: A Bank can have many Employees
Many to one:  Many employees can work in single department 
Many to Many: A Bank can have multiple customers and a customer can have multiple bank accounts.

3 files :
---------
Student.java
-------------
package com.ravi.association;

public class Student 
{
	private int studentId;
	private String studentName;
	private int studentMarks;

	public Student(int studentId, String studentName, int studentMarks)
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}

}


Trainer.java
-------------
package com.ravi.association;

import java.util.Scanner;

public class Trainer 
{
	public static void viewStudentProfile(Student obj)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student id :");
		int id = sc.nextInt();		
         
		if(id == obj.getStudentId())
		{
			System.out.println(obj);
		}
		else
		{
			System.err.println("Sorry! No such student with given id");
		}
		sc.close();
		
	}
	
}

AssociationDemo.java
----------------------
package com.ravi.association;

public class AssociationDemo {

	public static void main(String[] args)
	{
		Student raj = new Student(1, "Raj", 88);
		Trainer.viewStudentProfile(raj);

	}

}
---------------------------------------------------------------------
Composition (Strong reference) :
--------------------------------
Composition in Java is a way to design classes such that one class contains an object of another class. It is a way of establishing a "HAS-A" relationship between classes.

Composition represents a strong relationship between the containing class and the contained class.If the containing object (Car object) is destroyed, all the contained objects (Engine object) are also destroyed.

A car has an engine. Composition makes strong relationship between the objects. It means that if we destroy the owner object, its members  will be also destroyed with it. For example, if the Car is destroyed the engine will also be destroyed as well.

Program Guidelines :
--------------------
One object can't exist without another object
We will not create two separate objects

3 files :
-----------
Engine.java
-----------
package com.ravi.composition;

public class Engine 
{
	private String engineType;
	private int horsePower;

	public Engine(String engineType, int horsePower) 
	{
		super();
		this.engineType = engineType;
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", horsePower=" + horsePower + "]";
	}
	
	

}

Car.java
---------
package com.ravi.composition;

public class Car {
	private String carName;
	private int carModel;
	private final Engine engine; // HAS-A Relation

	public Car(String carName, int carModel)
	{
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.engine = new Engine("Battery", 1200); // Composition
	}

	@Override
	public String toString() 
	{
		return "Car [carName=" + carName + ", carModel=" + carModel + ", engine=" + engine + "]";
	}

}

CompostionDemo.java
--------------------
package com.ravi.composition;

public class CompostionDemo 
{
	public static void main(String[] args) 
	{
		Car naxon = new Car("Tata Naxon", 2024);
		System.out.println(naxon);

	}

}
---------------------------------------------------------------------
Aggregation (Weak Referance) :
------------------------------
Aggregation in Java is another form of association between classes that represents a "HAS-A" relationship, but with a weaker bond compared to composition. 

In aggregation, one class contains an object of another class, but the contained object can exist independently of the container. If the container object is destroyed, the contained object can still exist.


College.java
-------------
package com.ravi.aggregation;

public class College 
{
	private String collegeName;
	private String collgeLocation;

	public College(String collegeName, String collgeLocation) 
	{
		super();
		this.collegeName = collegeName;
		this.collgeLocation = collgeLocation;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collgeLocation=" + collgeLocation + "]";
	}
	
	
	
	
	

}

Student.java
--------------
package com.ravi.aggregation;

public class Student {
	private int studentId;
	private String studentName;
	private College collge; // HAS-A Relation

	public Student(int studentId, String studentName, College collge) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.collge = collge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", collge=" + collge + "]";
	}
	

}

AggregationDemo.java
----------------------
package com.ravi.aggregation;

public class AggregationDemo {

	public static void main(String[] args) 
	{
		College c1 = new College("VIT", "Vellore");
			
		
		Student s1 = new Student(1, "Scott", c1);
		
		Student s2 = new Student(2, "Martin", c1);
		Student s3 = new Student(3, "Smith", c1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}

Note :- IS-A relation is tightly coupled relation so if we modify the content of super class, sub class content will also modify but in HAS-A realtion we are accessing the properties of another class so we are not allowed to modify the content, we can access the content or Properties.

=====================================================================
27-11-2024
----------
Description of System.out.println() :
-------------------------------------
public class System
{
   public final static java.io.PrintStream out = null;  //HAS-A Relation
}


System.out.println();

Internally System.out.println() creates HAS-A relation because System class contains a predefined class called java.io.PrintStream as shown in the above example.

The following program describes that how System.out.println() works internally :

package com.ravi.s_o_p;

class Test
{
	static final String str = "Hyderabad";
}

public class Description {

	public static void main(String[] args)
	{
		System.out.println(Test.str.length());

	}

}
---------------------------------------------------------------------

***Polymorphism :
-----------------
Poly means "many" and morphism means "forms".

It is a Greek word whose meaning is "same object having different behavior".

In our real life a person or a human being can perform so many task, in the same way in our programming languages a method or a constructor can perform so many task.

Eg:-

void add(int a, int b)

void add(int a, int b, int c)

void add(float a, float b)

void add(int a, float b)
---------------------------------------------------------------------
Types of Polymorphism :
------------------------

Polymorphism can be divided into two types :

1) Static polymorphism OR Compile time polymorphism OR Early binding

2) Dynamic Polymorphism OR Runtime polymorphism OR Late binding
----------------------------------------------------------------
1) Static Polymorphism :
------------------------
The polymorphism which exist at the time of compilation is called Static OR compile time polymorphism.

In static polymorphism, compiler has very good idea that which method is invoked depending upon METHOD PARAMETER.

Here the binding of the method is done at compilation time so, it is known as early binding.

We can achieve static polymorphism by using Method Overloading concept.

Example of static polymorphism : Method Overloading.


2) Dynamic Polymorphism 
-----------------------
The polymorphism which exist at runtime is called Dynamic polymorphim Or Runtime Polymorphism.

*Here compiler does not have any idea about method calling, at runtime JVM will decide which method will be invoked depending upon CLASS TYPE OBJECT.

Here method binding is done at runtime so, it is also called Late Binding.

We can achieve dynamic polymorphism by using Method Overriding.

Example of Dynamic Polymorphism : Method Overriding

====================================================================
Method Overloading :
--------------------
Writing two or more methods in the same class or even in the super and sub class in such a way that the method name must be same but the argument must be different.

While Overloading a method we can change the return type of the method.

If parameters are same but only method return type is different then it is not an overloaded method.

Method overloading is possible in the same class as well as super and sub class.

While overloading the method the argument must be different otherwise there will be ambiguity problem.

Method Overloading allows us to write two methods with same name but differ in:
1. Number of parameters  
2. Data type of parameters   
3. Sequence of data type of parameters(int -long and long int)

IQ :
----
Can we overload the main method/static method ?

Yes, we can overload the main method OR static method but the execution of the program will start from main method which accept String [] array as a parameter.

Note :- The advantage of method overloading is same method name we can reuse for different functionality for refinement of the method.

Note :- In System.out.println() or System.out.print(), print()
        and println() methods are best example for Method Overloading.
	
Example :
----------
public void makePayment(Cash c)
{
}
public void makePayment(UPI c)
{
}
public void makePayment(CreditCard c)
{
}
-------------------------------------------------------------------
28-11-2024
----------
Program on Constructor Overloading :
------------------------------------
package com.ravi.overloading;

class Calculate
{
	 public Calculate()
	 {
		 this(10,20);
	 }
	 public Calculate(int x, int y)
	 {
		 this(100,200,300);
		 System.out.println("Sum of two integer is :"+(x+y));
	 }
	 public Calculate(int x, int y, int z)
	 {
		 System.out.println("Sum of three integer is :"+(x+y+z));
	 }
}

public class ConstructorOverloading {

	public static void main(String[] args) 
	{
		new Calculate();
	}

}
-------------------------------------------------------------------
Program on Method Overloading :
--------------------------------
package com.ravi.overloading;

class Addition
{
	public int add(int x, int y)
	{
		return x+y;
	}
	
	public double add(double x, double y)
	{
		return x+y;
	}
	
	public String add(String x, String y)
	{
		return x+y;
	}
}

public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		Addition a1 = new Addition();
		int sum = a1.add(12, 24);
		System.out.println("Sum of two integer is :"+sum);
		
		double add = a1.add(2.3, 8.9);
		System.out.println("Sum of two double is :"+add);
		
		String concat = a1.add("Data", "base");
		System.out.println("String after Concatenation :"+concat);

	}

}
------------------------------------------------------------------
Var-Args :
------------
It was introduced from JDK 1.5 onwards.

It stands for variable argument. It is an array variable which can hold 0 to n number of parameters of same type or different type by using Object class.

It is represented by exactly 3 dots (...) so it can accept any number of argument (0 to nth) that means now we need not to define method body again and again, if there is change in method parameter value.

var-args must be only one and last argument.

We can use var-args as a method parameter only.
-------------------------------------------------------------------

package com.ravi.overloading;

class Test
{
	public void input(int  ...x)
	{
		System.out.println("Var args executed");
	}
}

public class VarArgsDemo1 {

	public static void main(String... args) 
	{
		Test t1 = new Test();
		t1.input();
		t1.input(5);
		t1.input(5,10);
		t1.input(5,10,20);
	}

}

Note : We can pass 0 to n numbewr of parameters.
-------------------------------------------------------------------
//Finding the sum of parameters

package com.ravi.overloading;

class AddParameter
{
	public void acceptAndAddParameter(int ...values)
	{
		int sum = 0;
		for(int value : values)
		{
			sum = sum + value;
		}
		System.out.println("Sum of parameter is :"+sum);
	}
}

public class VarArgsDemo2 
{
	public static void main(String[] args) 
	{
		AddParameter a = new AddParameter();
		a.acceptAndAddParameter(10,20,30);
		a.acceptAndAddParameter(100,200,300,400);

	}

}

------------------------------------------------------------------
//We can hetrogeneous types of data
package com.ravi.overloading;

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

	public static void main(String[] args) 
	{
		Hetro h = new Hetro();
		h.acceptHetro(12,89.90,'C',34.89, new String("NIT"));

	}

}
------------------------------------------------------------------
//Var args must be only one and last argument.
package com.ravi.overloading;

class Demo 
{
	// All commented codes are invalid
	
	/*
	 * public void accept(float ...x, int ...y) { }
	 * 
	 * public void accept(int ...x, int y) { }
	 * 
	 * public void accept(int...x, int ...y) {}
	 */
	  
	 
	public void accept(int x, int... y)   // Valid
	{
		System.out.println("x value is :" + x);
		
		for (int z : y) 
		{
			System.out.println(z);
		}
	}
}


public class VarArgsDemo4 
{
   public static void main(String[] args) 
   {
	  Demo d = new Demo();
	  d.accept(12,10,20,30,40);
   }
}
-------------------------------------------------------------------
Wrapper classes in java :
-------------------------
We have 8 primitive data types in java i.e byte, short, int, long and so on.

Except these 8 primitive data types, everything in java is an object.

If we remove these 8 primitive data types then only java can become pure object oriented language.

On these primitive data types, we can't assign null or we can't invoke a method.

These primitive data types are unable to move in the network, only objects are moving in the network.

We can't perform serialization and object cloning on primitive data types.It is only possible with objects.

To avoid the above said problems, From JDK 1.5v, java software people has provided the following two concepts :

a) Autoboxing
b) Unboxing

Autoboxing 
--------------
When we convert the primitive data types into corresponding wrapper object then it is called Autoboxing as shown below.

Primitive type		Wrapper Object
----------------             ------------------
byte			-	Byte
short			-	Short
int			-	Integer
long			-	Long
float			-	Float
double			-	Double
char			-	Chracter
boolean			-	Boolean 

Note : ALL THE WRAPPER CLASSES ARE IMMUTABLE(UN-CHANGED) AS WELL AS equals(Object obj) and hashCode() methods are overridden in all the Wrapper classes.
------------------------------------------------------------------
WAP to show that Wrapper classes are immutable so if we modify try to modify the object then original object will not be modified.
package com.ravi.aggregation;

public class ImmutableDemo {

	public static void main(String[] args) 
	{
		Integer i = new Integer(12);
        accept(i);
        System.out.println(i);        
	}
	
	public static void accept(Integer y)
	{
		y = 22;
	}

}
-------------------------------------------------------------------
String is also an immutable class as shown in the program.

package com.ravi.aggregation;

public class ImmutableDemo2
{
	public static void main(String[] args) 
	{
		String str = "india";
		accept(str);
		System.out.println(str);
	}
	
	public static void accept(String s1)
	{
		s1 = "Hyd";
	}

}
------------------------------------------------------------------
//Integer.valueOf(int);
public class AutoBoxing1
{
	public static void main(String[] args) 
	{
		int a = 12;
		Integer x = Integer.valueOf(a); //Upto 1.4 version
		System.out.println(x);

		
        int y = 15;
		Integer i = y;   //From 1.5 onwards compiler takes care
		System.out.println(i);		
	}
}

------------------------------------------------------------------
public class AutoBoxing2
{  
	public static void main(String args[])
	{  
		byte b = 12;
	    Byte b1 = Byte.valueOf(b);
	   System.out.println("Byte Object :"+b1);
	   
	   short s = 17;
	   Short s1 = Short.valueOf(s);
	   System.out.println("Short Object :"+s1);
	   
	   int i = 90;
	   Integer i1 = Integer.valueOf(i);
	   System.out.println("Integer Object :"+i1);
	   
	  	long g = 12;
		Long h =  Long.valueOf(g);
		System.out.println("Long Object :"+h);
		
		float f1 = 2.4f;
		Float f2 = Float.valueOf(f1);
		System.out.println("Float Object :"+f2);
		
		double k = 90.90;
		Double l = Double.valueOf(k);
		System.out.println("Double Object :"+l);
		
		char ch = 'A';
		Character ch1 = Character.valueOf(ch);
		System.out.println("Character Object :"+ch1);
		
		boolean x = true;
		Boolean x1 = Boolean.valueOf(x);
		System.out.println("Boolean Object :"+x1);
	   
	   
			}   
}

In the above program we have used 1.4 approach so we are converting primitive to wrapper object manually.
--------------------------------------------------------------
Overloaded valueOf() method :
-----------------------------
We have 3 overloaded valueOf() method :
----------------------------------------
1) public static Integer valueOf(int x) : It will convert the given int value into Integer Object.

2) public static Integer valueOf(String str) : It will convert
   the given String into Integer Object.
   [valueOf() method will convert the String into Wrapper object where as parseInt() method will convet the String into primitive type]

3) public static Integer valueOf(String str, int radix/base) :
   It will convert the given String number into Integer object 
   by using the specified radix or base.

 Note :- We can pass base OR radix upto 36
i.e A to Z (26) + 0 to 9 (10) -> [26 + 10 = 36], It can be 
calculated by using Character.MAX_RADIX.

Output will be generated on the basis of radix

System.out.println(Character.MAX_RADIX); //36
MAX_RADIX is a final and static variable of Character class.

-----------------------------------------------------------------
//Integer.valueOf(String str)
//Integer.valueOf(String str, int radix/base)
public class AutoBoxing3 
{
	public static void main(String[] args) 
	{
			Integer a = Integer.valueOf(15);
			
			Integer b = Integer.valueOf("25");

            Integer c = Integer.valueOf("111",36); //Here Base we can take upto 36

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
           
	}
}
-------------------------------------------------------------------
public class AutoBoxing4 
{
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1==i2);

		Integer a1 = Integer.valueOf(15);
		Integer a2 = Integer.valueOf(15);
		System.out.println(a1==a2);
	}
}

Converting primtive to String type :
------------------------------------
Integer class has provided a static method toString() which will convert the int value into String type.

//Converting integer value to String
public class AutoBoxing5 
{
	public static void main(String[] args) 
	{
		int x = 12;
		String str = Integer.toString(x);
		System.out.println(str+2);
	}
}
-------------------------------------------------------------------
30-11-2024
----------
Unboxing :
----------------
Converting wrapper object to corresponding primitive type is called Unboxing.

Wrapper            Primitive
Object               type               
----------            ----------
Byte		-	byte

Short		-	short

Integer		-	int

Long		-	long

Float		-	float

Double		-	double

Chracter	-	char

Boolean		-	boolean
-----------------------------------------------------------------
We have total 8 Wrapper classes.

Among all these 8, 6 Wrapper classes (Byte, Short, Integer, Long, Float and Double) are the sub class of java.lang.Number class which represent numbers (either decimal OR non decimal)
so all the following six wrapper classes (Which are sub class of Number class) are providing the following common methods.

1) public byte byteValue()

2) public short shortValue()

3) public int intValue()

4) public long longValue()

5) public float floatValue()

6) public double doubleValue()
------------------------------------------------------------------
//Converting Wrapper object into primitive
public class AutoUnboxing1
{  
   public static void main(String args[])
	   {  
            Integer obj = 15;   //Upto 1.4
			int x = obj.intValue();
			System.out.println(x);
		}   
}  
-----------------------------------------------------------------
public class AutoUnboxing2
{
	public static void main(String[] args) 
	{	
			Integer x = 25; 
			int y = x;        //JDK 1.5 onwards  
			System.out.println(y);  
	}
}
------------------------------------------------------------------
public class AutoUnboxing3
{
	public static void main(String[] args) 
	{	
			Integer i = 15;
			System.out.println(i.byteValue());
			System.out.println(i.shortValue());
			System.out.println(i.intValue());
			System.out.println(i.longValue());
			System.out.println(i.floatValue());
			System.out.println(i.doubleValue());			
	}
}
-------------------------------------------------------------------
public class AutoUnboxing4
{
	public static void main(String[] args) 
	{
		Character c1 = 'A';
		char ch = c1.charValue();
		System.out.println(ch);
	}
}
------------------------------------------------------------------
public class AutoUnboxing5
{
	public static void main(String[] args) 
	{
		Boolean b1 = true;
		boolean b = b1.booleanValue();
		System.out.println(b);
	}
}
-------------------------------------------------------------------
class BufferTest 
{
	public static void main(String[] args) 
	{		
		Integer i = 127;
		Integer j = 127;
		System.out.println(i==j);
		System.out.println(i.equals(j));
		
		Integer a = 128;
		Integer b = 128;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		Integer p = 130;
		Integer q = 130;
		System.out.println(p.equals(q));	
		
	}
}

Note : 1) While comparing the Wrapper object we should always use
          equals(Object obj) method which is overridden method 
	  in the Wrapper classes.	  
	  
       2) Here when we write the statement Integer i = 128 then it is out of the range of byte (-128 to 127) hence == opertor will provide false if we compare two Integer object.
       
 Unlike primitive types we can't convert one wrapper type object to another wrapper object.

Example :

Long l = 12;  //Invalid

Float f = 90; //Invalid

Double d = 123; //Invalid

package com.ravi.basic;

public class Conversion 
{
	public static void main(String[] args) 
	{
	  long l = 12; //Implicit OR Widening	  
	  byte b = (byte) 12L; //Explicit OR Narrowing
	  
	  Long a = 12L;
	  Double d = 90D;
	  Double d1 = 90.78;
	  Float f = 12F;
	}

}
---------------------------------------------------------------
Ambiguity issue while overloading a method :
---------------------------------------------
When we overload a method then compiler is selecting appropriate method among the available methods based on the following types.

1. Different number of parameters 
2. Different data type of parameters 
3. Different sequence(order) of data type of parameters

In case of ambiguity where compiler can select more than one method then compiler will provide the priority in the following
rules :

1) Most Specific Type :
-----------------------
Compiler alwyas provide more priority to most specific data type or class type.

double > float [Here float is the most specific type]
float > long 
long > int
int > char
int > short  //[No relation between short and char]
short > byte

2) WAV [Widening ->  Autoboxing  -> Var Args]

   Compiler gives the priority to select appropriate method by using the following sequence :
   Widening ---> Autoboxing  ----> Var args

3) Nearest Data type or Nearest class (sub class) 
   
   While selecting the appropriate method in ambiguity issue compiler provides priority to nearest data type or nearest class i.e sub class

------------------------------------------------------------------
class Test
{
	public void accept(double d)
	{
		System.out.println("double");
	}
	public void accept(float d)
	{
		System.out.println("float");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(6);

	}
}

Note : Here float will be executed becuase float is the most specific type.
------------------------------------------------------------------
class Test
{
	public void accept(int d)
	{
		System.out.println("int");
	}
	public void accept(char d)
	{
		System.out.println("char");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(6);


	}
}

Here 6 is int type so int will be executed.
-------------------------------------------------------------------
class Test
{
	public void accept(int ...d)
	{
		System.out.println("int");
	}
	public void accept(char ...d)
	{
		System.out.println("char");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept();
	}
}

char will be executed becoz char is more specific type.
-------------------------------------------------------------------
class Test
{
	public void accept(short ...d)
	{
		System.out.println("short");
	}
	public void accept(char ...d)
	{
		System.out.println("char");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept();
	}
}

Here we will get compilation error because there is no relation between char and short based on the specific type rule.
--------------------------------------------------------------
 class Test
{
	public void accept(short ...d)
	{
		System.out.println("short");
	}
	public void accept(byte ...d)
	{
		System.out.println("byte");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept();
	}
}
Here byte will be executed because byte is the specific type.
--------------------------------------------------------------
class Test
{
	public void accept(double ...d)
	{
		System.out.println("double");
	}
	public void accept(long ...d)
	{
		System.out.println("long");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept();
	}
}

Here long will be executed because long is the most specific type.
--------------------------------------------------------------
class Test
{
	public void accept(byte d)  
	{
		System.out.println("byte");
	}
	public void accept(short s)  
	{
		System.out.println("short");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.accept(15);  //error
		t1.accept((byte)15);
		t1.accept((short)15);
	}
}
Here value 15 is of type int so, we can't assign directly to byte and short, If we want, explicit type casting is reqd.
---------------------------------------------------------------
class Test
{
	public void accept(int d)
	{
		System.out.println("int");
	}
	public void accept(long s)
	{
		System.out.println("long");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(9);  
	}
}
Note : Here int will be executed because int is the nearest type
--------------------------------------------------------------
class Test
{
	public void accept(int d, long l)
	{
		System.out.println("int-long");
	}
	public void accept(long s, int i)
	{
		System.out.println("long-int");
	}	
}
public class AmbiguityIssue 
{

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(9,9); 
	}
}

Here We will get ambiguity issue.
--------------------------------------------------------------
class Test
{
	public void accept(Object s)
	{
		System.out.println("Object");
	}
	public void accept(String s)
	{
		System.out.println("String");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(9);  

	}
}
Here Object will be executed
--------------------------------------------------------------
class Test
{
	public void accept(Object s)
	{
		System.out.println("Object");
	}
	public void accept(String s)
	{
		System.out.println("String");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept("NIT"); 

	}
}
Here String will be executed
--------------------------------------------------------------
class Test
{
	public void accept(Object s)
	{
		System.out.println("Object");
	}
	public void accept(String s)
	{
		System.out.println("String");
	}	
	public void accept(Integer i)
	{
		System.out.println("Integer");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(null);

	}
}
Here We will get compilation error
---------------------------------------------------------------
class Alpha
{
}
class Beta extends Alpha
{
}
class Test
{	
	public void accept(Alpha s)
	{
		System.out.println("Alpha");
	}	
	public void accept(Beta i)
	{
		System.out.println("Beta");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(null);

	}
}

Here Beta will be executed.
--------------------------------------------------------------
class Test
{	
	public void accept(Number s)
	{
		System.out.println("Number");
	}	
	public void accept(Integer i)
	{
		System.out.println("Integer");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(12);        

	}
}

Here Integer will be executed.
--------------------------------------------------------------
class Test
{	
	public void accept(long s)
	{
		System.out.println("Widening");
	}	
	public void accept(Integer i)
	{
		System.out.println("Autoboxing");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(12);        
    }
}
Here widening is having more priority
--------------------------------------------------------------
class Test 
{	
	public void accept(int ...s)
	{
		System.out.println("Var args");
	}	
	public void accept(Integer i)
	{
		System.out.println("Autoboxing");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(12);        
     
    }
}
Here Autoboxing will be executed.
--------------------------------------------------------------
class Test 
{	
	public void accept(Number n)
	{
		System.out.println("Number");
	}	
	public void accept(Double d)
	{
		System.out.println("Double");
	}	
}
public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(12);        
     
    }
}
Here Number will be executed.
-------------------------------------------------------------------
02-12-2024
----------
***Method Overriding :
----------------------
Writing two or more non static methods in super and sub class in such a way that method name along with method parameter (Method Signature) must be same as well as return type must be compaitable is called Method Overriding.

Method Overriding is not possible without inheritance.

Generally we can't change the return type of the method while overriding a method (compatibility issue) but from JDK 1.5v there is a concept called Co-variant (In same direction) through which we can change the return type of the method.

Example :
---------
class Super
{
	public void m1()
	{
	}
}
class Sub extends Super
{
	public void m1() //Overridden Method
	{
		
	}
}

Method overriding is mainly used to replacing the implementation of super class method by sub class method body.

Advantage of Method Overriding :
---------------------------------
The advantage of Method Overriding is, each sub class is specifying its own specific behavior.
--------------------------------------------------------------
**What is upcasting and downcasting ?
--------------------------------------
Upcasting :- 
------------
It is possble to assign sub class object to super class reference variable (up) using dynamic polymorphism. It is known as Upcasting.

Example:-    Animal a = new Lion();  //valid [upcasting]

Downcasting :
-------------
By default we can't assign super class object to sub class reference variable.

       Lion l = new Animal();  //Invalid

  Even if we type cast Animal to Lion type then compiler will allow but at runtime JVM will not convert Animal object (Generic type) into Lion object (Specific type) and it will throw an exception java.lang.ClassCastException

   Lion l = (Lion) new Animal(); //At runtime we will get
                                   java.lang.ClassCastException

Note : To avoid this ClassCastException we should use instanceof opertor.


Downcasting is a technique to assign sub class object (Only reference is super type) to sub class reference variable as shown below.

             Animal a1 = new Lion();	     
	     Lion l = (Lion) a1;  //Downcasting


Downcasting is not possible without upcasting.
--------------------------------------------------------------
package com.ravi.mor;

class Bird
{
  public void fly()
  {
	  System.out.println("Generic Bird is flying");
  }
}
class Parrot extends Bird
{
	 public void fly()
	  {
		  System.out.println("Parrot Bird is flying");
	  }
}

class Sparrow extends Bird
{
	 public void fly()
	  {
		  System.out.println("Sparrow Bird is flying");
	  }
}

public class OverridingDemo1 
{
	public static void main(String[] args) 
	{
		Bird b1 = null;
		
		b1 = new Parrot();  b1.fly();  //Dynamic Method Dispatch
		b1 = new Sparrow();  b1.fly();  //Dynamic Method Dispatch
		
	}

}
--------------------------------------------------------------
package com.ravi.mor;

class Animal
{
	public void eat()
	{
		System.out.println("Generic Animal is eating");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Dog Animal is eating");
	}
}
class Puppy extends Dog
{
	
}

public class OverridingDemo2 {

	public static void main(String[] args)
        {
		Animal a1 = new Puppy();
		a1.eat();

	}

}

Here compiler will search the eat method in Animal class where as JVM will start executing from Puppy class, Dog class, Animal class, Object class.
--------------------------------------------------------------
@Override Annotation :
--------------------------
In Java we have a concept called Annotation, introduced from JDK 1.5 onwards. All the annotations must be start with @ symbol.

@Override annotation is metadata (Giving information that method is overridden) and it is optional but it is always a good practice to write @Override annotation before the Overridden method so compiler as well as user will get the confirmation that the method is overridden method and it is available in the super class.

If we use @Override annotation before the name of the overridden method in the sub class and if the method is not available in the super class then it will generate a compilation error so it is different from comments because comment will not generate any kind of compilation error if method is not an overridden method, so this is how it is different from comment.

package com.ravi.mor;

class Shape
{
	public void draw()
	{
	   System.out.println("Generic Draw");	
	}
}
class Rectangle extends Shape
{
	@Override
	public void draw()
	{
	   System.out.println("Drawing Rectangle");	
	}
}

class Square extends Shape
{
	@Override
	public void draw()
	{
	   System.out.println("Drawing Square");	
	}
}

public class OverridingDemo3 
{
	public static void main(String[] args) 
	{
		Shape s = null;
		s = new Rectangle();  s.draw();
		s = new Square(); s.draw();
	}

}
--------------------------------------------------------------
Variable Hiding concept in upcasting :
---------------------------------------
class Super
{
   int x = 100;
 
}
class Sub exetnds Super
{
   int x = 200;  //Variable Hiding
}

Only non static methods are overridden in java but not the variables[variables are not overridden in java] because behavior will change but not the property(variable).

Note : In upcasting variable will be always executed besed on the current reference class variable.


Note : static variable, non static variable and static method 
       are always executed using current reference.


package com.ravi.mor;

class RBI
{
	protected String ifscCode = "RBIHYD09675";
	
	public String loan()
	{
		return "Bank should provide loan";
	}
}
class SBI extends RBI
{
	protected String ifscCode = "SBIAMPT78645";  //Variable Hiding
	
	@Override
	public String loan()
	{
		return "Providing loan @ 9.2% ROI";
	}	
}

public class OverridingDemo4 
{
	public static void main(String[] args) 
	{
		RBI r = new SBI();
		
		System.out.println(r.ifscCode+" : "+r.loan());		
		
	}

}
--------------------------------------------------------------
Can we override private method ?
--------------------------------
No, We can't override private method because private methods are not visible (not available) to the sub class hence we can't override.

We can't use @Override annotation on private method of sub class because it is not overridden method, actually it is re-declared by sub class developer.

package com.ravi.mor;

class Super
{
	private void m1()
	{
		System.out.println("Private Method of super class");
	}
}
class Sub extends Super
{
	protected void m1()  //Re-declaration of Method
	{
		System.out.println("Method has re-declared");
	}
}


public class OverridingDemo5 {

	public static void main(String[] args)
	{
		new Sub().m1();

	}

}

Note :- private method of super class is not available or not inherited in the sub class so if the sub class declare the method with same signature then it is not overridden method, actually it is re-declared in the sub class. 
--------------------------------------------------------------
04-12-2024
----------
Role of access modifier while overriding a method :
---------------------------------------------------
While overriding the method from super class, the access modifier of sub class method must be greater or equal in comparison to access modifier of super class method otherwise we will get compilation error.

In terms of accessibility, public is greater than protected, protected is greater than default (public > protected > default)
[default < protected < public]

**So the conclusion is we can't reduce the visibility of the method while overriding a method.

Note :- private method is not availble (visible) in sub class so it is not the part of method overriding.

class Super
{
	public void m1()
	{
	}
}
class Sub extends Super
{
	@Override
	protected void m1()  //error [super class method AM 
	                               is public ]
	{ 
	}
}
public class OverridingDemo6 
{
	public static void main(String[] args) 
	{
		Super s1 = new Sub();
		s1.m1();
	}
}
--------------------------------------------------------------
Co-variant in java : 
--------------------
In general we cann't change the return type of method while overriding a method. if we try to change it will generate compilation error because in method overriding, return type of both the methods must be compaitable as shown in the program below.

class Super
{
	public void m1()
	{
	}
}
class Sub extends Super
{
	@Override
	public int m1()  //error [int is not compaitable with
	                           void]
	{
		return 0;
	}
}
public class OverridingDemo7
{
	public static void main(String[] args) 
	{
		Super s1 = new Sub();
		s1.m1();
	}
}

Note : error, return type int is not compaitable with void.
-------------------------------------------------------------
But from JDK 1.5 onwards we can change the return type of the method in only one case that the return type of both the METHODS(SUPER AND SUB CLASS METHODS) MUST BE IN INHERITANCE RELATIONSHIP (IS-A relationship so it is compatible) called Co-Variant as shown in the program below.

Note :- Co-variant will not work with primitive data type, it will work only with classes.

class Alpha
{
}
class Beta extends Alpha
{
}

class Super
{
	public Alpha m1()
	{
		System.out.println("Super class Method");
		return new Alpha();
	}
}
class Sub extends Super
{
	@Override
	public Beta m1()
	{
		System.out.println("Sub class Method");
		return new Beta();
	}
}
public class OverridingDemo8
{
	public static void main(String[] args) 
	{
		Super s1 = new Sub();
		s1.m1();
	}
}

Note : Here we need to verify one concept, can we assign Beta class Object to Alpha class, if yes then it is compitable.
--------------------------------------------------------------
class Super
{
	public Super m1()
	{
		System.out.println("Super class Method");
		return this;
	}
}
class Sub extends Super
{
	@Override
	public Sub m1()
	{
		System.out.println("Sub class Method");
		return this;
	}
}
public class OverridingDemo9
{
	public static void main(String[] args) 
	{
		Super s1 = new Sub();
		s1.m1();
	}
}
--------------------------------------------------------------
package com.ravi.execution;

class A
{
	public Object m1() 
	{
		System.out.println("Super class m1 method");
		return this;
	}
}
class B extends A
{	
	@Override
	public System m1()
	{
		System.out.println("Sub class m1 method");
		return null;
	}
	
	
}
public class OverridingDemo10 {

	public static void main(String[] args) 
	{
		A a1 = new B();
		a1.m1();
	}

}

While working with co-variant (In the same direction), sub class method return type object, if we can assign to super class  method return then only it is compatible and it is co-variant
--------------------------------------------------------------
IQ :
-----
-------------------------------------------------------------
package com.ravi.polymorphic_behavior;

class Vehicle
{
	public int getHorsePower()
	{
		return 1000;
	}
	
	public void printHorsePower()
	{
		System.out.println(this.getHorsePower());
	}
	
}
class Car extends Vehicle
{
	public int getHorsePower()
	{
		return 1200;
	}
	
	public void printHorsePower()
	{
		System.out.println(super.getHorsePower());
	}
	
}


public class IQ {

	public static void main(String[] args) 
	{
		Vehicle v = new Car();
		v.printHorsePower();
	}

}
-------------------------------------------------------------
Progrm that describes Polymorphic behaviour of sub classes :
-----------------------------------------------------------
Case 1 :
--------
package com.ravi.polymorphic_behavior;

class Animal
{
	public void roam()
	{
		System.out.println("Generic Animal is roaming");
	}
}
class Lion extends Animal
{
	public void roam()
	{
		System.out.println("Lion Animal is roaming");
	}
}
class Dog extends Animal
{
	public void roam()
	{
		System.out.println("Dog Animal is roaming");
	}
}
public class PolymorphicDemo1 
{
	public static void main(String[] args) 
	{
       Animal a = null;       
       a = new Lion();       
       animalRoam(a);
       
       a = new Dog();
       animalRoam(a);
	}
	
	public static void animalRoam(Animal animal)
	{
		animal.roam();
	}

}
--------------------------------------------------------------
Case 2 :
---------
How to call specific method of sub class :
-------------------------------------------
package com.ravi.polymorphic_behavior;

class Animal
{
	public void roam()
	{
		System.out.println("Generic Animal is roaming");
	}
}
class Lion extends Animal
{
	public void roam()
	{
		System.out.println("Lion Animal is roaming");
	}
	
	public void roar()
	{
		System.out.println("Lion is roaring");
	}
}
class Dog extends Animal
{
	public void roam()
	{
		System.out.println("Dog Animal is roaming");
	}
	
	public void bark()
	{
		System.out.println("Dog is Barking");
	}
}
public class PolymorphicDemo1 
{
	public static void main(String[] args) 
	{
       Animal a = new Lion();
       animalRoam(a);
       
       a = new Dog();
       animalRoam(a);
	}
	
	public static void animalRoam(Animal animal)
	{	    
	
	    Lion lion = (Lion) animal;
	    lion.roam();
	    lion.roar();
	}

}

In the above program when we pass Dog object then we will get Runtime Exception java.lang.ClassCastException becuase Dog can't be converted into Lion.

In order to resolve this issue we should use instanceof Operator.

--------------------------------------------------------------
instanceof Operator :
---------------------
It is an operator as well as keyword.
It is relational operator which provides true/false.
It is used to verify whether a reference variable is pointing to a particular type of object or not ?
We must have IS-A relation between the reference variable and class or interface type. 

Programs :
-----------

package com.ravi.instance_of;

class Test
{	
}

public class InstanceofDemo1 
{
	public static void main(String[] args)
	{
	   Test t1 = new Test();
	   
	   if(t1 instanceof Test)
	   {
		   System.out.println("t1 is pointing to Test Object");
	   }

	}

}
------------------------------------------------------------
package com.ravi.instance_of;

class Alpha
{	
}
class Beta extends Alpha
{	
}
class Gamma extends Beta
{	
}

public class InstanceDemo2 
{
	public static void main(String[] args)
	{
		Gamma g = new Gamma();
		
		if(g instanceof Gamma)
		{
			System.out.println("g is pointing to Gamma Object");
		}
		
		if(g instanceof Beta)
		{
			System.out.println("g is pointing to Beta Memory");
		}
		
		if(g instanceof Alpha)
		{
			System.out.println("g is pointing to Alpha Memory");
		}
		
		if(g instanceof Object)
		{
			System.out.println("g is pointing to Object Memory");
		}
	}
	

}
------------------------------------------------------------
package com.ravi.instance_of;

public class InstanceDemo3 {

	public static void main(String[] args) 
	{
		String str = "india";
		
		if(str instanceof String)
		{
			System.out.println("str is pointing to String Object");
		}

		Integer i = 90;
		
		if(i instanceof Number)
		{
			System.out.println("i is pointing to Integer Object");
		}

	}

}
-----------------------------------------------------------
package com.ravi.instance_of;

class Bird
{
	
}
class Parrot extends Bird{}

class Sparrow extends Bird{}

public class InstanceDemo4 
{
	public static void main(String[] args) 
	{
		Parrot p = new Parrot();
		Sparrow s = new Sparrow();
		
		acceptBirdType(s);
	}

	public static void acceptBirdType(Bird bird)
	{		
		if(bird instanceof Parrot)
		{
			System.out.println("It is a Parrot object");
		}
		else
		{
			System.out.println("Another Object");
		}
		
		
	}
	
}
-------------------------------------------------------------
Dynamic Polymorphism with the help of instanceof Operator.
----------------------------------------------------------
package com.ravi.mor;

class Payment
{
	public double makePayment(double amount)
	{
		return amount;
	}
}

class UPI extends Payment
{
	@Override
	public double makePayment(double amount)
	{
		System.out.println("Making a payment of "+amount+" through UPI");
		return amount;
	}
	
	public void offer()
	{
		System.out.println("Make first payment and get 100 RS");
	}
}

class CreditCard extends Payment
{
	@Override
	public double makePayment(double amount)
	{
		System.out.println("Making a payment of "+amount+" through Credit Card");
		return amount;
	}
	
	public void offer()
	{
		System.out.println("Make first payment and get holiday ticket");
	}
}

public class DynamicPolyInstanceOf 
{
	public static void main(String[] args) 
	{
		Payment p = null;		
		p = new UPI();
		acceptPayment(p);
		
		System.out.println("..................");
		
		p = new CreditCard();
		acceptPayment(p);

	}
	
	public static void acceptPayment(Payment payment)
	{
		if(payment instanceof UPI)
		{
			UPI u = (UPI) payment;
			u.makePayment(20000);
			u.offer();
		}
		
		else if(payment instanceof CreditCard)
		{
			CreditCard cc = (CreditCard) payment;
			cc.makePayment(35000);
			cc.offer();
		}
	}

}
-------------------------------------------------------------
**What is Method Hiding in java ?
           OR
Can we override static method ?
           OR
Can we override main method ?


While working with method hiding we have all different cases :

Case 1 :
--------
A public static method of super class by default available to sub class so, from sub class we can call super class static method with the help of Class name as well as object reference as shown in the below program

class Parent
{
	public static void show()
	{
	  System.out.println("Show method of Parent class");	
	}
}
class Child extends Parent
{
}
public class MethodHidingDemo1 
{
	public static void main(String[] args) 
	{
		Child.show();
		
		Child c1 = new Child();
		c1.show();
	}
}
---------------------------------------------------------------
Case 2 :
-------
We can't override a static method with non static method because static method belongs to class and non static method belongs to object, If we try to override static method with non static method then it will generate an error i.e overridden method is static as shown below.

class Super 
{
	public static void m1()  //class
	{		
	}
}
class Sub extends Super 
{
	public void m1()  //object
	{		
	}
}
public class MethodHidingDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
---------------------------------------------------------------
Case 3 :
--------
We can't override any non static method with static method, If we try then it will generate an error, Overriding method is static.

class Super 
{
	public  void m1()  //Object
	{		
	}
}
class Sub extends Super 
{
	public static void m1()  //class
	{		
	}
}
public class MethodHidingDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

So, the conclusion is we cannot overide static with non static method as well as non-static with static method because static method belongs to class and non-static method belongs to object.
---------------------------------------------------------------
Case 4 :
-------
Program that describes method hiding concept as well as  sub class method can't hide super class method because return type is not compaitable.

class Super 
{
	public static void m1()  //class  
	{		
	}
}
class Sub extends Super 
{
	public static int m1()  //class   
	{	
		return 0;
	}
}
public class MethodHidingDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

Note : sub class method can't hide super class method becuase return type is not compaitable
--------------------------------------------------------------
case 5 :
---------
We can't override static method because It belong to class but not object, If we write static method in the sub class with same signature and compaitable return type then It is Method Hiding but not Method Overriding here compiler will search the method of super class and JVM will also execute the method of super class because method is not overridden.[Single copy and belongs to class area and common for all the objects]

Note :- 1) We can't apply @Override annotation on static methods.

        2) Static methods can't be overridden so behavior is 
	   same for all the Objects hence it is Static Polymorphism.
--------------------------------------------------------------
package com.ravi.mor;

class Base
{
	public static void m1()
	{
		System.out.println("Static Method of Base class");
	}
}
class Derived extends Base
{
	
	public static void m1() //Method Hiding [Static Polymorphism]
	{
		System.out.println("Static Method of Derived class");
	}
}
public class MethodHidingEx {

	public static void main(String[] args) 
	{
		Base b1 = new Derived();
		b1.m1();	
		
	
	}

}
--------------------------------------------------------------
06-12-2024
----------
*What is the limitation of 'new' keyword ?
                       OR
What is the difference between new keyword and newInstance() method?
                      OR
How to create the Object for the classes which are coming dynamically from the database or from some file at runtime.

The limitation with new keyword is, It demands the class name at the begning or at the time of compilation so new keyword is not suitable to create the object for the classes which are coming from database or files at runtime dynamically.

In order to create the object for the classes which are coming at runtime from database or files, we should use newInstance() method available in java.lang.Class class.

newInstance() method creates the object internally by using new keyword only and the class must contain either default OR no
argument constructor.

Methods :
----------
public Object newInstance() : Predefined non static method of 
                              java.lang.Class. It is used to 
			      create the object for dynmacilly 
			      loaded classes.
			      
public native java.lang.Class getClass() :Predefined non static method of Object class. The return type of this method is java.lang.Class so further we can call any method of java.lang.Class class object

          getClass().getName();
---------------------------------------------------------------
ObjectAtRuntime.java
----------------------
class Student
{
}
class Employee
{
}
public class ObjectAtRuntime 
{
	public static void main(String[] args) throws Exception
	{
		Object obj = Class.forName(args[0]).newInstance();
		System.out.println("Object created for :"+obj.getClass().getName());
	}
}
---------------------------------------------------------------
class Student
{
	public void greet()
	{
		System.out.println("Welcome Student");
	}
}
class Sample    
{
	public void greet()
	{
	  System.out.println("Hello Batch 39!!!!");	
	}
}
public class ObjectAtRuntime1 
{
	public static void main(String[] args) throws Exception
	{
		Object obj = Class.forName(args[0]).newInstance(); 
		
		if(obj instanceof Sample)
		{
		   Sample s1 = (Sample) obj;
		   s1.greet();	
		}
		else if(obj instanceof Student)
		{
		   Student s1 = (Student) obj;
		   s1.greet();	
		}
	}
}
---------------------------------------------------------------
 final keyword in java :
-----------------------
It is used to provide some kind of restriction in our program.
We can use final keyword in ways 3 ways in java.

1) To declare a class as a final. (Inheritance is not possible)
2) To declare a method as a final (Overriding is not possible)
3) To declare a variable (Field) as a final (Re-assignment is not possible)    
     
1) To declare a class as a final :
-----------------------------------
Whenever we declare a class as a final class then we cann't extend or inherit that class otherwise we will get a compilation error.

We should declare a class as a final if the composition of the class (logic of the class) is very important and we don't want to share the feature of the class to some other developer to modify the original behavior of the existing class, In that situation we should declare a class as a final.

Declaring a class as a final does not mean that the variables and methods declared inside the class will also become as a final, only the class behavior is final that means we can modify the variables value as well as we can create the object for the final classes.

Note :- In java String and All wrapper classes are declared as final class.
--------------------------------------------------------------
final class A
{
	private int x = 100;

	public void setData()
	{
		x = 120;
		System.out.println(x);
	}
}
class B extends A 
{   
}
public class FinalClassEx
{
	public static void main(String[] args)
	{
		B b1 = new B();
		b1.setData();		
	}
}

Note : class A is final so we can't inherit hence we will get compilation error.
---------------------------------------------------------------
final class Test
{
	private int data = 100;

	public Test(int data)
	{
		this.data = data;
		System.out.println("Data value is :"+data);
	}
}
public class FinalClassEx1 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test(200);
		
	}
}

Note : for final class we can create object as well as we can modify the data.
--------------------------------------------------------------
Whenever we declare a constructor as private then we should declare the class with final modifier. If constructor is private then we can't create a sub class because super class constructor is not visible from sub class constructor.

final class Sample
{
	private Sample()
	{
	}
	public void m1()
	{
		System.out.println("Sample class m1 method");
	}
}

public class FinalClassEx2 
{
	public static void main(String[] args) 
	{
		
	}
}
---------------------------------------------------------------
07-12-2024
----------
Sealed class in Java :
-----------------------
It is a new feature introduced from java 15v (preview version) and become the integral part of java from 17v.

It is an improvement over final keyword.

By using sealed keyword we can declare classes and interfaces as sealed.

It is one kind of restriction that describes which classes and interfaces can extend or implement from Sealed class Or interface.

It is similar to final keyword with less restriction because here we can permit the classes to extend from the original Sealed class.

The class which is inheriting from the sealed class must be final, sealed or non-sealed.

The sealed class must have atleast one sub class.

We can also create object for Sealed class.

It provides the following modifiers :

1) sealed : Can be extended only through permitted class.

2) non-sealed : Can be extended by any sub class, if a user wants to give permission to its sub classes.

3) permits : We can provide permission to the sub classes, which are inheriting through Sealed class OR sealed interface

4) final : we can declare permitted sub class as final so, it cannot be extended further.
-----------------------------------------------------------------
package com.ravi.sealed_ex;

sealed class Bird permits Parrot, Sparrow
{
	public void roam()
	{
		System.out.println("Generic Bird is roaming");
	}
}
non-sealed class Parrot extends Bird
{
	@Override
	public void roam()
	{
		System.out.println("Parrot Bird is roaming");
	}
}
final class Sparrow extends Bird
{
	@Override
	public void roam()
	{
		System.out.println("Sparrow Bird is roaming");
	}
}

public class SealedDemo1 
{
	public static void main(String[] args)
	{
		Bird b = null;
		b = new Parrot(); b.roam();
		b = new Sparrow(); b.roam();
	}

}
------------------------------------------------------------------
package com.ravi.sealed_ex;

sealed class BatteryVehicle permits BatteryCar, BatteryBike
{
	public void run()
	{
		System.out.println("Running using Battery");
	}
}
non-sealed class BatteryCar extends BatteryVehicle
{
	public void run()
	{
		System.out.println("Running Car by using Battery");
	}
}

non-sealed class BatteryBike extends BatteryVehicle
{
	public void run()
	{
		System.out.println("Running Bike by using Battery");
	}
}

public class SelaedDemo2 {

	public static void main(String[] args) 
	{
		BatteryVehicle b = null;
		b = new BatteryCar(); b.run();
		b = new BatteryBike(); b.run();
	}

}
------------------------------------------------------------------
2) To declare a method as a final (Overriding is not possible)
---------------------------------------------------------------
Whenever we declare a method as a final then we can't override that method in the sub class otherwise there will be a compilation error.

We should declare a method as a final if the body of the method i.e the implementation of the method is very important and we don't want to override or change the super class method body by sub class method body then we should declare the super class method as final method.

class A
{
	protected int a = 10;
	protected int b = 20;

     public final void calculate()
	 {
		int sum = a+b;
		System.out.println("Sum is :"+sum);
	 } 
}
class B extends A
{	
	@Override
	public void calculate() //error
	{
		int mul = a*b;
		System.out.println("Mul is :"+mul);	
	}
}
public class FinalMethodEx 
{
	public static void main(String [] args) 
	{
		 A a1 = new B();
		 a1.calculate();
	}
}

Note : We can't oevrride final method in the sub class.
-------------------------------------------------------------

class Alpha
{
	private final void accept()
	{
		System.out.println("Alpha class accept method");
	}
}
class Beta extends Alpha
{
	protected void accept()
	{
		System.out.println("Beta class accept method");
	}
}
public class FinalMethodEx1 
{
	public static void main(String [] args) 
	{
		new Beta().accept();
	}
}

Note : Here Program will compile and execute because private method of super class is not available to sub class.
-------------------------------------------------------------
3) To declare a variable/Field as a final :
--------------------------------------------
In older langugaes like C and C++ we use "const" keyword to declare a constant variable but in java, const is a reserved word for future use so instead of const we should use "final" keyword.

If we declare a variable as a final then we can't perform re-assignment (i.e nothing but re-initialization) of that variable.

In java It is always a better practise to declare a final variable by uppercase letter according to the naming convention.

class A
{
	final int A = 10;           
	public void setData()
	{
		 A = 10;  
		 System.out.println("A value is :"+A);
	}
}
class FinalVarEx 
{
	public static void main(String[] args) 
	{
		final A a1 = new A();
		a1.setData();
		
		a1 = new A(); 
		a1.setData();
	}
}
-------------------------------------------------------------
Abstraction : [Hiding the complexcity]
---------------------------------------
Showing the essential details without showing the background details is called abstraction.

In order to achieve abstraction we use the following two 
concepts :
       
       1) Abstract class (we can achieve 0 - 100% abstraction)
       2) Interface (we can achieve 100 % abstraction)
-------------------------------------------------------------
Abstract class and abstract methods :
-------------------------------------------
A class that does not provide complete implementation (partial implementation) is defined as an abstract class.

An abstract method is a common method which is used to provide easiness to the programmer because the programmer faces complexcity to remember the method name.

An abstract method observation is very simple because every abstract method contains abstract keyword, abstract method does not contain any method body and at the end there must be a terminator i.e ; (semicolon)

In java, whenever action is common but implementations are different then we should use abstract method, Generally we declare abstract method in the super class and its implementation must be provided in the sub classes.

if a class contains at least one method as an abstract method then we should compulsory declare that class as an abstract class.

Once a class is declared as an abstract class we can't create an object for that class.

*All the abstract methods declared in the super class must be overridden in the sub classes otherwise the sub class will become as an abstract class hence object can't be created for the sub class as well.

In an abstract class we can write all abstract method or all concrete method or combination of both the method. 

It is used to acheive partial abstraction that means by using abstract classes we can acheive partial abstraction(0-100%).

*An abstract class may or may not have abstract method but an abstract method must have abstract class.

Note :- We can't declare an abstract method as final, private and static (illegal combination of modifiers)

We can't declare an abstract class as a final.

-------------------------------------------------------------
abstract class Shape  
{
	public abstract void draw();
}

class Square extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Square");
	}
		
}
class Circle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
		
}

public class AbstractDemo1 
{
	public static void main(String[] args) 
	{
	   Shape s1 = null;
	   s1 = new Circle(); s1.draw();
	   s1 = new Square(); s1.draw();   

	}
}
-------------------------------------------------------------
09-12-2024
----------
package com.ravi.abstract_demo;

abstract class Bike
{
	protected int speed = 60;
	
	public Bike()
	{
		System.out.println("Bike Constructor");
	}
	
	public void getBikeDeatils()
	{
		System.out.println("It has two wheels");
	}
	
	public abstract void run();
	
}

class KTM extends Bike
{
	@Override
	public void run() 
	{
		System.out.println("KTM Bike is running");		
	}	
}

public class AbstractDemo2 {

	public static void main(String[] args) 
	{
		Bike obj = new KTM();
		System.out.println("SPEED IS :"+obj.speed);
		obj.getBikeDeatils();
		obj.run();
	}

}
-------------------------------------------------------------
IQ :
----
What is the advantage of taking instance variable OR writing constructor inside abstract class ?

As we know we can't create an object for abstract class but still we can take object properties (Instance variable) and 
constructor, To call the abstract class constructor for initialization of instance variable we should use sub class object (Using super keyword)
    
[Note : Even at the time of working with inheritance concept, to initialize the super class instance variable through super class constructor, super class object is not required, by creating the object of sub class, we can initialize super class properties(Instance variable)]
-------------------------------------------------------------
//Program that describes how to initialize super class properties :

package com.ravi.abstract_demo_ex;

abstract class Shape
{
	protected String shapeType;

	public Shape(String shapeType) 
	{
		super();
		this.shapeType = shapeType;
	}
	
	public abstract void draw();	
}
class Rectangle extends Shape
{
	public Rectangle(String shapeType) 
	{		
		super(shapeType);		
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing "+shapeType);
	}
}
class Circle extends Shape
{
	public Circle(String shapeType) 
	{
		super(shapeType);		
	}

	@Override
	public void draw() 
	{
		System.out.println("Drawing "+shapeType);		
	}
	
}
public class AbstractDemo3 {

	public static void main(String[] args) 
	{
		Shape s = null;
		s = new Rectangle("Rectangle"); s.draw();
		s = new Circle("Circle"); s.draw();
	}

}
-------------------------------------------------------------
//Program that describes we should compulsory override all 
  the abstract methods of super class in sub classes.

package com.ravi.abstract_demo_ex;

abstract class Alpha
{
	public abstract void show();
	public abstract void demo();
}

abstract class Beta extends Alpha
{
	@Override
	public void show()  // demo();
	{
		System.out.println("Show method implemented in Beta class");
	}
}

class Gamma extends Beta
{
	@Override
	public void demo() 
	{
		System.out.println("Demo method implemented in Gamma class");		
	}
	
}
public class AbstractDemo4 
{
	public static void main(String[] args) 
	{
		Gamma g = new Gamma();
		g.show(); g.demo();
		

	}

}
-------------------------------------------------------------
WAP to force the sub class developer to implement super class 
abstract method by using Array concept.

package com.ravi.abstract_demo_ex;

abstract class Animal
{
	public abstract void checkup();
}
class Lion extends Animal
{
	protected String name;
	
	public Lion(String name) 
	{
		super();
		this.name = name;
	}

	@Override
	public void checkup() 
	{
		System.out.println(name+ " Lion is going for Checkup");		
	}
	
}
class Elephant extends Animal
{
protected String name;
	
	public Elephant(String name) 
	{
		super();
		this.name = name;
	}

	@Override
	public void checkup() 
	{
		System.out.println(name+ " Elephant is going for Checkup");		
	}
}

class Horse extends Animal
{
protected String name;
	
	public Horse(String name) 
	{
		super();
		this.name = name;
	}

	@Override
	public void checkup() 
	{
		System.out.println(name+ " Horse is going for Checkup");		
	}
}

public class AbstractDemo5 {

	public static void main(String[] args) 
	{		
        Lion lions[] = {new Lion("Simba"),new Lion("myLion")};	
        
        Elephant elephants[] = {new Elephant("Erawat"), new Elephant("jambo")};
        
        Horse horses[] = {new Horse("Chetak"), new Horse("MyHorse")};
		
        visitZooForCheckup(lions);
        System.out.println("..................");
        visitZooForCheckup(elephants);
        System.out.println("..................");
        visitZooForCheckup(horses);
	}
	
	public static void visitZooForCheckup(Animal ...animals)
	{
		for(Animal animal : animals)
		{
			animal.checkup();
		}
	}

}
-------------------------------------------------------------
10-12-2024
----------
Anonymous inner class with abstract class and Concrete class.
--------------------------------------------------------------
What is Anonymous inner class ?
--------------------------------
If we define a class inside a method body without any name then it is called Anonymous inner class.

All the inner class .class files are represented by $ symbol.

The main purpose of anonymous inner class to extend a class OR to implement an interface that means creating a sub type.

An anonymous inner class object will be created by using new keyword at the time of defining the anonymous inner class.

Program on Anonymous inner class using Concrete class :
-------------------------------------------------------
package com.rvai.anonymous_inner_demo;

class Super
{
	public void show()
	{
		System.out.println("Super class show method");
	}
}
public class AnonymousInnerDemo1 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		Super sub = new Super()
		{
			@Override
			public void show()
			{
				System.out.println("Sub class show method");
			}
		};
		
		sub.show();
	}

}

--------------------------------------------------------------
Program on Anonymous inner class using abstract class :
-------------------------------------------------------
package com.rvai.anonymous_inner_demo;

abstract class Vehicle
{
	public abstract void run();
}

public class AnonymousInnerDemo2 
{
	public static void main(String[] args) 
	{
		//Anonymous inner class
		Vehicle car = new Vehicle()
		{
			@Override
			public void run() 
			{
				System.out.println("Car is Running");				
			}
			
		};
		
		//Anonymous inner class
		Vehicle bike = new Vehicle()
		{
			@Override
			public void run() 
			{
				System.out.println("Bike is Running");				
			}			
		};		
		car.run();  bike.run();
	}

}
--------------------------------------------------------------
interface :
-----------
interface upto java 1.7
------------------------
An interface is a keyword in java which is similar to a class which defines working functionality of a class.

Upto JDK 1.7 an interface contains only abstract methods that means there is a guarantee that inside an interfcae we don't have concrete or general or instance methods.

From java 8 onwards we have a facility to write default and static methods.

By using interface we can achieve 100% abstraction concept because it contains only abstract methods.

In order to implement the member of an interface, java software people has provided implements keyword.

All the methods declared inside an interface is by default public and abstract so at the time of overriding we should apply public access modifier to sub class method.

All the variables declared inside an interface is by default public, static and final.

We should override all the abstract methods of interface to the sub classes otherwise the sub class will become as an abstract class hence object can't be created.

We can't create an object for interface, but reference can be created.

By using interface we can acheive multiple inheritance in java.

We can achieve loose coupling using interface.

Note :- inside an interface we can't declare any blocks (instance, static), instance variables (No properties) as well as we can't write constructor inside an interface.

--------------------------------------------------------------
package com.nit.interface_demo;

sealed interface Moveable permits Car
{
	int SPEED = 100; //public + static + final
	void move();  //public + abstract	
}

non-sealed class Car implements Moveable
{
	@Override
	public void move() 
	{
		//SPEED = 120;   [Invalid]
		System.out.println("Car is Moving with :"+SPEED+ "KM/Hr");
		
	}	
}

public class InterfaceDemo1
{
	public static void main(String[] args) 
	{
	   Moveable m = new Car();
	   System.out.println("SPEED of Car is :"+Moveable.SPEED);
	   m.move();
	}

}
--------------------------------------------------------------
package com.nit.interface_demo;

interface Bank
{
	void deposit(double amount);
	void withdraw(double amount);
}
class Customer implements Bank
{
	double balance;

	public Customer(double balance) 
	{
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) 
	{
		if(amount<=0)
		{
		   System.err.println("deposit is not possible");	
		}
		else
		{
			this.balance = this.balance + amount;
			System.out.println("After deposit amount is :"+this.balance);
		}
	}

	@Override
	public void withdraw(double amount) 
	{
		if(amount > this.balance)
		{
			System.err.println("Insufficient Balance");
		}
		else
		{
			this.balance = this.balance - amount;
			System.out.println("Balance after withdraw is :"+this.balance);
		}
		
	}
}

public class InterfaceDemo2 
{
	public static void main(String[] args) 
	{
		Bank b = new Customer(10000);
		b.deposit(10000);
		b.withdraw(5000);
	}

}
--------------------------------------------------------------
11-12-2024
-----------
Program on loose coupling :
----------------------------
Loose Coupling :- If the degree of dependency from one class object to another class is very low then it is called loose coupling. [interface is reqd]

Tightly coupled :- If the degree of dependency of one class to another class is very high then it is called Tightly coupled.

According to IT industry standard we should always prefer loose coupling so the maintenance of the project will become easy.

High Cohesion [Encapsulation]:
------------------------------
Our private data must be accessible via public methods (setter and getters) so, in between data and method we must have high cohesion.
(tight coupling) so, validation of outer data is possible.
--------------------------------------------------------------
//Program on loose coupling :
------------------------------
6 files :
----------
HotDrink.java(I)
----------------
package com.ravi.loose_coupling;

public interface HotDrink 
{
    void prepare();
}


Tea.java
---------
package com.ravi.loose_coupling;

public class Tea implements HotDrink
{
	@Override
	public void prepare()
	{
	  System.out.println("Preparing Tea");	
	}

}


Coffee.java
------------
package com.ravi.loose_coupling;

public class Coffee implements HotDrink {

	@Override
	public void prepare() 
	{
		System.out.println("Preparing Coffee");

	}

}


Horlicks.java
--------------
package com.ravi.loose_coupling;

public class Horlicks implements HotDrink {

	@Override
	public void prepare() 
	{
		System.out.println("Preparing Horlicks");

	}

}


Restaurant.java
----------------
package com.ravi.loose_coupling;

public class Restaurant 
{
   public static void acceptObject(HotDrink hd)  
   {
	  hd.prepare(); 
   }
}


LooseCoupling.java
-------------------
package com.ravi.loose_coupling;

public class LooseCoupling 
{
	public static void main(String[] args) 
	{
		Restaurant.acceptObject(new Tea());
		Restaurant.acceptObject(new Coffee());
        Restaurant.acceptObject(new Horlicks());
	}

}

--------------------------------------------------------------
Method retutn type as a interface :
-----------------------------------
It is always better to take method return type as interface so we can return any implementer class object as shown in the example below

public HotDrink accept()
{
   return new Tea() OR new Coffee() OR new Horlicks() OR any future
   implementer class object...........................
}

------------------------------------------------------------
Compile time constant :
-----------------------
A compile time constant is a constant that is evaluated and replaced with its value at compile time rather than runtime.

It must be declared with static and final modifier as well as initialized with constant expression. (Must not be initialized by method call)

At compile time constant value will be converted by compiler at the time of compilation itself so, at runtime JVM can see the value but not the class name so class will not be loaded as shown in the program.

Example :  public static final int A = 100; //Valid
       
           public static final int A = m1(); //valid [Here
	   class will be loaded by JVM]



CompileTimeConstant.java
-------------------------
class Alpha
{
	static
	{
	   System.out.println("Static block of Alpha class");	
	}
	
	public static final int A = 100;
}


public class CompileTimeConstant 
{
	public static void main(String[] args) 
	{
		System.out.println(Alpha.A);
	}
}

--------------------------------------------------------------
The following program explains that compiler will convert the final, static variable value at the time of compilation itself
(so compile time OR early binding)

2 files :
----------
Beta.java
----------
public class Beta 
{
	public static final int D = 1200;
}

Main.java
----------
public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println(Beta.D); //1000
	}
}

Instruction :
--------------
1) Compile both the program and execute Main.java

2) Change the value of D variable, re-compile the code

3) Execute Main code without compilation.

compile time constant with interface :
---------------------------------------
package com.ravi.loose_coupling;

interface Hello
{
	public static final int X = 100;
}

public class MainDemo {

	public static void main(String[] args)
	{
		System.out.println(Hello.X); //Hello interface is not loaded

	}

}
--------------------------------------------------------------
Multiple Inheritance by using interface :
-----------------------------------------
In a class we have a constructor so, it is providing ambiguity issue but inside an interface we don't have constructor so multiple inheritance is possible using interface.

The sub class constructor's super keyword will directly move to Object class constructor.(11-DEC)

package com.ravi.inheritance;

interface Alpha
{
	void m1();
}
interface Beta
{
	void m1();
}
class Implementer implements Alpha, Beta
{	
	@Override
	public void m1() 
	{
		System.out.println("MI is possible");		
	}	
}



public class MultipleInheritance
{
	public static void main(String[] args) 
	{
		Implementer i = new Implementer();
		i.m1();

	}

}
--------------------------------------------------------------
12-12-2024
----------
Extending interface :
---------------------
One interface can extends another interface, it cannot implement because interface cannot provide implementation for the abstract method.

package com.ravi.exetnding_interface;

interface Alpha
{
	void m1();
}
interface Beta extends Alpha
{
	void m2();
}
class MyClass implements Beta
{

	@Override
	public void m1() 
	{
		System.out.println("M1 method Overridden");		
	}

	@Override
	public void m2() 
	{
		System.out.println("M2 method Overridden");		
	}
}

public class ExtendingInterfaceDemo {

	public static void main(String[] args) 
	{
		MyClass m = new MyClass();
		m.m1(); m.m2();

	}

}
--------------------------------------------------------------
java 8 features :
------------------
intreface from JDK 1.8V  [Java 8 = March 2014]
----------------------------------------------
Limitation of abstract method    
           OR
Maintenance problem with interface in an Industry upto JDK 1.7

The major maintenance problem with interface is, if we add any new abstract method at the later stage of development inside an existing interface then all the implementer classes have to override that abstract method otherwise the  implementer class will become as an abstract class so it is one kind of boundation.

We need to provide implementation for all the abstract methods available inside an interface whether it is required or not?

To avoid this maintenance problem java software people introduced default method inside an interface.
---------------------------------------------------------------
What is default method :
-------------------------
We can write default method (method with body) inside an interface with default keyword from Java 8v.

This default method provides "default implementation" so the implementer class can override to provide specific implementation in the class.

Unlike abstract method, default method does not provide any kind of boundation to override this default method in the sub class.

By default the access modifier of default method is public.

We can't write default method inside a class, we can write 
only inside an interface.

4 files :
---------
Vehicle.java(I)
---------------
package com.ravi.java_new_features;

public interface Vehicle 
{
    void run();
    void horn();
    
    default void digitalMeter()  //java 8
    {
    	System.out.println("Default Implementation");
    	System.out.println("Digital Meter Facility is coming soon");
    }
}

Car.java
---------
package com.ravi.java_new_features;

public class Car implements Vehicle 
{
	@Override
	public void run() 
	{
		System.out.println("Car is running");
	}

	@Override
	public void horn() 
	{
		System.out.println("Car has horn");		
	}
	
	 @Override
	 public void digitalMeter()  //java 8
	 {
		 System.out.println("Digital Meter Facility is Available in the Car");
	 }
}

Bike.java
----------
package com.ravi.java_new_features;

public class Bike implements Vehicle {

	@Override
	public void run() 
	{
		System.out.println("Bike is running");
	}

	@Override
	public void horn() 
	{
		System.out.println("Bike has horn");		
	}
}

package com.ravi.java_new_features;

public class DefaultMethod 
{
	public static void main(String[] args) 
	{			
		Vehicle v = null;
		v = new Car(); v.run(); v.horn(); v.digitalMeter();
		v = new Bike(); v.run(); v.horn(); v.digitalMeter();

	}

}

Note :- abstract method is a common method which is used to provide easiness to the programmer so, by looking the abstract method we will get confirmation that this is common behavior for all the sub classes and it must be implemnted in all the sub classes.

Common method [Behavior] -> abstract method
Uncommon method [Behavior] -> default method
---------------------------------------------------------------
Priority of deafult and concrete method :
-----------------------------------------
While working with class and interface, default method is having low priority than concrete method, In the same way class is more powerfult than interface.

package com.ravi.java_new_features;

interface A
{
	default void m1()
	{
		System.out.println("Default Method of interface A");
	}
}
class B 
{
	public void m1()
	{
		System.out.println("Concrete Method of Class B");
	}
}

class C extends B implements A 
{
}

public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.m1();

	}

}
---------------------------------------------------------------
Multiple Inheritance by using default method :
----------------------------------------------
Multiple inheritance is possible in java by using default method inside an interface, here we need to use super keyword to differenciate the super interface methods.
Before java 1.8, we have abstract method inside an interface but now we can write method body(default method) so, to execute the default method inside an interface we need to take super keyword with interface name(Alpha.super.m1()).

package com.ravi.java_new_features;

interface Alpha
{
	default void m1()
	{
		System.out.println("m1 method of Alpha interface");
	}
}
interface Beta
{
	default void m1()
	{
		System.out.println("m1 method of Beta interface");
	}
}

class MI implements Alpha, Beta
{
	
	@Override
	public void m1() //Overriding is compulsory, otherwise 
	{                   we will get compilation error
		Alpha.super.m1();
		Beta.super.m1();
		System.out.println("MI is possible");
	}	
}
public class MultipleInheritance 
{
	public static void main(String[] args) 
	{
		MI m = new MI();
		m.m1();
	}

}

Note : Here both the interfaces are having same method name m1() so, overridng is compulsory in the implementer class otherwise we will get compilation error due to ambiguity issue.
---------------------------------------------------------------
13-12-2024
----------
What is static method inside an interface?
------------------------------------------
We can define static method inside an interface from java 1.8 onwards.

static method is only available inside the interface, It is not available to the implementer classes.

It is used to provide common functionality which we can apply/invoke from any BLC/ELC class.

By default static method of an inetrafce contains public  access modifier.
---------------------------------------------------------------
2 files :
---------
Calculate.java(I)
-----------------
package com.ravi.static_method;

public interface Calculate 
{
   static double getSquare(int num)  //JDK 1.8 [by default public]
   {
	  
	   return num*num;
   }
   
   static double getCube(int num)  
   {
	   return num*num*num;
   }
}

Main.java
----------
package com.ravi.static_method;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Square is :"+Calculate.getSquare(12));
		System.out.println("Cube is :"+Calculate.getCube(12));

	}

}
--------------------------------------------------------------
Program that describe that static method of an interface is only available to interface only that means we can access the static method of an interface by using only one way i.e interface name.

interface Alpha
{
	static void m1()
	{
		System.out.println("Interface static method");
	}
}
class Beta implements Alpha
{
}
public class StaticMethodOfInterface 
{
	public static void main(String[] args) 
	{
		Alpha.m1();
		
		//Beta.m1();  [Invalid]
		
		Beta b1 = new Beta();
		//b1.m1(); //[Invalid]
	}
}

From the above program it is clear that interface static method
we can call through interface only.
---------------------------------------------------------------
Can we write a main method inside an interface ?
------------------------------------------------
Yes, We can write main method inside an interafce from java 8 version and it will be executed becuase interface is internally an abstract class.

package com.ravi.execution;

public interface Printable 
{
   public static void main(String[] args) 
   {
	  System.out.println("Main Method");
   }
}
---------------------------------------------------------------
Interface Static Method:
------------------------
   a) Accessible using the interface name.
   b) Cannot be Hidden by implementing classes.(Not Available)
   c) Can be called using the interface name only.

Class Static Method:
--------------------
   a) Accessible using the class name.
   b) Can be hidden (not overridden) in subclasses by redeclaring a static method with the same signature.
   c) Can be called using the super class, sub class name as well as sub class object also as shown in the program below.

package com.ravi.interface_demo;

class A
{
	public static void m1()
	{
		System.out.println("Static method A");
	}
}
class B extends A
{
	
}
public class Demo
{
	public static void main(String [] args)
	{
		   A.m1();
                   B.m1();  //valid
	           new B().m1(); //valid
	}
}
--------------------------------------------------------------
Introdction to Functional Programming :
---------------------------------------
In OOP, We always concentrate on objects but in Function Programming which is introduced from JDK 1.8V, Here we will 
concentrate on functions.

What is a Functional Interface ?
---------------------------------
A Functional interface is an interface which contains exactly one abstract method.

It may contain 'n' number of static and default methods but it must contain exactly one abstract method.

A functional interface can be annotated be @FunctionalInterface annotation.

Example :
---------
@FunctionalInterface
public interface Printable 
{	

   void print();  //[SAM = Single Abstract Method]
   
   default void m1()
   {
	   
   }
   
   static void m3()
   {
	   
   }
  
}
--------------------------------------------------------------
Functional interface by using Anonymous inner class :
------------------------------------------------------
package com.ravi.interface_demo;

@FunctionalInterface
interface Payment
{
	void makePayment();
}
public class AnonymousWithFunctionalInterface {

	public static void main(String[] args) 
	{
		Payment creditCard = new Payment() 
		{			
			@Override
			public void makePayment() 
			{
				System.out.println("Making payment through Credit Card");				
			}
		};
		
		Payment debitCard = new Payment() 
		{			
			@Override
			public void makePayment() 
			{
				System.out.println("Making payment through Debit Card");				
			}
		};
		
		creditCard.makePayment();  debitCard.makePayment();

	}

}
---------------------------------------------------------------
What is Lambda Expression in java ?
------------------------------------
It is a new feature introduced in java from JDK 1.8 onwards.
It is an anonymous function i.e function without any name.
In java it is used to enable functional programming.
It is used to concise our code as well as we can remove boilerplate code.
It can be used with functional interface only.
If the body of the Lambda Expression contains only one statement then curly braces are optional.
We can also remove the variables type while defining the Lambda Expression parameter.
If the lambda expression method contains only one parameter then we can remove () symbol also.

In lambda expression return keyword is optional but if we use return keyword then {} are compulsory.

Independently Lamda Expression is not a statement.

It requires a target variable i.e functional interface reference only.

Lamda target can't be class or abstract class, it will work with functional interface only.
---------------------------------------------------------------
abstract class Drawable
{
	abstract void draw();
}
public class LambdaTarget 
{
	public static void main(String[] args) 
	{
	 Drawable d = ()-> System.out.println("Drawing");
	 d.draw();
	}
}

Note : The above program will generate compilation error, Lambda Target must be Functional interface.
-------------------------------------------------------------
Program on Lambda Expression :
------------------------------
package com.ravi.lambda;

interface Vehicle
{
	void run();
}

public class LambdaDemo1 {

	public static void main(String[] args) 
	{
		Vehicle car = ()-> System.out.println("Car is running");
		car.run();
		
		Vehicle bike = ()-> System.out.println("Bike is running");
		bike.run();

		Vehicle bus = ()-> System.out.println("Bus is running");
		bus.run();
	}

}
-------------------------------------------------------------
package com.ravi.basic_concepts;

import java.util.Scanner;

@FunctionalInterface
interface Calculate
{
	double doSum(double x, double y);
	
}

public class LambdaDemo2 {

	public static void main(String[] args) 
	{
		Calculate c1 =  (a, b)->  a + b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		double p = sc.nextDouble();
		System.out.println("Enter the value of b :");
		double q = sc.nextDouble();

		System.out.println("Sum is :"+c1.doSum(p, q));
		sc.close();
	}

}
-------------------------------------------------------------
package com.ravi.lambda;

interface Length
{
	int getLength(String str);
}

public class LambdaDemo3 {

	public static void main(String[] args) 
	{
		Length l =  str -> str.length();
		
		System.out.println(l.getLength("India"));

	}

}
--------------------------------------------------------------
package com.ravi.basic_concepts;

import java.util.Scanner;

@FunctionalInterface
interface Verifier
{
	boolean verify(Integer num);
}

public class LambdaDemo4 
{
	public static void main(String[] args) 
	{
		//Check whether a number is even or odd
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int no = sc.nextInt();
				
         Verifier v1 =  num -> 
         {
            return num % 2==0;	
         };
         
         System.out.println("Is "+no+ " even Number :"+v1.verify(no));
         sc.close();
	}

}
-------------------------------------------------------------
/* If the input number is 0 or negative return -1
 * If the input number is even return square of the number
 * If the input number is even return cube of the number
 *  */

package com.ravi.basic_concepts;

import java.util.Scanner;

@FunctionalInterface
interface Calculator
{
	Double getSquareAndCube(Integer num);
}


public class LambdaDemo5 {

	public static void main(String[] args) 
	{
		Calculator calc = num -> 
		{
			if(num<=0)
			{
				return -1D;
			}
			else if(num % 2== 0)
			{				
				Double y = Double.valueOf(num*num);
				return y;
			}
			else
			{
				Double z = Double.valueOf(num*num*num);
				return z;
			}			
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int no = sc.nextInt();
		
		System.out.println(calc.getSquareAndCube(no));
		
		sc.close();
	}

}

===============================================================
What is type parameter<T> in java ?
------------------------------------
It is a technique through which we can make our application indepenedent of data type. It is represented by <T>

In java we can pass Wrapper classes as well as User-defined classes (reference classe) to this type parameter.

We cannot pass any primitive type to this type parameter.

package com.ravi.basic_concepts;

import java.util.stream.DoubleStream;

class Accept<T>
{
	private T data;

	public Accept(T data) //Product data = 
	{
		super();
		this.data = data;
	}

	public T getData() 
	{
		return data;
	}	
}

public class TypeParameter
{
	public static void main(String[] args) 
	{			
	   Accept<Integer> acceptInt = new Accept<Integer>(12);
       System.out.println("Integer type is :"+acceptInt.getData());
       
       Accept<Double> acceptDouble = new Accept<Double>(90.78);
       System.out.println("Double type is :"+acceptDouble.getData());
       

       Accept<Boolean> acceptBoolean = new Accept<Boolean>(false);
       System.out.println("Boolean type is :"+acceptBoolean.getData());
     
       
       Accept<Product> acceptProduct = new Accept<Product>(new Product(111));
       System.out.println("Product type is :"+acceptProduct.getData());
       
       
       
	}

}


class Product
{
	private int productId;

	public Product(int productId) 
	{
		super();
		this.productId = productId;
	}

	@Override
	public String toString() 
	{
		return "Product [productId=" + productId + "]";
	}
	
}
-----------------------------------------------------------
17-12-2024
-----------

Working with predefined functional interfaces :
------------------------------------------------------
In order to help the java programmer to write concise  java code in day to day programming java software people has provided the following predefined functional interfaces

1) Predicate<T>          boolean test(T x);
2) Consumer<T>           void accept(T x); 
3) Function<T,R>         R apply(T x);
4) Supplier<T>           T get();
5) BiPredicate<T,U>      boolean test(T x, U y);
6) BiConsumer<T, U>      void accept(T x, U y);
7) BiFunction<T,U,R>     R apply(T x, U y);
8) UnaryOperator<T>      T apply(T x)
9) BinaryOperator<T>     T apply(T x, T y)

Note :-
-------
All these predefined functional interfaces are provided as a part of java.util.function sub package.

Predicate<T> functional interface  :
-------------------------------------------
It is a predefined functional interface available in java.util.function sub package.

It contains an abstract method test() which takes type parameter <T> and returns boolean value. The main purpose of this interface to test one argument boolean expression.

@FunctionalInterface
public interface Predicate<T>   
{
  boolean test(T x);
}


Note :- Here T is a "type parameter" and it can accept any type of User defined class as well as  Wrapper class like Integer, Float, Double and so on.

We can't pass primitive type.
-----------------------------------------------------------
Programs on Predicate :
------------------------
package com.ravi.functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo1 
{
	public static void main(String[] args) 
	{
		//WAP to verify whether a number is even or odd
		
		Predicate<Integer> p1 = num -> num%2==0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();

		System.out.println("Is "+num+" even number ?"+p1.test(num));
		sc.close();
	}

}
----------------------------------------------------------
package com.ravi.functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo2 
{
	public static void main(String[] args)
	{
	   //Given name starts with character 'A' or not 
		
	   Predicate<String> p2 = str -> str.startsWith("A");
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter your Name :");
	   String name = sc.next();
	   
	   System.out.println(name+" starts with A or not ?"+p2.test(name));
	   sc.close();	

	}

}
-----------------------------------------------------------
package com.ravi.functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo3
{
	public static void main(String[] args)
	{
		//Based on age person is eligible for voting or not
	
		Predicate<Integer> p3 = age -> age >=18;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age :");
		int age = sc.nextInt();
	
		boolean isEligible = p3.test(age);
		
		if(isEligible)
		{
			System.out.println("You are eligible for Voting");
		}
		else
		{
			System.out.println("You are not eligible for Voting");
		}
		sc.close();
	}

}
----------------------------------------------------------
package com.ravi.functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo4 {

	public static void main(String[] args) 
	{
		//Verify my name is Ravi or not
		
		Predicate<String> p4 = 	str -> str.equalsIgnoreCase("Ravi");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name :");
		String name = sc.next();
		
		System.out.println("Are you Ravi :"+p4.test(name));
		
		sc.close();		

	}

}
-----------------------------------------------------------
Consumer<T>
-----------
Consumer<T> functional interface :
-----------------------------------------
It is a predefined functional interface available in java.util.function sub package.

It contains an abstract method accept() which takes T type parameter and returns nothing (void). It is used to accept the parameter value or consume the value.

@FunctionalInterface
public interface Consumer<T>
{
    void accept(T x);
}
----------------------------------------------------------
package com.ravi.functional_interface;

import java.util.function.Consumer;

public class ConsumerDemo1 {

	public static void main(String[] args) 
	{
		Consumer<Integer> c1 = num -> System.out.println("Integer type "+num);
	    c1.accept(12);	
	
	    Consumer<Boolean> c2 = bool -> System.out.println("Boolean Type :"+bool);
	    c2.accept(false);
	    
	    Consumer<Customer> c3 = cust -> System.out.println("Customer Type :"+cust);
	    c3.accept(new Customer(111));

	}

}

class Customer
{
	private int customerId;

	public Customer(int customerId) 
	{
		super();
		this.customerId = customerId;
	}

	@Override
	public String toString() 
	{
		return "Customer [customerId=" + customerId + "]";
	}

}
-----------------------------------------------------------
Function<T,R> functional interface :
-----------------------------------------
Type Parameters:
T - the type of the input to the function.
R - the type of the result of the function.

It is a predefined functional interface available in java.util.function sub package.

It provides an abstract method apply that accepts one argument(T) and produces a result(R).

Note :- The type of T(input) and the type of R(Result) both will be decided by the user.

@FunctionalInterface
public interface Function<T,R>
{
   public abstract R apply(T x);        
}
-----------------------------------------------------------
package com.ravi.functional_interface;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args)
	{
		//Finding the cube of a number
		Function<Integer,Integer> fn1 = num -> num*num*num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = sc.nextInt();
		
		System.out.println("Cube of "+num+" is :"+fn1.apply(num));
		sc.close();

	}

}
-----------------------------------------------------------
package com.ravi.functional_interface;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) 
	{
		//Finding the length of given city
		
		Function<String,Integer> fn2 = str -> str.length();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your City Name :");
		String city = sc.next();
		
		System.out.println("Langth of "+city+" is :"+fn2.apply(city));
		sc.close();
		   
	}

}
----------------------------------------------------------
package com.ravi.functional_interface;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionDemo3 {
	public static void main(String[] args) 
	{
		// Verify whether my name starts with character A or not

		Function<String, Boolean> fn3 = str -> str.startsWith("A");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name :");
		String name = sc.next();
		
		System.out.println("Name starts with A "+fn3.apply(name));
        sc.close();
	}

}
------------------------------------------------------------
18-12-2024
-----------
Supplier<T> prdefined functional interface :
--------------------------------------------
It is a predefined functional interface available in java.util.function sub package. 

It provides an abstract method get() which does not take any argument but produces/supply/return a value of type T.

@FunctionalInterface
public interface Supplier<T>
{
   T get();
}
------------------------------------------------------------
//Programs on Supplier :
------------------------
package com.ravi.supplier;

import java.util.function.Supplier;

public class SupplierDemo1 
{

	public static void main(String[] args) 
	{
		Supplier<String>  s1 = () -> 100 + 200+"NIT"+ 80 + 80 ;
		System.out.println(s1.get());

	}

}
-----------------------------------------------------------
package com.ravi.supplier;

import java.util.function.Supplier;

class Employee
{
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;

	public Employee(Integer employeeId, String employeeName, Double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() 
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	

}

public class SupplierDemo2 
{

	public static void main(String[] args) 
	{
       Supplier<Employee>  s2 = () -> new Employee(1, "Scott", 34890.90);
       
       Employee obj = s2.get();
       
       System.out.println(obj);
	}

}
-----------------------------------------------------------
package com.ravi.supplier;

import java.util.Scanner;
import java.util.function.Supplier;

class Product
{
	private Integer productId;
	private String productName;
	private Double productPrice;
	
	public Product(Integer productId, String productName, Double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
}

public class SupplierDemo3 
{
   public static void main(String[] args) 
   {
        Supplier<Product> s3 = 	()->
        {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter Product Id :");
        	int id = sc.nextInt();
        	System.out.println("Enter Product Name :");
        	String name = sc.nextLine();
        	name = sc.nextLine();
        	System.out.println("Enter Product Price :");
        	double price = sc.nextDouble();
        	
        	return new Product(id, name, price);
        };
        
        Product obj = s3.get();
        System.out.println(obj);
        
        
   }
}
------------------------------------------------------------
Creating our own Functional interface with various Parameter
------------------------------------------------------------
We can create our own userdefined functional interaface
with various parameters as shown below :

package com.ravi.custom_fun_interface;

@FunctionalInterface
interface TriFunction<T,U,V,R>
{
	public abstract R myApply(T a, U b, V c);
}

public class CustomFunctionalInterface 
{
	public static void main(String[] args) 
	{
	  TriFunction<Integer,Integer, Integer, String> fn1 
	  =   (a , b, c)-> ""+a+b+c;
	  
	  System.out.println(fn1.myApply(12, 24, 44));
	  
	}

}
------------------------------------------------------------
BiPredicate<T,U> functional interface :
-----------------------------------
It is a predefined functional interface available in java.util.function sub package.

It is a functional interface in Java that represents a predicate (a boolean-valued function) OF TWO ARGUMENTS.

The BiPredicate interface has method named test, which takes two parameters and returns a boolean value, basically this BiPredicate is same with the Predicate, instead, it takes 2 arguments for the metod test.


@FunctionalInterface
public interface BiPredicate<T, U> 
{
    boolean test(T t, U u);
}

Type Parameters:

T - the type of the first argument to the predicate
U - the type of the second argument the predicate
Note : return type is boolean.
------------------------------------------------------------
import java.util.function.*;
public class Lambda11 
{
	public static void main(String[] args)   
    {
        BiPredicate<String, Integer> filter = (x, y) -> 
		{
            return x.length() == y;  
        };

        boolean result = filter.test("Ravi", 4);
        System.out.println(result);  

        result = filter.test("Hyderabad", 10);
        System.out.println(result);
	}
}
-----------------------------------------------------------
import java.util.function.BiPredicate;

public class Lambda12
{
  public static void main(String[] args) 
  {
    // BiPredicate to check if the sum of two integers is even
    BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;

        System.out.println(isSumEven.test(2, 3));    
        System.out.println(isSumEven.test(5, 7));   
    }
}
-----------------------------------------------------------
BiConsumer<T, U> functional interface :
---------------------------------------
It is a predefined functional interface available in java.util.function sub package.

It is a functional interface in Java that represents an operation that accepts two input arguments and returns no result.

It takes a method named accept, which takes two parameters and performs an action without returning any result.

@FunctionalInterface
public interface BiConsumer<T, U> 
{
    void accept(T t, U u);
}
------------------------------------------------------------
import java.util.function.BiConsumer;

public class Lambda13
{
   public static void main(String[] args) 
   {
     BiConsumer<Integer, String> updateVariables =  (num, str) -> 
		 {
            num = num * 2;
            str = str.toUpperCase();
            System.out.println("Updated values: " + num + ", " + str);
        };

        
        int number = 15;
        String text = "nit";

        updateVariables.accept(number, text);

        // Values after the update (note that the original values are unchanged)
        System.out.println("Original values: " + number + ", " + text);
    }
}
-------------------------------------------------------------
BiFunction<T, U, R> Functional interface :   
---------------------------------
It is a predefined functional interface available in java.util.function sub package.

It is a functional interface in Java that represents a function that accepts two arguments and produces a result R.

The BiFunction interface has a method named apply that takes two arguments and returns a result.

@FunctionalInterface
public interface BiFunction<T, U, R> 
{
    R apply(T t, U u);
}
-------------------------------------------------------------
import java.util.function.BiFunction;

public class Lambda14
{
  public static void main(String[] args) 
  {
        // BiFunction to concatenate two strings
    BiFunction<String, String, String> concatenateStrings = (str1, str2) -> str1 + str2;

        String result = concatenateStrings.apply("Hello", " Java");
        System.out.println(result);  


      // BiFunction to find the length two strings
    BiFunction<String, String, Integer> concatenateLength = (str1, str2) -> str1.length() + str2.length();

        Integer result1 = concatenateLength.apply("Hello", "Java");
        System.out.println(result1);  


  }
}
--------------------------------------------------------------
UnaryOperator<T> :
------------------
It is a predefined functional interface available in java.util.function sub package.

It is a functional interface in Java that represents an operation on a single operand that produces a result of the same type as its operand. This is a specialization of Function for the case where the operand and result are of the same type.

It has a single type parameter, T, which represents both the operand type and the result type.

@FunctionalInterface
public interface UnaryOperator<T> extends Function<T,R>
{
  public abstract T apply(T x);
}
--------------------------------------------------------------
import java.util.function.*;
public class Lambda15  
{
	public static void main(String[] args) 
	{
		UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(5));

		UnaryOperator<String> concat = str -> 
         str.concat("base");
		 System.out.println(concat.apply("Data"));
	}
}
-------------------------------------------------------------
BinaryOperator<T>
-----------------
It is a predefined functional interface available in java.util.function sub package.

It is a functional interface in Java that represents an operation upon two operands of the same type, producing a result of the same type as the operands. 

This is a specialization of BiFunction for the case where the operands and the result are all of the same type.

It has two parameters of same type, T, which represents both the operand types and the result type.

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T,U,R>
{
  public abstract T apply(T x, T y);
}
--------------------------------------------------------------
import java.util.function.*;
public class Lambda16  
{
	public static void main(String[] args) 
	{
		BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(3, 5));  
	}
}
--------------------------------------------------------------
19-12-2024
-----------
Can an interface extend a class ?
---------------------------------
An interface can't extend a class, It can extend only interface.

Every public method of Object class is implicitly re-declared inside every interface as an abstract method to support upcasting if interface does not extend any super interface.

We can't override any public method of object class as a
default method inide interface.
---------------------------------------------------------------
package com.ravi.interface_member;

interface Drawable
{
	 
}
public class InterfaceMemberDemo1 {

	public static void main(String[] args) 
	{
		Drawable d = null;
		d.hashCode();
		d.toString();
		d.equals(null);

	}

}
---------------------------------------------------------------
package com.ravi.interface_member;

interface Printable
{
	
}
class Print implements Printable
{

	@Override
	public String toString() {
		return "Print []";
	}
	
}
public class InterfaceMemberDemo2 
{
	public static void main(String[] args) 
	{
		Printable p = new Print();
		System.out.println(p.hashCode());
		System.out.println(p.toString());
	}

}
--------------------------------------------------------------
package com.ravi.interface_member;

@FunctionalInterface
abstract interface Moveable
{
	void move();
	public String toString();	   
	public int hashCode();
    public boolean equals(Object obj);
    

}

public class InterfaceMemberDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
---------------------------------------------------------------
package com.ravi.interface_member;

interface Alpha
{
	
	default String toString() //error
	{
		return null;
	}

	default int hashCode() //error
	{
		return 100;
	}

	
}

public class InterfaceMemberDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

Note : From the above program, It is clear that we can't override Object class public method as a default method inside interface.
---------------------------------------------------------------
Interface from JAVA 9V
----------------------
We can write private static and private non static (not public)
methods inside an interface from java 9 version.

The main purpose of providing these two methods inside an 
interface are as follows :

1) Code Reusability 
--------------------
If two or more than two default methods want to share a common code (Helper Method code) then we can write these common code in private methods so it will enhance code reusability.

2) Hide the Logic from Outer World 
----------------------------------
By writing these code in private static and private non static methods the actual logic is not visible to the outer world so, It is way to make our interface as a fully abstract class so 100% abstraction is possible.

Note : By default interface is not Fully abstract but we can make it full abstract from java 9V by writing the logic inside private method.

Note : from default method we can call private static as well as private non static methods but from public static method of interface we can call only private static method.
--------------------------------------------------------------
package com.ravi.interface_member;

interface Acceptable
{
	int MAX_VALUE = 500;  //JDK 1.0
	
	void m1(); //JDK 1.0
	
	default void m2() //JDK 1.8
	{	
		m4();
		m5();
	}
	
	static void m3()  //JDK 1.8
	{	
		m4();
		
	}
	
	private static void m4()  //Java 9
	{
		System.out.println("Private static method");
	}
	
	private void m5()  //Java 9
	{
		System.out.println("Private non static method");
	}
}
class Accept implements Acceptable
{
	@Override
	public void m1()
	{
		System.out.println("M1 overridden Method");
		
	}
	
}

public class InterfaceMemberFromJava9
{
	public static void main(String[] args) 
	{
      Acceptable a = new Accept();
      a.m1();
      a.m2();
      Acceptable.m3();
       

	}

}

---------------------------------------------------------------
The following Program explains how to use Helper method (private Method) to validate different data 

package com.ravi.method_overloading;

import java.util.Scanner;

class Payment
{  
// Payment using cash
    public void makePayment(double amount)
    {
        if (validateAmount(amount))
        {
            System.out.println("Processing payment via Cash...");
            System.out.println("Amount Paid RS :" + amount);
            System.out.println("Payment Successful!");
        }
    }
   
    //Payment through creditCard
    public void makePayment(String cardHolderName, String creditCardNumber,double amount)
    {
        if (validateCardNumber(creditCardNumber) && validateAmount(amount))
        {
            System.out.println("Processing payment via Credit Card...");
            System.out.println("Card Holder: " + cardHolderName);
            System.out.println("Card Number: " + maskCardNumber(creditCardNumber));
            System.out.println("Amount Paid RS :" + amount);
            System.out.println("Payment Successful!");
        }
    }

    //Payment through debitCard
    public void makePayment(String debitCardNumber, double amount)
    {
        if (validateCardNumber(debitCardNumber) && validateAmount(amount))
        {
            System.out.println("Processing payment via Debit Card...");
            System.out.println("Card Number: " + maskCardNumber(debitCardNumber));
            System.out.println("Amount Paid RS :" + amount);
            System.out.println("Payment Successful!");
        }
    }    

    // Helper method to validate amount
    private boolean validateAmount(double amount)
    {
        if (amount <= 0)
        {
            System.err.println("Error: Amount must be greater than zero.");
            return false;
        }
        return true;
    }

    // Helper method to validate credit OR debit card
    private boolean validateCardNumber(String cardNumber)
    {
        if (cardNumber.length() != 16 )
        {
            System.err.println("Error: Invalid card number. It must be 16 digits.");
            return false;
        }
        return true;
    }

    //Helper Method
    private String maskCardNumber(String cardNumber)
    {
        return "****-****-****-" + cardNumber.substring(12);
    }
   
   
}

public class PaymentProcess
{
    public static void main(String[] args)
    {
        System.out.println("Payment Menu");
        System.out.println("Please select any one Payment Method from the Menu :");
        System.out.println("\t\t 1) Payment by using Cash ");
        System.out.println("\t\t 2) Payment by using Credit Card ");
        System.out.println("\t\t 3) Payment by using Debit Card ");
       
        Payment payment = new Payment();
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Please enter your Payment choice [1/2/3]");
        int choice = sc.nextInt();
       
        switch(choice)
        {
        case 1:
        System.out.println("Enter the amount you want to pay through cash :");
        double amount = sc.nextDouble();
        payment.makePayment(amount);
        break;
       
        case 2:
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter your 16 digit Credit Card Number :");
        String creditCard = sc.nextLine();
       
        System.out.println("Enter your Payment Amount :");
        amount = sc.nextDouble();
        payment.makePayment(name, creditCard, amount);
        break;
       
        case 3 :
        System.out.println("Enter your 16 digit Debit Card Number :");
        String debitCard = sc.nextLine();
        debitCard = sc.nextLine();
        System.out.println("Enter your Payment Amount :");
        amount = sc.nextDouble();
        payment.makePayment(debitCard, amount);
        break;
        }
       
        sc.close();

     
    }
}
--------------------------------------------------------------
What is a Marker interface ?
-----------------------------
If an interface does not contain any field or method, Basically It is an empty interface then it is called Marker interface OR Tag interface.

Example :

interface Callable  //Marker interface
{

}

In java we have following marker interfaces are available :

a) java.io.Serializable
b) java.lang.Cloneable
c) java.util.RandomAccess

**The main purpose of marker interface to provide additional information to the JVM reagarding the Object like Object is Serializable, Cloneable OR Randomly Accessible.
---------------------------------------------------------------
---
 ****What is difference between abstract class and interface ?
----------------------------------------------------------------
The following are the differences between abstract class and interface.

1) An abstract class can contain instance variables but interface variables are by default public , static and final (no instance variable).

2) An abstract class can have state (properties) of an object but interface can't have state of an object.

3) An abstract class can contain constructor but inside an interface we can't define constructor.

4) An abstract class can contain instance and static blocks but inside an interface we can't define any blocks.

5) Abstract class can't refer Lambda expression but using Functional interface we can refer Lambda Expression.	

6) By using abstract class multiple inheritance is not possible but by using interface we can achieve multiple inheritance.

------------------OOPs Completed..............................

1) Exception Handling
2) Multithreading
3) Collections Framework (22 Session)

a) enum  b) inner classes c) Object class and its method
d) file Handling and Input and Output
===============================================================
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

In the above program, we have two threads, main thread which is responsible to execute main method and Thread-0 thread which is responsible to execute run() method. [04-JAN-25]

In entire Multithreading start() is the only method which is responsible to create a new thread.
------------------------------------------------------------------
public final boolean isAlive() :-
-----------------------------
It is a predefined non static method of Thread class through which we can find out whether a thread has started or not ?

As we know a new thread is created/started after calling start() method so if we use isAlive() method before start() method, it will return false but if the same isAlive() method if we invoke after the start() method, it will return true.

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
Assignment :
------------
Thread.sleep(long mills, int nanos);

06-01-2025
----------
IQ :- If we write Thread.sleep(1000) then exactly after 1 sec the Thread will re-start?

Ans :- No, We can't say that the Thread will directly move from waiting state to Running state. 

The Thread will definetly wait for 1 sec in the waiting state and then again it will re-enter into Runnable state which is control by Thread Schedular so we can't say that the Thread will re-start just after 1 sec.
------------------------------------------------------------------
Anonymous inner class by using Thread class :
---------------------------------------------
Case 1:
-------
Creating Anonymous inner class object using Thread class with ref.

package com.ravi.basic;

public class AnonymousThreadWithReference
{
	
	public static void main(String[] args) 
	{
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
				System.out.println(name+" thread is running Here.");
			}
		};
		t1.start();
		String name = Thread.currentThread().getName();
		System.out.println("Currently Executing Thread name is :"+name);


	}

}
------------------------------------------------------------------
Case 2 :
----------
Creating Anonymous inner class object using Thread class without ref.

package com.ravi.basic;

public class AnonymousThreadWithoutReference {

	public static void main(String[] args) 
	{
		new Thread()
		{
			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
				System.out.println(name+" thread is running Here.");
			}
		}.start();

	}

}
--------------------------------------------------------------07-01-2025
----------
join() method of Thread class :
-------------------------------
The main purpose of join() method to put the current thread into waiting state until the other thread finish its execution.

Here the currently executing thread stops its execution and the thread goes into the waiting state. The current thread remains in the wait state until the thread on which the join() method is invoked has achieved its dead state.

It also throws checked exception i.e InterruptedException so better to use try catch or declare the method as throws.

It is a non static method so we can call this method with the help of Thread object reference.
-------------------------------------------------------------
package com.ravi.basic;

class Join extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1; i<=5; i++)
		{
			System.out.println("i value is :"+i+" by "+name);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(name+ "Thread is dead now");
	}
}

public class JoinDemo 
{
	public static void main(String[] args) throws InterruptedException  
	{
		System.out.println("Main Thread started");
		
		Join j1 = new Join();		
		Join j2 = new Join();
		Join j3 = new Join();
		
		j1.setName("J1");
		j2.setName("J2");
		j3.setName("J3");
		
		
		j1.start();
		j1.join();
		System.out.println("Main Thread wake up");
		j2.start();
		j3.start();
		
		System.out.println("Main Thread Completed");
		
	}

}
--------------------------------------------------------------
package com.ravi.basic;

class Alpha extends Thread   
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();	//Alpha_Thread is current thread		
		
		Beta b1 = new Beta();
		b1.setName("Beta_Thread");
        b1.start();  
        try 
        {
			b1.join(); //Alpha thread is waiting 4 Beta Thread to complete
		
			System.out.println("Alpha thread re-started");
		} 
        catch (InterruptedException e) 
        {			
			e.printStackTrace();
		}
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+" by "+name);
		}
		
	}
}

public class JoinDemo2 
{
	public static void main(String[] args) 
	{
		Alpha a1 = new Alpha();
		a1.setName("Alpha_Thread");
		a1.start();
	}
}

class Beta extends Thread
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();	
		
		for(int i=1; i<=20; i++)
		{
			System.out.println(i+" by "+name);
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				
			}
		}
		System.out.println("Beta Thread Ended");
	}
}
--------------------------------------------------------------
package com.ravi.basic;

public class JoinDemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
       System.out.println("Main Thread started");
       
       Thread t = Thread.currentThread();
       
       for(int i=1; i<=10; i++)
       {
    	   System.out.println(i+" by "+t.getName());
       }
       
       t.join();  //Deadlock [Main thread is waiting 4 main thread to complete]
           
       System.out.println("Main Thread Ended");
	}
}

Note : Here main thread is waiting for main thread to 
       complete so, It is deadlock situation.
--------------------------------------------------------------
Assignment :

join(long millis)
join(long millis, long nanos)
--------------------------------------------------------------
Assigning target by Runnable interface :[Loose Coupling]
----------------------------------------------------------
By using Runnable interface we can assign different targets to our thread but thread will be created by using start() method 
of Thread class.

package com.ravi.basic;

class Demo1 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Thread is Running");		
	}	
}

public class RunnableDemo
{
   public static void main(String [] args)
   {
	   System.out.println("Main");
	  Demo1 d = new Demo1();
	  Thread t1 = new Thread(d);
	  t1.start();
   }
}   
--------------------------------------------------------------
Assigning different Target by multiple thread :
------------------------------------------------
package com.ravi.basic;

class Tatkal implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" is booking ticket under Tatkal Scheme");
	}	
}
class PremimumTatkal implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" is booking ticket under PremimumTatkal Scheme");		
	}	
}

public class RunnableDemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{			
		Thread t2 = new Thread(new PremimumTatkal(),"Smith");
		t2.start();
			
		Thread t1 = new Thread(new Tatkal(),"Scott");
		t1.start();		
		
		Thread t3 = new Thread(new Tatkal(), "Martin");
		t3.start();
		
		
	}

}
--------------------------------------------------------------
08-01-2025
----------
Thread class Constructor :
--------------------------
We have total 10 constructors in the Thread class, The following are commonly used constructor in the Thread class

1) Thread t1 = new Thread();

2) Thread t2 = new Thread(String name);

3) Thread t3 = new Thread(Runnable target);

4) Thread t4 = new Thread(Runnable target, String name);

5) Thread t5 = new Thread(ThredGroup tg, String name);

6) Thread t6 = new Thread(ThredGroup tg, Runnable target);

7) Thread t7 = new Thread(ThredGroup tg, Runnable target, String name);
--------------------------------------------------------------
Anonymous inner class by using Runnable interface :
--------------------------------------------------
Case 1 :
---------
Implementing run() method by using Anonymous inner class :
-----------------------------------------------------------
package com.ravi.mi;

public class AnonymousRunnable {

	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable() 
		{			
			@Override
			public void run() 
			{
				String name = Thread.currentThread().getName();
				System.out.println(name);				
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();	

	}

}
--------------------------------------------------------------
Case 2 :
--------
By using Lambda :
-----------------
package com.ravi.runnable_ex;

public class RunnableLambdaDemo {

	public static void main(String[] args) 
	{
		Runnable r1 = ()->
		{
			String name = Thread.currentThread().getName();
			System.out.println("Current Thread Name is :"+name);
					
		};
		
		Thread t1 = new Thread(r1,"Child1");
		t1.start();

	}

}
--------------------------------------------------------------
Case 3 :
--------
package com.ravi.runnable_ex;

public class RunnableImplementationUsingConstructor {

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Runnable()
		{
			@Override
			public void run() 
			{
				String name = Thread.currentThread().getName();
				System.out.println("Current Thread Name is :"+name);								
			}
				
		});
		t1.start();

	}

}
-------------------------------------------------------------
Case 4 :
---------
package com.ravi.runnable_ex;

public class RunnableImplementationUsingConstructorWithoutRef {

	public static void main(String[] args) 
	{
		new Thread(new Runnable()
		{
					@Override
					public void run() 
					{
						String name = Thread.currentThread().getName();
						System.out.println("Current Thread Name is :"+name);						
					}
			
				}).start();
	}
}
-------------------------------------------------------------
Case 5 :
----------
package com.ravi.runnable_ex;

public class LambdaImplementationInConstructor {

	public static void main(String[] args) 
	{
		new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
		
		new Thread(()-> System.out.println(Thread.currentThread().getName()),"Child1").start();
	}

}
--------------------------------------------------------------
Limitation of Multithreading :
-------------------------------
Multithreading is very good to complete our task as soon as possible but in some situation, It provides some wrong data or wrong result.

In Data Race or Race condition, all the threads try to access the resource at the same time so the result may be corrupted.

In multithreading if we want to perform read operation and data is not updatable then multithreading is good but if the data is updatable data (modifiable data) then multithreading may produce some wrong result or wrong data as shown in the diagram. [08-JAN-25]
-------------------------------------------------------------
package com.ravi.runnable_ex;

class Customer implements Runnable
{
	private int availableSeat = 1;
	private int wantedSeat;
	
	public Customer(int wantedSeat) 
	{
		super();
		this.wantedSeat = wantedSeat;
	}
	
	@Override
	public  void run() 
	{
	  String name = null;
	  
	  if(availableSeat >= wantedSeat)
	  {
		  name = Thread.currentThread().getName();
		  System.out.println(wantedSeat+ " berth is reserved for :"+name);
		  availableSeat = availableSeat - wantedSeat;		  
	  }
	  else
	  {
		  System.out.println("Available Seat is :"+availableSeat);
		  name = Thread.currentThread().getName();
		  System.err.println("Sorry!!"+name+ " berth is not available");
	  } 
		
	}	
}

public class RailwayReservation {

	public static void main(String[] args) 
	{
		Customer c1 = new Customer(1);

		Thread t1 = new Thread(c1,"Scott");
		Thread t2 = new Thread(c1,"Smith");
		
		t1.start();
		
				
		t2.start();		
	}
}

Most of the time, both the Threads will get the ticket.
--------------------------------------------------------------
package com.ravi.runnable_ex;

class Customer
{
	private double availableBalance = 20000;
	private double withdrawAmount;
	
	public Customer(double withdrawAmount) 
	{
		super();
		this.withdrawAmount = withdrawAmount;
	}
	
	public void withdraw()
	{
		String name = null;
		
		if(withdrawAmount <= availableBalance)
		{			
			name = Thread.currentThread().getName();
			System.out.println(name+" has successfully withdraw :"+withdrawAmount+" amount");
			availableBalance = availableBalance - withdrawAmount;
			
		}
		else
		{
			name = Thread.currentThread().getName();
			System.err.println("Sorry!!!"+name+" you have insufficient balance ");
		}
	}	
	
}

public class BankApplication {

	public static void main(String[] args) throws InterruptedException 
	{
		Customer c1 = new Customer(20000);
		
		Runnable r1 = () -> c1.withdraw();
		
		
		Thread t1 = new Thread(r1,"Scott");
		Thread t2 = new Thread(r1,"Smith");
		
		t1.start();  
		t2.start();		

	}

}
-------------------------------------------------------------
09-01-2025
-----------
***Synchronization :
-------------------
In order to solve the problem of multithreading java software people has introduced synchronization concept.

In order to acheive sycnhronization in java we have a keyword called "synchronized".

It is a technique through which we can control multiple threads but accepting only one thread at a time for Single object.

Synchronization can be divided into two categories :-

1) Method level synchronization

2) Block level synchronization

1) Method level synchronization :-
-----------------------------------
In method level synchronization, the entire method gets synchronized so all the thread will wait at method level and only one thread will enter inside the synchronized area as shown in the diagram. [09-JAN]


2) Block level synchronization
-------------------------------
In block level synchronization the entire method does not get synchronized, only the part of the method gets synchronized so all the thread will enter inside the method but only one thread will enter inside the synchronized block as shown in the diagram (09-JAN-25) 

Note :- In between method level synchronization and block level synchronization, block level synchronization is more preferable because all the threads can enter inside the method so only the PART OF THE METHOD GETS synchronized.

Note :  Synchronized area is a restricated area, with 
permission only, a thread can enter inside synchronized area.
--------------------------------------------------------------
How synchronization logic controls multiple threads ?
------------------------------------------------------
Every Object has a lock(monitor) in java environment and this lock can be given to only one Thread at a time.

Actually this lock is available with each individual object provided by Object class. 

The thread who acquires the lock from the object will enter inside the synchronized area, it will complete its task without any disturbance because at a time there will be only one thread inside the synchronized area(for single Object). *This is known as Thread-safety in java.

The thread which is inside the synchronized area, after completion of its task while going back will release the lock so the other threads (which are waiting outside for the lock) will get a chance to enter inside the synchronized area by again taking the lock from the object and submitting it to the synchronization mechanism.
This is how synchronization mechanism controls multiple Threads.

Note :- Synchronization logic can be done by senior programmers in the real time industry because due to poor synchronization there may be chance of getting deadlock.

--------------------------------------------------------------
//Program on Method Level Synchronization :
-------------------------------------------
package com.ravi.mt;

class Table
{
   public synchronized void printTable(int num) 
   {
     for(int i=1; i<=10; i++)
     {
    	try
    	{
    		Thread.sleep(1000);
    	}
    	catch(InterruptedException e)
    	{
    		e.printStackTrace();
    	}
       System.out.println(num+" X "+i+" = "+(num*i));   
     }
     String name = Thread.currentThread().getName();
     System.out.println(name+" thread is completed!!");
   }
}

public class MethodLevelSynchronization 
{
	public static void main(String[] args) 
	{
		Table obj = new Table(); //lock is created
		
		Thread t1 = new Thread()
		{
			@Override
			public void run()
			{
				obj.printTable(5);
			}
		};
		
		Thread t2 = new Thread()
		{
			@Override
			public void run()
			{
				obj.printTable(10);
			}
		};

		t1.start();  t2.start();
		
	}

}
--------------------------------------------------------------
//Program on Block Level Synchronization :
-------------------------------------------
package com.ravi.mt;

class ThreadName
{
	public void printThreadName()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Running Thread name is :"+name);
		
		synchronized(this)
		{
			System.out.println("Synchronized block started by thread :"+name);
			for(int i = 1; i<=10; i++)
			{
				System.out.println("i value is :"+i+" by "+name);
			}
			System.out.println("Synchronized block ended by thread :"+name);
		}
	}
	
	
}


public class BlockLevelSynchronization {

	public static void main(String[] args) 
	{
		ThreadName tn = new ThreadName();
		
		Runnable r1 = ()-> tn.printThreadName();
		
		Thread t1 = new Thread(r1,"Child1");
		Thread t2 = new Thread(r1,"Child2");
		
		t1.start();  t2.start();

	}

}
------------------------------------------------------------
10-01-2025
----------
Limitation/Drawback of Object Level Synchronization :
------------------------------------------------------
From the given diagram it is clear that there is no interference between t1 and t2 thread because they are passing throgh Object1 where as on the other hand there is no interferenec even in between t3 and t4 threads because they are also passing through Object2 (another object).

But there may be chance that with t1 Thread (object1), t3 or t4 thread can enter inside the synchronized area at the same time, simillarly it is also possible that with t2 thread, t3 or t4 thread can enter inside the synchronized area so the conclusion is, synchronization mechanism does not work with multiple Objects. [09-JAN-25]
------------------------------------------------------------
package com.ravi.advanced;

class PrintTable
{
	    public synchronized void printTable(int n)
	    {
	       for(int i=1; i<=10; i++)
	       {
	    	   System.out.println(n+" X "+i+" = "+(n*i));
	    	   try
	    	   {
	    		   Thread.sleep(500);
	    	   }
	    	   catch(Exception e)
	    	   {	    		   
	    	   }
	       }
	       System.out.println(".......................");
	    }	
}

public class ProblemWithObjectLevelSynchronization
{
	public static void main(String[] args) 
	{
		
		PrintTable pt1 = new PrintTable(); //lock1 [2 , 3]		
		PrintTable pt2 = new PrintTable(); //lock2 [8 , 9]	
				
		Thread t1 = new Thread()  //Anonymous inner class concept
				{
			       @Override
			       public void run()
			       {
			    	   pt1.printTable(2);	//lock1
			       }			   
				};
		       	        
		        Thread t2 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt1.printTable(3);	//lock1
			       }			   
				};
		                
		        Thread t3 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt2.printTable(8);	//lock2
			       }			   
				};
		               
		        Thread t4 = new Thread()
				{
			       @Override
			       public void run()
			       {
			    	   pt2.printTable(9); //lock2
			       }			   
				};
				 t1.start();	t2.start();	 t3.start();  t4.start(); 
	}
}

Here we are getting exprected output because two locks are available from two differenet object. It is clear that synchronization logic will not work with multiple objects.

To avoid this problem, We introduced static synchronization.
------------------------------------------------------------
**Static Synchronization :
------------------------
If we make our synchronized method as a static method then it is called static synchronization.

Here, To call static synchronized method, object is not required.

The thread will take the lock from class but not object because we can call the static method with the help of class name.

Unlike Object, we cann't create multiple classes in the same package.

For synchronized block we can write the following code :

synchronized(ClassName.class)
{

}
------------------------------------------------------------
package com.ravi.advanced;
class MyTable     
{
	 public static synchronized void printTable(int n)  //static synchronization
	    {
	       for(int i=1; i<=10; i++)
	       {
	    	   try
	    	   {
	    		   Thread.sleep(100);
	    	   }
	    	   catch(InterruptedException e)
	    	   {
	    		  System.err.println("Thread is Interrupted...");
	    	   }
	    	   System.out.println(n+" X "+i+" = "+(n*i));
	       }
	       System.out.println("------------------------");
	    }
}
public class StaticSynchronization 
{
	public static void main(String[] args)
	{
			        Thread t1 = new Thread()
					{
				      @Override
				      public void run()
				      {
				    	 MyTable.printTable(5); 
				      }
					};		
					
					Thread t2 = new Thread()
					{
				      @Override
				      public void run()
				      {
				    	  MyTable.printTable(10);
				      }
					};										

					Runnable r3 = ()-> MyTable.printTable(15);
					Thread t3 = new Thread(r3);
					
					t1.start();
					t2.start();	
					t3.start();
					
		}
}
------------------------------------------------------------
Thread Priority :
-----------------
Thread Priority :
-----------------
It is possible in java to assign priority to a Thread. Thread class has provided two predefined methods setPriority(int newPriority) and getPriority() to set and get the priority of the thread respectively.

In java we can set the priority of the Thread in numbers from 1- 10 only where 1 is the minimum priority and 10 is the maximum priority.

Whenever we create a thread in java by default its priority would be 5 that is normal priority.

The user-defined thread created as a part of main thread will acquire the same priority of main Thread.

Thread class has also provided 3 final static variables which are as follows :-

public static final int MIN_PRIORITY = 1;
public static final int NORM_PRIORITY = 5;
public static final int MAX_PRIORITY = 10;


Note :- We can't set the priority of the Thread beyond the limit(1-10) so if we set the priority beyond the limit (1 to 10) then it will generate an exception java.lang.IllegalArgumentException.
-----------------------------------------------------------
package com.ravi.priority;

public class PriorityDemo1 {

	public static void main(String[] args) 
	{
		Thread t1 = new Thread();
		System.out.println("Priority is :"+t1.getPriority());

	}

}

package com.ravi.priority;

class UserThread extends Thread
{
	
}

public class PriorityDemo2 {

	public static void main(String[] args) 
	{
		int priority = Thread.currentThread().getPriority();
        System.out.println("Main Thread priority is :"+priority);
        
        UserThread ut = new UserThread();
        System.out.println("User Thread priority is :"+ut.getPriority());
              
        
	}

}

ote : By default every thread even main thread is having default priority i.e 5.
-----------------------------------------------------------
package com.ravi.priority;

class Foo extends Thread
{
	
}

public class PriorityDemo3 
{
	public static void main(String[] args) 
	{
       Thread t = Thread.currentThread();
       t.setPriority(Thread.MAX_PRIORITY);
       
       
       Foo f1 = new Foo();
       System.out.println("Child Thread priority is :"+f1.getPriority());
       
       //f1.setPriority(11); //Invalid [java.lang.IllegalArgumentException]
       
       
       
       

	}

}

Note : Always child thread will acquire main thread priority.

package com.ravi.priority;

class Priority extends Thread
{
	@Override
	public void run()
	{
		int count = 0;
		for(int i = 1; i<=1000000; i++)
		{
			count++;
		}
		
		int priority = Thread.currentThread().getPriority();
		String name = Thread.currentThread().getName();
		
		System.out.println("The priority is :"+priority+" and thread name is :"+name);
		
	}
}

public class PriorityDemo4 
{
	public static void main(String[] args)
	{
		Priority p1 = new Priority();
		Priority p2 = new Priority();
		
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.MAX_PRIORITY);
		
		p1.setName("Last");
		p2.setName("First");
		
		p1.start();  p2.start();
		
	}

}
Most of time the thread having highest priority will complete its task but we can't say that it will always complete its task first that means Thread schedular dominates over the priority of the Thread.
------------------------------------------------------------
 
