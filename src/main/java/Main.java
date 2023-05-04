public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack = stack
                .add(10)
                .add(11)
                .add(12)
                .add(13);

        Stack<Integer> newStack = stack;

        do {
            System.out.println(newStack.get());
            newStack = newStack.next();
        } while (newStack.hasNext());

    }
}
