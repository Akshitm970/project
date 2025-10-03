public class CompositionHAS_A {
    
}
class Engine {
    void start() { System.out.println("Engine started"); }
}
class Car1 {
    Engine engine = new Engine();  // HAS-A relationship
    void drive() { engine.start(); }
}