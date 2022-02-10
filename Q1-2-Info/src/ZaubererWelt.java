
public class ZaubererWelt {
//Kristian und Dave
	// Anfang Attribute
	  private int Anzahl;
	  private Zauberer [] ZaubererStube;
	  // Ende Attribute
	  
	  public ZaubererWelt() {
	    this.Anzahl = 0;
	    this.ZaubererStube=new Zauberer[20];
	    //zaubererErzeugen(10);
	    
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
	  
	  zaubererErzeugen(int anzahl){
      for(int i=0; i<anzahl; i++) {
    	  
      ZaubererStube[i] = new Zauberer(); 
      System.out.println("Zauberer: "+i+"Ausdauer "+ZaubererStube[i].getAusdauer()+"Kampfkraft "+ZaubererStube[i].getKampfkraft()+"Magie "+ZaubererStube[i].getMagie())
    	  
      }
	  }// Ende Methoden
}
