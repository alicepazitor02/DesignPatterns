package book.com.example.demo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Section implements Element, Cloneable {
    private String title;
    private List<Element> content = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element element : content) {
            element.print();
        }
    }

    @Override
    public void add(Element element) {
        content.add(element);
    }

    @Override
    public void remove(Element element) {
        content.remove(element);
    }

    @Override
    public Element get(int index) {
        return content.get(index);
    }
}
