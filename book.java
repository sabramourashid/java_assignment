public class Book {
    private String name;
    private String iSBN;
    private String author;
    private String publisher;

    public Book(String name, String iSBN, String author, String publisher) {
        this.name = name;
        this.iSBN = iSBN;
        this.author = author;
        this.publisher = publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setISBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getISBN() {
        return iSBN;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setpublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBookInfo() {
        return "Book Name: " + name + "\nISBN: " + iSBN + "\nauthor: " + "\npublisher: " + publisher; 
    } 

    public static void main(String[] args) {
        Book[]books = new Book[30];
        books[0] = new Book("book1","12345","author1","publisher1");
        books[1] = new Book("book2","12346","author2","publisher2");

        for(int i = 0; i < 2; i++) {
            System.out.println(books[i].getBookInfo());
        }
    }


}