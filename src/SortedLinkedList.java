import java.util.Comparator;
public class SortedLinkedList extends SinglyLinkedList{
    //f
    Comparator<Song> compare;
    //c
    SortedLinkedList(Comparator<Song> compare){
        this.compare = compare;
    }
    //m
    @Override
    public void add(int index, Song song){
        //add items in order by title.
        if(first == null){
            first = new  Node(null,song);
            last = first;
            return;
        }
        Node current = first;
        Node previous = null;
        while(current != null){
            int result = compare.compare(current.getSong(), song);
            Node newNode = new Node(null,song);
            if(result > 0 || result == 0){
                newNode.setLink(current);
                if(current == first){
                    first = newNode;
                }
                current = newNode;
                if(previous != null){
                    previous.setLink(current);
                }
                return;
            }else if(result < 0){
                if(current.getLink() == null){
                    current.setLink(newNode);
                    return;
                }
                previous = current;
                current = current.getLink();
                continue;
            }
        }
    }
}
