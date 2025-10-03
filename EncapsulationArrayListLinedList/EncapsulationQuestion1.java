package EncapsulationArrayListLinedList;

public class EncapsulationQuestion1 {
    private int id;
    private String name;
    private int salary = 100;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {
        if(salary<0){
            System.out.println("Invalid salary");
            this.salary = 100;
        }else{
        this.salary = salary;}
    }
}
