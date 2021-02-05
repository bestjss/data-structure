/**
 * 栈
 */
public class Stack<E> {

    private Object[] data = null;
    // 栈的容量
    private int maxSize = 0;
    // 栈指针
    private int top = -1;

    public int getTop() {
        return top;
    }

    Stack() {
        this(10);
    }

    // 初始化对象
    Stack(int initialSize) {
        if (initialSize >= 0) {
            this.maxSize = initialSize;
            data = new Object[initialSize];
            top = -1;
        } else {
            throw new RuntimeException("初始化大小不能小于0：" + initialSize);
        }
    }

    public boolean push(E e) {
        if (top == maxSize - 1) {
            throw new RuntimeException("栈已满，无法将元素入栈");
        } else {
            data[++top] = e;
            return true;
        }
    }

    public E pop() {
        if (top == -1) {
            throw new RuntimeException("栈为空");
        } else {
            return (E) data[top--];
        }
    }

    public E peek() {
        if (top == -1) {
            throw new RuntimeException("栈为空");
        } else {
            return (E) data[top];
        }
    }
}
