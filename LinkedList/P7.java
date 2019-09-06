import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
public class P7 {
 
 public static void main(String[] args) {
 
    // Create a LinkedList
    LinkedList<String> linkedlist = new LinkedList<String>();
 
    // Add elements to LinkedList
    linkedlist.add("Item1");
    linkedlist.add("Item2");
    linkedlist.add("Item3");
    linkedlist.add("Item4");
    linkedlist.add("Item5");
    linkedlist.add("Item6");
    linkedlist.add("Item7");
 
    // Displaying LinkedList elements
    System.out.println("LinkedList elements:");
    Iterator it= linkedlist.iterator();
    while(it.hasNext()){
       System.out.println(it.next());
    }
 
    // Obtaining Sublist from the LinkedList
    List sublist = linkedlist.subList(2,5);
 
    // Displaying SubList elements
    System.out.println("\nSub List elements:");
    Iterator subit= sublist.iterator();
    while(subit.hasNext()){
       System.out.println(subit.next());
    }
 
    /* Any changes made to Sub List will be reflected
     * in the original List. Lets take this example - We
     * are removing element "Item4" from sublist and it 
     * should be removed from original list too. Observe 
     * the Output of this part of the program.
     */
    sublist.remove("Item4");
    System.out.println("\nLinkedList elements After remove:");
    Iterator it2= linkedlist.iterator();
    while(it2.hasNext()){
       System.out.println(it2.next());
    }
 }
}