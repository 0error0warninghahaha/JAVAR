package test;

import factory.BoyFactory;
import factory.ElderFactory;
import factory.GirlFactory;

public class Test {

	public static void main(String[] args) {
		new BoyFactory().getRole();
		new GirlFactory().getRole();
		new ElderFactory().getRole();
	}
}
