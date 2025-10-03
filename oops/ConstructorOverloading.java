public class ConstructorOverloading {
    
}
class User {
    String name;
    int age;

    User(String name) { this.name = name; }
    User(String name, int age) { this.name = name; this.age = age; }
}
