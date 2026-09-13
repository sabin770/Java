public class LibraryApp {
    public static void main(String[] args) {
        Library b1 = new Library(101, "Java Programming", "Savin Sapkota");
        Library b2 = new Library(102, "Data Structures", "Savs Saps");

        System.out.println("=== Library Books ===");
        b1.display();
        b2.display();

        System.out.println("=== Issue Books ===");
        b1.issueBook();
        b2.issueBook();
        b1.issueBook();

        System.out.println("\n=== After Issuing ===");
        b1.display();
        b2.display();

        System.out.println("=== Return Books ===");
        b1.returnBook();
        b1.returnBook();

        System.out.println("\n=== After Returning ===");
        b1.display();
    }
}