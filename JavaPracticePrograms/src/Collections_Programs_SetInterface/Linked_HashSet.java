package Collections_Programs_SetInterface;

import java.util.LinkedHashSet;

public class Linked_HashSet {

    /**
     * LinkedHashSet->Child class of HashSet
     * DS-> Hash table + Linked List
     * Insertion order is preserved
     * Duplicates not allowed
     */
     public void Linked_HashSetExample()
     {
        LinkedHashSet lhs = new LinkedHashSet();
         lhs.add("1");
         lhs.add("A");
         lhs.add("B");
         lhs.add("10");

         System.out.println("Insertion order is preserved in Linked Hash Set"+lhs);


     }

      public static void main(String[] args)
    {
        Linked_HashSet example =new Linked_HashSet();

        example.Linked_HashSetExample();



    }



}
