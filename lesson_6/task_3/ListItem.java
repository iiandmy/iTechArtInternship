public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;   
    protected Object value;

    public ListItem(Object value) { 
        this.value = value;
    }

    abstract ListItem getNext();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract int compareTo(ListItem item);

    public Object getValue() { return this.value; }
    public void setValue(Object value) { this.value = value; }
}