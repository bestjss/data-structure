/**
 * 双向链表
 */
public class TwoWayLinkedList {
    private Node head; // 链表头
    private Node tail; // 链表尾
    private int length; // 长度

    private class Node {
        private Object data;
        private Node next; // 后驱
        private Node prev; // 前驱

        public Node(Object data) {
            this.data = data;
        }
    }

    public TwoWayLinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * 头添加
     *
     * @param obj
     */
    public void addHead(Object obj) {
        Node newNode = new Node(obj);
        if (length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.head.prev = newNode;
            newNode.next = this.head;
            this.head = newNode;
        }
        length++;
    }

    /**
     * 尾添加
     *
     * @param obj
     */
    public void addTail(Object obj) {
        Node newNode = new Node(obj);
        if (length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.prev = newNode;
            newNode.next = this.tail;
            this.tail = newNode;
        }
        length++;
    }

    /**
     * 删除头
     *
     * @return
     */
    public boolean delHead() {
        boolean result = false;
        if (length != 0) {
            Node next = this.head.next;
            next.prev = null;
            this.head = next;
            length--;
            result = true;
        }
        return result;
    }

    /**
     * 删除尾
     *
     * @return
     */
    public boolean delTail() {
        boolean result = false;
        if (length != 0) {
            Node prev = this.tail.prev;
            prev.next = null;
            this.tail = prev;
            length--;
            result = true;
        }
        return result;
    }

    public void delete(Object obj) {
        if (length == 0) {
            throw new RuntimeException("链表为空");
        }
        // 从头删除
        Node curreNode = this.head;
        while (curreNode != null) {
            if (curreNode.data == obj) {
                Node prev = curreNode.prev;
                Node next = curreNode.next;
                next.prev = prev;
                prev.next = next;
                length--;
            }
            curreNode = curreNode.next;
        }
    }
}
