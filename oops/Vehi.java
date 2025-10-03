package oops;

public interface Vehi {
    static void speak(){
        System.out.println("speak");
    } default  void sound(){
        System.out.println("sound");
    }
}
class vh implements Vehi {
    void speak(){
        System.out.println("sound");
    }
}
