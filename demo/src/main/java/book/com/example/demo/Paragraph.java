package book.com.example.demo;
import lombok.Data;

@Data
public class Paragraph implements Element, Cloneable {
    private String text;
    public Paragraph(String text){
        this.text = text;
    }
    public void print() {
        System.out.println("Paragraph: " + text);
    }
    @Override
    public void add(Element element){
        //not applicable for leaf class
    }
    @Override
    public void remove(Element element){
        //not applicable for leaf class
    }
    public Element get(int index){
        //not applicable for leaf class
        return null;
    }
    @Override
   
    public Element clone() {
        try {
            return (Paragraph) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported for Paragraph", e);
        }
    }
}
