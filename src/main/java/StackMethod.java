public class StackMethod {

    public static <T> void printForEach(Stack<T> stack) {
        do {
            System.out.println(stack.get());
            stack = stack.next();
        } while (stack.hasNext());
    }

    public static <T> void addToEnd(Stack<T> stack, T value) {
        do {
            stack = stack.next();
        } while (stack.next().hasNext());
        stack.addNewNext(value);
    }
}
