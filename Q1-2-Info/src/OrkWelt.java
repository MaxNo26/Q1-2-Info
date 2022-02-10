/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08.02.2022
 * @author 
 */

public class OrkWelt{
  
  // Anfang Attribute
  private static int Anzahl;
  private Orks [] OrkKeller;
  // Ende Attribute
  
  public OrkWelt() {
    this.Anzahl = 0;
    this.OrkKeller=new Orks[100];
    OrkKeller[0]=new Orks(); 
  }

  // Anfang Methoden
  public int getAnzahl() {
    return Anzahl;
  }
  private void willeVerbessern(int verbesserung, int wille) {
    // TODO hier Quelltext einfügen
    
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

