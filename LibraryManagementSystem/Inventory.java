package LibraryManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Inventory {
    //it will be a singleton
    static Inventory inventory;
    Map<Book,Integer> map;
    private Inventory(){
        map=new HashMap<>();
    }
    public static Inventory createInventory(){
        if(inventory==null){
            return inventory= new Inventory();
        }
        return inventory;
    }
    public int getBookCount(Book book){
        if(map.containsKey(book)){
            return map.get(book);
        }
        else{
            return 0;
        }
    }
    public boolean hasBook(Book book){
        return map.containsKey(book);
    }
    public void addBook(Book book){
        if(!map.containsKey(book)){
            map.put(book,0);
        }
        map.put(book,map.get(book)+1);
    }

    public void borrowBook(Book book){
        if(!inventory.hasBook(book) || inventory.getBookCount(book)==0) {
            System.out.println("Can not borrow , inventory does not have this book");
            return;
        }
        inventory.map.put(book,inventory.map.get(book)-1);
    }
}
