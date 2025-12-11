public class Book {
    String title;
    String author;

    Book(String newTitle, String newAuthor){
        this.title = newTitle;
        this.author = newAuthor;
    }

    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }

    void setTitle(String newTitle){
        this.title = newTitle;
    }

    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    void printInfo(){
        System.out.println("The book title is: " + this.title + ", and the author name is: " + this.author);
    }


}
