package book.com.example.demo;

public interface Element {
    
    public void print();
    public void add(Element element);
    public void remove(Element element);
    Element get(int index);
}
