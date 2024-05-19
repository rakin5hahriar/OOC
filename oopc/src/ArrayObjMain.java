public class ArrayObjMain {
    public static void main(String []args){
        ArrayObj []st = new ArrayObj[3];

        st[0] = new ArrayObj("Rakin", "16");
        System.out.println(st[0].stId);
    }
}

class ArrayObj {
    String stName;
    String stId;

    public ArrayObj(String stName, String stId ){
        this.stName = stName;
        this.stId = stId;
    }
}
