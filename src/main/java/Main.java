public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack = stack
                .add(10)
                .add(11)
                .add(12)
                .add(13);

        Stack newStack = stack;

        do {
            System.out.println(stack.get());
            stack = stack.next();
        } while (stack.hasNext());

//        do {
//            System.out.println(newStack.get());
//            newStack = newStack.next();
//        } while (newStack.hasNext());

    }
}
