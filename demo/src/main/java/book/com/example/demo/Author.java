package book.com.example.demo;

import lombok.Data;

@Data
public class Author {
    private String name;
    //private String surname;

  
    public Author(String name){
        this.name= name;
    }

    public void print() {
        System.out.println("Author: " + name );
    }
}