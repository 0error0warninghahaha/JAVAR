package behavioral.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
	private List<Person> elements = new LinkedList<>();

	// 增加
	public void attach(Person person) {
		elements.add(person);
	}

	// 移除
	public void detach(Person person) {
		elements.remove(person);
	}

	// 查看显示
	public void display(Action action) {
		for (Person person : elements) {
			person.accept(action);
		}
	}
}
