package lab;
import java.util.*;

public class PerformanceComparator
{
    public static void main(String[] args)
    {
        DataGenerator data = new DataGenerator();
        int SMALL = 1000;
        int BIG = 250000;
        int BIGGEST = 1000000;
        int n = 0;

        for(int i=0; i<3; i++)
        {
            switch (i)
            {
                case 0: n=SMALL; break;
                case 1: n=BIG; break;
                case 2: n=BIGGEST; break;
            }
            data.write(n);
            System.out.println("For " + n + " elements");
            System.out.println("                Add Find Delete");
            test(data, n);
            System.out.println("");
        }
    }

    static void test(DataGenerator data, int n)
    {
        int k = 10000;

        System.out.print("ArrayList:       ");
        ListTest(data.arrayList, n, k);

        System.out.println("");
        System.out.print("LinkedList:      ");
        ListTest(data.linkedList, n, k);

        System.out.println("");
        System.out.print("HashMap:         ");
        MapTest(data.hashMap, n, k);

        System.out.println("");
        System.out.print("LinkedHashMap:   ");
        MapTest(data.linkedHashMap, n, k);

        System.out.println("");
        System.out.print("TreeMap:         ");
        MapTest(data.treeMap, n, k);

        System.out.println("");
        System.out.print("HashSet:         ");
        SetTest(data.hashSet, k);

        System.out.println("");
        System.out.print("LinkedHashSet:   ");
        SetTest(data.linkedHashSet, k);

        System.out.println("");
        System.out.print("TreeSet:         ");
        SetTest(data.treeSet, k);
    }

    static void ListTest(List a, int n, int k)
    {
        long time;

        time = System.currentTimeMillis();
        for(int i=0; i<k; i++)
            a.add(2 * n / 3, UUID.randomUUID().toString());
        System.out.print(System.currentTimeMillis() - time + "    ");

        time = System.currentTimeMillis();
        for(int i=0; i<k/10; i++)
            a.contains(UUID.randomUUID().toString());
        System.out.print(System.currentTimeMillis() - time + "    ");

        time = System.currentTimeMillis();
        for(int i=0; i<k; i++)
            a.remove(2 * n / 3);
        System.out.print(System.currentTimeMillis() - time + "    ");
    }

    static void MapTest(Map a, int n, int k)
    {
        long time;

        time = System.currentTimeMillis();
        for(int i=0; i<k; i++)
            a.put(2 * n / 3, UUID.randomUUID().toString());
        System.out.print(System.currentTimeMillis() - time + "    ");

        time = System.currentTimeMillis();
        for(int i=0; i<k/10; i++)
            a.containsValue(UUID.randomUUID().toString());
        System.out.print(System.currentTimeMillis() - time + "    ");

        time = System.currentTimeMillis();
        for(int i=0; i<k; i++)
            a.remove(2 * n / 3);
        System.out.print(System.currentTimeMillis() - time + "    ");
    }

    static void SetTest(Set a, int k)
    {
        long time;

        time = System.currentTimeMillis();
        for (int i = 0; i < k; i++)
            a.add(UUID.randomUUID().toString());
        System.out.print(System.currentTimeMillis() - time + "    ");

        time = System.currentTimeMillis();
        for (int i = 0; i < k/10; i++)
            a.contains(UUID.randomUUID().toString());
        System.out.print(System.currentTimeMillis() - time + "    ");

        time = System.currentTimeMillis();
        for(int i=0; i<k; i++)
            a.remove(UUID.randomUUID().toString());
        System.out.print(System.currentTimeMillis() - time + "    ");
    }
}
