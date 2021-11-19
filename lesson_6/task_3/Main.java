public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addItem(new Node("1"));
        list.addItem(new Node("4"));
        list.addItem(new Node("3"));
        list.addItem(new Node("2"));
        list.addItem(new Node("-1"));
        list.addItem(new Node("0"));
        list.removeItem(new Node("0")); // End of list
        list.removeItem(new Node("1")); // Root of list
        list.removeItem(new Node("3")); // Middle of list
        list.traverse();
    }
}