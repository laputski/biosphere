package lab;
import java.util.*;

public class DataGenerator
{
    ArrayList<String> arrayList = new ArrayList<>();
    List<String> linkedList = new LinkedList<>();
    Map<Integer, String> hashMap = new HashMap<Integer, String>();
    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
    Map<Integer, String> treeMap = new TreeMap<Integer, String>();
    Set<String> hashSet = new HashSet<>();
    Set<String> linkedHashSet = new LinkedHashSet<>();
    Set<String> treeSet = new TreeSet<>();

    void write(int a)
    {
        arrayList.clear();
        linkedList.clear();
        hashMap.clear();
        linkedHashMap.clear();
        treeMap.clear();
        hashSet.clear();
        linkedHashSet.clear();
        treeSet.clear();

        for(int i=0; i<a; i++)
        {
            arrayList.add(UUID.randomUUID().toString());
            linkedList.add(UUID.randomUUID().toString());
            hashMap.put(i, UUID.randomUUID().toString());
            linkedHashMap.put(i, UUID.randomUUID().toString());
            treeMap.put(i, UUID.randomUUID().toString());
            hashSet.add(UUID.randomUUID().toString());
            linkedHashSet.add(UUID.randomUUID().toString());
            treeSet.add(UUID.randomUUID().toString());
        }
    }
}
