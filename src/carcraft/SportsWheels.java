package carcraft;

public class SportsWheels extends CarOptions
{
	
   public String Wheels;


    public SportsWheels()
    {
      System.out.print(" CarWithSportsWheels Constructor\n");
			Wheels = "Wheels";
    }

    @Override
    public String GetDescription()
  	{
        return super.GetDescription() + " with " + Wheels;
  	}
}
