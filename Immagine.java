package progetto;

public  class Immagine extends Multimediale implements Luminosita { 
	
     private int luminosita;
     private String asterichi = "*";
      
	public Immagine(String titolo , int luminosita) {
		super(titolo);
		this.setLuminosita(luminosita) ;
		this.setTitolo(titolo);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void aumentaLuminosita() {
		
	    if(this.luminosita == 10) {
            System.out.println("Errore!! La luminosità di " + this.getTitolo() + " è al massimo.");
        }else {
            this.luminosita++;
            System.out.println("Luminosità " + this.getTitolo() + " è " + this.asterichi.repeat(this.luminosita));
        }
    }
		// TODO Auto-generated method stub
		
		
	
	@Override
	public void diminuisciLuminosita() {
		// TODO Auto-generated method stub
		 if(this.luminosita == 10) {
	            System.out.println("Errore!! La luminosità di " + this.getTitolo() + " è al minimo.");
	        }else {
	            this.luminosita--;
	            System.out.println("Luminosità " + this.getTitolo() + " è " + this.asterichi.repeat(this.luminosita));
	        }
		
	}


	public int getLuminosita() {
		return luminosita;
	}


	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}

public void show() {
	System.out.println(this.getTitolo() );
}
	
	

}
