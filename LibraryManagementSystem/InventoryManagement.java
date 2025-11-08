package LibraryManagementSystem;

import java.util.Map;

public class InventoryManagement {
    Inventory inventory;
    public InventoryManagement(Inventory inventory){
        this.inventory=inventory;
    }

    public void addBook(Book book,User user){
        if(user.role!=Role.ADMIN){
            System.out.println("Only Admin can add books");
            return;
        }
        inventory.addBook(book);
    }
    public void borrowBook(Book book,User user){
        if(user.role!=Role.MEMBER){
            System.out.println("Only member can borrow books");
            return;
        }
        inventory.borrowBook(book);
    }

    public void displayInventory(){
        for(Map.Entry<Book, Integer> entry:inventory.map.entrySet()){
            System.out.println(entry.getKey().displayBook()+" "+entry.getValue());
        }
    }
}
