package se.lexicon.laurita;

public class Snack {

    String candy;
    String pink;
    int kr20;

    public Snack(String candy, String pink, int kr20) {
        this.candy = candy;
        this.pink = pink;
        this.kr20 = kr20;

    }

    public String getCandy() {
        return candy;
    }

    public void setCandy(String candy) {
        this.candy = candy;
    }

    public String getPink() {
        return pink;
    }

    public void setPink(String pink) {
        this.pink = pink;
    }

    public int getKr20() {
        return kr20;
    }

    public void setKr20(int kr20) {
        this.kr20 = kr20;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "candy='" + candy + '\'' +
                ", pink='" + pink + '\'' +
                ", kr20=" + kr20 +
                '}';
    }
}