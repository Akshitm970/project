package exam.question5;

public class Calculator {
    private double result;
    static int totalCalculations;
    public void add(int a,int b){
        getTotalCalculations();
        result = a+b;
    }
    public void add(double a,double b){
        getTotalCalculations();
        result= a+b;
    }
    public void add(int a, double b){
        getTotalCalculations();
        result =  a+b;
    }

    public double getResult() {
        this.result = result;
        return result;
    }
    public int getTotalCalculations() {
         totalCalculations ++;
         return totalCalculations;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1,2);
        System.out.println(calculator.getTotalCalculations());
        System.out.println(calculator.getResult());
        calculator.add(1.1,2.1);
        System.out.println(calculator.getTotalCalculations());
        System.out.println(calculator.getResult());
        calculator.add(1,2.1);
        System.out.println(calculator.getTotalCalculations());
        System.out.println(calculator.getResult());
    }
}
