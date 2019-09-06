import java.util.LinkedList;

public class P11 {
 public static void main(String[] args) {

    // Creating LinkedList of String Elements
    LinkedList<String> linkedlist = new LinkedList<String>();
 
    // Populating it with String values
    linkedlist.add("AA");
    linkedlist.add("BB");
    linkedlist.add("CC");
    linkedlist.add("DD");
    linkedlist.add("EE");

    // contains() method checks whether the element exists
    if (linkedlist.contains("CC")) {
       System.out.println("Element CC is present in List");
    } else {
       System.out.println("List doesn't have element CC");
     }
    
    //Checking for element FF
    if (linkedlist.contains("FF")) {
       System.out.println("Element FF is present in List");
    } else {
        System.out.println("List doesn't have element FF");
      }
 }
}
