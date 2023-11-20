package book.com.example.demo;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Subchapter {
    private String name;
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<Image> images = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();

    public Subchapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String text) {
        Paragraph paragraph = new Paragraph(text);
        paragraphs.add(paragraph);
    }

    public void createNewImage(String imageName) {
        Image image = new Image(imageName);
        images.add(image);
    }

    public void createNewTable(String title) {
        Table table = new Table();
        table.setTitle(title);
        tables.add(table);
    }

    public void print() {
        System.out.println("SubChapter: " + name);
        paragraphs.forEach(Paragraph::print);
        images.forEach(Image::print);
        tables.forEach(Table::print);
    }
}