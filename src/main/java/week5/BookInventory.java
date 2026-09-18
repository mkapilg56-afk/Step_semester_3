package week5;

public class BookInventory {

    private int copiesTotal;
    private int copiesAvailable;

    public BookInventory(int copiesTotal) {
        this.copiesTotal = copiesTotal;
        this.copiesAvailable = copiesTotal;
    }

    public void checkOut() {
        if (copiesAvailable > 0) {
            copiesAvailable--;
        }
    }

    public void checkIn() {
        if (copiesAvailable < copiesTotal) {
            copiesAvailable++;
        }
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public static void main(String[] args) {

        BookInventory books = new BookInventory(3);

        books.checkOut();
        books.checkOut();

        System.out.println("Available: " + books.getCopiesAvailable());

        books.checkIn();

        System.out.println("Available: " + books.getCopiesAvailable());

        books.checkIn();
        books.checkIn();
        books.checkIn();   // Invalid, should be rejected

        System.out.println("Available: " + books.getCopiesAvailable());
    }
}