package carcraft;

public class BasicCar implements ICar {

    public BasicCar() {
		System.out.print("Creating new car . . . \n");
	}

    @Override
    public String GetDescription() {
        return "Basic Car";
    }
}

