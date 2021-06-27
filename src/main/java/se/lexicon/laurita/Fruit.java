package se.lexicon.laurita;

public class Fruit {
    String mango;
    String ripe;
    int kr5;

    public Fruit(String mango, String ripe, int kr5){
        this.mango = mango;
        this.ripe = ripe;
        this.kr5 = kr5;
    }

    public String getMango() {
        return mango;
    }

    public void setMango(String mango) {
        this.mango = mango;
    }

    public String getRipe() {
        return ripe;
    }

    public void setRipe(String ripe) {
        this.ripe = ripe;
    }

    public int getKr5() {
        return kr5;
    }

    public void setKr5(int kr5) {
        this.kr5 = kr5;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "mango='" + mango + '\'' +
                ", ripe='" + ripe + '\'' +
                ", kr5=" + kr5 +
                '}';
    }
}
