/**
 * DeliveredState implements State and displays the appropriate status and eta messages
 * @author Adam Nguyen
 *
 */
public class DeliveredState implements State {
	private Package pkg;
	public DeliveredState(Package pkg)
	{
		this.pkg=pkg;
	}
	/**
	 * Displays package name and that it arrived
	 */
	public void displayStatus()
	{
		System.out.println(pkg.getName()+" is here for you");
	}
	/**
	 * Displays package name and that it arrived
	 */
	public void displayETA()
	{
		System.out.println(pkg.getName()+" is here");
	}

}
