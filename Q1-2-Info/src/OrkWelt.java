/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08.02.2022
 * @author 
 */

public class OrkWelt{
  
  // Anfang Attribute
  private  int Anzahl;
  private Orks [] OrkKeller;
  // Ende Attribute
  
  public OrkWelt() {
    this.Anzahl = 0;
    this.OrkKeller=new Orks[100];
    
    anfangsOrksErzeugen();
  }

  // Anfang Methoden
  public int getAnzahl() {
    return Anzahl;
  }
  private void willeVerbessern(int verbesserung, int wille) {
    // TODO hier Quelltext einfügen
    
  }
  private void anfangsOrksErzeugen() {
	for (int i=0;i<100; i++) {
		OrkKeller[i]=new Orks();
		Anzahl=i; 
		System.out.println("Ork " + i +" Ausdauer: " + OrkKeller[i].getAusdauer()+" Kampfkraft: " + OrkKeller[i].getKampfkraft()+" Magie: " + OrkKeller[i].getMagie());
	}	
	  
	  
  
  }

  public int [] kriegerSenden() {
    int [] krieger ={0,0,2,4};
    return krieger;
  }
  
  public void kriegerErhalten(int[]krieger){
  System.out.println(krieger[0]);
  }  

  // Ende Methoden
} // end of OrkWelt


