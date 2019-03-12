

// Author: McCray, Warren

package carcraft;

public class PaintColor extends CarOptions {
    
    public PaintColor(ICar car){
    super(car);
  }

 
  public String GetDescription(){
    return car.GetDescription() + addPaint();
  }
    

  private String addPaint(){
    return " + brand new paint";
  }
}
