public class Song {
    //f
    private String title;
    private String artist;
    private int duration;
	//c
	Song(String title,String artist,int duration){
	    this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	//m
	public String getTitle(){
	    return this.title;
	}
	public String getArtist(){
	    return this.artist;
	}
	public int getDuration(){
	    return this.duration;
	}
	public String toString(){
	    return "Song: " + this.title + " by: " + this.artist + " length: " + this.duration;
	}
}
