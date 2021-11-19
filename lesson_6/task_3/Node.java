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
    ListItem getPrevious() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return this.leftLink = item;
    }

    @Override
    int compareTo(ListItem item) {
        return item == null ? -1 : (((String) this.getValue()).compareTo((String) item.getValue()));
    }
    
}
