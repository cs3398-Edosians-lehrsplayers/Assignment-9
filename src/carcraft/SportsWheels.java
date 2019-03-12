package carcraft;

public class SportsWheels extends CarOptions
{
  

	public SportsWheels(ICar car){
    super(car);
  }

 
  public String GetDescription(){
    return car.GetDescription() + addWheels();
  }
    

  private String addWheels(){
    return " + brand new wheels";
  }
}
