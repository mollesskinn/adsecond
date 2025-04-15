public class Main {
    public static void main(String[] args) {
        
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Popped from stack: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());

        
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue peek: " + queue.peek());
        System.out.println("Dequeued from queue: " + queue.dequeue());
        System.out.println("Queue size after dequeue: " + queue.size());

        
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();
        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(20);

        System.out.println("MinHeap remove: " + minHeap.remove());
        System.out.println("MinHeap size after remove: " + minHeap.size());
    }
}

