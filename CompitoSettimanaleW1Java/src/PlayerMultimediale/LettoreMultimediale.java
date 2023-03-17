package PlayerMultimediale;

import java.util.Scanner;

public class LettoreMultimediale {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scanner = new Scanner(System.in);
//		String titolo = scanner.nextLine();

//		ElementoMultimediale file1 = new ElementoMultimediale("titolo", 3);
//	
////		file1.getStats();
////		
////		file1.setStats(4, 4);
////		
////		file1.getStats();
//		
//		ElementoMultimediale file2 = new ElementoMultimediale("titolo", 5);
//		
//		file2.getStats();
		
//		Audio audio = new Audio(titolo, 4);
//		audio.setStats(4, 3);
	
	
		
//		audio.getStats();
//		audio.play();
//		
//		Video img = new Video("ciaone", 2);
//		
//		img.play();
//		
//		img.aumentaLuminosità();
//		img.getStats();
//		
//		img.aumentaLuminosità();
//		img.aumentaLuminosità();
//		
//		img.play();
//		
//		img.abbassaLuminosità();
//		img.abbassaLuminosità();
//		img.abbassaLuminosità();
//		img.abbassaLuminosità();
//		img.abbassaLuminosità();
//		
//		img.play();
		
		ElementoMultimediale[] arrayElementi = creaPlaylist();
		
		for(int i = 0; i < arrayElementi.length; i++) {
			System.out.println(arrayElementi[i].titolo);
		}
		
		play(arrayElementi);
	
	
	}
	
	
	public static ElementoMultimediale[] creaPlaylist() {
		ElementoMultimediale[] array = new ElementoMultimediale[5];
		String titolo;
		Immagine immagine;
		int durata;
		int counter = 0;
//		Scanner scanner = new Scanner(System.in);
		
		while(counter < array.length) {
			System.out.println("Seleziona tipo (img, audio o video)");
			String tipo = scanner.nextLine().toLowerCase();
			switch(tipo) {
			case "img":
				System.out.println("Seleziona titolo elemento " + (counter + 1)+ ":");
				titolo = scanner.nextLine();
				array[counter] = new Immagine(titolo);
				counter++;
				break;
				
			case "audio":
				System.out.println("Seleziona titolo elemento " + (counter + 1)+ ":");
				titolo = scanner.nextLine();
				System.out.println("Seleziona durata elemento " + (counter + 1)+ ":");
				durata = scanner.nextInt();
				array[counter] = new Audio(titolo, durata);
				counter++;
				break;
				
			case "video":
				System.out.println("Seleziona titolo elemento " + (counter + 1)+ ":");
				titolo = scanner.nextLine();
				System.out.println("Seleziona durata elemento " + (counter + 1)+ ":");
				durata = scanner.nextInt();
				array[counter] = new Video(titolo, durata);
				counter++;
				break;
			default:
			break;
			}
			
			
			
		}
		
//		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i].titolo);
//		}
		
		return array;
	}
	
	public static void play(ElementoMultimediale[] array) {
//		Scanner scanner = new Scanner(System.in);
		Immagine img;
		Audio audio;
		Video video;
		
		boolean play = true;
		while(play) {
			System.out.println("Seleziona elemento da 1 a 5 o chiudi con 0");
			int numero = scanner.nextInt();
			if (numero > 0 && numero <array.length + 1) {
				if(array[numero - 1] instanceof Immagine) {
					img = (Immagine) array[numero - 1];
					img.show();
			
				} else if(array[numero - 1] instanceof Audio) {
					audio = (Audio) array[numero - 1];
					audio.play();
				
				} else {
					video = (Video) array[numero - 1];
					video.play();
				
				}
			} else if(numero == 0) {
				play = false;
			} 
			
		}
	}

}
