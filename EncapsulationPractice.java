public class EncapsulationPractice {
    public static void main(String[] args) {
        stud s = new stud();
        s.setName("Akshit");
        s.setage(10);
        System.out.println(s.getage());
        System.out.println(s.getName());
    }
}
class stud{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name  = name;
    }
    public int getage() {
        return age;
    }
    public void setage(int age) {
        this.age  = age;
    }

}
