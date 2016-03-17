package Test;

public class Personen {
	public static void main(String[] args) {
		Chef chef = new Chef("Sattler", "Beatrice", 25, "Verkauf");
		Fachangestellter fachangestellter = new Fachangestellter("Heuchler", "Tom", 34, chef);
		Lehrnender lehrnender = new Lehrnender("Timolino", "Tim", 14, 2);
		Firma firma = new Firma(new Person[] {chef, fachangestellter, lehrnender});

        int i = 20;
		for (Person mitarbeiter : firma.mitarbeiter) {
			mitarbeiter.print();
            System.out.println("Ferien: "+mitarbeiter.berechneFerien(i));
            i = i*2;
		}
	}
}
