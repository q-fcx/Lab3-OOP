import java.util.ArrayList;
import java.util.Arrays;

public class Store {

    ArrayList<User> users;
    ArrayList<Media> mediaList;

    public Store(ArrayList<User> users, ArrayList<Media> mediaList) {
        this.users = users;
        this.mediaList = mediaList;
    }

    public ArrayList<User> getUser() {
        return users;
    }

    public void setUser(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Media> getMedia() {
        return mediaList;
    }

    public void setMedia(ArrayList<Media> mediaList) {
        this.mediaList = mediaList;
    }

    public void addUser(User user){
       users.add(user);
    }
    public ArrayList<User> displayUsers() {
        return users;
    }

    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public ArrayList<Media> displayMedia() {
        return mediaList;
    }

    public Book searchBook(String title) {
        for(Media book : mediaList) {
            if(book.getTitle().equals(title)){
                return (Book) book;
            }
        }
        System.out.println("Book not found!");
        return null;
    }

    @Override
    public String toString() {
        return "Store{" +
                "users=" + users +
                ", mediaList=" + mediaList +
                '}';
    }
}
