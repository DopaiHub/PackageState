/**
 * InTransitState implements State and displays the appropriate status and eta messages
 * @author Adam Nguyen
 *
 */
public class InTransitState implements State {
	private Package pkg;
	public InTransitState(Package pkg)
	{
		this.pkg=pkg;
	}
	/**
	 * Displays package name and that its out for delivery
	 */
	public void displayStatus()
	{
		System.out.println(pkg.getName()+" is out for delivery");
	}
	/**
	 * Displays package name and that it'll arrive within 5 days
	 */
	public void displayETA()
	{
		System.out.println(pkg.getName()+" should arrive within 5 days");
	}

}
