import java.util.LinkedList;
public class P6 {
 
  public static void main(String[] args) {
 
     // Step1: Create a LinkedList
     LinkedList<String> linkedlist = new LinkedList<String>();
 
     // Step2: Add elements to LinkedList
     linkedlist.add("Tim");
     linkedlist.add("Rock");
     linkedlist.add("Hulk");
     linkedlist.add("Rock");
     linkedlist.add("James");
     linkedlist.add("Rock");
 
     //Searching first occurrence of element
     int firstIndex = linkedlist.indexOf("Rock");
     System.out.println("First Occurrence: " + firstIndex);
 
     //Searching last occurrence of element
     int lastIndex = linkedlist.lastIndexOf("Rock");
     System.out.println("Last Occurrence: " + lastIndex);
  }
}