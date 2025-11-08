package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Inventory inventory=Inventory.createInventory();
        InventoryManagement inventoryManagement=new InventoryManagement(inventory);
        Book b1 = new Book("Goosebumps", "R.L. Stine", 200);
        Book b2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 450);
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien", 350);
        Book b4 = new Book("Pride and Prejudice", "Jane Austen", 300);

        User member=new Member();
        User admin=new Admin();
        inventoryManagement.addBook(b1,admin);
        inventoryManagement.addBook(b2,admin);
        inventoryManagement.addBook(b3,admin);
        inventoryManagement.addBook(b4,admin);
        inventoryManagement.displayInventory();

        //Adding dublicate
        Book b5 = new Book("Goosebumps", "R.L. Stine", 200);
        inventoryManagement.addBook(b5,admin);
        System.out.println("After adding dublicate book");
        inventoryManagement.displayInventory();

        //borrow books
        inventoryManagement.borrowBook(b1,member);
        inventoryManagement.borrowBook(b2,member);
        inventoryManagement.displayInventory();
    }
}
