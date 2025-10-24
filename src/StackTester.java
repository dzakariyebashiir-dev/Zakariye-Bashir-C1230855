public class StackTester {
    public static void main(String[] args) {
        StringStack stack = new StringStack(3);

        stack.push("Tufaax");
        stack.push("Moos");
        stack.push("Canab");
        stack.push("Timir");

        stack.display();

        System.out.println("Waxa ugu sareeya: " + stack.peek());
        stack.pop();
        stack.pop();

        stack.display();
        System.out.println("Tirada hadda: " + stack.size());
        System.out.println("Ma madhan yahay? " + stack.isEmpty());
}
}