package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Text extends Shape{

	int height;
	int angle;
	String text;
	
	Text(){
		Type = ElementType.TEXT;//图元类型
		OrgX = 100;//原点坐标
		OrgY = 100;
		new Chushihua();
		height = 50;
		angle = 30;
	}
	
	Text(int x, int y, int h, int a, String t){
		Type = ElementType.TEXT;//图元类型
		OrgX = x;//原点坐标
		OrgY = y;
		height = 100;
		angle = 30;
		new Chushihua();

	}
	
	void Draw(Graphics c) {//绘制文档   
		// 绘制一段文本，其中 (x, y) 坐标指的是文本序列的 左下角 的位置
		c.drawString(text, OrgX, OrgY);
	}
	
	boolean IsMatched(Point pnt)//重载点pnt是否落在图元内
	{
		if ((pnt.x >= OrgX /*- radiusa / 2) && (pnt.x <= OrgX + radiusa / 2*/) && (pnt.y >= OrgY /*- radiusb / 2) && (pnt.y <= OrgY + radiusb / 2*/))
			return true;
		else
			return false;
	}
	
	//virtual void Serialize(CArchive& ar);
	//序列化文档图元
	
	void SetValue(ElementType t,int x,int y,int w,int h){
		Type=t;
		OrgX = x;
		OrgY = y;
		angle = w;
		height = h;
	}
	
	void GetValue(ElementType t, int x, int y, int w, int h){
		t = Type;
		x = OrgX;
		y = OrgY;
		w = angle;
		h = height;
	}
	
	void SetText(String a){
		text=a;
	}
	
	void GetText(String a){
		a=text;
	}

	//DECLARE_SERIAL(CText)//声明类CText支持序列化
}
