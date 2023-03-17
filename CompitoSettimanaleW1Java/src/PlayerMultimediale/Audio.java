package PlayerMultimediale;

public class Audio extends ElementoMultimediale implements Riproducibile {

	public Audio(String titolo, int durata) {
		super(titolo, durata);
	}


	@Override
	
	public void abbassaVolume() {
		if (this.volume > 0) {
			this.volume --;
		}
		return;
	}

	
	public void alzaVolume() {
		if (this.volume < 5) {
			this.volume ++;
		}
		return;
		
	}
	
	public void play() {
		System.out.println("Play:");
		for(int i = 0; i < this.durata; i++) {
			System.out.print(this.titolo);
			for(int j = 0; j < this.volume; j++) {
				System.out.print("!");
			}
			System.out.println();
		}
		// PER SPAZIARE DAL PRINT SUCCESSIVO
		System.out.println(); 
	}


}
