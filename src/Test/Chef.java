package Test;

public class Chef extends Person{
	private String abteilung;
	
	public Chef(String name, String vorname, int personalNummer, String abteilung) {
		super(name, vorname, personalNummer);
		this.abteilung = abteilung;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Abteilung: "+abteilung);
	}

	@Override
	public int berechneFerien(int alter) {
		if (alter<45){
			return 4;
		}else if (alter>=55){
			return 6;
		} else {
			return 5;
		}
	}
}
