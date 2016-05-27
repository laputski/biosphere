import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Acer on 22.10.2015.
 */
public class DataGenerator {

    static String TestList(int size,List list){
        Random random=new Random();
        String insert;
        for(int i=0;i<size;i++){
            insert= UUID.randomUUID().toString();
            list.add(insert);
           //System.out.print(list.get(i)+" ");
        }
        return list.get(random.nextInt(size)).toString();
    }

    static String TestSet(int size,Set set){
        String insert;
        for(int i=0;i<size;i++){
            insert= UUID.randomUUID().toString();
            set.add(insert);
            //System.out.print(insert+" ");
        }
        Random random=new Random();
        Iterator itr=set.iterator();
        return itr.next().toString();
    }

    static int TestMap(int size,Map map){
        String insert;
        for(int i=0;i<size;i++){
            insert= UUID.randomUUID().toString();
            map.put(i,insert);
            // System.out.print(list.get(i)+" ");
        }
        Random random=new Random();
        return random.nextInt(size);
    }

    static long SearchList(ArrayList list, String str){
        long initTime=System.currentTimeMillis();
        list.contains(str);
        return System.currentTimeMillis()-initTime;
    }

    static long SearchSet(Set set, String str){
        long initTime=System.currentTimeMillis();
        set.contains(str);
        return System.currentTimeMillis()-initTime;
    }

    static long SearchMap(Map map, int str){
        long initTime=System.currentTimeMillis();
        map.get(str);
        return System.currentTimeMillis()-initTime;
    }

    static long DeleteList(ArrayList list, String str) {
        long initTime=System.currentTimeMillis();
        list.remove(str);
        return System.currentTimeMillis()-initTime;
    }

    static long DeleteSet(Set set, String str) {
        long initTime=System.currentTimeMillis();
        set.remove(str);
        return System.currentTimeMillis()-initTime;
    }

    static long DeleteMap(Map map, int str) {
        long initTime=System.currentTimeMillis();
        map.remove(str);
        return System.currentTimeMillis()-initTime;
    }

    static long InsertList(ArrayList list){
        long initTime=System.currentTimeMillis();
        list.add(UUID.randomUUID().toString());
        return System.currentTimeMillis()-initTime;
    }

    static long InsertSet(Set set){
        long initTime=System.currentTimeMillis();
        set.add(UUID.randomUUID().toString());
        return System.currentTimeMillis()-initTime;
    }

    static long InsertMap(Map map){
        long initTime=System.currentTimeMillis();
        map.put(map.size()+1, UUID.randomUUID().toString());
        return System.currentTimeMillis()-initTime;
    }

    public static void main(String[] args){
        ArrayList tryList=new ArrayList();
        HashMap tryMap=new HashMap();
        HashSet trySet=new HashSet();
        String setElem=TestSet((int)Math.pow(10,6),trySet);
        System.out.println("Set done");
        int mapElem=TestMap((int)Math.pow(10,6),tryMap);
        System.out.println("Map done");
        String listElem=TestList((int)Math.pow(10,6),tryList);
        System.out.println("List done");
        System.out.print(DeleteSet(trySet, setElem));
        System.out.println(" " + trySet.size() + " ");
        System.out.print(DeleteMap(tryMap, mapElem));
        System.out.println(" " + tryMap.size() + " ");
        System.out.print(DeleteList(tryList, listElem));
        System.out.println(" " + tryList.size() + " ");
    }
}
