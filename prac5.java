import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student1{
    int rollno;
    String name;
    Student1(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    @Override
    public String toString() {
        return rollno + ": " + name;
    }
}
class SortbyRoll implements Comparator<Student1>
{
    // Compare by roll number in ascending order
    public int compare(Student1 a, Student1 b) {
        return a.rollno - b.rollno;
    }
}
public class prac5 {
    public static void main(String[] args) {
        List<Student1> stud = new ArrayList<>();

        stud.add(new Student1(111, "Mayank"));
        stud.add(new Student1(131, "Anshul"));
        stud.add(new Student1(121, "Solanki"));
        stud.add(new Student1( 101, "Aggarwal"));


        Collections.sort(stud, new SortbyRoll());
        System.out.println(stud);
        for (int i = 0;i<stud.size();i++){
            System.out.print(stud.get(i)+" ");
        }
    }
}
