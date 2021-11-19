public class MyLinkedList implements INodeList {
    private ListItem root;

    public MyLinkedList() {
        this.root = null;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentNode = this.getRoot();
        while (currentNode.getNext() != null && currentNode.compareTo(item) != 0) {
            currentNode = currentNode.getNext();
        }
        return this.getRoot().compareTo(currentNode) == 0 ? removeFromBeggining() : 
            currentNode.getNext() == null ? removeFromEnd(currentNode) : removeFromMiddle(currentNode);
    }

    private boolean removeFromBeggining() {
        this.getRoot().getNext().setPrevious(null);
        this.root = this.getRoot().getNext();
        return true;
    }

    private boolean removeFromMiddle(ListItem item) {
        item.getPrevious().setNext(item.getNext());
        item.getNext().setPrevious(item.getPrevious());
        return true;
    }

    private boolean removeFromEnd(ListItem item) {
        item.getPrevious().setNext(null);
        return true;
    }

    @Override
    public boolean addItem(ListItem item) {
        return this.getRoot() == null ? addItemAtBegin(item) : addItemAtMiddle(item);
    }

    private boolean addItemAtBegin(ListItem item) {
        if (this.getRoot() != null)
            this.getRoot().setPrevious(item);
        item.setNext(this.getRoot());
        this.root = item;
        return true;
    }

    private boolean addItemAtMiddle(ListItem item) {
        ListItem currentNode = this.getRoot();
        while (currentNode.getNext() != null && currentNode.getNext().compareTo(item) <= 0) {
            currentNode = currentNode.getNext();
        }
        return this.getRoot().compareTo(item) > 0 ? addItemAtBegin(item) : insertItem(currentNode, item);
    }

    private boolean insertItem(ListItem insertAfter, ListItem toInsert) {
        if (insertAfter.getNext() != null)
            insertAfter.getNext().setPrevious(toInsert);

        toInsert.setNext(insertAfter.getNext());
        toInsert.setPrevious(insertAfter);
        insertAfter.setNext(toInsert);
        return true;
    }

    @Override
    public void traverse() {
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
