package Test;

public class Fachangestellter extends Person {
	private Chef vorgesetzter;
	
	public Fachangestellter(String name, String vorname, int personalNummer, Chef vorgesetzter) {
		super(name, vorname, personalNummer);
		this.vorgesetzter = vorgesetzter;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("");
	}

	@Override
	public int berechneFerien(int alter) {
		if (alter<50){
			return 4;
		}else if (alter>=60){
			return 6;
		} else {
			return 5;
		}
	}
}
