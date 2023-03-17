package PlayerMultimediale;

import java.util.Scanner;

public class LettoreMultimediale {

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
		
	
	
	}
	
	public static ElementoMultimediale[] creaPlaylist() {
		ElementoMultimediale[] array = new ElementoMultimediale[5];
		String titolo;
		Immagine immagine;
		int durata;
		int counter = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(counter < 5) {
			System.out.println("Seleziona tipo (img, audio o video)");
			String tipo = scanner.nextLine();
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
				array[counter] = new Audio(titolo, durata);
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
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		boolean play = true;
		while(play) {
			if (numero > 0 && numero <6) {
				
			}
		}
	}

}
