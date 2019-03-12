
package carcraft;

public class SuperCharger extends CarOptions
{
        public String SuperCharger;


        public SuperCharger(String superCharger)
        {
            System.out.println(" SuperCharger Constructor\n");

            SuperCharger = superCharger;
        }

        @Override
        public String GetDescription()
        {
            return super.GetDescription() + " with " + SuperCharger;
        }
}
