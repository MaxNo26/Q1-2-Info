public class MittelerdeK�mpfen{
  private OrkWelt orkWelt;
  
  
  public MittelerdeK�mpfen(){
    this.orkWelt=new OrkWelt();
    k�mpfen();
  }
  
  public void k�mpfen (){
    int [] krieger = orkWelt.kriegerSenden();
    System.out.println("Die id des Orks ist:"+ krieger[0]); 
    orkWelt.kriegerErhalten(krieger);
    
  }
  
  public static void main (String[]args){
    new MittelerdeK�mpfen();
   
  }  
}

