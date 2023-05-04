public class StackMethod {

    public static <T> void printForEach(Stack<T> stack) {
        do {
            System.out.println(stack.get());
            stack = stack.next();
        } while (stack.hasNext());
    }

}
