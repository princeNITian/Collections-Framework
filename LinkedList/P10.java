import java.util.LinkedList;
public class P10 {
 
 public static void main(String[] args) {
 
    // Create a LinkedList
    LinkedList<String> linkedlist = new LinkedList<String>();
 
    // Add elements to LinkedList
    linkedlist.add("Cobol");
    linkedlist.add("JCL");
    linkedlist.add("C++");
    linkedlist.add("C#");
    linkedlist.add("Java");
 
    // Displaying Elements before replace
    System.out.println("Before Replace:");
    for(String str: linkedlist){
       System.out.println(str);
    }
 
    // Replacing 3rd Element with new value
    linkedlist.set(2, "NEW VALUE");
    System.out.println("\n3rd Element Replaced \n");

    // Displaying Elements after replace
    System.out.println("After Replace:");
    for(String str2: linkedlist){
       System.out.println(str2);
    }
 }
}