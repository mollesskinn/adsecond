public class Main {
    public static void main(String[] args) {
        System.out.println("Testing MyStack:");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // 20
        System.out.println(stack.peek()); // 10

        System.out.println("\nTesting MyQueue:");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        System.out.println(queue.dequeue()); // A
        System.out.println(queue.peek()); // B

        System.out.println("\nTesting MyMinHeap:");
        MyMinHeap heap = new MyMinHeap();
        heap.add(5);
        heap.add(3);
        heap.add(8);
        System.out.println(heap.removeMin()); // 3
        System.out.println(heap.peek()); // 5

        System.out.println("\nTesting MyArrayList:");
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.addFirst("zero");
        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println("\nTesting MyLinkedList:");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addFirst(0);
        linkedList.removeLast();
        for (int val : linkedList) {
            System.out.println(val);
        }
    }
}
