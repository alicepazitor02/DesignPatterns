package book.com.example.demo;
import lombok.Data;

@Data
public class Table implements Element{
    private String title;

    public Table(String title){
        this.title = title;
    }
    public void print() {
        System.out.println("Table: " + title);
    }
    public void add(Element element){
        //not applicable for leaf class
    }
    public void remove(Element element){
        //not applicable for leaf class
    }
    public Element get(int index){
        //not applicable for leaf class
        return null;
    }

}
