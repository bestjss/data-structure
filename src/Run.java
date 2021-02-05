
public class Run {
    public static void main(String[] args) throws Exception {
        // 栈
        // stackStudy();
        // 循环队列
        // queueStudy();
        // 单向链表
        // singleLinkedListStudy();
        // 双向链表
        // twoWayLinkedListStudy();
        // 循环链表
        cycleLinkedListStudy();
    }

    public static void stackStudy() {
        int length = 10;
        Stack stack = new Stack<Integer>(10);
        ISet<Integer, Boolean> convSet = stack::push;
        for (int i = 0; i < length; i++) {
            convSet.set(i);
        }
        for (int i = 0; i < length; i++) {
            System.out.println("peek : " + stack.peek());
            System.out.println("pop : " + stack.pop());
        }

        System.out.println("top : " + stack.getTop());
    }

    public static void queueStudy() {
        int length = 10;
        Queue queue = new Queue<Integer>(10);
        for (int i = 0; i < length; i++) {
            queue.add(i);
            System.out.println("Pool : " + queue.poll());
        }
        for (int i = 0; i < length; i++) {
            queue.add(i);
        }
        for (int i = 0; i < length; i++) {
            System.out.println("Pool : " + queue.poll());
        }
        for (int i = 0; i < length; i++) {
            queue.add(i);
        }
        for (int i = 0; i < length; i++) {
            System.out.println("Pool : " + queue.poll());
        }
    }

    public static void singleLinkedListStudy() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead(1);
        singleLinkedList.addHead(2);
        singleLinkedList.addHead(3);
        singleLinkedList.addHead(4);
        singleLinkedList.addHead(5);
        singleLinkedList.addTail(0);
        singleLinkedList.delete(2);
        singleLinkedList.find(12);
        System.out.println("Finished");
    }

    public static void twoWayLinkedListStudy() {
        TwoWayLinkedList twoWayLinkedList = new TwoWayLinkedList();
        twoWayLinkedList.addHead(1);
        twoWayLinkedList.addHead(2);
        twoWayLinkedList.addHead(3);
        twoWayLinkedList.addHead(4);
        twoWayLinkedList.addHead(5);
        twoWayLinkedList.addHead(6);
        twoWayLinkedList.delHead();
        twoWayLinkedList.delTail();
        twoWayLinkedList.delete(3);
    }

    public static void cycleLinkedListStudy() {
        CycleLinkedList cycleLinkedList = new CycleLinkedList();
        cycleLinkedList.addHead(1);
        cycleLinkedList.addHead(2);
        cycleLinkedList.addHead(3);
        cycleLinkedList.addTail(4);
        cycleLinkedList.addTail(5);
    }
}
