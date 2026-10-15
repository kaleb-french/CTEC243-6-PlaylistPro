import java.util.Iterator;
import java.util.Comparator;

public class Main {
    static void main() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.addLast(new Song("Plush", "Stone Temple Pilots", 316));
        singly.addLast(new Song("Fell On Black Days", "Soundgarden", 302));
        singly.addLast(new Song("Learn to Fly", "The Foo Fighters", 289));

        System.out.println("Song in Database--- By Title \n");
        SortedLinkedList titleSorted = new SortedLinkedList(Comparator.comparing(Song::getTitle));
        titleSorted.add(0,new Song("Plush", "Stone Temple Pilots", 316));
        titleSorted.add(1,new Song("Fell On Black Days", "Soundgarden", 302));
        titleSorted.add(2,new Song("Learn to Fly", "The Foo Fighters", 289));
        titleSorted.display();
        System.out.println("\nSong in Database--- By Title \n");
        SortedLinkedList artistedSorted = new SortedLinkedList(Comparator.comparing(Song::getArtist));
        artistedSorted.add(0,new Song("Plush", "Stone Temple Pilots", 316));
        artistedSorted.add(1,new Song("Fell On Black Days", "Soundgarden", 302));
        artistedSorted.add(2,new Song("Learn to Fly", "The Foo Fighters", 289));
        artistedSorted.display();
    }
}
