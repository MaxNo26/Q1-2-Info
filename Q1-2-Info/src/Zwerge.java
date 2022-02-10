
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 10.02.2022
 * @author 
 */

public class Zwerge{
  
  // Anfang Attribute
  private int ausdauer = 0;
  private int kampfkraft = 0;
  private int magie = 0;
  // Ende Attribute
  
  public Zwerge() {

	  private int ausdauer = (int )(Math.random() *20  + 80);
	  private int kampfkraft = (int )(Math.random() * 30 + 20);
	  private int magie = (int )(Math.random() * Math.random() * Math.random() * 90 + 10);
	  
  }

  // Anfang Methoden
  public int getAusdauer() {
    return ausdauer;
  }

  public void setAusdauer(int ausdauerNeu) {
    ausdauer = ausdauerNeu;
  }

  public int getKampfkraft() {
    return kampfkraft;
  }

  public void setKampfkraft(int kampfkraftNeu) {
    kampfkraft = kampfkraftNeu;
  }

  public int getMagie() {
    return magie;
  }
  
  public int setMagie(int magieNeu) {
	  magie = magieNeu;
  }

  // Ende Methoden
} // end of Orks



