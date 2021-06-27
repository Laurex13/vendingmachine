package se.lexicon.laurita;

public class Drink {
    String coke;
    String zero;
    int kr10;

    public Drink (String coke, String zero, int kr10){
        this.coke = coke;
        this.zero = zero;
        this.kr10 = kr10;
    }

    public String getCoke() {
        return coke;
    }

    public void setCoke(String coke) {
        this.coke = coke;
    }

    public String getZero() {
        return zero;
    }

    public void setZero(String zero) {
        this.zero = zero;
    }

    public int getKr10() {
        return kr10;
    }

    public void setKr10(int kr10) {
        this.kr10 = kr10;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "coke='" + coke + '\'' +
                ", zero='" + zero + '\'' +
                ", kr10=" + kr10 +
                '}';
    }
}
