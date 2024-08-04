package Collections_Programs_HashMapInterface;


/*********
 NATURE OF MAP
 • MAP (I) is NOT the child interfaces of
 Collection (I) and hence it is not considered
 to be a true collection.
 • It represents data in KEY-VALUE Pair.
 • Duplicate Keys are NOT Allowed in Map.
 • Duplicate Values are allowed.
 • Examples:
 o Employee# (Key) → Employee Name(Value)
 o PinCode(Key)→ Town or city name
 *********/
public class Hash_Map {

/**********
 POINTS ABOUT HASHMAP
 • HASHMAP (C) is implementation class for MAP(I).
 • Duplicate Keys are not allowed but duplicate values are NOT allowed.
 • Uses a technique called Hashing to store elements.
 • Only one NULL Key is allowed.
 • The order is not preserved as it uses Hashing. So we can't predict the
 retrieval order of the elements inserted.
 • A VALUE of the map can only be fetched using it's KEY.
 • It is not synchronised. So if it has to be used on multithreading
 environment, it has to be synchronized explicitly.
 • Initial capacity: 16 and Load Factor: .75
 ***********/
   public void Hash_Map_Example()
    {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Suriya");
        hm.put(2,"Priya");
        hm.put(3,"Abarna");
        hm.put(4,"Abitha");
        hm.put(5,"Divya");
        System.out.println("Employee Map : " +hm);

       //To make a copy of the existing
        Map<Integer,String> duplicateMap = new HashMap<Integer,String>();
        duplicateMap.putAll(hm);
        System.out.println("Employee Map Duplicate: " +duplicateMap);

        //clear to delete the map contents
        duplicateMap.clear();
        System.out.println("Employee Map Duplicate: " +duplicateMap);

        //To check if  a Key is present or not in the Map
        System.out.println("Does this map has Key 1" +hm.containsKey(1));

        //To check if a Value is present or not
        System.out.println("Does this map has value Abarna" +hm.containsValue("Abarna"));

        //Clone the Map
        System.out.println("Cloned Map " +hm.clone());

        //Check if the Map is empty or  not
        System.out.println("Cloned Map " +duplicateMap.isEmpty());

        //Fetch the set of Keys in the Map (Note: Here its not list of Keys, its set of Keys.
        //Because List will allow duplicate but Set Wont. Keys should be Unique
        System.out.println("Key Set " +hm.keySet());

        //Fetch a value
        System.out.println(hm.get(1));

        //Fetch all the Values
        System.out.println("All Values" +hm.values());

        //Entry set
        System.out.println(hm.entrySet());

    }

    public static void main(String[] args)
    {
        Hash_Map hm = new Hash_Map();
        hm.Hash_Map_Example();
    }






}
