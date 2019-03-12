public class CarOptions implements Car {

    public CarOptions() {
		System.out.print("  Option Constructor\n");
	}
    @Override
    public void GetDescription() {
        System.out.print("  Lets give your car some option");
    }

}