/**
 * Created by VD on 09.10.2015.
 */
/*
import java.util.Random;
import java.util.UUID;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;
*/
import java.util.*;

public class DataGenerator {

    ArrayList<String> arrList = new ArrayList<>();
    LinkedList<String> linkList = new LinkedList<>();
    HashMap<Integer,String> HMap= new HashMap<>();
    LinkedHashMap<Integer,String> LHMap = new LinkedHashMap<>();
    TreeMap<Integer,String> TrMap = new TreeMap<>();
    HashSet<String> HSet = new HashSet<>();
    LinkedHashSet<String> LHSet = new LinkedHashSet<>();
    TreeSet<String> TrSet = new TreeSet<>();




    public void add(int Amount, int dataType) {
        switch (dataType) {
            case 1:
                for (int i = 0; i < Amount; i++) {
                    arrList.add(UUID.randomUUID().toString());
                }
                break;
            case 2:
                for (int i = 0; i < Amount; i++) {
                    linkList.add(UUID.randomUUID().toString());
                }
                break;
            case 3:
                for (int i = 0; i < Amount; i++) {
                    HMap.put(i, UUID.randomUUID().toString());
                }
                break;
            case 4:
                for (int i = 0; i < Amount; i++) {
                    LHMap.put(i, UUID.randomUUID().toString());
                }
                break;
            case 5:
                for (int i = 0; i < Amount; i++) {
                    TrMap.put(i,UUID.randomUUID().toString());
                }
                break;
            case 6:
                for (int i = 0; i < Amount; i++) {
                    HSet.add(UUID.randomUUID().toString());
                }
                break;
            case 7:
                for (int i = 0; i < Amount; i++) {
                    LHSet.add(UUID.randomUUID().toString());
                }
                break;
            case 8:
                for (int i = 0; i < Amount; i++) {
                    TrSet.add(UUID.randomUUID().toString());
                }
                break;
            default: break;
        }
    }

    public void search(int Amount, int dataType) {
        switch (dataType) {
            case 1:
                Iterator<String> iterArrList = arrList.iterator();
                while(iterArrList.hasNext()){
                    if( "hello".equals(iterArrList.next())    )
                        break;
                }
                break;
            case 2:
                Iterator<String> iterLinkList = linkList.iterator();
                while(iterLinkList.hasNext()){
                    if( "hello".equals(iterLinkList.next())    )
                        break;
                }
                break;
            case 3:
                Collection cHMap = HMap.values();
                Iterator iterHMap = cHMap.iterator();
                while (iterHMap.hasNext()) {
                    if ( "hello".equals(iterHMap.next()))
                        break;
                }
                break;
            case 4:
                Collection cLHMap = LHMap.values();
                Iterator iterLHMap = cLHMap.iterator();
                while (iterLHMap.hasNext()) {
                    if ( "hello".equals(iterLHMap.next()))
                        break;
                }
                break;
            case 5:
                Collection cTrMap = TrMap.values();
                Iterator iterTrMap = cTrMap.iterator();
                while (iterTrMap.hasNext()) {
                    if ( "hello".equals(iterTrMap.next())  )
                        break;
                }
                break;
            case 6:
                Iterator<String> iterHSet = HSet.iterator();
                while(iterHSet.hasNext()){
                    if( "hello".equals(iterHSet.next())  )
                        break;
                }
                break;
            case 7:
                Iterator<String> iterLHSet = LHSet.iterator();
                while(iterLHSet.hasNext()){
                    if( "hello".equals(iterLHSet.next())  )
                        break;
                }
                break;
            case 8:
                Iterator<String> iterTrSet = TrSet.iterator();
                while(iterTrSet.hasNext()){
                    if( "hello".equals(iterTrSet.next())    )
                        break;
                }
                break;
            default: break;
        }
    }

    public void deleteNumberOfElements(int Amount, int dataType) {
        switch (dataType) {
            case 1:
                Iterator<String> iterArrList = arrList.iterator();
                while(iterArrList.hasNext()){
                    iterArrList.next();
                    iterArrList.remove();
                }
                break;
            case 2:
                Iterator<String> iterLinkList = linkList.iterator();
                while(iterLinkList.hasNext()){
                    iterLinkList.next();
                    iterLinkList.remove();
                }
                break;
            case 3:
                for( int i = 0; i < Amount; i++){
                    HMap.remove(i);
                }
                break;
            case 4:
                for( int i = 0; i < Amount; i++){
                    LHMap.remove(i);
                }
                break;
            case 5:
                Collection ColTrMap = TrMap.values();
                Iterator iterTrMap = ColTrMap.iterator();
                while (iterTrMap.hasNext()) {
                    iterTrMap.next();
                    iterTrMap.remove();
                }
                break;
            case 6:
                Iterator<String> iterHSet = HSet.iterator();
                while(iterHSet.hasNext()){
                    iterHSet.next();
                    iterHSet.remove();
                }
                break;
            case 7:
                Iterator<String> iterLHSet = LHSet.iterator();
                while(iterLHSet.hasNext()){
                    iterLHSet.next();
                    iterLHSet.remove();
                }
                break;
            case 8:
                Iterator<String> iterTrSet = TrSet.iterator();
                while(iterTrSet.hasNext()){
                    iterTrSet.next();
                    iterTrSet.remove();
                }
                break;
            default: break;
        }
    }

    public void cleanCollection(int dataType){
        switch (dataType) {
            case 1:
                arrList.clear();
                break;
            case 2:
                linkList.clear();
                break;
            case 3:
                HMap.clear();
                break;
            case 4:
                LHMap.clear();
                break;
            case 5:
                TrMap.clear();
                break;
            case 6:
                HSet.clear();
                break;
            case 7:
                LHSet.clear();
                break;
            case 8:
                TrSet.clear();
                break;
            default: break;
        }
    }

}
