public class Bar<T> {
    // Bar is parameterised

    public T aMethod(T x) {
        return x;
    }

    public static void main(String[] args) {
        Bar<Integer> bar = new Bar<Integer>();
        int k = bar.aMethod(5);
        String s = bar.aMethod("abc");  // Compile error here
    }
}
