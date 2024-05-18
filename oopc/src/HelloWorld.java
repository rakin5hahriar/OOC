public class HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello World");

        //casting
        short s1 = 1000;
        int i1 = s1;    // auto casting

        int i2 = 1000;
        short s2 = (short)i2;    // explicit casting

        float f1 = 10.5f;     // casting 10.5 (which is, by default, a double) to a float

        float f2 = 10.2f;
        int i3 = (int)f2;     // casting float to int

        long l1 = 10000000L;       // casting 10000000 (which is, by default, a int) to a long


        // summary - kono number k float korte last e f dite hoy
        // kono number k long korte hole last e L dite hoy
    }
}
