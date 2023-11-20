package book.com.example.demo;
import lombok.Data;
@Data
public class Image {
    private String imageName;
    public Image(String imageName){
        this.imageName = imageName;
    }
    public void print() {
        System.out.println("Image: " + imageName);
    }

    
}