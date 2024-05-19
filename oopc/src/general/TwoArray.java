package general;

public class TwoArray {
    public static void main(String args[]){
        int twoD[][] = new int[3][];
        twoD[0] = new int[2];
        twoD[1] = new int[3];
        twoD[2] = new int[1];


        System.out.println("Two-dimensional array elements:");
        for (int i = 0; i < twoD.length; i++) {
            System.out.print("[");
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j]);
            }
            System.out.println("]");
        }

    }
}
