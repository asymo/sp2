public class Main {
    public static void main(String[] args) {
        MySuper o1 = new MySuper();
        MySuper o2 = new MySub();
        MySub o3 = new MySub();
        MySuper o4 = o3;

        // note that String extends Object
        o1.f("");
        o2.f("");
        o3.f("");
        o4.f("");
    }
}
