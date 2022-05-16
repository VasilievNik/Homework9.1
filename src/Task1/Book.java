package Task1;

public class Book {
    String Name;
    int publishDate;
    String AuthorName;
    String AuthorSerame;
    public Book(int publishDate, String Name, Author author) {
        this.publishDate = publishDate;
        this.Name = Name;
        this.AuthorName = author.getAuthorName();
        this.AuthorSerame = author.getAuthorSername();
    }

    public String getBookName() {
        return this.Name;
    }
    public int getPublishDate() {
        return this.publishDate;
    }
    public void getBookAllInfo(){
        System.out.format("Книга: %s\nАвтор: %s %s\nГод выпуска: %d\n\n", Name, AuthorName, AuthorSerame, publishDate);
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
        System.out.format("Изменена дата издания!\nНовая дата издания для книги \"%s\" - %d\n\n", Name, publishDate);
    }


}
