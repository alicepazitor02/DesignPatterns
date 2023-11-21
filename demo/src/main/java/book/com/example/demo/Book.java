package book.com.example.demo;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Book extends Section implements Element {
    private List<Author> authors = new ArrayList<>();

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void removeAuthor(Author author) {
        authors.remove(author);
    }
    public void addContent(Element content) {
        this.getContent().add(content);
    }

    @Override
    public void print() {
        System.out.println("Book: " + getTitle());
        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }
        for (Element element : getContent()) {
            element.print();
        }
    }
}