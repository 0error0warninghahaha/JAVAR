package structural.composite;

import java.util.List;

public abstract class Component {
	protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void operation();

   public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    public Component getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public List<Component> getChildren() {
        return null;
    }

}
