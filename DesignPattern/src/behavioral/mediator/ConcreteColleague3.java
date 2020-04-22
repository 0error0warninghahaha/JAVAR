package behavioral.mediator;

public class ConcreteColleague3 extends Colleague {
    public ConcreteColleague3(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod(){
        System.out.println("colleague3: 自发行为...");
    }

    public void sendMessageToColleague1(String message){
        super.mediator.sendMessageToColleague1(message);
    }

    public void sendMessageToColleague2(String message){
        super.mediator.sendMessageToColleague2(message);
    }
}