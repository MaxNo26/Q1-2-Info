public class ZwergenWelt{
  
  // Anfang Attribute
  private static int Anzahl;
  private Zwerge [] Zwergh�hle;
  // Ende Attribute
  
  public ZwergenWelt() {
    this.Anzahl = 0;
    this.Zwergh�hle=new Zwerge[100];
   Zwergh�hle[0]=new Zwerge(); 
  }

  // Anfang Methoden
  public int getAnzahl() {
    return Anzahl;
  }
  private void willeVerbessern(int verbesserung, int wille) {
    // TODO hier Quelltext einf�gen
    
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

