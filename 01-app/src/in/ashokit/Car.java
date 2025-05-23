package in.ashokit;

public class Car {

	public void drive() {

		Engine eng = new Engine();

		boolean isStarted = eng.start();

		if (isStarted) {
			System.out.println("Journey Started");
		} else {
			System.out.println("Engine Trouble");
		}
	}
}
