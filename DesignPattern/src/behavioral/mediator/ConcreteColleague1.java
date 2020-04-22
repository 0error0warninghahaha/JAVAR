package behavioral.mediator;

public class ConcreteColleague1 extends Colleague {
	 public ConcreteColleague1(Mediator mediator) {
	        super(mediator);
	    }

	    // ---------- self-method
	    public void selfMethod(){
	        System.out.println("colleague1: 自发行为...");
	    }

	    public void receiveMessage(String message){
	        System.out.println("colleague1收到消息: "+message);
	    }

	    // ---------- dependency-method
	    public void sendMessageToColleague2(String message){ // 同事类之间不能直接交互, 同事类不能完成的工作委托给中介者完成
	        super.mediator.sendMessageToColleague2(message);
	    }
}
