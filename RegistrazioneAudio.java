package progetto;

public  class RegistrazioneAudio extends Multimediale implements ElementoRiproducibile {
     
	private int durata;
	private int volume = 0; 
	
	public RegistrazioneAudio(String titolo , int durata , int volume) {
		super(titolo);
		this.setDurata(durata);
		this.setVolume(volume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void abbassaVolume() {
		if (volume  > 0) {
			volume --;
		}else {
			System.out.println("VOLUME MINIMO");
		}
		this.setVolume(volume);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alzaVolume() {
		
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
		
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		if (durata<=0) {
            System.out.println("Errore inserire una durata valida");
            return;
        }
       
		this.durata = durata;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	

	

}
