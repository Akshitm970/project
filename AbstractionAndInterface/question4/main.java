package AbstractionAndInterface.question4;

public class main {
    public static void main(String[] args) {
        Employee e1 = new Manager("Akshit",100);
        Employee e2 = new Developer("Bob",50);

//        e1.salary;
//        System.out.println("Manager Salary"+e1.salary);
        e1.bonus();
        e2.bonus();

    }
}
