package BibliotecaAlvise;

public class Menu {
	
	// MENU 1
	
	private static void StampaMenu1() {
		System.out.println("Benveuto nella libreria!");
		System.out.println("Cosa desideri fare?\n");

		System.out.println("1)Inserisci un libro");
		System.out.println("2)Modifica un libro");
		System.out.println("3)Elimina un libro");
		System.out.println("4)Ordina i libri"); // diversi tipi di ordinamento (titolo, autore, genere)
		System.out.println("5)Gestione prestito");
		System.out.println("6)Stampa i dati di un libro specifico");
		System.out.println("7)Visualizza tutti i libri");
		
		System.out.println("0)Esci\n");
	}
	
	public static short Menu1() {
		StampaMenu1();
		
		short selezione = Tools.TryMinMax(0, 7); // 0 e 7 corrispettivi valori min e max del menu
		return selezione;
	}
	
	// MENU 2
	
	private static void StampaMenu2() {
		System.out.println("Come vuoi ordinare il libro?\n");

		System.out.println("1)Per Titolo");
		System.out.println("2)Per Autore");
		System.out.println("3)Per Genere");
		
		System.out.println("0)Esci\n");
	}
	
	public static short Menu2() {
		StampaMenu2();
		
		short selezione = Tools.TryMinMax(0, 3); // 0 e 3 corrispettivi valori min e max del menu
		return selezione;
	}
}
