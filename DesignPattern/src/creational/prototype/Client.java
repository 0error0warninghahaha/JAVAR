package creational.prototype;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ProtioType protoType = new ProtioType();

        try {
            //通过clone生成一个ProtoTypeClass类型的新对象
            protoType.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
	}

}
