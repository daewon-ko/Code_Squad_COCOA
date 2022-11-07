package chapter7.array;

public class Book {


    private String author;
    private String title;

    Book(String title, String author){
        this.author = author;
        this.title =title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void showBookInfo(){
        System.out.println(title+", "+author);
    }

}
