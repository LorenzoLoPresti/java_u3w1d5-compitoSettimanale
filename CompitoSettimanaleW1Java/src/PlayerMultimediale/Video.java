package PlayerMultimediale;

public class Video extends ElementoMultimediale implements Riproducibile, RegolaLuminosità{

	public Video(String titolo, int durata) {
		super(titolo, durata);
	}



	@Override
	public void play() {
		System.out.println("Play:");
		for(int i = 0; i < this.durata; i++) {
			System.out.print(this.titolo);
			for(int j = 0; j < this.volume; j++) {
				System.out.print("!");
			}
			for(int k = 0; k < this.luminosità; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// PER SPAZIARE DAL PRINT SUCCESSIVO
		System.out.println(); 
	}


	
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
	

}
