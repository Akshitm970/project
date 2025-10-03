package AbstractionAndInterface.question9;

public class mai {
    public static void main(String[] args) {


        Playable p;
        p = new Football();
        p.play();
        p = new Cricket();
        p.play();
    }
}
