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



    }

    public static void main (String[] arg)
    {}


}
