package se.lexicon.laurita;

public class Fruit extends Product {
    Fruit (int selectionNumber, String name, String description, int price) {
        super(selectionNumber, name, description, price);
}
    public String examine() {

        return "Fruit{" +
                "selectionNumber=" + selectionNumber +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String Use() {
        return "Eat all edible parts and throw the seed away properly in the garbage";
    }
}
