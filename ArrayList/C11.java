import java.util.ArrayList;
class Student 
{
    private String studentname;
    private int studentage;
    Student(String name, int age)
    {
         this.studentname=name;
         this.studentage=age;
    }
    @Override
    public String toString() {
      return "Name is: "+this.studentname+" & Age is: "+this.studentage;
    }
}

public class C11
{
     public static void main(String [] args)
     {
          ArrayList<Student> al= new ArrayList<Student>();
          al.add(new Student("Chaitanya", 26));
          al.add(new Student("Ajeet", 25));
          al.add(new Student("Steve", 55));
          al.add(new Student("Mary", 18));
          al.add(new Student("Dawn", 22));
          for (Student tmp: al){
              System.out.println(tmp);
          }
     }
}