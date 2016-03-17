package Test;

public abstract class Person {
	protected String name;
	protected String vorname;
	protected int personalNummer;
	
	public Person(String name, String vorname, int personalNummer) {
		this.name = name;
		this.vorname = vorname;
		this.personalNummer = personalNummer;
	}

	public void print(){
		System.out.print("Name: "+name + " Vorname: " + vorname + " Personalnummer: "+ personalNummer+" ");
	}

	public abstract int berechneFerien(int alter);
}
