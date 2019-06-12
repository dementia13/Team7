package bookstore.shoppingcart;

import java.util.ArrayList;

import static java.lang.Boolean.TRUE;

public class ShoppingCart {

        String iD = new String();
        boolean isActive;
        ArrayList<Item> Items = new ArrayList<Item>();
        String name = new String();
        double cartTotal;

    private class Item {
        private String iD;
        private int quantity = 1;
        private boolean isInStock;
        private Book theBook;

        Item(Book newBook){
            this.theBook = newBook;
        }

        Item(Book newBook, int newQuantity){
            this.theBook = newBook;
            this.quantity = newQuantity;
        }
    }

    public ShoppingCart (){
        // iD = collection ID
        isActive = TRUE;
        name = "Shopping Cart";
        cartTotal = 0.0;
    }

    public ShoppingCart (Item newItem){
        // iD = collection ID
        isActive = TRUE;
        name = "Shopping Cart";
        cartTotal = 0.0;
        addItem(new ArrayList<Item>(), newItem) ;
    }

    private void addItem(ArrayList<Item> Items, Item newItem){
         Items.add(newItem);
         cartTotal += newItem.theBook.price;
    }

    private void display(){

    }

}
