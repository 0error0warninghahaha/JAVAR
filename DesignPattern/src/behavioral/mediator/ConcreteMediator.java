package behavioral.mediator;

public class ConcreteMediator extends Mediator{
	 @Override
	    public void sendMessageToColleague1(String message) {
	        super.colleague1.receiveMessage(message);
	    }

	    @Override
	    public void sendMessageToColleague2(String message) {
	        super.colleague2.receiveMessage(message);
	    }
}
