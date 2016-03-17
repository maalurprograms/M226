package Test;

/**
 * Created by vmadmin on 09.03.2016.
 */
public class Lehrnender extends Person {

    private int lehrjahr;

    public Lehrnender(String name, String vorname, int personalNummer, int lehrjahr) {
        super(name, vorname, personalNummer);
        this.lehrjahr = lehrjahr;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Lehrjahr: "+lehrjahr);
    }

    @Override
    public int berechneFerien(int alter) {
        return 5;
    }
}
