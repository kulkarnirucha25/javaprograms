public class IntegerStack implements Stack {
    int stack[] = new int[size];
    int top = -1;

    public void push(int value) {
        if (top == size - 1) overflow();
        else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    public void pop() {
        if (top == -1) underflow();
        else System.out.println(stack[top--] + " popped from stack");
    }

    public void display() {
        if (top == -1) System.out.println("Stack is empty");
        else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--)
                System.out.println(stack[i]);
        }
    }

    public void overflow() {
        System.out.println("Stack Overflow!");
    }

    public void underflow() {
        System.out.println("Stack Underflow!");
    }
}