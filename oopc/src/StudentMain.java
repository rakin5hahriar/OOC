public class StudentMain {
    public static void main(String args[]){
        Student St1 = new Student("Rakin","16");
        System.out.println("Name " + St1.name);

    }
}

class Student {
    String name;
    String id;

    public Student(String _name, String _id){
        name = _name;
        id = _id;
    }
}
