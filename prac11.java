public class prac11 {
    public static void main(String[] args) {
        prac10 p = new prac10(){
            @Override
            public void hello() {
                System.out.println("hello");

            }

            @Override
            public void hell() {
                System.out.println("hello");
            }
        };
        p.hello();
//code to print hello
//        System.out.println("hello");
//        prac10 p = () -> System.out.println("hello");
//        p.hello();

    }
}
