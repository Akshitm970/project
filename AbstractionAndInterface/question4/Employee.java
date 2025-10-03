package AbstractionAndInterface.question4;

abstract class Employee {
    String name;
    int salary;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public abstract void bonus();


}
