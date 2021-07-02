package se.lexicon.laurita;

public abstract class Product  {

   /* CANDY (1, "PInk and contains 5%sugar", 20),
    COKE (2,message,10),
    MANGO (3,message,5),
    EMPTY(0,0,0);
*/

    int selectionNumber;
    String name;
    String description;
    int price;

    Product(int selectionNumber,String name, String description, int price) {
        this.selectionNumber = selectionNumber;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getSelectionNumber() {
        return selectionNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return this.price;
    }
    public abstract String examine();

    public abstract String Use();


}



