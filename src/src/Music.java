import java.util.ArrayList;
import java.util.List;

public class Music extends Media {
    private String artist;


    public Music() {

    }
    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String author, String ISBN, double price, String artist) {
        super(title, author, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user) {
        user.getPurchaseMediaList().add(this);
    }

    public List<Music> generatePlayList(List<Music> musicCatalog) {
        ArrayList<Music> playList = new ArrayList<>();
        for(Music music : musicCatalog) {
            if(music.artist.equals(this.artist)){
                playList.add(music);
            }
        }
        return playList;
    }

    public String getMediaType() {
        if(super.getPrice() >= 10)
            return "Premium Music";
        else
            return "Music";
    }

    @Override
    public String toString() {
        return "{Music Name: " + this.getTitle() +
                "artist: '" + artist + "}";
    }
}
