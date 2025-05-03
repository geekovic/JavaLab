// First interface
interface Printable {
    void print();
}


// Second interface
interface Showable {
    void show();
}


// Class implementing both interfaces
class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing document...");
    }


    public void show() {
        System.out.println("Showing document preview...");
    }
}


// Main class
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Document doc = new Document();


        doc.print(); // from Printable
        doc.show();  // from Showable
    }
}
