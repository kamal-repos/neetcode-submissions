class LinkedList {

    private ListNode head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if (null == head || index < 0 || index >= size) {
            return -1;
        }

        ListNode nodeAtIndex = head;
        int i = 0;

        while (nodeAtIndex != null && i < index) {
            nodeAtIndex = nodeAtIndex.next;
            i++;
        }

        return nodeAtIndex.value;
        
    }

    public void insertHead(int val) {
        ListNode newHead = new ListNode(val);
        if (null == head) {
            head = newHead;
        } else {
            newHead.next = head;
            head = newHead;
        }
        size++;
    }

    public void insertTail(int val) {
        ListNode newNode = new ListNode(val);
        if (null == head) {
            head = newNode;
        } else {
            ListNode node = head;
            while(node.next != null) {
                node = node.next;
            }            node.next = newNode;
        }
        size++;
    }

    public boolean remove(int index) {

        if (null == head || index < 0 || index >= size) {
            return false;
        }

        if (null != head && index == 0) {
            head = head.next;
            size--;
            return true;
        }
        
        ListNode node = head;
        int i = 0;

        while (node.next != null && i < index - 1) {
            node = node.next;
            i++;
        }

        if (node.next != null) {
            node.next = node.next.next;
            size--;
            return true;
        } else {
            return false;
        }
        
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();

        if (null == head) {
            return values;
        } else {
            ListNode node = head;
            while (node != null) {
                values.add(node.value);
                node = node.next;
            }
            return values;
        }
    }
}

class ListNode {

    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

}
