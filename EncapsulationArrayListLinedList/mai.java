package EncapsulationArrayListLinedList;

public class mai {
    public static void main(String[] args) {
        EncapsulationQuestion1 emp1 = new EncapsulationQuestion1();
        emp1.setId(1);
        emp1.setName("A");
        emp1.setSalary(-1);

        EncapsulationQuestion1 emp2 = new EncapsulationQuestion1();
        emp2.setId(2);
        emp2.setName("B");
        emp2.setSalary(100);

        EncapsulationQuestion1 emp3 = new EncapsulationQuestion1();
        emp3.setId(3);
        emp3.setName("C");
        emp3.setSalary(100);

        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
    }
}
