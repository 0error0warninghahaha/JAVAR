package behavioral.mediator;

public class Client {
	public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();

        ConcreteColleague1 colleague1=new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2=new ConcreteColleague2(mediator);


        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);


        colleague1.selfMethod();
        colleague1.sendMessageToColleague2("来自colleague1的贺电...");

        colleague2.selfMethod();
        colleague2.sendMessageToColleague1("来自colleague2的贺电...");


        // 之后新增一个colleague3, 与其他同事类交互很清晰
        ConcreteColleague3 colleague3=new ConcreteColleague3(mediator);
        colleague3.selfMethod();
        colleague3.sendMessageToColleague1("来自colleague3的贺电...");
        colleague3.sendMessageToColleague2("来自colleague3的贺电...");

    }
}
