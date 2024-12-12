package BibliotecaAlvise;

import java.util.Scanner;

public class Gestione {

	public static void InserisciLibro(Biblioteca biblioteca) {
        String titolo = Tools.LeggiStringa("Inserisci il titolo del libro: ");
        String autore = Tools.LeggiStringa("Inserisci l'autore del libro: ");
        String genere = Tools.LeggiStringa("Inserisci il genere del libro: ");
        int pagine = Tools.InserisciIntero("Inserisci il numero di pagine: ");
        int annoPubblicazione = Tools.InserisciIntero("Inserisci l'anno di pubblicazione: ");
        double prezzo = Tools.InserisciDouble("Inserisci il prezzo: ");

        // Creazione del libro
        Libro libro = new Libro(titolo, autore, genere, pagine, annoPubblicazione, prezzo, false); // False di default imposta il prestito libro su false

        // Aggiunta del libro alla biblioteca
        biblioteca.AggiungiLibro(libro);
    }
    
    public static boolean isEmpty(Biblioteca biblioteca) {
  	   if (biblioteca.getNumeroLibri() == 0) {
 		    System.out.println("La biblioteca è vuota!");
 		    return false;
  	   } else {
  		   	return true;
  	   }
    }
    
    public static boolean ModificaLibro(Biblioteca biblioteca) {
    	if (isEmpty(biblioteca) == true) {
    		String titolo = Tools.LeggiStringa("Inserisci il titolo del libro da modificare: ");
            Libro libro = biblioteca.CercaLibro(titolo);
            
            if (libro != null) {
                System.out.println("Libro trovato!");
                
                String nuovoTitolo  = Tools.LeggiStringa("Inserisci il nuovo titolo: ");
                String autore = Tools.LeggiStringa("Inserisci il nuovo autore: ");
                String genere = Tools.LeggiStringa("Inserisci il nuovo genere: ");
                int pagine = Tools.InserisciIntero("Inserisci il nuovo numero di pagine: ");
                int annoPubblicazione = Tools.InserisciIntero("Inserisci il nuovo anno di pubblicazione: ");
                double prezzo = Tools.InserisciDouble("Inserisci il nuovo prezzo: ");
               
                libro.setTitolo(nuovoTitolo);
                libro.setAutore(autore);
                libro.setGenere(genere);
                libro.setPagine(pagine);
                libro.setAnnoPubblicazione(annoPubblicazione);
                libro.setPrezzo(prezzo);
     
                return true;
            } else {
                System.out.println("Libro non trovato!");
                return false;
            }
    	} else {
    		return false;
    	}
    }

    public static boolean EliminaLibro(Biblioteca biblioteca) {
    	if (isEmpty(biblioteca) == true) {
            String titolo = Tools.LeggiStringa("Inserisci il titolo del libro da eliminare: ");
            Libro libroTrovato = biblioteca.CercaLibro(titolo);
            
            if (libroTrovato != null) {
                biblioteca.eliminaLibro(titolo);
                System.out.println("Libro eliminato con successo!");

                return true;
            } else {
                System.out.println("Libro non trovato!");
                return false;
            }
    	} else {
    		return false;
    	}
    }

    public static void CercaLibroPerTitolo(Biblioteca biblioteca) {
    	if (isEmpty(biblioteca) == true) {
            String titolo = Tools.LeggiStringa("Inserisci il titolo del libro da cercare: ");
            Libro libro = biblioteca.CercaLibro(titolo);
            
            if (libro != null) {
                System.out.println("Libro trovato:\n" + libro);
            } else {
                System.out.println("Libro non trovato.");
            }
    	}
    }
    
    public static void OrdinaLibri(Biblioteca biblioteca) {
		if (isEmpty(biblioteca) == true) {
        	short selezione = Menu.Menu2();
        	
        	if (selezione == 1) {
        		biblioteca.ordinaPerTitolo();
        	} else if (selezione == 2){
        		biblioteca.ordinaPerAutore();
        	} else if (selezione == 3){
        		biblioteca.ordinaPerGenere();
        	}
		}
    }

   public static void GestionePrestito(Biblioteca biblioteca) {
       String titolo = Tools.LeggiStringa("Inserisci il titolo del libro su cui fare l'operazione: ");
       Libro libro = biblioteca.CercaLibro(titolo);

       if (libro != null) {
           System.out.println(" Vero --> presta il libro \n Falso --> ritira il libro dal prestito");
           boolean prestito = Tools.ScegliBoolean();
           libro.setPrestito(prestito);
       } else {
           System.out.println("Libro non trovato.");
       }
   }
    
    public static void main(String[] args) {

        // inizializza la biblioteca con una dimensione di 10 libri
        Biblioteca biblioteca = new Biblioteca("Biblioteca Centrale");

        while(true) {     
            switch (Menu.Menu1()) { // Qui stampa sia il menu e anche di selezionare l'opzione
	            case 1: {
	                InserisciLibro(biblioteca);
	                break;
	            }
	            case 2: {
	                ModificaLibro(biblioteca);
	                break;
	            }
	            case 3: {
	                EliminaLibro(biblioteca);
	                break;
	            }
	            case 4: {
	            	OrdinaLibri(biblioteca);
	        		break;
	            }
	            case 5: {
	            	GestionePrestito(biblioteca);
	                break;
	            }
	            case 6: {
	                CercaLibroPerTitolo(biblioteca);
	                break;
	            }
	            case 7: {
	                biblioteca.StampaElenco();
	                break;
	            }
				case 0: { // Fa chiudere il programma
			        String scelta = Tools.LeggiStringa("Sei sicuro di voler uscire? (Y = si, N = no)");
	
					if (scelta.equalsIgnoreCase("Y")) {
						System.out.println("Sei uscito!");
						System.exit(0); // Chiude il programma
					} else {
						System.out.println("Hai scelto di non uscire!");
					}
					break;
				}
            }
        }
    }
}
