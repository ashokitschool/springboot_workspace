package in.ashokit.beans;

public class ATM {

	private Printer printer;

	public ATM() {
		System.out.println("ATM :: 0-param constructor");
	}

	public ATM(Printer printer) {
		System.out.println("ATM :: param constructor");
		this.printer = printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
		System.out.println("setPrinter() method called...");
	}

	public void withdraw() {
		System.out.println("Amount withdrawn successfully");
		printer.print();
	}

}
