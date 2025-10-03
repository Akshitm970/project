package AbstractionAndInterface.question2;

public class mai {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Animal a = new Dog();
        a.sound();
        Cat cat = new Cat();
        cat.sound();
        Animal c = new Cat();
        c.sound();
    }
    }

