package behavioral.visitor;

public class Failing extends Action {

	@Override
	public void getManConclusion(Man man) {
		// TODO 自动生成的方法存根
		System.out.println("男人失败...");
	}

	@Override
	public void getWomanConclusion(Woman woman) {
		// TODO 自动生成的方法存根
		System.out.println("女人失敗...");
	}
}
