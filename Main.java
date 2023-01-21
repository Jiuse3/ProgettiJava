package progetto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		RegistrazioneAudio audio = new RegistrazioneAudio("Audio" , 10 , 3);
		RegistrazioneAudio audioMeno = new RegistrazioneAudio ("Audio" , 10 , 0);
		
		
		Immagine immagine = new Immagine ("Immagine " , 2);
		Immagine immagineMeno = new	Immagine ("Immagine" , 4);	
		
		//ALZA LUMINOSITA
		immagine.aumentaLuminosita();
		System.out.println();
		
	    // ABBASSA LUMINOSITA
		immagine.diminuisciLuminosita();
		System.out.println();
		
        //ALZA VOLUME
		audio.alzaVolume();
		System.out.println("il tuo volume alzato e " +audio.getVolume());
		
		//ABBASSA VOLUME
		audio.abbassaVolume();
		System.out.println("il tuo volume abbassato e " +audio.getVolume());
	}

}
