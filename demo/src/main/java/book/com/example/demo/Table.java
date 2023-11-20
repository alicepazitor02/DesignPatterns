package book.com.example.demo;
import lombok.Data;

@Data
public class Table {
    private String title;

    public void print() {
        System.out.println("Table: " + title);
    }
}
