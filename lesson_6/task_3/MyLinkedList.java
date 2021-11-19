public class MyLinkedList implements INodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        return this.getRoot() == null ? addItemAtBegin(item) : addItemAtMiddle(item);
    }

    private boolean addItemAtBegin(ListItem item) {
        this.root = item;
        return true;
    }

    private boolean addItemAtMiddle(ListItem item) {
        ListItem currentNode = this.getRoot();
        while (currentNode != null || currentNode.compareTo(item) != 0) {
            currentNode = currentNode.getNext();
        }
        return true;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (this.getRoot() == null) {
            System.out.println("The list is empty.");
            return;
        }
        ListItem node = this.getRoot();
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
    
}
