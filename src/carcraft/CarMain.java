package carcraft;



public class CarMain {

	public static void main(String[] args) {

        System.out.println("Testing 1st car");
		ICar firstCar = new PaintColor(new BasicCar());
		System.out.println(firstCar.GetDescription());
		System.out.println();

		System.out.println("Testing 2nd car");
		ICar secondCar = new SportsWheels(new SuperCharger(new PaintColor(new BasicCar())));
		System.out.println(secondCar.GetDescription());
		System.out.println();

		System.out.println("Testing 3rd car");
		ICar thirdCar = new SuperCharger(new SportsWheels((new BasicCar())));
		System.out.println(thirdCar.GetDescription());
		System.out.println();

		System.out.println("Testing 4th car");
		ICar fourthCar = new PaintColor(new SuperCharger(new BasicCar()));
		System.out.println(fourthCar.GetDescription());
		System.out.println();

		System.out.println("Testing 5th car");
		ICar fifthCar = new SuperCharger(new SportsWheels(new PaintColor(new BasicCar())));
		System.out.println(fifthCar.GetDescription());
		System.out.println();

		System.out.println("Testing 6th car");
		ICar sixthCar = new SuperCharger(new SportsWheels(new PaintColor(new BasicCar())));
		System.out.println(sixthCar.GetDescription());
		System.out.println();



		
	}

}

