/**
 * 单向链表
 */
public class SingleLinkedList {
    private int length; // 链表节点个数
    private Node head; // 头节点

    /**
     * 构造对象
     */
    public SingleLinkedList() {
        length = 0;
        head = null;
    }

    /**
     * 节点对象
     */
    private class Node {
        private Object data; // 每个节点数据
        private Node next; // 每个节点指向下一个节点的链接

        public Node(Object data) {
            this.data = data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        public void setNext(Node node) {
            this.next = node;
        }

        public Node getNext() {
            return this.next;
        }
    }

    /**
     * 头部加入数据
     *
     * @param obj
     * @return
     */
    public Object addHead(Object obj) {
        Node newHead = new Node(obj);
        if (length == 0) {
            head = newHead; // 链表为空的时候 ， 该节点为头节点
        } else {
            newHead.next = head; // 将新的节点指向为原来节点
            head = newHead; // 将新的节点设置为头节点 ？
        }
        length++; // 链表长度+1
        return obj;
    }

    /**
     * 尾部添加数据
     *
     * @param obj
     * @return
     */
    public Object addTail(Object obj) {
        Node newTail = new Node(obj);
        if (length == 0) {
            head = newTail; // 链表为空的时候 ， 该节点为头节点
        } else {
            Node curreNode = head;
            while (curreNode != null) {
                // 尾巴
                if (curreNode.next == null) {
                    curreNode.next = newTail;
                    break;
                }
                curreNode = curreNode.next;
            }
        }
        return obj;
    }

    /**
     * 查找节点
     *
     * @param object
     * @return
     */
    public Node find(Object obj) {
        if (length == 0) {
            throw new RuntimeException("链表为空");
        }
        Node current = head;
        while (current.data != obj) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    /**
     * 删除链表数据
     *
     * @param obj
     * @return
     */
    public boolean delete(Object obj) {
        if (length == 0) {
            throw new RuntimeException("链表为空");
        }
        Node current = head;
        Node previous = head;
        while (current.data != obj) {
            if (current.next == null) {
                return false;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == head) {
            head = current.next;
        } else {
            previous.next = current.next;
        }
        length--;
        return true;
    }
}
