package serialize3;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name="simpe";
	private Integer age=15;
	public String getName() {
		return this.name;
	}
}
