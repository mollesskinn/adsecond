public class MyMinHeap {
    private MyArrayList<Integer> heap;

    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    public void add(int val) {
        heap.add(val);
        heapifyUp(heap.size() - 1);
    }

    public int peek() {
        if (heap.size() == 0) throw new IllegalStateException("Heap is empty");
        return heap.get(0);
    }

    public int removeMin() {
        if (heap.size() == 0) throw new IllegalStateException("Heap is empty");
        int min = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);
        return min;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) < heap.get(parent)) {
                swap(index, parent);
                index = parent;
            } else break;
        }
    }

    private void heapifyDown(int index) {
        int smallest = index;
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        if (left < heap.size() && heap.get(left) < heap.get(smallest)) smallest = left;
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) smallest = right;

        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }
}
