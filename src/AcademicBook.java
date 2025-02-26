import java.util.ArrayList;

public class AcademicBook extends Book{

    private String subject;

    public AcademicBook() {

    }

    public AcademicBook(String title, String author, String ISBN, double price, int stock, ArrayList<Review> review, String subject) {
        super(title, author, ISBN, price, stock, review);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMediaType() {
        if(isBestSeller())
            return "Bestselling AcademicBook";
        else
            return "AcademicBook";
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
