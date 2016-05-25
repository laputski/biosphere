import java.util.*;

public class DataGenerator {

	ArrayList<String> AList = new ArrayList<>();
    LinkedList<String> LList = new LinkedList<>();
    HashMap<Integer,String> HMap= new HashMap<>();
    LinkedHashMap<Integer,String> LHMap = new LinkedHashMap<>();
    TreeMap<Integer,String> TMap = new TreeMap<>();
    HashSet<String> HSet = new HashSet<>();
    LinkedHashSet<String> LHSet = new LinkedHashSet<>();
    TreeSet<String> TSet = new TreeSet<>();
	
    
    public void add(int N, String TypeCol) {
    	
    	if (TypeCol.equals("ArrayList"))
    	{ for (int i = 0; i < N; i++) {
                    AList.add(UUID.randomUUID().toString());
                }
    	}
                
    	
                if (TypeCol.equals("LinkedList"))
                {
                for (int i = 0; i < N; i++) {
                    LList.add(UUID.randomUUID().toString());
                }
                }
                
                if (TypeCol.equals("HashMap"))
                {
                for (int i = 0; i <N; i++) {
                    HMap.put(i, UUID.randomUUID().toString());
                }
                }
                
          if (TypeCol.equals("LinkedHashMap"))
                {
                for (int i = 0; i < N; i++) {
                    LHMap.put(i, UUID.randomUUID().toString());
                }
    }
          if (TypeCol.equals("TreeMap"))
          {     for (int i = 0; i < N; i++) {
                    TMap.put(i,UUID.randomUUID().toString());
                }
    }
          if (TypeCol.equals("HashSet"))
          {    for (int i = 0; i < N; i++) {
                    HSet.add(UUID.randomUUID().toString());
                }
          }
          if (TypeCol.equals("LinkedHashSet"))
          {      for (int i = 0; i < N; i++) {
                    LHSet.add(UUID.randomUUID().toString());
                }
    }
          if (TypeCol.equals("TreeSet"))
          { for (int i = 0; i < N; i++) {
                    TSet.add(UUID.randomUUID().toString());
                }
          }
           
    }
    
    
    
    public void del(int N, String TypeCol) {
    	
    	if (TypeCol.equals("ArrayList"))
    	{ Iterator<String> IAList = AList.iterator();
        while(IAList.hasNext()){
        	IAList.next();
        	IAList.remove();
        }
    	}
                
    	
                if (TypeCol.equals("LinkedList"))
                {
                	Iterator<String> ILList = LList.iterator();
                    while(ILList.hasNext()){
                    	ILList.next();
                    	ILList.remove();
                }
                }
                
                if (TypeCol.equals("HashMap"))
                {
                	for( int i = 0; i < N; i++){
                        HMap.remove(i);
                    }
                }
                
          if (TypeCol.equals("LinkedHashMap"))
                {
        	  for( int i = 0; i < N; i++){
                  LHMap.remove(i);
              }
    }
          if (TypeCol.equals("TreeMap"))
          {
        	  for( int i = 0; i < N; i++){
                  TMap.remove(i);
          }
        	  
          }
    
          if (TypeCol.equals("HashSet"))
          {    Iterator<String> IHSet = HSet.iterator();
          while(IHSet.hasNext()){
              IHSet.next();
              IHSet.remove();
          }
          }
          if (TypeCol.equals("LinkedHashSet"))
          {      Iterator<String> ILHSet = LHSet.iterator();
          while(ILHSet.hasNext()){
              ILHSet.next();
              ILHSet.remove();
          }
    }
          if (TypeCol.equals("TreeSet"))
          { Iterator<String> ITSet = TSet.iterator();
          while(ITSet.hasNext()){
              ITSet.next();
              ITSet.remove();
          }
          }
    }
    
    
    
  public void findEl(int N, String TypeCol) {
    	
    	if (TypeCol.equals("ArrayList"))
    	{ 
        	System.out.println(AList.get(2));
        
    	}
                
    	
                if (TypeCol.equals("LinkedList"))
                {
                	 Iterator<String> ILList = LList.iterator();
                     while(ILList.hasNext()){
                         if( "foundEl".equals(ILList.next())    )
                        	 System.out.println(ILList.next());
                             break;
                     }
                	
                
                }
                
                if (TypeCol.equals("HashMap"))
                {
                	
                		String val=(String)HMap.get(4);
                		 
                		   System.out.println(val);
                    
                }
                
          if (TypeCol.equals("LinkedHashMap"))
                {
        	  
        		  System.out.println(LHMap.get(3));
              
    }
          if (TypeCol.equals("TreeMap"))
          {
        	
        		  System.out.println(TMap.get(5));
              
        	  
          }
    
          if (TypeCol.equals("HashSet"))
          {    Iterator<String> IHSet = HSet.iterator();
          while(IHSet.hasNext()){
        	  
                  if( "foundEl".equals(IHSet.next())  )
                	  System.out.println(IHSet.next());
                      break;
              }
          }
          if (TypeCol.equals("LinkedHashSet"))
          {      Iterator<String> ILHSet = LHSet.iterator();
          while(ILHSet.hasNext()){
        	 
                  if( "foundEl".equals(ILHSet.next())  )
                	  System.out.println(ILHSet.next());
                      break;
    }
          }
          if (TypeCol.equals("TreeSet"))
          { Iterator<String> ITSet = TSet.iterator();
          while(ITSet.hasNext()){
        	  if( "foundEl".equals(ITSet.next())    )
        		  System.out.println(ITSet.next());
                  break;
          
          }
          }
    }
}
