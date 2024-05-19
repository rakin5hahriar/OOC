package oop;

import java.sql.SQLOutput;

public class Inheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.cMethod();

    }
}

class Parent{
    public int pId = 16;
    public void pMethod(){
        System.out.print("parent id-");
    }
}

class Child extends Parent{
    public int cId = 210042116;
    public void cMethod(){
        pMethod();
        System.out.println(" " + pId + ", child method " + cId);
    }

}
