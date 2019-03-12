package carcraft;

public class CarOptions implements ICar {

    public CarOptions() {
		System.out.print("  Option Constructor\n");
	}
    @Override
    public void GetDescription() {
        System.out.print("  Lets give your car some option");
    }

}
