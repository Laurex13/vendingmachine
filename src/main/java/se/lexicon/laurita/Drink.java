package se.lexicon.laurita;

public class Drink extends Product{
    Drink(int selectionNumber, String name, String description, int price){
        super(selectionNumber, name, description, price);
    }
    public String examine(){

        return "Drink{" +
                "selectionNumber=" + selectionNumber +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String Use() {
        return "Open the bottle and drink with a straw";
    }
}
