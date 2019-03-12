package carcraft;

public class SuperCharger extends CarOptions
{
   public SuperCharger(ICar car){
    super(car);
  }

 
  public String GetDescription(){
    return car.GetDescription() + addCharge();
  }
    

  private String addCharge(){
    return " + SuperCharger edition";
  }
}
