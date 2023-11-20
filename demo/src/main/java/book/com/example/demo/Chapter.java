package book.com.example.demo;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
@Data
public class Chapter {
     private String name;
    private List<Subchapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String subChapterName) {
        Subchapter subChapter = new Subchapter(subChapterName);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public Subchapter getSubChapter(int index) {
        return subChapters.get(index);
    }

    public void print() {
        System.out.println("Chapter: " + name);
        subChapters.forEach(Subchapter::print);
    }
}