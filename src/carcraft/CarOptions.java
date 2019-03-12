package carcraft;

public class CarOptions implements ICar {

    public CarOptions() {
		System.out.print("  Option Constructor\n");
	}
    @Override
    public String GetDescription() {
        return "  Lets give your car some option";
    }

}
