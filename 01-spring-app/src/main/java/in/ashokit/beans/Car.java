package in.ashokit.beans;

public class Car {

	private Engine eng;

	public Car() {
		System.out.println("Car 0 Param- Constructor :: Executed");
	}

	// constructor injection
	public Car(Engine eng) {
		System.out.println("Car Param- Constructor :: Executed");
		this.eng = eng;
	}

	// setter injection
	public void setEng(Engine eng) {
		this.eng = eng;
		System.out.println("setEng() method called...");
	}

	public void drive() {

		boolean status = eng.start();

		if (status) {
			System.out.println("Journey Started...");
		} else {
			System.out.println("Engine Trouble");
		}
	}

}
