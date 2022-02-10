
public class Zauberer {
	// Anfang Attribute
	  private int ausdauer = 30 + Math.random()*50;
	  private int kampfkraft = 10 + Math.random()*30;
	  private int magie = 60 + Math.random()*50;
	  // Ende Attribute
	  
	  public Zauberer() {
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
}
