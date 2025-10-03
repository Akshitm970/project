package AbstractionAndInterface.question2;

public class Dog implements Animal {
    private String name;

    @Override
    public void sound() {
        System.out.println("Sound of dog is wfff");
    }
}
