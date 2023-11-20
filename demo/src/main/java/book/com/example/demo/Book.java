package book.com.example.demo;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Book {
    private String name;
    private Author author;
    private TableOfContents tableOfContents;
    
    private List<Author> authors = new ArrayList<>();
    private List<Chapter> chapters = new ArrayList<>();

    public Book(String name) {
        this.name = name;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String chapterName) {
        Chapter chapter = new Chapter(chapterName);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void print() {
        System.out.println("Book: " + name);
        authors.forEach(Author::print);
        chapters.forEach(Chapter::print);
    }
}

