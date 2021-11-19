public class Node extends ListItem {

    public Node(Object value) { 
        super(value);
    }

    @Override
    ListItem getNext() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        return this.rightLink = item;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        return item == null ? -1 : (((String) super.getValue()).compareTo((String)item.getValue()));
    }
    
}
