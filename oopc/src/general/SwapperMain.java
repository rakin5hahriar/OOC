package general;

public class SwapperMain {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Create an instance of the general.Swapper class
        Swapper swapper = new Swapper();

        // Call the swap method on the general.Swapper instance
        swapper.swapValues(a, b);

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}


class Swapper {
    // Method to swap two integers
    public void swapValues(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
