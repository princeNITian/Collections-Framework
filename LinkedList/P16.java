import java.util.LinkedList;
class P16{

  public static void main(String[] args) {

     // Create a LinkedList of Strings
     LinkedList<String> list = new LinkedList<String>();

     // Add few Elements
     list.add("Element1");
     list.add("Element2");
     list.add("Element3");
     list.add("Element4");

     // Display LinkList elements
     System.out.println("LinkedList before: "+list);

     //peek()
     System.out.println(list.peek());
 
     //peekFirst()
     System.out.println(list.peekFirst());
 
     //peekLast()
     System.out.println(list.peekLast());

     // Should be same as peek methods does not remove
     System.out.println("LinkedList after: "+list);
  }
}