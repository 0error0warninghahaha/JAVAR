package behavioral.iterator;

public class Client {
	public static void main(String[] args) {
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		cma.addObject("111");
		cma.addObject("222");
		cma.addObject("333");
		cma.addObject("444");

		MyIterator iterator = cma.createIterator();
		cma.removeObject("111");// 如果删除一个元素的话，迭代的时候也同样会被删除
		while (iterator.hasNext()) {
			System.out.println(iterator.getCurrentObj());// 获取当前对象
			iterator.next();// 将游标向下移
		}
	}
}
