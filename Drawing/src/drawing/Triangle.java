package drawing;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Triangle extends Shape{

	int width;
	
	Triangle(){
		Type = ElementType.TRIANGLE;//图元类型
		OrgX = 100;//原点坐标
		OrgY = 100;
		new Chushihua();
		width = 100;
	}
	
	Triangle(int x, int y, int w){

		Type = ElementType.TRIANGLE;//图元类型
		OrgX = x;//原点坐标
		OrgY = y;
		new Chushihua();
		width = w;
	}
	
	void Draw(Graphics c) {//绘制三角形   
		int px1[]={100,500,650};
		int py1[]={100,200,300};
		// 根据给定的多个点坐标绘制一个多边形（首尾相连）
		c.drawPolygon(px1,py1,3);
		// 根据给定的多个点坐标填充一个多边形（首尾相连）
		c.fillPolygon(px1, py1, 3);
		c.setColor(BorderColor);
	}
	
	boolean IsMatched(Point pnt) {//重载，点pnt是否落在图元内
		if ((pnt.x >= OrgX - width / 2) && (pnt.x <= OrgX + width / 2) && (pnt.y >= OrgY - width / 2) && (pnt.y <= OrgY + width / 2))
			return true;
		else
			return false;
	}
	
//	virtual void Serialize(CArchive& ar);

	void SetValue(ElementType t,int x,int y,int w,int height){ //设置长方形对象中的部分数据成员（与画笔和画刷无关的）的值
		Type=t; OrgX=x;OrgY=y;width=w;
	}
	
	void GetValue(ElementType t,int x,int y,int w,int height){ //获取长方形对象中部分数据成员的值，通过引用参数将值传到实在参数
		t=Type;x=OrgX;y=OrgY;w=width;
	}

	//DECLARE_SERIAL(CTriangle)//声明类CTriangle支持序列化
}
