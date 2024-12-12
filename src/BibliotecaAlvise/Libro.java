package BibliotecaAlvise;

public class Libro {
    private String titolo, autore, genere;
    private int pagine, annoPubblicazione;
    private double prezzo;
    private boolean prestito;

    // Costruttore
    public Libro(String titolo, String autore, String genere, int pagine, int annoPubblicazione, double prezzo, boolean prestito) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.pagine = pagine;
        this.annoPubblicazione = annoPubblicazione;
        this.prezzo = prezzo;
        this.prestito = prestito;
    }

    // Getter e Setter
    
    // Titolo
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	// Autore
	public String getAutore() {
		return titolo;
	}
	
	public void setAutore(String autore) {
		this.autore = autore;
	}

	// Genere
	public String getGenere() {
		return genere;
	}
	
	public void setGenere(String genere) {
		this.genere = genere;
	}

	// Pagine
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	// Anno Pubblicazione
	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}
	
	// Prezzo
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	// Prestito
	public boolean getPrestito() {
		return prestito;
	}
	
	public void setPrestito(boolean prestito) {
		this.prestito = prestito;
	}

    // Metodo toString
    public String toString() {
		String s="Libro: ";
		s = s + "\nTitolo: " + this.titolo;
		s = s + "\nAutore: " + this.autore;
		s = s + "\nGenere: " + this.genere;
		s = s + "\nPagine: " + this.pagine;
		s = s + "\nAnno di publicazione: " + this.annoPubblicazione;
		s = s + "\nPrezzo: " + this.prezzo;
		s = s + "\nPrestito: " + this.prestito + "\n";
		
		return s;
    }
}
