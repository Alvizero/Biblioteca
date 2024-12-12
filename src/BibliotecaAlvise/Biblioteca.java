package BibliotecaAlvise;

public class Biblioteca {
	private Libro[] libri = new Libro[10];
	private String NomeBiblioteca;
	private int numeroLibri = 0;

	public Biblioteca(String NomeBiblioteca) {
		this.NomeBiblioteca = NomeBiblioteca;
	}
	
    // metodo per aggiungere un libro all'array
    public void AggiungiLibro(Libro libro) {
    	// Crea un nuovo array se l'array principale e' pieno, questo rende possibile sempre l'inserimento
        if (numeroLibri >= libri.length) {
            Libro[] nuovoArray = new Libro[libri.length + 10];
            for (int i = 0; i < libri.length; i++) {
                nuovoArray[i] = libri[i];
            }
            libri = nuovoArray;
        }

        libri[numeroLibri] = libro;
        numeroLibri++;
        System.out.println("Libro aggiunto con successo!");
    }
	
	// Metodo per modificare un libro
	public boolean modificaLibro(String titolo, String nuovoTitolo, String nuovoAutore, String nuovoGenere, int nuovePagine, int nuovoAnno, double nuovoPrezzo, boolean prestito) {
	    for (int i=0; i<numeroLibri; i++) {
	        if (libri[i].getTitolo().equalsIgnoreCase(titolo)) {
	            libri[i].setTitolo(nuovoTitolo);
	            libri[i].setAutore(nuovoAutore);
	            libri[i].setGenere(nuovoGenere);
	            libri[i].setPagine(nuovePagine);
	            libri[i].setAnnoPubblicazione(nuovoAnno);
	            libri[i].setPrezzo(nuovoPrezzo);
	            libri[i].setPrestito(prestito);
	            return true;
	        }
	    }
	    return false;
	}
	
	// Metodo per eliminare un libro
	public boolean eliminaLibro(String titolo) {
	    for (int i=0; i<numeroLibri; i++) {
	        if (libri[i].getTitolo().equalsIgnoreCase(titolo)) {
	            for (int j=i; j<numeroLibri-1; j++) {
	                libri[j] = libri[j + 1];
	            }
	            libri[numeroLibri-1] = null; // Rimuove il riferimento all'ultimo libro
	            numeroLibri--;
	            return true;
	        }
	    }
	    return false;
	}
	
	// Metodo per ordinare i libri per titolo
	public void ordinaPerTitolo() {
	    for (int i=0; i<numeroLibri-1; i++) {
	        for (int j=0; j<numeroLibri-i-1; j++) {
	            if (libri[j].getTitolo().compareToIgnoreCase(libri[j+1].getTitolo()) > 0) {
	                // Scambio dei libri
	                Libro temp = libri[j];
	                libri[j] = libri[j+1];
	                libri[j+1] = temp;
	            }
	        }
	    }
	    System.out.println("I libri sono stati ordinati per titolo.");
	}
	
	// Metodo per ordinare i libri per autore
	public void ordinaPerAutore() {
	    for (int i=0; i<numeroLibri-1; i++) {
	        for (int j=0; j<numeroLibri-i-1; j++) {
	            if (libri[j].getAutore().compareToIgnoreCase(libri[j+1].getAutore()) > 0) {
	                // Scambio dei libri
	                Libro temp = libri[j];
	                libri[j] = libri[j+1];
	                libri[j+1] = temp;
	            }
	        }
	    }
	    System.out.println("I libri sono stati ordinati per titolo.");
	}
	
	// Metodo per ordinare i libri per genere
	public void ordinaPerGenere() {
	    for (int i=0; i<numeroLibri-1; i++) {
	        for (int j=0; j<numeroLibri-i-1; j++) {
	            if (libri[j].getGenere().compareToIgnoreCase(libri[j+1].getGenere()) > 0) {
	                // Scambio dei libri
	                Libro temp = libri[j];
	                libri[j] = libri[j+1];
	                libri[j+1] = temp;
	            }
	        }
	    }
	    System.out.println("I libri sono stati ordinati per titolo.");
	}
    
	// Metodo per cercare un libro per titolo
	public Libro CercaLibro(String titolo) {
	    for (int i=0; i<numeroLibri; i++) {
	        if (libri[i].getTitolo().equalsIgnoreCase(titolo)) {
	            return libri[i]; // Restituisce il libro trovato
	        }
	    }
	    return null; // Restituisce null se non trovato
	}

	// Metodo per visualizzare tutti i libri
	public void StampaElenco() {
        System.out.println("Elenco dei libri nella biblioteca: \n");
        
		for(int i=0; i<numeroLibri; i++) {
			System.out.println(libri[i]);
		}
	}

	public int getNumeroLibri() {
		return numeroLibri;
	}
}
