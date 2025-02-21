package FAB_03;

import java.util.*;

public class Test15
{
       public static void main(String[] args) 
       {
            List<Number> list = new ArrayList<Number>();
            list.add(7);
            list.add(8);
            list.add(7);
            Number index = list.get(Integer.valueOf(7));
            System.out.println(index);
        }
}
/** 
 * Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 3
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
	at java.base/java.util.Objects.checkIndex(Objects.java:365)
	at java.base/java.util.ArrayList.get(ArrayList.java:428)
	at Collection_LAB/FAB_03.Test15.main(Test15.java:13)
*/
 