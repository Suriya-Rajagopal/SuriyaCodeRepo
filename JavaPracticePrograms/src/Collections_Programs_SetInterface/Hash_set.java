package Collections_Programs_SetInterface;

import Collections_Programs_ListInterface.Arrays_List;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {
    /**********
     * NATURE OF SET
     * • SET (I) is one of the child interfaces of Collection (I).
     * • duplicate values are NOT allowed
     * • insertion order is NOT maintained
     * • can insert Heterogeneous objects (If generics are not used)
     */

    /**********
     POINTS ABOUT HASHSET
     • HASHSET (I) is implementation class for SET(I).
     • Duplicate values are NOT allowed
     • Insertion order is NOT maintained
     • underlying DS is HashTable which is actually a HashMap instance.
     • can insert Heterogeneous objects (If generics are not used)
     • NULL elements are allowed in HashSet.
     • Implements Serializable and Cloneable Interfaces
     • Data are stored based on hashcode, so search is very effective.
     • Fill Ratio or Load factor: 0.75 or 75% • Default capacity-16
     ***************/

    /***************
     **
     * Set(I)-> HashSet (C) and LinkedHashSet(C) are implementations
     * Set(I) -> SortedSet(Child Interface)->NavigableSet(I)=> TreeSet(C) is the implementation
     *Important points to remember:
     *1. To store group of individual objects.
     *2. Duplicates not allowed
     *3.Insertion order will not be maintained
     *4.Set(I) doesn't have any new methods other than given in Collection(I).
     *5. DS for HashSet is Hash table
     *6. If we add duplicate value to HashSet, simply it will return false to the
     *add() and it won't throw any error or exception.
     *7. We can insert null values
     *8. Heterogeneous values can be added.
     *9. Implements Serializable and Cloneable?-> Yes
     *10. Data are stored based on hashcode, so search is very effective.
     *11. Fill Ratio or Load factor: 0.75 or 75%
     *12.Default capacity-16
     */

    public void Hash_SetExample() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Plums");
        hashSet.add("Cherry");
        hashSet.add("Guava");
        hashSet.add("Kiwi");
        hashSet.add("Banana");
        hashSet.add("Dates");
        hashSet.add("Papaya");


        System.out.println(hashSet);
        System.out.println(/****************************************************/);
        hashSet.remove("Dates");
        System.out.println(hashSet);
        System.out.println(/****************************************************/);
        System.out.println(hashSet.contains("Papaya"));
        System.out.println(hashSet);
        /**********
         *
         * Number Constructors available in HashSet=4
         * 1. HashSet hs= new HashSet();// size-16 and fill ratio is 0.75
         * 2. HashSet hs= new HashSet(int initialSize); size as declared and fill ratio is 0.75(default)
         * 3. HashSet hs= new HashSet(int initialSize, float fillRatio);//size and fill ratio can be declared
         * 4. HashSet hs= new HashSet (Collection c);//  creates a HashSet for any given Collection (Acts as interconversion)
         **********/
    }
        public void iteratorUsingIterator()
        {
            HashSet<String> hashSet1 = new HashSet<String>();
            hashSet1.add("A");
            hashSet1.add("B");
            hashSet1.add("C");
            hashSet1.add("D");
            hashSet1.add("E");
            hashSet1.add("F");
            hashSet1.add("G");
            System.out.println(hashSet1);
            Iterator<String> Ish = hashSet1.iterator();
            while(Ish.hasNext())
            {
                System.out.println("List of Hash Set Items :" +Ish.next());
            }



        }



        public static void main(String[] args)
        {
            Hash_set hs= new Hash_set();
            hs.Hash_SetExample();
            hs.iteratorUsingIterator();
        }

}








