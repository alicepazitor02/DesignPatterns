package book.com.example.demo;
import lombok.Data;
@Data
public class Image implements Element {
    private String url;
    public Image(String url){
        this.url = url;
    }
    public void print() {
        System.out.println("Image: " + url);
    }
    public void add(Element element){
        //not applicable for leaf class
    }
    public void remove(Element element){
        //not applicable for leaf class
    }
    public Element get(int index){
        //not applicable in leaf class
        return null;
    }

    
}