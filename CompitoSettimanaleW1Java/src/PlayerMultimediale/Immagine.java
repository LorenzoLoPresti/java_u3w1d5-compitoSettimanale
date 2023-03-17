package PlayerMultimediale;

public class Immagine extends ElementoMultimediale implements RegolaLuminosità {


	public Immagine(String titolo) {
		super(titolo);
	}


	@Override
	public void aumentaLuminosità() {
		if (this.luminosità< 5) {
			this.luminosità ++;
		}
		return;
	}

	
	public void abbassaLuminosità() {
		if (this.luminosità > 1) {
			this.luminosità --;
		}
		return;
		
	}
	
	public void show() {
		System.out.println("Show:");
		System.out.print(this.titolo);
		settaAsterischi(this.luminosità);
		
		//per spaziare
		System.out.println();
	}
	
	private void settaAsterischi(int luminosità) {
		for(int i = 0; i < luminosità; i++) {
			System.out.print("*");
		}
	}
	
	public void getStats() {
		System.out.println("Titolo: " + this.titolo);
		System.out.println("luminosità: " + this.luminosità);
		
		// per spaziare
			System.out.println();
	}

}
