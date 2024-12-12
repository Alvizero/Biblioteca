package BibliotecaAlvise;

import java.util.Scanner;

public class Tools {
	
	// INPUT

	public static int InserisciIntero(String messaggio) {
		Scanner tastiera = new Scanner(System.in);

		int numero = -1;

		boolean inputValido = false;
		while (!inputValido) {
			try {
				System.out.print(messaggio);
				numero = Integer.parseInt(tastiera.nextLine());
				inputValido = true;
			} catch (Exception e) {
				System.out.println("Errore: Inserire un numero valido!");
			}
		}
		return numero;
	}

	public static double InserisciDouble(String messaggio) {
		Scanner tastiera = new Scanner(System.in);

		double numero = -1.0;
		
		boolean inputValido = false;
		while (!inputValido) {
			try {
				System.out.print(messaggio);
				numero = Double.parseDouble(tastiera.nextLine());
				inputValido = true;
			} catch (Exception e) {
				System.out.println("Errore: Inserire un numero valido!");
			}
		}
		return numero;
	}
	
	public static boolean ScegliBoolean() {		
		System.out.println("Seleziona \n 1 - Per selezionare vero\n 2 - Per selezionare falso");

        boolean scelta = false;
		short selezione = TryMinMax(1, 2);

        if(selezione == 1){
            scelta = true;
        }
        else if(selezione == 2){
            scelta = false;
        }
        
		return scelta;
	}

	public static String LeggiStringa(String messaggio) {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.print(messaggio);
		String s = tastiera.nextLine().trim();
		
		return s;
	}
	
	// TRY
	
	public static short TryMinMax(int min, int max) {
		Scanner tastiera = new Scanner(System.in);

		short selezione = -1;

		boolean inputValido = false;
		while (!inputValido) {
			try {
				System.out.print("Selezione: ");
				selezione = tastiera.nextShort();

				if (selezione >= min && selezione <= max) {
					inputValido = true;
				} else {
					System.out.println("Selezionare un'opzione valida!");
				}
			} catch (Exception e) {
				System.out.println("Errore: Inserire un numero valido!");
				tastiera.next(); // Salta tasto "invio" nel buffer
			}
		}
		return selezione;
	}
}