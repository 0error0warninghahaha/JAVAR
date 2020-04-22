package behavioral.visitor;

public abstract class Action {
	// 得到男人的结论或反应
	public abstract void getManConclusion(Man man);

	// 得到女人的结论或反应
	public abstract void getWomanConclusion(Woman woman);
}
