package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Ellipse extends Shape{
	
	int radiusa;
	int radiusb;
	
	Ellipse(){
		Type = ElementType.ELLIPSE;//图元类型
		OrgX = 200;//原点坐标
		OrgY = 200;
		new Chushihua();
		radiusa = 25;
		radiusb = 50;
	}
	
	Ellipse(int x, int y, int sa, int sb){
		Type = ElementType.ELLIPSE;//图元类型
		OrgX = x;//原点坐标
		OrgY = y;
		new Chushihua();
		radiusa = sa;
		radiusb = sb;
	}
	
	void Draw(Graphics c) {//绘制椭圆   
		// 绘制一个椭圆
		c.drawOval(OrgX, OrgY, radiusa, radiusb);
		// 填充一个椭圆
		c.fillOval(OrgX, OrgY, radiusa, radiusb);
		c.setColor(BorderColor);
	}
	
	boolean IsMatched(Point pnt) {//重载，点pnt是否落在图元内
		if ((pnt.x >= OrgX - radiusa / 2) && (pnt.x <= OrgX + radiusa / 2) && (pnt.y >= OrgY - radiusb / 2) && (pnt.y <= OrgY + radiusb / 2))
			return true;
		else
			return false;
	}
	
	//virtual void Serialize(CArchive& ar);
	//序列化椭圆图元
	
	void SetValue(ElementType t,int x,int y,int w,int h){//设置长方形对象中的部分数据成员（与画笔和画刷无关的）的值
		Type=t; OrgX=x;OrgY=y;radiusa=w;radiusb=h;
	}
	
	void GetValue(ElementType t,int x,int y,int w,int h)//获取长方形对象中部分数据成员的值，通过引用参数将值传到实在参数
	{
		t=Type;x=OrgX;y=OrgY;w=radiusa;h=radiusb;
	}

	//DECLARE_SERIAL(CEllipse)//声明类CEllipse支持序列化
}
