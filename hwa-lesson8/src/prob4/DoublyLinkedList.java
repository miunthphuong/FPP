package prob4;

public class DoublyLinkedList {
    Node header;
    DoublyLinkedList(){
        header = new Node();
    }
    //1. adds to the end of the list
    public void addLast(String item){
        //implement
        if(item == null) return;
        Node newNode = new Node();
        newNode.value = item;
        Node current = header;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.previous = current;

    }
    // 2. Remove by passing object
    public boolean remove(String item){
        //Implement
        if(item == null) return false;
        Node current = header.next;
        while(current != null){
            if(item.equals(current.value)){
                if(current.next != null){
                    current.next.previous = current.previous;
                }
                current.previous.next = current.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 3. Remove the First Node
    public boolean removeFirst() {
        // Implement
        if(header.next == null) return false;
        Node first = header.next;
        header.next = first.next;
        if(first.next != null){
            first.next.previous = header;
        }
        return true;
    }


    // 4. Prints the list from last to first
    public void printReverse() {
        // Implement
        Node current = header;
        while(current.next != null){
            current = current.next;
        }
        while(current != header){
            System.out.print(current.value + " ");
            current = current.previous;
        }
        System.out.println();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();

    }

    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");

        System.out.println("List before add Last: " +  list);
        list.addLast("Phuong");
        System.out.println("List after add Phuong at last position: " +  list);

        System.out.println("List before remove : " + list);
        list.remove("Harry");
        System.out.println("List after remove Harry : " + list);

        list.removeFirst();
        System.out.println("List after removeFirst : " + list);

        System.out.print("Print Reverse : ");
        list.printReverse();
    }
}
