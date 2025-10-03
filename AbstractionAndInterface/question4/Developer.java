package AbstractionAndInterface.question4;

public class Developer extends Employee {
    Developer(String name, int salary) {
        super(name, salary);
    }
    @Override
    public void bonus() {
        int total = salary + 500;
        System.out.println("Bonus Salary"+total);
    }
}
