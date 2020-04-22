package behavioral.mediator;

public class ConcreteColleague2 extends Colleague {
	 public ConcreteColleague2(Mediator mediator) {
	        super(mediator);
	    }

	    // ---------- self-method
	    public void selfMethod(){
	        System.out.println("colleague2: 自发行为...");
	    }

	    public void receiveMessage(String message){
	        System.out.println("colleague2收到消息: "+message);
	    }

	    // ---------- dependency-method
	    public void sendMessageToColleague1(String message){ // 同事类之间不能直接交互, 同事类不能完成的工作委托给中介者完成
	        super.mediator.sendMessageToColleague1(message);
	    }
}
