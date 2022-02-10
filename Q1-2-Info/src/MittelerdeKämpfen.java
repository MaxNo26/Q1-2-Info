public class MittelerdeKämpfen{
  private OrkWelt orkWelt;
  
  
  public MittelerdeKämpfen(){
    this.orkWelt=new OrkWelt();
    kämpfen();
  }
  
  public void kämpfen (){
    int [] krieger = orkWelt.kriegerSenden();
    System.out.println("Die id des Orks ist:"+ krieger[0]); 
    orkWelt.kriegerErhalten(krieger);
    
  }
  
  public static void main (String[]args){
    new MittelerdeKämpfen();
   
  }  
}

