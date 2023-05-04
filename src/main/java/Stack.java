public class Stack {

    private final Integer value;
    private final Stack nextEl;

    public Stack() {
        value = null;
        nextEl = null;
    }

    public Stack(Integer value, Stack nextEl) {
        this.value = value;
        this.nextEl = nextEl;
    }

    public Stack add(Integer value) {
        return new Stack(value, this);
    }

    public Integer get() {
        return value;
    }

    public Stack next() {
        return nextEl;
    }

    public Boolean hasNext() {
        return nextEl != null;
    }

}
