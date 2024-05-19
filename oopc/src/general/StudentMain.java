package general;

public class StudentMain {
    public static void main(String args[]){
        Student St1 = new Student("Rakin","16");
        System.out.println("Name " + St1.name);

    }
}

class Student {
    String name;
    String id;

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    //this. => this j constructor e use kora hoise oi constructor er karon e create houa obj er attribute  
}
