package Collections_Programs_ListInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arrays_List{

    /** List(I) is the Child of Collection(I).
     * ArrayList (C) is one of the classes provides implementation for the List(I).
     * In list duplicate values are allowed and the insertion order is maintained.
     * The underlying DS is resizeable Array or Growable Array. We can insert Heterogeneous objects a
     * NOTE: All the collections can store Heterogeneous objects can be stored except TREE SET and TR
     * ArrayList and vector implements RandomAccess, Serializable and Cloneable Interfaces
     * Synchronized-> NO
     * Thread safe-> NO
     * Default capacity-10
     * Fill Ratio or Load factor: 1 or 100%
     * Growth Rate: current_size + current_size/2
     */
    public void examplesOfArray() {
        List<String> FlowerNames = new ArrayList();
        FlowerNames.add("Dhalia");
        FlowerNames.add("SunFlower");
        FlowerNames.add("Rose");
        FlowerNames.add("jasmine");

        System.out.println(FlowerNames);
        FlowerNames.add(1, "Lily");

        int IdentifiedFLowerIndex = FlowerNames.indexOf("jasmine");
        System.out.println(IdentifiedFLowerIndex);

        int IdentifiedFLowerIndex1 = FlowerNames.indexOf("Lilly");
        System.out.println(IdentifiedFLowerIndex1);

        FlowerNames.add("SunFlower");
        System.out.println(FlowerNames);

        int IdentifiedFLowerIndex2 = FlowerNames.indexOf("SunFlower");
        System.out.println(IdentifiedFLowerIndex2);

        System.out.println("last index of issued to  check the last occurence position:" + FlowerNames.indexOf("SunFlower"));
        List<String> FruitsName = new ArrayList();
        FruitsName.add("apple");
        FruitsName.add("Pineapple");
        FruitsName.add("Kiwi");
        FruitsName.addAll(FlowerNames);
        System.out.println("addalisttoanotherlist:" + FruitsName);
        FruitsName.clear();
        System.out.println("cleartodeletealltheelements:" + FruitsName);
        FruitsName.add(null);
        System.out.println("wecaneveninsertnull:" + FruitsName);
        FruitsName.addAll(0, FlowerNames);
        System.out.println("addinglisttoalistatspecifiedposition." + FruitsName);
        FruitsName.set(1, "apple");
        FruitsName.set(2, "Pineapple");
        FruitsName.set(3, "Kiwi");
        System.out.println("ReplacestheelementsinitsrespectiveIndex:" + FruitsName);
        FruitsName.remove(3);
        System.out.println("RemovestheitemspresentinthespecifiedIndex:" + FruitsName);
        System.out.println("RemovestheitemspresentinthespecifiedIndex:" + FruitsName);
        FruitsName.remove("Kiwi");
        System.out.println("RemovestheObjectusingvalue:" + FruitsName);
        System.out.println("RemovestheObjectusingvalue:" + (String) FlowerNames.get(3));
        System.out.println("methodtocheckthelistisemptyornot:" + FlowerNames.isEmpty());



        //Iterate using foreach loop
        for (String ar :FruitsName) {
            System.out.println("Printing Iterate foreach example:");
            System.out.println(ar);

        }

        for (int element = 0; element < FruitsName.size(); ++element) {
            System.out.println("Positionoftheelement:" + element + "thposition" + (String)
                    FruitsName.get(element));
        }

        //Iterate using Iterator
        System.out.println("_____________________________________________________________");
        ListIterator<String> list_iterator =FruitsName.listIterator();
        System.out.println("Printing Array using List Iterator in Forward order");
         while(list_iterator.hasNext())
        {
            System.out.println(list_iterator.next());
        }
        System.out.println("_____________________________________________________________");
        ListIterator<String> list_iterator1 = FruitsName.listIterator();
        System.out.println("Printing Array using List Iterator in Reverse order");
        while(list_iterator1.hasPrevious())
        {
            System.out.println(list_iterator1.previous());

        }
    }
    public static void main(String[] args)
        {
        Arrays_List arraysList= new Arrays_List();
        arraysList.examplesOfArray();
    }}


/****IMPORTANT POINTS
• ArrayList (C) is one of the classes provides implementation for the List(I).
        • duplicate values are allowed
• insertion order is maintained
• underlying DS is resizeable Array or Growable Array
• can insert Heterogeneous objects (If generics are not used)
• ArrayList is not synchronised
• It is not Thread safe.
• Default capacity-10
        • Fill Ratio or Load factor:1 or 100%
        • Growth Rate: current_size + current_size/2
        • implements RandomAccess, Serializable and Cloneable Interfaces
Best suited for search operations and performs worst on insertion and
deletion.*********/