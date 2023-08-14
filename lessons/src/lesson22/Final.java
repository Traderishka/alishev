package lesson22;

public class Final {
    public static void main(String[] args) {
        Static sta = new Static(5);
        sta.Print();
//        System.out.println(sta);
    }
}
class Static{
    public final int CONSTANT;

    public Static(int CONSTANT) {
        this.CONSTANT = CONSTANT;
//        System.out.println(CONSTANT);
//        Print();
    }
    public void Print(){
        System.out.println(CONSTANT);
    }
}
