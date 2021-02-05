/**
 * 循环链表
 */
public class CycleLinkedList {

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

    public CycleLinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public void addHead(Object obj) {
        Node newNode = new Node(obj);
        if (length == 0) {
            newNode.next = newNode;
            newNode.prev = newNode;
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node oldHead = head;
            this.tail.next = newNode;
            newNode.prev = tail;
            newNode.next = oldHead;
            oldHead.prev = newNode;
            this.head = newNode;
        }
        length++;
    }

    public void addTail(Object obj) {
        Node newNode = new Node(obj);
        if (length == 0) {
            newNode.next = newNode;
            newNode.prev = newNode;
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node oldTail = tail;
            this.head.prev = newNode;
            newNode.prev = oldTail;
            newNode.next = head;
            oldTail.next = newNode;
            this.tail = newNode;
        }
        length++;
    }
}
