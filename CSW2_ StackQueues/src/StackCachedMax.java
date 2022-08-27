import java.util.*;

class ElementWithCachedMax {
    public Integer element;
    public Integer max;

    public ElementWithCachedMax(Integer element, Integer max) {
        this.element = element;
        this.max = max;
    }
}

public class StackCachedMax {
    private Deque<ElementWithCachedMax> elementWithCachedMax = new LinkedList<>();

    public boolean empty() {
        return elementWithCachedMax.isEmpty();
    }

    public Integer max() {
        if (empty()) {
            throw new IllegalStateException("max(): empty stack");
        }
        return elementWithCachedMax.peek().max;
    }

    public Integer pop() {
        if (empty()) {
            throw new IllegalStateException("pop(): empty stack");
        }
        return elementWithCachedMax.removeFirst().element;
    }

    public void push(Integer x) {
        elementWithCachedMax.addFirst(new ElementWithCachedMax(x, Math.max(x, empty() ? x : max())));
    }
    public void display()
    {
        System.out.print("Current Stack: ");
        for(ElementWithCachedMax e:elementWithCachedMax)
        {
            System.out.print(e.element+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackCachedMax stack = new StackCachedMax();
        for (int i = 0; i < 7; i++)
            stack.push(new Random().nextInt(10));
        stack.display();
        System.out.println("Max: " + stack.max());
        System.out.print("Pop elements: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\nMax: " + stack.max());
    }
}
