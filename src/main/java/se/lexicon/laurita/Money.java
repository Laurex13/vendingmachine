package se.lexicon.laurita;

public enum Money {
    currency1(1), currency2(2), currency3(5), currency4(10), currency5(20), currency6(50),
    currency7(100), currency8(200), currency9(500), currency10(1000);

    //Field
    private final double kr;

    //Constructor
    Money(double kr) {
        this.kr = kr;
    }

    //Getter
    public double getKr() {
        return kr;
    }

    @Override
    public String toString() {
        return "Money{" +
                "kr=" + kr +
                '}';

    }
}