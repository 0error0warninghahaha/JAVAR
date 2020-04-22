package behavioral.mediator;

public abstract class Mediator {
	//中介者记录各具体同事类的引用, 用于交互
    // 也可以是集合类记录,如 List, Map
    protected ConcreteColleague1 colleague1;
    protected ConcreteColleague2 colleague2;


    // ------------------------- 因为中介者可以有部分同事类, 所以使用setter, getter 注入同事类

    public ConcreteColleague1 getColleague1() {
        return colleague1;
    }

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public ConcreteColleague2 getColleague2() {
        return colleague2;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }



    // ------------------------------------------ 具体同事类依赖中介者的方法
    //这种方法其实可以精简成通用的发放 sendMessage(String toColleague, message)
    public abstract void sendMessageToColleague1(String message);
    //
    public abstract void sendMessageToColleague2(String message);
}
