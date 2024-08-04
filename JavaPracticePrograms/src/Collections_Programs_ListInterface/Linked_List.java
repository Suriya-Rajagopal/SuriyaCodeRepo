package Collections_Programs_ListInterface;

import java.util.LinkedList;

public class Linked_List {

    /*****
     * LinkedList is implemented using Doubly linked list. This is best suited for insertion and Deletion
     Operation
     * Unlike ArrayList, this is not the best for retrieving the data.
     * All the collections implements Serializable and cloneable Interfaces.
     * LinkedList also implements those Interfaces but not RandomAccess Interface. ***/

    public void linkedList_Example() {
        LinkedList<Integer> linked_List = new LinkedList<Integer>();
        linked_List.add(2);
        linked_List.add(4);
        linked_List.add(6);
        linked_List.add(8);
        linked_List.add(10);
        linked_List.add(2);
        linked_List.add(4);
        linked_List.add(6);
        linked_List.add(8);
        linked_List.add(10);
        linked_List.add(2);
        linked_List.add(4);
        linked_List.add(6);
        linked_List.add(8);
        linked_List.add(10);

        System.out.println("Linked List Integers:" + linked_List);
        System.out.println("/*******Add an element to First Position*********/");
        linked_List.addFirst(12);
        System.out.println(linked_List);

        System.out.println("/*******Add an element to last Position*********/");
        linked_List.addLast(24);
        System.out.println(linked_List);


        /*** LinkedList performs the worst if the operation is retrieval of data.
         Hence if our requirement is to fetch data, we should use ArrayList.
         But LinkedList is the best choice if we have requirements of adding and
         removing data very often. In this case we should avoid ArrayList ****/

        System.out.println("Get First Value :" + linked_List.getFirst());
        System.out.println(linked_List);

        System.out.println("Get Last Value :" + linked_List.getLast());
        System.out.println(linked_List);

        System.out.println("Get Index Value :" + linked_List.indexOf(12));
        System.out.println(linked_List);

        System.out.println("Get Value of given Index :" + linked_List.get(2));
        System.out.println(linked_List);

        System.out.println("Methods to Remove items in the Linked List");

        linked_List.poll();//Deletes First element
        System.out.println("Iterating LinkedList " + linked_List);
        linked_List.pollFirst();
        System.out.println("Iterating LinkedList" + linked_List);
        linked_List.pollLast();
        System.out.println("Iterating LinkedList" + linked_List);

        linked_List.remove();//removes first element
        System.out.println("Removes First Element" + linked_List);
        linked_List.removeFirst();
        System.out.println("Removes First Element" + linked_List);
        linked_List.removeLast();
        System.out.println("Removes Last Element" + linked_List);
        linked_List.removeFirstOccurrence(2);
        System.out.println("Removes First Occurence of the mentioned Element" + linked_List);
        linked_List.removeLastOccurrence(6);
        System.out.println("Removes last Occurence of the Mentioned Element" + linked_List);


        linked_List.peek();
        System.out.println("Peek the Element" + linked_List);
        linked_List.peekFirst();
        System.out.println("Peek the first Element" + linked_List);
        linked_List.peekLast();
        System.out.println("Peek the last Element" + linked_List);
    }

    public void iterateLinkedList() {
        LinkedList<String> linked_List1 = new LinkedList<String>();
        linked_List1.add("ab");
        linked_List1.add("bc");
        linked_List1.add("cd");
        linked_List1.add("de");
        linked_List1.add("ef");
        System.out.println("/**********Iterating LinkedList*********************/");
        for (int s = 0; s < linked_List1.size(); s++) {
            System.out.println("Elements in the linked list are :" + linked_List1.get(s));
        }
    }

   //Poll removes the element
    /**
     * Now get the third value of the list.
     * Since LinkedList has the data structure of doubly linked list,
     * the value of the third index is known only to the link present in
     * the Second index. Internally, the program will traverse to index number 2 and then only
     * it can get the value of 3. So Linked list is not suited for search operations.
     **/

    public static void main(String[] args) {
        Linked_List lList = new Linked_List();
        lList.linkedList_Example();
        lList.iterateLinkedList();
    }


}
