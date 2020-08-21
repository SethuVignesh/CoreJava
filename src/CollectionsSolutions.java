import java.util.*;

public class CollectionsSolutions {
    //ArrayList
    //HashSet
    //Hash map
    //Tree set
    //linked hash set
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("orange");
        arrayList.add("banana");
        arrayList.add("apple");
        System.out.println(arrayList);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("orange");
        treeSet.add("banana");
        treeSet.add("apple");
        System.out.println(treeSet);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("orange");
        hashSet.add("banana");
        hashSet.add("apple");
        System.out.println(hashSet);

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("fruit","apple");
        hashMap.put("fruit","orange");
        hashMap.put("Vegitables","orange");
        System.out.println(hashMap);

        TreeMap<String,String> treeMap = new TreeMap();
        treeMap.put("Fruit","apple");
        treeMap.put("Fruit","orange");
        treeMap.put("fruit","banana");
        treeMap.put("null","apple");
        treeMap.put("apple","apple");
        treeMap.put("Apple","apple");
        System.out.println(treeMap);

        List<String> list = new ArrayList<>();
       //List<String> list2 = new List<>();

    }
}


