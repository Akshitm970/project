import java.lang.reflect.Method;

//import static jdk.nio.zipfs.ZipFileAttributeView.AttrID.method;
/*
 * Program Demonstrate hashcode() method of Method Class.
 */
import java.lang.reflect.Method;

public class prac4 {

    // create a Method name getSampleMethod
    public void getSampleMethod() {}

    // create main method
    public static void main(String args[])
    {

        String myStr = "Hello";
        System.out.println(myStr.hashCode());
        String myStr2 = "ello";
        System.out.println(myStr2.hashCode());
    }
}