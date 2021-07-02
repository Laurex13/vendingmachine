package se.lexicon.laurita;

public enum Currency {
    currency1(1), currency2(2), currency5(5), currency10(10), currency20(20), currency50(50),
    currency100(100), currency200(200), currency500(500), currency1000(1000);

    //Field
    private int kr;

    //Constructor
    Currency(int kr) {
        this.kr = kr;
    }

    //Getter
    public int getKr() {
        return this.kr;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "kr=" + kr +
                '}';

    }
}
