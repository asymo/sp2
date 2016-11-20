public class Box<E> {
    private E data;

    public Box(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void copyFrom(Box<E> src) {
        this.data = src.data;
    }
}
