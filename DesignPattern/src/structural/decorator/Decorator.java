package structural.decorator;

public class Decorator extends Component {
    private Component component;
    
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        //调用被装饰者的方法
        this.component.operate();
    }
}
