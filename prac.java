public class prac{
    private int a;
    public static void main(String[] args){
        A k = new b();
        System.out.println(k.toString());
        k.speak();
    }
    public void prt(int a) {
        int i = a;
        this.a = a;
        System.out.println(i);
    }
    
}




class A{
     void speak(){
         System.out.println("Hello A");
    }
}
class b extends A{
    void speak(){
        System.out.println("Hello B");
    }
}
class c {
    void speak(){
        System.out.println("Hello C");
    }
}
class d extends c{
    void speak(){
        System.out.println("Hello D");
    }
}


