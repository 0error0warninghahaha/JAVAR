package structural.composite;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("叶节点"+name+"的操作");
    }
}
