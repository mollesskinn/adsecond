import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements MyList<T> {
    private class MyNode {
        T data;
        MyNode prev;
        MyNode next;

        MyNode(T data) {
            this.data = data;
        }
    }

    private MyNode head, tail;
    private int size;

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void addFirst(T item) {
        MyNode node = new MyNode(item);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        MyNode node = new MyNode(item);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    @Override
    public void add(int index, T item) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            MyNode current = getNode(index);
            MyNode node = new MyNode(item);
            node.prev = current.prev;
            node.next = current;
            current.prev.next = node;
            current.prev = node;
            size++;
        }
    }

    private MyNode getNode(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        MyNode current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current;
    }

    @Override
    public void set(int index, T item) {
        getNode(index).data = item;
    }

    @Override
    public T get(int index) {
        return getNode(index).data;
    }

    @Override
    public T getFirst() {
        if (head == null) throw new NoSuchElementException();
        return head.data;
    }

    @Override
    public T getLast() {
        if (tail == null) throw new NoSuchElementException();
        return tail.data;
    }

    @Override
    public void remove(int index) {
        MyNode node = getNode(index);
        removeNode(node);
    }

    @Override
    public void removeFirst() {
        if (head == null) throw new NoSuchElementException();
        removeNode(head);
    }

    @Override
    public void removeLast() {
        if (tail == null) throw new NoSuchElementException();
        removeNode(tail);
    }

    private void removeNode(MyNode node) {
        if (node.prev != null) node.prev.next = node.next;
        else head = node.next;
        if (node.next != null) node.next.prev = node.prev;
        else tail = node.prev;
        size--;
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public int indexOf(Object obj) {
        int index = 0;
        for (MyNode current = head; current != null; current = current.next, index++) {
            if (current.data.equals(obj)) return index;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        int index = size - 1;
        for (MyNode current = tail; current != null; current = current.prev, index--) {
            if (current.data.equals(obj)) return index;
        }
        return -1;
    }

    @Override
    public boolean exists(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size];
        MyNode current = head;
        int i = 0;
        while (current != null) {
            arr[i++] = current.data;
            current = current.next;
        }
        return arr;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }
