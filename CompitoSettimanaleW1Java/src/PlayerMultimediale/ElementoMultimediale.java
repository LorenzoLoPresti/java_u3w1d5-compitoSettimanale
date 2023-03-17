package PlayerMultimediale;

public class ElementoMultimediale {
	// VARIABILI STATIC
	// da 0 a 5
	protected static int volume = 3;
	// da 1 a 5
	protected static int luminosità = 3;
	
	protected String titolo;
	protected int durata;
	
	
	// COSTRUTTORE PER IMMAGINI
	public ElementoMultimediale(String titolo) {
		this.titolo = titolo;
	}

	// COSTRUTTORE PER AUDIO/VIDEO
	public ElementoMultimediale(String titolo, int durata) {
		this(titolo);
		this.durata = durata;
	}
	
	public void getStats() {
		System.out.println("Titolo: " + this.titolo);
		System.out.println("Durata:" + this.durata);
		System.out.println("volume: " + this.volume);
		System.out.println("luminosità: " + this.luminosità);
		
		// per spaziare
		System.out.println();
	}
	
	public void setStats(int volume, int lumi) {
		this.volume = volume;
		this.luminosità = lumi;
	}

	
}
