package AbstractionAndInterface.question4;

class Manager extends Employee {
    int salary;
    Manager(String name,int salary){
        super(name,salary);
    }
    @Override
    public void bonus() {
        salary = salary+100;
        System.out.println("Manager Salary"+salary);
    }

}
