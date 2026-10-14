
public class SinglyLinkedList {
    //f
    private Node first;
    private Node last;
    //c
    SinglyLinkedList(){

    }
    //m
    public void addLast(Song song){
        if(last == null){
            last = new Node(null,song);
            first = last;
        }else{
            Node newNode = new Node(null, song);
            last.setLink(newNode);
            last = newNode;
        }
    }
    public void display(){
        Node current = first;
        System.out.println("T1");
         while(current != null){
            System.out.println("T2");
            System.out.println(current.getSong().toString());
            current = current.getLink();
        }
    }
}
