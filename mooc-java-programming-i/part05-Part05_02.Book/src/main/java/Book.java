public class Book {
    private String author;
    private String name;
    private Integer pages;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor () {
        return author;
    }
    public String getName () {
        return name;
    }
    public int getPages () {
        return pages;
    }
    public String toString () {
        return author + ", " + name + ", " + pages.toString() + " pages";
    }
}
