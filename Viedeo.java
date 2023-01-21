package progetto;

public class Viedeo extends Multimediale implements ElementoRiproducibile , Luminosita {

	private int luminosita;
	private int durata;
	private int volume;
	private String asterischi = "*";
	
	public Viedeo(String titolo , int luminosita , int durata , int volume) {
		super(titolo);
		this.setTitolo(titolo);
		this.setLuminosita(luminosita);
		this.setDurata(durata);
		this.setVolume(volume);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void abbassaVolume() {
		// TODO Auto-generated method stub
		if (volume  > 0) {
			volume --;
		}else {
			System.out.println("VOLUME MINIMO");
		}
		this.setVolume(volume);
		
	}

	@Override
	public void alzaVolume() {
		// TODO Auto-generated method stub
		if (volume  < 10) {
			
		}
		else { 
			System.out.println("MAX VOLUME");
		}
		this.setVolume(volume);
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
	       System.out.println(this.getTitolo()+ this.getDurata() + volume);
	}

	@Override
	public void aumentaLuminosita() {
		// TODO Auto-generated method stub
		 if(this.luminosita == 10) {
	            System.out.println("Errore!! La luminosità di " + this.getTitolo() + " è al massimo.");
	        }else {
	            this.luminosita++;
	            System.out.println("Luminosità " + this.getTitolo() + " è " + this.asterischi.repeat(this.luminosita));
	        }
		
	}

	@Override
	public void diminuisciLuminosita() {
		// TODO Auto-generated method stub
		 if(this.luminosita == 10) {
	            System.out.println("Errore!! La luminosità di " + this.getTitolo() + " è al minimo.");
	        }else {
	            this.luminosita--;
	            System.out.println("Luminosità " + this.getTitolo() + " è " + this.asterischi.repeat(this.luminosita));
	        }
		
		
	}

	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
