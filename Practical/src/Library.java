class Library {
    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;

    public Library(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " issued successfully");
        } else {
            System.out.println(title + " is already issued");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " returned successfully");
        } else {
            System.out.println(title + " was not issued");
        }
    }

    public void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isIssued ? "Issued" : "Available"));
        System.out.println();
    }
}