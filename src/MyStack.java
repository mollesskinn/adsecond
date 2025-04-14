public class MyStack<E> {
    private MyLinkedList<E> list = new MyLinkedList<>();

    public void push(E element) {
        list.add(element);
    }

    public E pop() {
        if (list.size() == 0) throw new IllegalStateException("Stack is empty");
        E element = list.get(list.size() - 1);
        list.remove(element);
        return element;
    }

    public E peek() {
        if (list.size() == 0) throw new IllegalStateException("Stack is empty");
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}
