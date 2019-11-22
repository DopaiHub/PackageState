/**
 * Package class has different states to display different messages
 * @author Adam Nguyen
 *
 */
public class Package{
	private State orderedState;
	private State inTransitState;
	private State deliveredState;
	private String name;
	private State state;
	
	/**
	 * Creates new states and sets name of package to parameter
	 * @param contents
	 */
	public Package(String contents)
	{
		orderedState=new OrderedState(this);
		inTransitState=new InTransitState(this);
		deliveredState=new DeliveredState(this);
		this.name=contents;
	}
	/**
	 * Sets state to ordered state and displays status and eta
	 */
	public void order()
	{
		setState(orderedState);
		state.displayStatus();
		state.displayETA();
	}
	/**
	 * Sets state to transit state and displays status and eta
	 */
	public void mail()
	{
		setState(inTransitState);
		state.displayStatus();
		state.displayETA();
	}
	/**
	 * Sets state to delivered state and displays status
	 */
	public void received()
	{
		setState(deliveredState);
		state.displayStatus();
	}
	/**
	 * Setter method for state
	 * @param state
	 */
	public void setState(State state)
	{
		this.state=state;
	}
	/**
	 * Getter method for name
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}

}
