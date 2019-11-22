/**
 * OrderedState implements State and displays the appropriate status and eta messages
 * @author Adam Nguyen
 *
 */
public class OrderedState implements State {
	private Package pkg;
	public OrderedState(Package pkg)
	{
		this.pkg=pkg;
	}
	/**
	 * Displays package was delivered
	 */
	public void displayStatus()
	{
		System.out.println(pkg.getName()+" was ordered");
	}
	/**
	 * Displays package should arrive within 5-7 days
	 */
	public void displayETA()
	{
		System.out.println(pkg.getName()+" should arrive in 5 to 7 business days");
	}
}
