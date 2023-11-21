package book.com.example.demo;
public class Main {
    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);

        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));

        Section cap1 = new Section("Capitolul 1");
        noapteBuna.addContent(cap1);

        Paragraph sharedParagraph = new Paragraph("Shared Paragraph");
        cap1.add(sharedParagraph.clone());  // Use the clone method

        // Print the book before making changes
        System.out.println("Before modifying sharedParagraph:");
        noapteBuna.print();

        // Modify the text of the sharedParagraph in cap1
        sharedParagraph.setText("Modified Shared Paragraph");

        // Add a new paragraph to cap1
        cap1.add(new Paragraph("New Paragraph in cap1"));

        // Print the book after making changes
        System.out.println("\nAfter modifying sharedParagraph and adding a new paragraph:");
        noapteBuna.print();
    }
}
