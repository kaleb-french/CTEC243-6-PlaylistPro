import java.util.Iterator;

public class Main {
    static void main() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.addLast(new Song("Plush", "Stone Temple Pilots", 316));
        singly.addLast(new Song("Fell On Black Days", "Soundgarden", 302));
        singly.addLast(new Song("Learn to Fly", "The Foo Fighters", 289));

        System.out.println("Song in Database--- \n");
        singly.display();
        Iterator<Song> radio = singly.iterator();
        System.out.println(singly.get(0).toString());

        singly.add(4, new Song("Somebody To Love","Queen", 220));
        System.out.println("");
        singly.display();

    }
}
