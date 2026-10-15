import java.util.Iterator;

public class SinglyLinkedList implements Iterable<Song>{
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
         while(current != null){
            System.out.println(current.getSong().toString());
            current = current.getLink();
        }
    }
    public Song get(int index){
        Node current = first;
        int i = 0;
        while(current != null){
            if(index == i){
                return current.getSong();
            }
            current = current.getLink();
            i++;
        }
        return new Song("Invaild", "ERROR", 404);
    }
    public void add(int index, Song song){
        Node current = first;
        Node previous = null;
        int i = 0;
        while(current != null){
            if(index == i){
                Node newNode = new Node(current,song);
                previous.setLink(newNode);
                return;
            }
            previous = current;
            current = current.getLink();
            i++;
        }if(index == i + 1){
            Node newNode = new Node(null, song);
            last.setLink(newNode);
            last = newNode;
            return;
        }
        System.out.println("Error Index out of Scope!");
    }
	@Override
	public Iterator<Song> iterator() {
		return new Iterator<Song>() {
		    private Node current = first;
			private Node previous;
			@Override
			public boolean hasNext() {
			    if(current == null){
					return false;
				}
				return true;
			}

			@Override
			public Song next() {
				if(this.hasNext()){
				    Song song = current.getSong();
					previous = current;
					current = current.getLink();
					return song;
				}
				return null;
			}
			public void remove(){
			    //if its first and only.
			    if(previous == null){
					if(current != null && current.getLink() == null)
					first = null;
					current = null;
					return;
				}
				if(previous == first){
				    first = first.getLink();
					return;
				}
				Node now = first.getLink();
				Node then = first;
				while(now != null){
				    if(now == previous){
						then.setLink(previous.getLink());
						return;
					}
					then = now;
					now = now.getLink();
				}
			}
		};
	}
}
