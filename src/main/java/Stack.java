public class Stack<T> {

    private final T value;
    private Stack<T> nextEl;

    public Stack() {
        value = null;
        nextEl = null;
    }

    public Stack(T value, Stack<T> nextEl) {
        this.value = value;
        this.nextEl = nextEl;
    }

    public Stack<T> add(T value) {
        return new Stack<>(value, this);
    }

    public T get() {
        return value;
    }

    public Stack<T> next() {
        return nextEl;
    }

    public Boolean hasNext() {
        return nextEl != null;
    }

    public void addNewNext(T value) {
        nextEl = new Stack<T>(value, new Stack<>());
    }
}
