
import java.util.*;

public class PerformanceComparator {

	DataGenerator col = new DataGenerator();
	double currentTime = 0, result = 0;
	 long startTime = System.currentTimeMillis();
    public void show(int num)
    {
    	
    for( int i = 0; i < num; i++ )
    {
   
    col.add(i,"ArrayList");
    col.add(i, "LinkedList");
    col.add(i, "HashMap");
    col.add(i, "LinkedHashMap");
    col.add(i, "TreeMap");
    col.add(i, "HashSet");
    col.add(i, "LinkedHashSet");
    col.add(i, "TreeSet");
    long timeSpent = System.currentTimeMillis(); 
	long timeSpent1=timeSpent-startTime;
    System.out.println("program completed at " + timeSpent1 + " millisecund");
 

    
    col.findEl(i,"ArrayList");
    col.findEl(i, "LinkedList");
    col.findEl(i, "HashMap");
    col.findEl(i, "LinkedHashMap");
    col.findEl(i, "TreeMap");
    col.findEl(i, "HashSet");
    col.findEl(i, "LinkedHashSet");
    col.findEl(i, "TreeSet");
    long timeSpent2 = System.currentTimeMillis(); 
	long timeSpent3=timeSpent2-timeSpent1;
    System.out.println("program completed at " + timeSpent3 + " millisecund");
 

    
    col.del(i,"ArrayList");
    col.del(i, "LinkedList");
    col.del(i, "HashMap");
    col.del(i, "LinkedHashMap");
    col.del(i, "TreeMap");
    col.del(i, "HashSet");
    col.del(i, "LinkedHashSet");
    col.del(i, "TreeSet");
    long timeSpent4 = System.currentTimeMillis(); 
	long timeSpent5=timeSpent4-timeSpent3;
    System.out.println("program completed at " + timeSpent5 + " millisecund");
 

   
    }
    }
public static void main(String[] args) {
	PerformanceComparator test=new PerformanceComparator();
	test.show((int)Math.pow(10,3));
	test.show((int)Math.pow(10,6));
	test.show(5*((int)Math.pow(10,6)));

}
    
}

