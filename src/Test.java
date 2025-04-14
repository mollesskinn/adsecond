public class Test {
    public static void main(String[] args) {
        // Stack тестілеу
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack peek: " + stack.peek());  // 20
        stack.pop();
        System.out.println("Stack size after pop: " + stack.size());  // 1

        // Queue тестілеу
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Queue peek: " + queue.peek());  // 10
        queue.dequeue();
        System.out.println("Queue size after dequeue: " + queue.size());  // 1

        // MinHeap тестілеу
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.add(20);
        heap.add(10);
        heap.add(30);
        System.out.println("MinHeap remove: " + heap.remove());  // 10
        System.out.println("MinHeap size after remove: " + heap.size());  // 2
    }
}

