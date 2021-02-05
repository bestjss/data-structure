/**
 * 循环队列
 */
public class Queue<E> {
    private Object[] data = null;
    private int maxSize;
    private int front;
    private int rear;

    private int size = 0;

    public Queue() {
        this(10);
    }

    public Queue(int initialSize) {
        if (initialSize > 0) {
            this.maxSize = initialSize;
            data = new Object[initialSize];
            front = rear = 0;
        } else {
            throw new RuntimeException("初始值需要大于0");
        }
    }

    public boolean add(E element) {
        if (size == maxSize) {
            throw new RuntimeException("队列已满");
        } else {
            rear = front + size > maxSize ? front + size - maxSize : front + size;
            data[rear++] = element;
            size++;
            return true;
        }
    }

    public boolean empty() {
        return rear == front;
    }

    public E poll() {
        if (size == 0) {
            throw new RuntimeException("队列为空");
        } else {
            E value = (E) data[front];
            if (front < maxSize - 1) {
                data[front] = null;
                front++;
            } else {
                front = 0;
            }
            size--;
            return value;
        }
    }

    public E peek() {
        if (empty()) {
            throw new RuntimeException("队列为空");
        } else {
            return (E) data[front];
        }
    }
}
