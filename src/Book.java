import java.util.Date;

public class Book {
    private String id ;
    private String author ;
    private String title ;
    private String genre ;
    private double price ;
    private String publish_date ;
    private String describtion ;
    public Book() {

    }
    public Book(String id, String author, String title, String genre, double price, String publish_date, String describtion) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.publish_date = publish_date;
        this.describtion = describtion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuther(String auther) {
        this.author = auther;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishDate() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    @Override
    public String toString() {
        return "author:" + author  + " || title:" + title + " || genre:" + genre + " || price:" +
                price + " || publish_date:" + publish_date + " || description:" + describtion ;
    }

}