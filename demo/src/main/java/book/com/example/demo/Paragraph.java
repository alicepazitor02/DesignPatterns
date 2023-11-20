package book.com.example.demo;
import lombok.Data;

@Data
public class Paragraph {
    private String text;
    public Paragraph(String text){
        this.text = text;
    }
    public void print() {
        System.out.println("Paragraph: " + text);
    }
}
