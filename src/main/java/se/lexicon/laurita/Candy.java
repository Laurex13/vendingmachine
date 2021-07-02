package se.lexicon.laurita;

public class Candy extends Product{

    Candy(int selectionNumber, String name, String description, int price) {
        super(selectionNumber, name, description, price);

    }
    public String examine(){

        return "Candy{" +
                "selectionNumber=" + selectionNumber +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';

    }

    @Override
    public String Use() {
        return "unwrap and eat the candy";
    }
}
