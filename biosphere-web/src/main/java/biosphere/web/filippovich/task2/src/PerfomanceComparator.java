import java.util.*;

/**
 * Created by Acer on 30.10.2015.
 */
public class PerfomanceComparator {

    static void InsertList(ArrayList list){
        list.add(UUID.randomUUID().toString());
        System.out.print(System.currentTimeMillis());
    }

    public static void main(String[] args){
        ArrayList tryList=new ArrayList();
        InsertList(tryList);
    }
}
