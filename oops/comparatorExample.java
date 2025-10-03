package oops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class comparatorExample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Akshit",2));
        list.add(new Person("Akshit",1));
        list.add(new Person("Akshit",3));

        System.out.println(list.toString());
        Collections.sort(list,(p1,p2)-> Integer.compare(p1.getNumber(),p2.getNumber()));
        for(Person p : list){
            System.out.println(p);
        }
    }
}
class Person{
    private String name;
    private int number;


    public Person(String name,int number){
        this.name=name;
        this.number=number;
    }
    public int getNumber() {
        return number;
    }
    @Override
    public String toString(){
        return "name:"+name+",number:"+number;
    }
}