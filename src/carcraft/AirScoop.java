//Author: Spencer Ginsburg

package carcraft;

public class AirScoop extends CarOptions
{
   public AirScoop(ICar car){
    super(car);
  }

 
  public String GetDescription(){
    return car.GetDescription() + addScoop();
  }
    

  private String addScoop(){
    return " + a new AirScoop";
  }
}
