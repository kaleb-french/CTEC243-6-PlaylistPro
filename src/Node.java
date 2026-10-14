public class Node {
    //f
    private Node link;
    private Song song;
    //c
    Node(Node link, Song song){
        this.link = link;
        this.song = song;
    }
    //m
    public void setLink(Node node){
        this.link = node;
    }
    public Node getLink(){
        return link;
    }
    public Song getSong(){
        return song;
    }
}
