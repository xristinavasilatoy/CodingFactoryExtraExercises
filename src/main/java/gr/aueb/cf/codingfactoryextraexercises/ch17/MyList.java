package gr.aueb.cf.codingfactoryextraexercises.ch17;

public class MyList<T> {

    private Node<T> head = null;

    public void insertFirst(T t) {
        Node<T> tmp = new Node<>(t);
        tmp.next = head;
        head = tmp;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        Node<T> n = head;
        while (n != null) {
            count += 1;
            n = n.next;
        }
        return count;
    }

    public boolean contains(T t) {
        Node<T> n = head;
        while (n != null) {
            if (t.equals(n.item)) {
                return true;
            }
            n = n.next;
        }
        return false;
    }

    public void printAll() {
        Node<T> n = head;
        while (n != null) {
            System.out.println(n.item);
            n = n.next;
        }
    }
}