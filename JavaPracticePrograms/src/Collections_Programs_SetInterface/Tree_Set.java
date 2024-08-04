package Collections_Programs_SetInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.lang.*;
import java.util.List;
public class Tree_Set  {
    /**
     * TreeSet is the implementation class of SortedSet Interface.
     * Does not allow duplicates.
     * Sorts the elements
     * It has 6 methods like first,last,headSet,tailSet,subSet and comparator.
     * Difference between Hashset and Treeset, hash doesnt maintain order
     * but Treeset maintains ascending or alphabetical order.
     * DS-> Balanced Tree
     * Heterogeneous data not allowed. If added Exception, ClassCast will occur
     * For default natural sorting order,the objects should be homogeneous and comparable else class cast exception
     * To say any class is comporable or not, the class should implement comparable interface.
     */
    /**
     * Constructors present are 4
     * 1. TreeSet ts= new TreeSet();// default sort order
     * 2. TreeSet ts= new TreeSet(Comparator c);// customized sorting order defined by comparator object
     * 3. TreeSet ts= new TreeSet(Collection c);// equivalent tree set of any collection will be created
     * 4. TreeSet ts= new TreeSet(SortedSet s);// creates tree set for given sorted set
     **/
   public void treeSetExample()
   {
       TreeSet<Integer> treeset = new TreeSet<Integer>();

       treeset.add(8);
       treeset.add(2);
       treeset.add(10);
       treeset.add(6);
       treeset.add(0);
       treeset.add(4);


       System.out.println("Elements are Sorted on ascending order :"+treeset);

       //first()
       System.out.println("First element :"+treeset.first());
       //last()
       System.out.println("Last element :"+treeset.last());
       //headSet()
       System.out.println("Values lesser than given value" +treeset.headSet(4));
       //tailSet()
       System.out.println("Values equal to and higher than given value" +treeset.tailSet(2));
       //subSet()
       System.out.println("Subset values :"+treeset.subSet(2,10));
       //comparator()
       System.out.println("Comparator returns null if the sorting is default natural order :"+treeset.subSet(4,8));
       //Adding null to a non empty tree set causes null pointer excpetion
       //treeSet.add(null);
       System.out.println("Ceiling :"+treeset.ceiling(6));
       treeset.pollLast();
       System.out.println("Poll Last :"+treeset);
       treeset.pollFirst();
       System.out.println("Poll Last :"+treeset);
       System.out.println("Get First:"+treeset.getFirst());
       System.out.println("Get last :"+treeset.getLast());


       Iterator<Integer> desc =  treeset.descendingIterator();
       while(desc.hasNext())
       {
         System.out.println("Descending Iterator :"+desc.next());

       }
       //Convert tree to list
       List<Integer> list = new ArrayList<>(treeset);
       for (int i = 0;i<treeset.size(); i++)
       {
           System.out.println("Iterating using for loop :" +list.get(i));
       }

       //Advanced for Loop
       for (Integer j : treeset) {
           System.out.println("Advanced for loop :" + j);
       }
   }

    /*null can be easily added if the tree set is empty. If there are any elements present, the
     * comparator will check for the sorting order between the previosly added element and
     * the null. Since it compares null with the objects exisiting we are getting NPE.
     * Same is the case, if we add null first and add other elements, NPE will happen.
     */

    public static void main(String[] args) {

        Tree_Set ts = new Tree_Set();
        ts.treeSetExample();


    }
    }


