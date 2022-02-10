/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08.02.2022
 * @author 
 */

public class Orks{
  
  // Anfang Attribute
  private int ausdauer = (int)(Math.random()*20 + 20);
  private int kampfkraft = (int)(Math.random()*40 + 50);
  private int magie = (int)(Math.random()*5 + 10);
  // Ende Attribute
  
  public Orks() {
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

  // Ende Methoden
} // end of Orks



