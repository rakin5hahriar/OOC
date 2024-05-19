package general;

class ValueHolder {
    // Attributes
    public int value;

    // Constructor
    public ValueHolder(int value) {
        this.value = value;
    }

    // Static method to swap values of two general.ValueHolder objects
    public static void swapValues(ValueHolder a, ValueHolder b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}


public class ValueHolderMain {
    public static void main(String[] args) {
        // Create two general.ValueHolder objects
        ValueHolder holder1 = new ValueHolder(5);
        ValueHolder holder2 = new ValueHolder(10);

        // Display values before swapping
        System.out.println("Before swap: holder1 = " + holder1.value + ", holder2 = " + holder2.value);

        // Swap the values using the static method in general.ValueHolder class
        ValueHolder.swapValues(holder1, holder2);

        // Display values after swapping
        System.out.println("After swap: holder1 = " + holder1.value + ", holder2 = " + holder2.value);
    }
}
