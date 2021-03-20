import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArrayStack<T> implements Stack<T> {

    private final static int CAPACITY = 10;
    private T[] stack;
    private int numItems;


    //Constructor
    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int initialCapacity) {
        numItems = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    public void push(T item) throws CannotAddException {
        if (numItems >= CAPACITY) {
            throw new CannotAddException();
        } else {
            stack[numItems] = item;
            numItems++;
        }
    }

    public T pop() {
        if (numItems == 0) {
            throw new EmptyStackException();
        }
        if (stack[numItems - 1] == null) {
            throw new NoSuchElementException();
        } else {
            T value = stack[numItems - 1];
            stack[numItems] = null;
            numItems--;
            return value;
        }
    }

    public T peek() {
        if (numItems == 0) {
            throw new EmptyStackException();
        }
        if (stack[numItems - 1] == null) {
            throw new NoSuchElementException();
        } else {
            return stack[numItems - 1];
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numItems; i++) {
            sb.append(stack[i]);
            sb.append(' ');
        }
        return sb.toString();
    }

    public int length() {
        int length = stack.length;
        return length;
    }
}
