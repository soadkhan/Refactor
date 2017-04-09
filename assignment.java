
import java.util.Enumeration;



public class Refactoring {
	private MyCollection orders = new MyCollection();
	private String name = "Customer name";

	void printOwing()
	{
		Enumeration<E> e = orders.elements();
		double outstanding = 0.0;

		//print banner
		print_banner();

		// calculate outstanding
		outstanding = calculate_outstanding(e, outstanding);

		// print details

		print_details(outstanding);

	}

	private void print_details(double outstanding) {
		System.out.println("name: " + name);
		System.out.println("amount: " + outstanding);
	}

	private double calculate_outstanding(Enumeration<E> e, double outstanding) {
		while(e.hasMoreElements())
		{
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();

		}
		return outstanding;
	}

	private void print_banner() {
		System.out.println("*****************************");
		System.out.println("****** Customer Owes ********");
		System.out.println("*****************************");
	}


}
