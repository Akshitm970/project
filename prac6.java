//import java.util.*;
//class prac6 implements Comparable<prac6>{
//    int v; // Value of the number
//
//    // Constructor
//    public  prac6(int v) {
//        this.v = v;
//    }
//
//    // toString() for displaying the number
//    @Override
//    public String toString() {
//        return String.valueOf(v);
//    }
//
//    // compareTo() method to
//    // define sorting logic
//    @Override
//    public int compareTo(prac6 o) {
//        return this.v - o.v;
//    }
//    public static void main(String[] args) {
//        Number[] n = {new Number() {
//            @Override
//            public int intValue() {
//                return 0;
//            }
//
//            @Override
//            public long longValue() {
//                return 0;
//            }
//
//            @Override
//            public float floatValue() {
//                return 0;
//            }
//
//            @Override
//            public double doubleValue() {
//                return 0;
//            }
//        }, new prac6(1),
//                new prac6(7), new prac6(2) };
//
//        System.out.println("Before Sorting: "
//                + Arrays.toString(n));
//
//        // Sort the array
//        Arrays.sort(n);
//
//        // Display numbers after sorting
//        System.out.println("After Sorting: " + Arrays.toString(n));
//    }
//
////    @Override
////    public int compareTo(Number o) {
////        return 0;
////    }
//}
