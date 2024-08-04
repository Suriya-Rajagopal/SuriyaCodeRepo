package Collections_Programs_HashMapInterface;

/******
 POINTS ABOUT LINKEDHASHMAP
 • HASHMAP (C) is implementation class for MAP(I).
 • Duplicate Keys are not allowed but duplicate values are allowed.
 • Uses a technique called Hashing to store elements.
 • Only one NULL Key is allowed.
 • The order is preserved.
 • A VALUE of the map can only be fetched using it's KEY.
 • It is not synchronised. So if it has to be used on multithreading
 environment, it has to be synchronized explicitly.
 • Initial capacity: 16 and Load Factor: .75
 . It all allowes null Key with unique value
 .It allowes Null Key, Null Value but latest get overwrites
 . Duplicate null keys are allowed but the value get overwritten with latest value

 *******/
public class Linked_HashMap {

 public void Linked_HashMapExample() {
        LinkedHashMap<String, String> heros = new LinkedHashMap<String, String>();
        heros.put("Iron Man", "Tony Stark");
        heros.put("Bat Man", "Bruce Wyne");
        heros.put("Super Man", "Clark");

        System.out.println(heros);

        HashMap<String, String> hasMapHeros = new HashMap<String, String>();
        hasMapHeros.put("Iron Man", "Tony Stark");
        hasMapHeros.put("Bat Man", "Bruce Wyne");
        hasMapHeros.put("Super Man", "Clark");

        System.out.println(hasMapHeros);

    }


    public static void main(String[] args) {
        Linked_HashMap Lhm = new Linked_HashMap();
        Lhm.Linked_HashMapExample();


    }

}
