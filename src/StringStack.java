public class StringStack {
    private String[] stackArray;
    private int top;
    private int capacity;

    public StringStack(int size) {
        stackArray = new String[size];
        capacity = size;
        top = -1;
    }

    public void push(String value) {
        if (top == capacity - 1) {
            expand();
        }
        stackArray[++top] = value;
        System.out.println(value + " waa lagu daray stack-ka.");
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack waa madhan yahay! Lama saari karo wax.");
            return null;
        }
        String value = stackArray[top--];
        System.out.println(value + " waa laga saaray stack-ka.");
        return value;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack waa madhan yahay!");
            return null;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack waa madhan yahay!");
            return;
        }
        System.out.println("Waxyaabaha stack-ka ku jira (kor ilaa hoos):");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    private void expand() {
        int newCapacity = capacity * 2;
        String[] newStack = new String[newCapacity];
        System.arraycopy(stackArray, 0, newStack, 0, capacity);
        stackArray = newStack;
        capacity = newCapacity;
        System.out.println("Stack waa la ballaariyay ilaa " + capacity);
}
}
