package AbstractionAndInterface;

public class CircleAndRectangle {
    public static void main(String[] args) {
        shape s = new Circle(4);
        shape r = new Rectangle(4,5);
        s.area();
        r.area();
    }
}
abstract class shape{
    public abstract void area();
}
class Circle extends shape{
    int r;
    Circle(int r){
        this.r = r;
    }
    @Override
    public void area() {

        System.out.println("Area of Circle"+(r*r*Math.PI));
    }
}
class Rectangle extends shape{
    int l;
    int h;
    Rectangle(int l,int h){
        this.l = l;
        this.h = h;
    }
    @Override
    public void area() {

        System.out.println("Area of Rectangle"+(l*h));
    }
}