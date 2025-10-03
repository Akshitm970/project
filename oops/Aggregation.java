import java.util.*;

public class Aggregation {
    
}
class Student {
    String name;
    Student(String name) { this.name = name; }
}
class College {
    String collegeName;
    List<Student> students; // aggregation
}

